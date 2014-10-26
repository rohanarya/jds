package jsd.core.tree.binarytree;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DepthTreeTest {

	private DepthTree<Integer> depthTree;

	@BeforeTest
	public void setUp() {
		depthTree = new DepthTree<Integer>();
	}

	@Test
	public void testDepth() {
		Assert.assertEquals(depthTree.depth(TreeFactory.createIntTree()), 3);

	}

}
