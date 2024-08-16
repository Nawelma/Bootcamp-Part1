package com_doublyLinked;

public class DoublyLinkedList {
	
	    private Node head;
	    private Node tail;

	    private class Node {
	        int data;
	        Node next;
	        Node prev;

	        Node(int data) {
	            this.data = data;
	        }
	    }

	    public void addFirst(int data) {
	        Node newNode = new Node(data);
	        if (head == null) {
	            head = tail = newNode;
	        } else {
	            newNode.next = head;
	            head.prev = newNode;
	            head = newNode;
	        }
	    }

	    public void addLast(int data) {
	        Node newNode = new Node(data);
	        if (tail == null) {
	            head = tail = newNode;
	        } else {
	            tail.next = newNode;
	            newNode.prev = tail;
	            tail = newNode;
	        }
	    }

	    // Additional methods like remove, display, etc. can be added here.
	}

