package jsd.core.tree.binarytree;

import jsd.core.tree.ITreeNode;

/**
 * This is a program to find the depth of Binary Tree.
 * 
 * @author rohanarya
 * 
 */
public class DepthTree<T> {

	public int depth(final ITreeNode<T> root) {
		int leftDepth = 0, rightDepth = 0;
		if (root == null)
			return 0;
		if (root.getLeft() != null) {
			leftDepth = depth(root.getLeft()) + 1;
		}
		if (root.getRight() != null) {
			rightDepth = depth(root.getRight()) + 1;
		}
		return (leftDepth > rightDepth) ? leftDepth : rightDepth;
	}

}
