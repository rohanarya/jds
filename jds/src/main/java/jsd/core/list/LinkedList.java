package jsd.core.list;

public class LinkedList<T extends Comparable<T>> implements IList<T> {

    IListNode<T> rootNode;

    /** {@inheritDoc} */
    @Override
    public IListNode<T> getRootNode() {
        return rootNode;
    }

    /** {@inheritDoc} */
    @Override
    public void addElement(T element) {
        IListNode<T> newNode = new LinkedListNode<T>();
        newNode.setValue(element);
        if (rootNode == null) {
            rootNode = newNode;
            return;
        }
        newNode.setNextNode(rootNode);
        rootNode = newNode;
    }

    /** {@inheritDoc} */
    @Override
    public void removeElement(T element) {
        if (rootNode.getValue().compareTo(element) == 0) {
            rootNode = rootNode.getNextNode();
            return;
        }
        IListNode<T> tempNode = rootNode;
        while (tempNode.getNextNode() != null) {
            if (tempNode.getNextNode().getValue().compareTo(element) == 0) {
                tempNode.setNextNode(tempNode.getNextNode().getNextNode());
                return;
            }
            tempNode = tempNode.getNextNode();
        }

    }

    /** {@inheritDoc} */
    @Override
    public void displayList() {
        IListNode<T> tempNode = rootNode;
        while (tempNode != null) {
            System.out.println(tempNode.getValue().toString());
            tempNode = tempNode.getNextNode();
        }

    }

    /** {@inheritDoc} */
    @Override
    public void reverseList() {
        if (rootNode == null) {
            return;
        }
        IListNode<T> tempNodeOne = rootNode;
        IListNode<T> currentNode = rootNode.getNextNode();
        IListNode<T> nextNode = rootNode.getNextNode().getNextNode();
        tempNodeOne.setNextNode(null);
        while (currentNode != null) {
            currentNode.setNextNode(tempNodeOne);
            tempNodeOne = currentNode;
            currentNode = nextNode;
            if (nextNode != null) {
                nextNode = nextNode.getNextNode();
            }
        }
        rootNode = tempNodeOne;
    }
}
