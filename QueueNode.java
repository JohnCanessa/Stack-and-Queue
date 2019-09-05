package john.stack;

/*
 * Node used to build a queue.
 */
public class QueueNode<T> {

	// **** members ****
	private T 				data;
	private QueueNode<T>	next;
	
	/*
	 * Constructor.
	 */
	public QueueNode(T data) {
		this.data = data;
		this.next = null;
	}

	/*
	 * Get next element.
	 */
	public QueueNode<T> getNext() {
		return this.next;
	}
	
	/*
	 * Set next element.
	 */
	public void setNext(QueueNode<T> node) {
		this.next = node;
	}
	
	/*
	 * Get the data from the node.
	 */
	public T getData() {
		return this.data;
	}
	
}
