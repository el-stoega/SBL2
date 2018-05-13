package de.ur.adp.linkedlist;


import java.util.Objects;

public class Node<T> {

  private final T content;
  private Node nextNode;

  /**
   * Create a new Node. The content should not be editable afterwards
   *
   * @param content
   *         an integer
   */
  public Node(T content) {
    this.content = content;
  }

  /**
   * Get the Node's content
   *
   * @return the Node's content
   */
  public T getContent() {
    return content;
  }

  /**
   * Get the next Node
   *
   * @return the next Node
   */
  public Node getNextNode() {
    return nextNode;
  }

  /**
   * Set the next Node
   *
   * @param nextNode
   *         the next Node
   */
  public void setNextNode(Node nextNode) {
    this.nextNode = nextNode;
  }

  /**
   * Two Nodes are equals if
   * a) their content is the same and
   * b) they both have the same next node
   *
   * @param o
   *         another object which should be a Node
   * @return
   */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Node)) return false; // o is not a Node

    Node otherNode = (Node) o;

    if (!otherNode.content.equals(this.content)) return false; // content not equal

    // both have null as next node
    if (otherNode.nextNode == null && this.nextNode == null) return true;

    // otherNode's nextNode is a real node
    if (otherNode.nextNode != null && otherNode.nextNode.equals(this.nextNode)) return true;

    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, nextNode);
  }
}
