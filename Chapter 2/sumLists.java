import java.util.Arrays;

public class sumLists{
    public static void main(String[] args){
        LinkedList a = new LinkedList();
        LinkedList b = new LinkedList();

        a.append(7);
        a.append(6);
        a.append(3); 
        
        // LinkedList a contains 367

        b.append(3);
        b.append(8);
        b.append(2);

        // LinkedList b contains 283

        System.out.println(getSum(a,b));
    }

    public static int getSum(LinkedList a, LinkedList b){
        return (a.backInt() + b.backInt());
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

    public int backInt(){
        Node a = head;
        int[] numbers = new int[size];
        int index = 0;

        while(a.next != null && a != null){
            numbers[index] = a.data;
            a = a.next;
            index++;
        }
        numbers[index] = a.data;
        String num = "";

        for(int i = size - 1; i >= 0; i--){
            num += String.valueOf(numbers[i]);
        }

        return Integer.valueOf(num);
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

    public Node getHead(){
        return head;
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
