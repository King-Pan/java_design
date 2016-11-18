package com.leave.design.action.template;

/**
 * 领导
 * @author King-Pan
 *
 */
public class Leader extends Worker {

	@Override
	public void goWork() {
		System.out.println("领导: 早上9:30出门，开车10分钟到达公司.");
	}
	@Override
	public void startWork() {
		System.out.println("领导: 秘书帮忙泡一杯茶，拿一份报纸看一上午，下午开个会，晚上和客户一起吃饭.");
	}

	@Override
	public void offDuty() {
		System.out.println("领导: 酒足饭饱后回到了家.");
	}
}
