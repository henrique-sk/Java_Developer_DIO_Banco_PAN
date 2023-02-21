package a2_stacks_lifo.a2a_implementation;

public class Stack {

  private Node nodeReferenceStackInput;

  public Stack() {
    this.nodeReferenceStackInput = null;
  }

  public void push(Node newNode) {
    Node secondaryReference = nodeReferenceStackInput;
    nodeReferenceStackInput = newNode;
    nodeReferenceStackInput.setNodeReference(secondaryReference);
  }

  public Node pop() {
    if (!this.isEmpty()) {
      Node poppedNode = nodeReferenceStackInput;
      nodeReferenceStackInput = nodeReferenceStackInput.getNodeReference();
      return poppedNode;
    }
    return null;
  }

  public Node top() {
    return nodeReferenceStackInput;
  }

  public boolean isEmpty() {
    return nodeReferenceStackInput == null ? true : false;
  }

  @Override
  public String toString() {
    String stringOutput = "---------------\n";
    stringOutput += "    Pilha\n";
    stringOutput += "---------------\n";

    Node secondaryNode = nodeReferenceStackInput;

    while (true) {
      if (secondaryNode != null) {
        stringOutput += "[Node{data=" + secondaryNode.getData() + "}]\n";
        secondaryNode = secondaryNode.getNodeReference();
      } else {
        break;
      }
    }
    stringOutput += "===============\n";
    return stringOutput;

  }
}
