package practice;

public class RunnerClass {
	public static void main(String args[]) {
		
		
//		MyQueue<Integer> queue = new MyQueue<Integer>();
//		queue.append(1);
//		queue.append(2);
//		queue.append(3);
//		queue.append(4);
//		queue.append(5);
//		
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		System.out.println(queue.pop());
//		
//		System.out.println(queue.pop());
//		
//		MyStack<Integer> stack = new MyStack<Integer>();
//		stack.push(1);
//		stack.push(2);
//		stack.push(3);
//		stack.push(4);
//		stack.push(5);
//		
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		System.out.println(stack.pop());
//		
		
		BinaryTree<Integer> bt = new BinaryTree<Integer>();
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(5);
		
		bt.printInorder();
		System.out.println("Print Height "+ bt.getHeight());
		
	}
}
