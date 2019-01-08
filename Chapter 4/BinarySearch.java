package chapter4;

public class BinarySearch{
	private Node head;

	public BinarySearch(){

	}

	public Node createTree(int[] entry){
		for(int num: entry){
			insert(head, num);
		}
	}

	public Node insert(Node head, int data){
		if(head == null){
			head = new Node(data);
			return head;
		}

		if(head.value < data){
			head.right = insert(head.right, data);
		}else{
			head.left = insert(head.left, data);
		}
		return head;
	}
}