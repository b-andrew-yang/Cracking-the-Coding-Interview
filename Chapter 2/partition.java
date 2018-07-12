import java.util.Arrays;

public class partition{
	public static void main(String[] args){
		LinkedList list = new LinkedList();

		for(int i = 0; i< 5; i++){
			list.append(i);
		}
		list.append(2);
		list.append(6);
		list.append(3);

		System.out.println(list.toString());
		list.partition(3);
		System.out.println(list.toString());
		list.partition(5);
		System.out.println(list.toString());
	}
}

class LinkedList{
    Node head;  // head of list
    int size;

    public void partition(int value){
    	Node a = head;
    	Node[] moreThan = new Node[size];
    	Node[] lessThan = new Node[size];
    	int lessIndex = 0; 
    	int moreIndex = 0;

		while(a.next != null && a != null){
			if(a.data < value){
				lessThan[lessIndex] = a;
				lessIndex++;
			}else if(a.data >= value){
				moreThan[moreIndex] = a;
				moreIndex++;
			}
			a = a.next;
		}
		if(a.data < value){
			lessThan[lessIndex] = a;
			lessIndex++;
		}else if(a.data >= value){
			moreThan[moreIndex] = a;
			moreIndex++;
		}

		Node last = head;
		lessThan[0] = head;

		for(int i = 0; i< size; i++){
			if(lessThan[i] != null){
				lessThan[i].next = lessThan[i + 1];
				last = lessThan[i];
			}
		}
		last.next = moreThan[0];

		for(int j = 0; j< size; j++){
			if(moreThan[j] != null){
				moreThan[j].next = moreThan[j + 1];
			}
		}
    }

    public void append(int data){
    	Node new_node = new Node(data);

    	if(head == null){
    		head = new Node(data);
    		size++;
    		return;
    	}

    	new_node.next = null;
    	Node last = head;
    	while(last.next != null){
    		last = last.next;
    	}
    	last.next = new_node;
    	size++;
    	return;
    }

    public void removeDups(){
		Node a = head;
		Node curr = null;
		Node dup = null;

		while(a.next != null && a != null){
			curr = a;

			while(curr.next != null){
				if(a.data == curr.next.data){
					dup = curr.next;
					curr.next = curr.next.next;
				}else{
					curr = curr.next;
				}
			}
			a = a.next;
		}
	}

	public Node kToLast(int index){
		Node a = head;

		for(int i = 0; i< (size - index - 1); i++){
			a = a.next;
		}
		return a;
	}

	public void deleteMiddle(Node a){
		if(a == null || a.next == null){
			return;
		}

		Node next = a.next;
		a.data = next.data;
		a.next = next.next;
	}

    public String toString(){
    	String s = "";

    	Node a = head;
    	while(a.next != null){
    		s+= (String.valueOf(a.data) + " --> ");
    		a = a.next;
    	}
    	s+= String.valueOf(a.data);

    	return s;
    }

    public int size(){
    	return size;
    }
 
    /* Node Class */
    class Node
    {
        int data;
        Node next;
          
        // Constructor to create a new node
        Node(int d) {data = d; next = null; }
    }
}
