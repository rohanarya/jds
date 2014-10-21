package jsd.core.list;

public interface IList<T> {

    IListNode<T> getRootNode();

    void addElement(T element);

    void removeElement(T element);

    void displayList();
    
    void reverseList();

}
