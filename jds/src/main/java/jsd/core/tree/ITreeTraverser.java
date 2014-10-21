package jsd.core.tree;

/**
 * @author R.Arya
 * @version $Id$
 * @since 0.1.1
 */
public interface ITreeTraverser<T> {

    void traverse(ITreeNode<T> treeNode);

}
