package jsd.core.tree;

/**
 * @author R.Arya
 * @version $Id$
 * @since 0.1.1
 */
public interface ITreeNode<T> {

    T getValue();

    ITreeNode<T> getLeft();

    ITreeNode<T> getRight();

    void setValue(T value);

    void setLeft(ITreeNode<T> left);

    void setRight(ITreeNode<T> right);

}
