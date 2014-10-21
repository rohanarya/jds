package jsd.core.tree.binarysearchtree;

import jsd.core.tree.ITreeNode;
import jsd.core.tree.ITreeTraverser;

public class InOrderTreeTraverser<T> implements ITreeTraverser<T> {

    /** {@inheritDoc} */
    @Override
    public void traverse(ITreeNode<T> treeNode) {
        if (treeNode != null) {
            traverse(treeNode.getLeft());
            System.out.println(" : " + treeNode.getValue());
            traverse(treeNode.getRight());
        }
    }

}
