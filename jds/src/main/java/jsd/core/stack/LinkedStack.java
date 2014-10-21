package jsd.core.stack;

import java.util.EmptyStackException;

import jsd.core.list.IListNode;
import jsd.core.list.LinkedListNode;

public class LinkedStack<T> implements IStack<T> {

    private IListNode<T> head;

    private boolean empty = true;

    /** {@inheritDoc} */
    @Override
    public void push(T element) {
        IListNode<T> newNode = new LinkedListNode<T>();
        newNode.setValue(element);
        if (empty) {
            empty = false;
        } else {
            newNode.setNextNode(head);
        }
        head = newNode;
    }

    /** {@inheritDoc} */
    @Override
    public T pop() {
        if (!empty) {
            IListNode<T> poppedNode = head;
            head = head.getNextNode();
            if (head == null) {
                empty = true;
            }
            return poppedNode.getValue();
        } else
            throw new EmptyStackException();
    }

    /** {@inheritDoc} */
    @Override
    public T peek() {
        return head.getValue();
    }

    /** {@inheritDoc} */
    @Override
    public boolean isEmpty() {
        return empty;
    }

}
