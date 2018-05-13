package de.ur.adp.linkedlist;


import org.junit.Test;

import static org.junit.Assert.*;

public class NodeTest {

  @Test
  public void testNode() {
    Node node1 = new Node(1);
    Node node2 = new Node(2);
    Node node3 = new Node(3);

    assertEquals("Node 1 content is correct", 1, node1.getContent());
    assertEquals("Node 2 content is correct", 2, node2.getContent());
    assertEquals("Node 3 content is correct", 3, node3.getContent());

    node1.setNextNode(node2);
    node2.setNextNode(node3);

    assertNotNull("Node 1 next is not null", node1.getNextNode());
    assertNotNull("Node 2 next is not null", node2.getNextNode());
    assertNull("Node 3 next is  null", node3.getNextNode());

    assertEquals("node 1 has the correct next node", node2, node1.getNextNode());
    assertEquals("node 2 has the correct next node", node3, node2.getNextNode());
  }

  @Test
  public void testEqualNodes() {
    Node noSuccessor1 = new Node(1);
    Node noSuccessor2 = new Node(1);

    assertNull(noSuccessor1.getNextNode());
    assertNull(noSuccessor2.getNextNode());

    assertEquals(noSuccessor1, noSuccessor2);

    Node successor1 = new Node(1);
    Node successor2 = new Node(1);
    Node successorButOtherValue = new Node(2);

    Node otherNode = new Node(2);

    successor1.setNextNode(otherNode);
    successor2.setNextNode(otherNode);
    successorButOtherValue.setNextNode(otherNode);

    assertEquals(successor1, successor2);
    assertNotEquals(successor1, successorButOtherValue);
    assertNotEquals(successor1, noSuccessor1);
  }

}
