public class listPalindrome{
    public static void main(String[] args){
        LinkedList list1 = new LinkedList();
        LinkedList list2 = new LinkedList();
        LinkedList list3 = new LinkedList();

        for(int i = 0; i< 5; i++){
            list1.append(i);
        }
        list1.append(2);
        list1.append(6);
        list1.append(3);

        list2.append(1);
        list2.append(2);
        list2.append(3);
        list2.append(2);
        list2.append(1);

        list3.append(1);
        list3.append(3);
        list3.append(3);
        list3.append(1);

        System.out.println(list1.isPalindrome());
        System.out.println(list2.isPalindrome());
        System.out.println(list3.isPalindrome());
    }
}

class LinkedList{
    Node head;  // head of list
    int size;

    public boolean isPalindrome(){
        int[] dataArr = new int[size];
        int index = 0;
        Node c = head;

        while(c.next != null && c != null){
            dataArr[index] = c.data;
            c = c.next;
            index++;
        }
        dataArr[index] = c.data;

        int a = 0;
        int b = size - 1;

        if(size % 2 == 0){
            while(a + 1 != b){
                if(dataArr[a] != dataArr[b]){
                    return false;
                }
                a++;
                b--;
            }
        }else if(size % 2 == 1){
            while(a != b){
                if(dataArr[a] != dataArr[b]){
                    return false;
                }
                a++;
                b--;
            }
        }
        return true;
    }

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