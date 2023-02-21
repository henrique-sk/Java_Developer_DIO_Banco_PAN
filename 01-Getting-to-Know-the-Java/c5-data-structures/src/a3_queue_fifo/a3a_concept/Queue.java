package a3_queue_fifo.a3a_concept;

public class Queue<T> {

  private Node<T> nodeReferenceInputQueue;

  public Queue() {
    this.nodeReferenceInputQueue = null;
  }

  public void enqueue(T object) {
    Node newNode = new Node(object);
    newNode.setNodeReference(nodeReferenceInputQueue);
    nodeReferenceInputQueue = newNode;
  }

  public T first() {
    if (!this.isEmpty()) {
      Node firstNode = nodeReferenceInputQueue;
      while (true) {
        if (firstNode.getNodeReference() != null) {
          firstNode = firstNode.getNodeReference();
        } else {
          break;
        }
      }
      return (T) firstNode.getObject();
    }
    return null;
  }

  public T dequeue() {
    if (!this.isEmpty()) {
      Node firstNode = nodeReferenceInputQueue;
      Node secondNode = nodeReferenceInputQueue;
      while (true) {
        if (firstNode.getNodeReference() != null) {
          secondNode = firstNode;
          firstNode = firstNode.getNodeReference();
        } else {
          secondNode.setNodeReference(null);
          break;
        }
      }
      return (T) firstNode.getObject();
    }
    return null;
  }

  public boolean isEmpty() {
    return nodeReferenceInputQueue == null ? true : false;
  }

  @Override
  public String toString() {
    String stringReturn = "";
    Node secondNode = nodeReferenceInputQueue;

    if (nodeReferenceInputQueue != null) {
      while (true) {
        stringReturn += "[Node{Object=" + secondNode.getObject() + "}]--->";
        if (secondNode.getNodeReference() != null) {
          secondNode = secondNode.getNodeReference();
        } else {
          stringReturn += "null";
          break;
        }
      }
    } else {
      stringReturn = "null";
    }
    return stringReturn;
  }
}
