package jsd.core.tree.binarytree;

import jsd.core.tree.ITreeNode;

/**
 * Amazon question - Calculates the daimeter of a tree which is basically the
 * length of the path between two leaves. The scenarios to consirder are
 * --------------------1) When the longest path is via the root
 * --------------------2) The longest path exists in the right subtree
 * --------------------3) The longest path exists in the left subtree
 * 
 * For e.g. the diameter of {@link TreeFactory#createIntTree()} is 6 i.e
 * 
 * 4 - 2 - 1 -3 - 6 - 7
 * 
 * @author rohanarya
 * 
 */
public class DiameterOfTree<T> {

	public int calculateHieghtAndUpdateDiameter(ITreeNode<T> root,
			IntHolder diameter) {
		int leftDepth = 0, rightDepth = 0;
		if (root == null) {
			return 0;
		}
		if (root.getLeft() != null) {
			leftDepth = calculateHieghtAndUpdateDiameter(root.getLeft(),
					diameter);
		}
		if (root.getRight() != null) {
			rightDepth = calculateHieghtAndUpdateDiameter(root.getRight(),
					diameter);
		}
		diameter.setDiameter(Math.max(diameter.getDiameter(), rightDepth
				+ leftDepth + 1));
		return Math.max(leftDepth, rightDepth) + 1;
	}

	/**
	 * Just a holder to maintain the state of daimeter across the recursive
	 * stack.
	 * 
	 * @author rohanarya
	 * 
	 */
	public static class IntHolder {

		private Integer diameter;

		public IntHolder() {
			diameter = Integer.valueOf(0);
		}

		public Integer getDiameter() {
			return diameter;
		}

		public void setDiameter(Integer diameter) {
			this.diameter = diameter;
		}

	}
}
