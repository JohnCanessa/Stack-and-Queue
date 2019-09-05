package john.stack;

/*
 * 
 */
public class MyQueue<T> {

	// **** ****
	private QueueNode<T>	first 	= null;
	private QueueNode<T>	last 	= null;
	
	/*
	 * Add element to the queue.
	 */
	public void add(T item) {
		
		// **** allocate a node ****
		QueueNode<T> node = new QueueNode<T>(item);
		
		// **** the queue is empty ****
		if ((first == null) && (last == null)) {
			this.first = node;
			this.last  = node;
		}
		
		// **** the queue is not empty ****
		else {
			last.setNext(node);
			this.last = node;
		}
	}
	
	/*
	 * Check if queue is empty.
	 */
	public boolean isEmpty() {
		
		// **** ****
		if ((first == null) && (last == null))
			return true;
		else
			return false;
	}
	
	/*
	 * Remove the first element from the queue.
	 */
	public T remove() {
		
		QueueNode<T> node = null;
		
		// **** check if last element in the queue ****
		if ((first != null) && (last != null) && (first == last)) {
			node 		= last;
			this.first 	= null;
			this.last 	= null;
		}
		
		// **** remove first element from the queue ****
		else {
			node = first;
			first = first.getNext();
		}
		
		// **** ****
		return node.getData();
	}

	
	/*
	 * Return a string holding the values in the queue.
	 */
	public String toString() {
		
		// **** for performance ****
		StringBuilder sb = new StringBuilder("[ ");
		
		// **** traverse the queue ****
		QueueNode<T> p = this.first;
		while (p != null) {
			
			// **** display the value of this element ****
			if (p.getNext() != null)
				sb.append(p.getData() + " -> ");
			else
				sb.append(p.getData() + " ");
			
			// **** move to the next element ****
			p = p.getNext();
		}

		// **** close the list ****
		sb.append("]");

		// **** ****
		return sb.toString();
	}
}
