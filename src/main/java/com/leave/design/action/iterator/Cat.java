package com.leave.design.action.iterator;

public class Cat {
	private String id;

	public Cat(String id) {
		super();
		this.id = id;
	}

	public Cat() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Cat [id=" + id + "]";
	}
}
