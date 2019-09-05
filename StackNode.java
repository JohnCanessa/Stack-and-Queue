package john.stack;

/*
 * Node used to build a stack.
 */
public class StackNode<T> {

	// **** members ****
	private T 				data;
	private StackNode<T>	next;
	
	/*
	 * Constructor.
	 */
	public StackNode(T data) {
		this.data = data;
		this.next = null;
	}
	
	/*
	 * Get data.
	 */
	public T getData() {
		return data;
	}
	
	/*
	 * Get next.
	 */
	public StackNode<T> getNext() {
		return this.next;
	}
	
	/*
	 * Set next.
	 */
	public void	setNext(StackNode<T> node) {
		this.next = node;
	}
}
