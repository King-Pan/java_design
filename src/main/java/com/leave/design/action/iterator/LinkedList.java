package com.leave.design.action.iterator;

public class LinkedList  implements Collection {
	Node head = null;
	Node tail = null;
	int size;
	public void add(Object o){
		//链表的第一个节点
		Node node = new Node(o,null);
		if(head == null){
			head = node;
			tail = node;
		}
		tail.setNext(node);
		tail = node;
		size ++ ;
	}
	
	public int size(){
		return size;
	}

	public Iterator iterator() {
		return new LinkedListIterator();
	}
	
	private class LinkedListIterator implements Iterator{

		public Object next() {
			//if(size)
			return null;
		}

		public boolean hasNext() {
			return false;
		}
		
	}
}
