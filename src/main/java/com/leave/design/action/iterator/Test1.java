package com.leave.design.action.iterator;

import org.junit.Test;

public class Test1{
	@Test
	public void testArrayList(){
		ArrayList list = new ArrayList();
		for(int i=0;i<15;i++){
			list.add(new Cat("cat - " + i));
		}
		System.out.println(list.size());
	}
	
	@Test
	public void testLinkedList(){
		LinkedList list = new LinkedList();
		for(int i=0;i<15;i++){
			list.add(new Cat("cat - " + i));
		}
		System.out.println(list.size());
	}
	
	/**
	 * 面向接口编程:容器可替换性
	 */
	@Test
	public void testLinkedList2(){
		Collection list = new LinkedList();
		for(int i=0;i<15;i++){
			list.add(new Cat("cat - " + i));
		}
		System.out.println(list.size());
	}
}
