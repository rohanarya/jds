package jsd.core.tree.binarytree;

import jsd.core.tree.TreeNode;

public class TreeFactory {

	/**
	 * Tree Structure to be created-----------------------------
	 * ------------------LEVEL 0---------------------------1
	 * ------------------LEVEL 1-----------------------2-----3
	 * ------------------LEVEL 2---------------------4-----5---6
	 * ------------------LEVEL 3----------------------------------7
	 */
	public static TreeNode<Integer> createIntTree() {
		TreeNode<Integer> treeNodeOne = new TreeNode<Integer>();
		treeNodeOne.setValue(1);
		TreeNode<Integer> treeNodeTwo = new TreeNode<Integer>();
		treeNodeTwo.setValue(2);
		TreeNode<Integer> treeNodeThree = new TreeNode<Integer>();
		treeNodeThree.setValue(3);
		TreeNode<Integer> treeNodeFour = new TreeNode<Integer>();
		treeNodeFour.setValue(4);
		TreeNode<Integer> treeNodeFive = new TreeNode<Integer>();
		treeNodeFive.setValue(5);
		TreeNode<Integer> treeNodeSix = new TreeNode<Integer>();
		treeNodeSix.setValue(6);
		TreeNode<Integer> treeNodeSeven = new TreeNode<Integer>();
		treeNodeSeven.setValue(7);
		treeNodeOne.setLeft(treeNodeTwo);
		treeNodeOne.setRight(treeNodeThree);
		treeNodeTwo.setLeft(treeNodeFour);
		treeNodeThree.setLeft(treeNodeFive);
		treeNodeThree.setRight(treeNodeSix);
		treeNodeSix.setRight(treeNodeSeven);
		return treeNodeOne;
	}

}
