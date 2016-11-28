package com.leave.design.action.visitor;

public class Visitor implements IVisitor{

	@Override
	public void visit(ConcreteElement1 element) {
		element.doSomething();
	}

	@Override
	public void visit(ConcreteElement2 element) {
		element.doSomething();
	}

}
