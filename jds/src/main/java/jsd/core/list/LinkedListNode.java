package jsd.core.list;

public class LinkedListNode<T> implements IListNode<T> {

    private T value;

    private IListNode<T> nextNode;

    /** {@inheritDoc} */
    @Override
    public T getValue() {
        return value;
    }

    /** {@inheritDoc} */
    @Override
    public void setValue(T value) {
        this.value = value;
    }

    /** {@inheritDoc} */
    @Override
    public IListNode<T> getNextNode() {

        return nextNode;
    }

    /** {@inheritDoc} */
    @Override
    public void setNextNode(IListNode<T> nextNode) {
        this.nextNode = nextNode;
    }

    /** {@inheritDoc} */
    @Override
    public String toString() {
        return value.toString();
    }
}
