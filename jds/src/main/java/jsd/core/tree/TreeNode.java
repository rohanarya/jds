package jsd.core.tree;

/**
 * The Class TreeNode.
 * @param <T> the generic type
 */
public class TreeNode<T> implements ITreeNode<T> {

    /** The value. */
    private T value;

    /** The left. */
    private ITreeNode<T> left;

    /** The right. */
    private ITreeNode<T> right;

    /** {@inheritDoc} */
    @Override
    public T getValue() {
        return value;
    }

    /** {@inheritDoc} */
    @Override
    public ITreeNode<T> getLeft() {
        return left;
    }

    /** {@inheritDoc} */
    @Override
    public ITreeNode<T> getRight() {
        return right;
    }

    /** {@inheritDoc} */
    @Override
    public void setValue(T value) {
        this.value = value;
    }

    /** {@inheritDoc} */
    @Override
    public void setLeft(ITreeNode<T> left) {
        this.left = left;
    }

    /** {@inheritDoc} */
    @Override
    public void setRight(ITreeNode<T> right) {
        this.right = right;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return value.toString();
    }
}
