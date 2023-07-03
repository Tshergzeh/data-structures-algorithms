public class FixedCapacityStackOfStrings {
  // creates instance variables
  private String[] s;
  private int N = 0;

  // asking clients to supply capacity is a cheat as the client code is meant to be separate from the implementation
  public FixedCapacityStackOfStrings(int capacity) { s = new String[capacity]; }

  // checks if the stack is empty by returning whether or not the size is 0
  public boolean isEmpty() { return N == 0; }

  // pushes a new item to the top of the stack by using the current size to index into the array,
  // saving the item, and incrementing the size
  public void push(String item) { s[N++] = item; }

  // pops the most recent item from the stack by decrementing the size and indexing into the array
  public String pop() { return s[--N]; }
}
