package chapter4;

import java.lang.Math;

public class checkBalanced{
	public int height(Node node){
		if(node == null){
			return 0;
		}

		return 1 + Math.max(height(node.left), height(node.right));
	}

	public boolean isBalanced(Node root){
		private int leftHeight = height(root.left);
		private int rightHeight = height(root.right);

		if((leftHeight - rightHeight) <= 1){
			if(isBalanced(root.left) && isBalanced(root.right)){
				return true;
			}
		}
		return false;
	}
}