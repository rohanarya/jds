package jsd.core.tree.binarytree;

import jsd.core.tree.TreeNode;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DepthTreeTest {

	private DepthTree<Integer> depthTree;

	@BeforeTest
	public void setUp() {
		depthTree = new DepthTree<Integer>();
	}

	/**
	 * Tree Structure to be created
	 * ------------------LEVEL 0---------------------------1
	 * ------------------LEVEL 1-----------------------2-----3
	 * ------------------LEVEL 2---------------------4-----5---6
	 * ------------------LEVEL 3----------------------------------7
	 */
	@Test
	public void testDepth() {
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
		Assert.assertEquals(depthTree.depth(treeNodeOne), 3);

	}

}
