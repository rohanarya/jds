package jsd.core.list;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class LinkedListTest {

    private LinkedList<Integer> linkedList;

    @BeforeMethod
    public void setup() {
        linkedList = new LinkedList<Integer>();
    }

    public void testAddAndDisplay() {
        linkedList.addElement(2);
        linkedList.addElement(3);
        linkedList.addElement(4);
        linkedList.displayList();
        linkedList.addElement(5);
        linkedList.addElement(6);
        linkedList.addElement(7);
        linkedList.displayList();
        assertEquals(linkedList.getRootNode().getValue(), Integer.valueOf(7));
        assertEquals(linkedList.getRootNode().getNextNode().getValue(), Integer.valueOf(6));
    }

    public void testAddDelete() {
        linkedList.addElement(2);
        linkedList.addElement(3);
        linkedList.addElement(5);
        linkedList.addElement(6);
        linkedList.addElement(7);
        linkedList.displayList();
        assertEquals(linkedList.getRootNode().getValue(), Integer.valueOf(7));
        assertEquals(linkedList.getRootNode().getNextNode().getValue(), Integer.valueOf(6));
        linkedList.removeElement(6);
        assertEquals(linkedList.getRootNode().getNextNode().getValue(), Integer.valueOf(5));
        linkedList.removeElement(7);
        assertEquals(linkedList.getRootNode().getValue(), Integer.valueOf(5));
        assertEquals(linkedList.getRootNode().getNextNode().getValue(), Integer.valueOf(3));
    }

    public void testAddReverse() {
        linkedList.addElement(2);
        linkedList.addElement(3);
        linkedList.addElement(5);
        linkedList.addElement(6);
        linkedList.addElement(7);
        linkedList.displayList();
        assertEquals(linkedList.getRootNode().getValue(), Integer.valueOf(7));
        assertEquals(linkedList.getRootNode().getNextNode().getValue(), Integer.valueOf(6));
        linkedList.reverseList();
        linkedList.displayList();
    }
}
