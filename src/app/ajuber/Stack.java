package app.ajuber;


public class Stack {
  String stack[] = new String[1000];
  int top = 0;

  public void push(String data) {
    stack[top] = data;
    top++;
  }

  public String pop() {

    String data = null;
    if(isEmpty()) {
      System.out.println("There are no items in your Stack.");
    } else {
      top--;
      data = stack[top];
      stack[top] = null;
    }
    return data;

  }

  public int size() {
    return top;
  }

  public boolean isEmpty() {
    return top<=0;
  }

  public void print() {
    for(String n : stack) {
      if(n == null) {
        continue;
      } else {
        System.out.print(n + " ");
      }
    }
  }
}
