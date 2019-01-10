package chapter4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 *
 *	4.3: List of Depths
 *		Given a binary tree, design an algorithm which creates a 
 *		linked list of all the nodes at each depth.
 */

 public class ListofDepths {
 	private LinkedList<LinkedList<Node>> listOfLists;

 	public LinkedList<LinkedList<Node>> create(Node root){
 		listOfLists = new LinkedList<>();
 		preOrderTraversal(listsOfLists, root, 0);
 		return listOfLists;
 	}

 	private void preOrderTraversal(LinkedList<LinkedList<Node>> listOfLists, Node n, int level){
 		if(node == null){
 			return;
 		}
 		LinkedList<Node> list = null;
 		if(listsOfLists.size() == level){
 			list = new LinkedList<>();
 			listsOfLists.add(list);
 		}else{
 			list = listsOfLists.get(level);
 		}
 		list.add(n);
 		preOrderTraversal(listsOfLists, n.left, level+1);
 		preOrderTraversal(listsOfLists, n.right, level+1);
 	}
 }