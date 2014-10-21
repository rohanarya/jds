package jsd.core.list;

public interface IListNode<T> {

    T getValue();

    void setValue(T value);

    IListNode<T> getNextNode();

    void setNextNode(IListNode<T> nextNode);

}
