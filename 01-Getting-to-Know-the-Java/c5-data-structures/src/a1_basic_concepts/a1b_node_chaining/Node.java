package a1_basic_concepts.a1b_node_chaining;

public class Node<T> {

  private T content;
  private Node nextNode;
  
  public Node(T content) {
    this.content = content;
    this.nextNode = null;
  }

  public T getContent() {
    return content;
  }

  public void setContent(T content) {
    this.content = content;
  }

  public Node<T> getNextNode() {
    return nextNode;
  }

  public void setNextNode(Node<T> nextNode) {
    this.nextNode = nextNode;
  }

  @Override
  public String toString() {
    return "Node [content=" + content + "]";
  }  
  
}
