package de.ur.adp.containers;


import org.junit.Test;

import static org.junit.Assert.*;


public class QueueTest {

  @Test
  public void testQueue() {

    Queue<Integer> queue = new StudentsQueue<>();

    queue.put(1);
    queue.put(2);
    queue.put(3);
    queue.put(4);
    queue.put(5);
    queue.put(6);

    assertEquals("Queue size is 6", 6, queue.size());
    assertFalse("Queue is empty", queue.isEmpty());

    assertEquals("1 is 1", 1, queue.get().intValue());
    assertEquals("2 is 2", 2, queue.get().intValue());
    assertEquals("3 is 3", 3, queue.get().intValue());
    assertEquals("4 is 4", 4, queue.get().intValue());
    assertEquals("5 is 5", 5, queue.get().intValue());

    assertEquals("Queue size is 1", 1, queue.size());
    assertFalse("Queue is not empty", queue.isEmpty());

    assertEquals("6 is 6", 6, queue.get().intValue());
    assertTrue("Queue is empty", queue.isEmpty());

    assertNull("Queue returns null", queue.get());

  }

  @Test
  public void testCircularQueue() {
    int ringSize = 3;

    Queue<Integer> queue = new CircularQueue<>(ringSize);

    queue.put(1);
    queue.put(2);
    queue.put(3);

    assertEquals("Queue size is 3", 3, queue.size());
    assertFalse("Queue is empty", queue.isEmpty());

    // override
    queue.put(4); // overrides 1
    queue.put(5); // overrides 2

    // queue should be 3, 4, 5

    assertEquals("Queue size is 3", 3, queue.size());
    assertFalse("Queue is empty", queue.isEmpty());

    assertEquals("3 is 3", 3, queue.get().intValue());
    assertEquals("4 is 4", 4, queue.get().intValue());
    assertEquals("5 is 5", 5, queue.get().intValue());

    assertTrue("Queue is empty", queue.isEmpty());
    assertNull("Queue returns null", queue.get());

  }

}
