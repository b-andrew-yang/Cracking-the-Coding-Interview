public class BinaryTree{
	private Node root;

	public BinaryTree(){
	
	}

	public void insert(int value){
		insertHelper(root, value);
	}

	private Node insertHelper(Node current, int value){
		if(current == null){
			return new Node(value);
		}

		if(value < current.value){
			current.left = insertHelper(current.left, value);
		}else if(value > current.value){
			current.right = insertHelper(current.right, value);
		}else{
			return current;
		}
		return current;
	}

	public Node getRoot(){
		return root;
	}
}