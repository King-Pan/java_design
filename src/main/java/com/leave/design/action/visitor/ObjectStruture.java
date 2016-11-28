package com.leave.design.action.visitor;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 结构对象
 * @author King-Pan
 *
 */
public class ObjectStruture {
	public static List<IElement> getList() {
		List<IElement> list = new ArrayList<IElement>();
		Random ran = new Random();
		for (int i = 0; i < 10; i++) {
			int a = ran.nextInt(100);
			if (a > 50) {
				list.add(new ConcreteElement1());
			} else {
				list.add(new ConcreteElement2());
			}
		}
		return list;
	}
}
