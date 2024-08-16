package com_stack_with_linkedList;

	import java.util.Stack;
	
	
	public class Queue {

	    private Stack<Integer> stack1;
	    private Stack<Integer> stack2;

	    public Queue() {
	        stack1 = new Stack<>();
	        stack2 = new Stack<>();
	    }

	    public void enqueue(int data) {
	        while (!stack1.isEmpty()) {
	            stack2.push(stack1.pop());
	        }

	        stack1.push(data);

	        while (!stack2.isEmpty()) {
	            stack1.push(stack2.pop());
	        }

	        System.out.println(data + " enqueued to the queue.");
	    }

	    public int dequeue() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return -1;
	        }

	        return stack1.pop();
	    }

	    public int peek() {
	        if (isEmpty()) {
	            System.out.println("Queue is empty.");
	            return -1;
	        }

	        return stack1.peek();
	    }

	    public boolean isEmpty() {
	        return stack1.isEmpty();
	    }
	

	
	    public static void main(String[] args) {
	        Queue queue = new Queue();

	        queue.enqueue(10);
	        queue.enqueue(20);
	        queue.enqueue(30);

	        System.out.println("Front element: " + queue.peek());

	        System.out.println(queue.dequeue() + " dequeued from the queue.");
	        System.out.println(queue.dequeue() + " dequeued from the queue.");

	        System.out.println("Is the queue empty? " + queue.isEmpty());
	    }
	}

	
