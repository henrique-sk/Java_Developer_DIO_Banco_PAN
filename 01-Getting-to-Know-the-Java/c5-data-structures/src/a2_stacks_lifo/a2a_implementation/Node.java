package a2_stacks_lifo.a2a_implementation;

public class Node {
  private int data;
  private Node nodeReference = null;
  
  public Node() {
  }

  public Node(int data) {
    this.data = data;
  }

  public int getData() {
    return data;
  }

  public void setData(int data) {
    this.data = data;
  }

  public Node getNodeReference() {
    return nodeReference;
  }

  public void setNodeReference(Node nodeReference) {
    this.nodeReference = nodeReference;
  }

  @Override
  public String toString() {
    return "Node [data=" + data + "]";
  }
  
}
