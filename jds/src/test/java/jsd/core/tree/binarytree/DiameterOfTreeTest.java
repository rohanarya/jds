package jsd.core.tree.binarytree;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DiameterOfTreeTest {

	private DiameterOfTree<Integer> diameterOfTree;

	@BeforeMethod
	public void setUp() {
		diameterOfTree = new DiameterOfTree<Integer>();
	}

	@Test
	public void testDiameter() {
		DiameterOfTree.IntHolder diameter = new DiameterOfTree.IntHolder();
		diameterOfTree.calculateHieghtAndUpdateDiameter(
				TreeFactory.createIntTree(), diameter);
		Assert.assertEquals(diameter.getDiameter(), Integer.valueOf(6));

	}
}
