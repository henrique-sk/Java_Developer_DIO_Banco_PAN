package a1_basic_concepts.a1a_assignment_and_reference;

public class MyObject {
  
  Integer num;
   
  public MyObject(Integer num) {
    this.num = num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  @Override
  public String toString() {
    return this.num.toString();
  }

}
