package com.leave.design.action.visitor;

import java.util.List;

/**
 * 客户端
 * 
 * @author King-Pan
 *
 */
public class Client {
	public static void main(String[] args) {
		List<IElement> list = ObjectStruture.getList();
		for (IElement e : list) {
			e.accept(new Visitor());
		}
	}
}
