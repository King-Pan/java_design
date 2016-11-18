package com.leave.design.action.iterator;

public class Node {
	private Object data;
	private Object next;
	
	public Node() {
		super();
	}
	public Node(Object data, Object next) {
		super();
		this.data = data;
		this.next = next;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public Object getNext() {
		return next;
	}
	public void setNext(Object next) {
		this.next = next;
	}
}
