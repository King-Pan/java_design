package com.leave.design.action.visitor;

/**
 * 元素实现类2
 * @author King-Pan
 *
 */
public class ConcreteElement2 implements IElement {

	@Override
	public void accept(IVisitor visitor) {
		visitor.visit(this);    
	}

	@Override
	public void doSomething() {
		System.out.println("这是元素2");
	}

}