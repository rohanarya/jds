package jsd.core.stack;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;
import jsd.core.queue.LinkedQueue;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

@Test
public class LinkedQueueTest {

    private LinkedQueue<Integer> linkedQueue;

    @BeforeMethod
    public void setup() {
        linkedQueue = new LinkedQueue<Integer>();
    }

    public void testBasicOperations() {
        linkedQueue.offer(6);
        linkedQueue.offer(7);
        linkedQueue.offer(8);
        linkedQueue.offer(9);
        assertEquals(linkedQueue.peek(), Integer.valueOf(6));
        assertFalse(linkedQueue.isEmpty());
        assertEquals(linkedQueue.poll(), Integer.valueOf(6));
        assertEquals(linkedQueue.poll(), Integer.valueOf(7));
        assertEquals(linkedQueue.poll(), Integer.valueOf(8));
        assertEquals(linkedQueue.poll(), Integer.valueOf(9));
        assertTrue(linkedQueue.isEmpty());
    }
}
