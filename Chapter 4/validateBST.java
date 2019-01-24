/*
 *	Andrew Yang
 *	CtCI 4.5: Validate BST
 */

public class validateBST{
	public static boolean validate(Node root){
		return validateHelper(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean validateHelper(Node node, int min, int max){
		if(node == null){
			return true;
		}

		if(node.value < min || node.value > max){
			return false; 
		}

		return (validateHelper(node.left, min, node.value+1) &&
			validateHelper(node.right, node.value+1, max));
	}

	public static void main(String[] args){
		BinaryTree tree = new BinaryTree();

		tree.insert(1);
		tree.insert(2);
		tree.insert(3);
		tree.insert(4);

		System.out.println(validate(tree.getRoot()));
	}
}