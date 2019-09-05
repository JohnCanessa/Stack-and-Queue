package john.stack;

/*
 * 
 */
public class Solution {

	/*
	 * Test scaffolding.
	 */
	public static void main(String[] args) {
		
		// **** instantiate a stack ****
		MyStack<Integer> stack = new MyStack<Integer>();

		// **** display if stack is empty ****
		System.out.println("main <<< stack.isEMpty: " + stack.isEmpty());
		
		// **** loop pushing values into the stack ****
		for (int i = 0; i < 7; i++) {
			stack.push(i);
			System.out.println("main <<< stack.push: " + i);
		}
		
		// **** display if stack is empty ****
		System.out.println("main <<< stack.isEMpty: " + stack.isEmpty());
		
		// **** display the contents of the stack ****
		System.out.println("main <<< stack: " + stack.toString());

		// **** loop popping the stack ****
		while (!stack.isEmpty())
			System.out.println("main <<<< stack.pop: " + stack.pop());
		
		// **** display if the stack is empty ****
		System.out.println("main <<< stack.isEMpty: " + stack.isEmpty());
		
		// **** display the contents of the stack ****
		System.out.println("main <<< stack: " + stack.toString());
		System.out.println();
		
		
		// **** instantiate a queue ****
		MyQueue<Integer> queue = new MyQueue<Integer>();
		
		// **** display if the queue is empty ****
		System.out.println("main <<< queue.isEmpty: " + queue.isEmpty());
		
		// **** loop adding elements into the queue ****
		for (int i = 0; i < 7; i++) {
			queue.add(i);
			System.out.println("main <<< queue.add: " + i);
		}

		// **** display if the queue is empty ****
		System.out.println("main <<< queue.isEmpty: " + queue.isEmpty());
		
		// **** display the contents of the queue ****
		System.out.println("main <<< queue: " + queue.toString());
		
		// **** loop removing elements from the queue ****
		while (!queue.isEmpty()) {
			System.out.println("main <<< queue.remove: " + queue.remove());
		}
		
		// **** display if the queue is empty ****
		System.out.println("main <<< queue.isEmpty: " + queue.isEmpty());
		
		// **** display the contents of the queue ****
		System.out.println("main <<< queue: " + queue.toString());
	}
	
}
