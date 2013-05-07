
/*************************************************************************
 *  Compilation:  javac StackOfObjects.java
 *  Execution:    java StackOfObjects
 *
 *  A stack of objects implemented using a linked list.
 * 
 *  % java StackOfObjects
 *  This
 *  is
 *  a
 *  test.
 *  is
 *  a
 *  test.
 *
 *************************************************************************/

public class StackOfObjects {
    private Node first;        // top of stack

    // linked list node helper data type
    private class Node {
        private Object item;
        private Node next;
    }

    // create an empty stack
    public StackOfObjects() {
        first = null;
    }

    // is the stack empty?
    public boolean isEmpty() { return (first == null); }

    // add an element to the stack
    public void push(Object item) {
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    // delete and return the most recently added element
    public Object pop() {
        if (isEmpty()) throw new RuntimeException("Stack underflow");
        Object item = first.item;      // save item to return
        first = first.next;            // delete first node
        return item;                   // return the saved item
    }


    // a test client
    public static void main(String[] args) {
        StackOfObjects stack = new StackOfObjects();
        stack.push("test.");
        stack.push("This");
        System.out.println(stack.pop());
        stack.push("a");
        stack.push("is");
        while (!stack.isEmpty()) {
            String s = (String) stack.pop();
            System.out.println(s);
        }
    }
}

