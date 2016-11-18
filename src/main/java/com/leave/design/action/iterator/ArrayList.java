package com.leave.design.action.iterator;

public class ArrayList implements Collection {
	Object[] objects = new Object[10];
	int index = 0;
	public void add(Object o){
		if(index==objects.length){
			Object[] newObjects = new Object[objects.length*2];
			System.arraycopy(objects, 0, newObjects, 0, objects.length);
			objects = newObjects;
		}
		objects[index++] = o;
	}
	
	public int size(){
		return index;
	}
	public static void main(String[] args) {
		int index = 0;
		System.out.println(index++);
		
		ArrayList list = new ArrayList();
		for(int i=0;i<15;i++){
			list.add("info - "+ i);
		}
		System.out.println(list.size());
	}

	public Iterator iterator() {
		// TODO Auto-generated method stub
		return new ArrayListIterator();
	}
	private class ArrayListIterator implements Iterator{
		private int currentIndex = 0;
		public Object next() {
			Object o = objects[currentIndex++];
			return o;
		}

		public boolean hasNext() {
			if(currentIndex > index )
				return false;
			return true;
		}
		
	}
}
