package com.leave.design.action.visitor;

/**
 * 元素类
 * @author King-Pan
 *
 */
public interface IElement {
	public abstract void accept(IVisitor visitor);

	public abstract void doSomething();
}
