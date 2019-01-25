public class Node{
	public int value;
	public Node left;
	public Node right;
	public Node parent;

	public Node(int value){
		this.value = value;
		right = null;
		left = null;
		parent = null;
	}	

	public int getValue(){
		return value;
	}
}