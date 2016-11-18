package com.leave.design.action.template;

public abstract class Worker {
	// 抽象类定义整个流程骨架
	public void oneDay() {
		//上班
		goWork();
		//上班中
		startWork();
		//下班
		offDuty();
	}

	public abstract void offDuty();

	public abstract void startWork();

	public abstract void goWork();
}
