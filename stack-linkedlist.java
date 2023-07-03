public class LinkedStackOfStrings
{
    // Constructor
    private Node first = null; // initialize the first item in the stack to point to null

    private class Node {
        String item;
        Node next;
    }
	
    // method returns whether the stack is empty by checking whether the first item is null
    public boolean isEmpty() { return first == null; } 

    public void push(String item) {
        Node oldfirst = first; // first save a pointer the first item in the list
        first = new Node(); // create a new node to be placed at the beginning of the list

	// set the instance variables in the new node
	first.item = item;
        first.next = oldfirst;
    }

    public String pop {
        String item = first.item; // save the first item to be returned 
        first = first.next; // advance the pointer to the first item to point to the next item, leaving the previous first to be collected by the garbage collector
        return item; // return the saved item
    }

    public static void main(String[] args) {
	StackOfStrings stack = new StackOfStrings)_'
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            if (s.equals("-")) StdOut.print(stack.pop());
            else stack.push(s);
        }
    }
}
