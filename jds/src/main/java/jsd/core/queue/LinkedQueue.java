package jsd.core.queue;

import jsd.core.list.IListNode;
import jsd.core.list.LinkedListNode;

public class LinkedQueue<T> implements IQueue<T> {

    private IListNode<T> front;

    private IListNode<T> rear;

    private boolean empty = true;

    /** {@inheritDoc} */
    @Override
    public void offer(T element) {
        IListNode<T> newNode = new LinkedListNode<T>();
        newNode.setValue(element);
        if ((front == rear) && (front == null)) {
            front = newNode;
            rear = newNode;
            empty = false;
            return;
        }
        rear.setNextNode(newNode);
        rear = newNode;
    }

    /** {@inheritDoc} */
    @Override
    public T peek() {
        return front.getValue();
    }

    /** {@inheritDoc} */
    @Override
    public T poll() {
        if (!((front == rear) && (front == null))) {
            IListNode<T> polledNode = front;
            front = front.getNextNode();
            if (front == null) {
                rear = front;
                empty = true;
            }
            return polledNode.getValue();
        }
        return null;
    }

    /** {@inheritDoc} */
    @Override
    public boolean isEmpty() {
        return empty;
    }

}
