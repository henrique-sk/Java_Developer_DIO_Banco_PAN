package a3_queue_fifo.a3a_concept;

public class Node<T> {

  private T object;
  private Node<T> nodeReference;

  public Node() {
  }

  public Node(T object) {
    this.object = object;
    this.nodeReference = null;
  }

  public T getObject() {
    return object;
  }

  public void setObject(T object) {
    this.object = object;
  }

  public Node getNodeReference() {
    return nodeReference;
  }

  public void setNodeReference(Node nodeReference) {
    this.nodeReference = nodeReference;
  }

  @Override
  public String toString() {
    return "Node [object=" + object + "]";
  }

}
