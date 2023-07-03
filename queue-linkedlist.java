public class LinkedQueueOfStrings {
  private Node first, last;

  private class Node {
      String item;
      Node next;
  }

  // check whether the queue is empty by comparing the first value to null
  public boolean isEmpty() { return first == null; } 

  public void enqueue(String item) {
    Node oldlast = last; // store a pointer to the last item in the queue
    last = new Node(); // create a new node item
    last.item = item; // store the enqueued string into the most recently created node
    last.next = null; // make the most recently created item the last by including a pointer to null
    if (isEmpty()) first = last; 
    else oldlast.next = last;
  }

  public String dequeue() {
    String item = first.item; // store the item in front of the queue
    first = first.next; // advance the first pointer to the next item on the queue
    if (isEmpty()) last = null; // if the queue is empty after removing the item, set the last pointer to null
    return item; // return the stored item
  }
}
