/*
 * Andrew Yang
 * CtCI 4.6: Find the successor of this node if we're going an in-order traversal. 
 * If n is on the left, then we need to explore it's parents right sub-tree.
 * If n is on the right, then we're done traversing this parents sub-tree and we need
 * to go back and search for another case where we move from the left child to the parent.
 * In this case, we still need to explore the right sub-tree of that parent. If we can't find
 * this scenario then we return null because the node has no successor.
 */

public class Successor{
	public Successor(Node n){
		return getSuccessor(n);
	}

	private Node getSuccessor(Node n){
		if(n == null){
			return null;
		}
		if(n.right != null){
			return getLeftMostChild(n.right);
		}else{
			Node tmp = n;
			Node x = tmp.parent;
			while(x != null && x.left != tmp){
				tmp = x;
				x = x.parent;
			}
		}
		return x;
	}

	private Node getLeftMostChild(Node n){
		if(n == null){
			return null;
		}

		while(n.left != null){
			n = n.left;
		}
		return n;
	}
}