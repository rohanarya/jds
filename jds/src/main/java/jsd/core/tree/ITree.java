package jsd.core.tree;

/**
 * @author R.Arya
 * @version $Id$
 * @since 0.1.1
 */
public interface ITree<T> {

    ITreeNode<T> getRootNode();

    void addElement(T element);

    void traverseTree(ITreeTraverser<T> treeTraverser);

}
