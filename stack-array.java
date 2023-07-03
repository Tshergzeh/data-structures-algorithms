public class ResizingArrayStackOfStrings {

  // creates instance variables
  private String[] s;
  private int N = 0;
  
  public ResizingArrayStackOfStrings() { s = new String[1]; } // start with an array size of 1

  // checks if the stack is empty by returning whether or not the size is 0
  public boolean isEmpty() { return N == 0; }

  public void push(String item) { 
    if (N == s.length) resize(2 * s.length); // if the array is full, call the resize method to double its size
    s[N++] = item;  // use the current size to index into the new array, store the pushed item in that position, increment the size of the array
  }

  private void resize(int capacity) {
    String[] copy = new String[capacity]; // create a new array of strings with the size passed as the method argument
    for (int i = 0; i < N; i++)
      copy[i] = s[i]; // store each of the items in the previous array into the new array
    s = copy; // replace the previous array with the new 
  
  public String pop() { 
    String item = s[--N]; // decrement the size of the array and use the new size to index into the array, storing the last item in the array
    s[N] = null; // remove the last item by changing its value to null so that the garbage collect can reclaim memory
    return item; // returned the previously stored last item
  }
}
