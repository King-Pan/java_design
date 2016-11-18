package com.leave.design.action.template;

public class TemplateTest {
	public static void main(String[] args) {
		Worker woker = new ITDog();
		woker.oneDay();
		System.out.println("##############################################");
		woker = new Leader();
		woker.oneDay();
	}
}
