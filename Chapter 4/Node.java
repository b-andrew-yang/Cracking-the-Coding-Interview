package chapter4;

public class Node{
	public int value;
	public Node[] children;

	public Node(int value){
		this.value = value;
		children = new Node[2];
	}

	public void addChildren(Node child){
		for(int i = 0; i< children.length; i++){
			if(children[i] == null){
				children[i] = child;
			}
		}
	}

	public int getValue(){
		return value;
	}
}