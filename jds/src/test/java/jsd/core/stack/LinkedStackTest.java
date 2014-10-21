package jsd.core.stack;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class LinkedStackTest {

    LinkedStack<Integer> stackUsingLinkedList;

    @BeforeMethod
    public void setup() {
        stackUsingLinkedList = new LinkedStack<Integer>();
    }

    public void testBasicOperations() {
        stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(11);
        stackUsingLinkedList.push(12);
        assertEquals(stackUsingLinkedList.peek(), Integer.valueOf(12));
        assertEquals(stackUsingLinkedList.pop(), Integer.valueOf(12));
        assertFalse(stackUsingLinkedList.isEmpty());
        assertEquals(stackUsingLinkedList.pop(), Integer.valueOf(11));
        assertEquals(stackUsingLinkedList.pop(), Integer.valueOf(10));
        assertTrue(stackUsingLinkedList.isEmpty());
    }

}
