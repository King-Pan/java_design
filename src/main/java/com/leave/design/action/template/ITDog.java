package com.leave.design.action.template;

/**
 * IT狗
 * @author King-Pan
 *
 */
public class ITDog extends Worker {
	
	@Override
	public void goWork() {
		System.out.println("ITDOG:  挤了20分钟的公交,坐了80分钟的地铁，走了30分钟的路程终于在8点的最后一秒活着到达公司打卡.");
	}
	@Override
	public void startWork() {
		System.out.println("ITDOG:  处理昨天遗留下一堆的bug和用户改过的N多需求.");
	}
	@Override
	public void offDuty() {
		System.out.println("ITDOG:  终于在晚上9点准时下班了.");
	}
}
