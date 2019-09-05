package john.stack;

/*
 * 
 */
import java.util.EmptyStackException;

/*
 * 
 */
public class MyStack<T> {

	// **** private ****
	private StackNode<T>	top;
	
	/*
	 * Push specified data into stack.
	 */
	public void push(T data) {
		
		// **** allocate new item for the stack ****
		StackNode<T> item = new StackNode<T>(data);
		
		// **** set next in the item ****
		item.setNext(top);
		
		// **** update the top of the stack ****
		top = item;
	}
	
	/*
	 * Pop element from stack.
	 */
	public T pop() {
		
		// **** check if stack is empty ****
		if (top == null)
			throw new EmptyStackException();
			
		// **** get the top item ****
		T item = top.getData();
		
		// **** update the top ****
		top = top.getNext();
		
		// **** return the item ****
		return item;
	}
	
	/*
	 * Peek top element in stack.
	 */
	public T peek() {
		
		// **** check if stack is empty ****
		if (top == null)
			throw new EmptyStackException();

		// **** return the value at the top of the stack ****
		return top.getData();
	}
	
	/*
	 * Check if stack is empty.
	 */
	public boolean isEmpty() {
		return top == null;
	}
	
	/*
	 * Return a string with the contents of the stack.
	 */
	public String toString() {
		
		// **** check if stack is empty ****
		if (top == null)
			return "[ ]";
		
		// **** ****
		StringBuilder sb = new StringBuilder("[ ");
		
		// **** ****
		StackNode<T> t = top;
		
		// **** traverse the stack ****
		while (t != null) {
			
			// *** ****
			if (t.getNext() != null)
				sb.append(t.getData() + " -> ");
			else
				sb.append(t.getData());
			
			// **** ****
			t = t.getNext();
		}
		
		// **** ****
		sb.append(" ]");
		
		// **** ****
		return sb.toString();
	}
}
