package com.leave.design.action.adapter.obj;

import com.leave.design.action.adapter.cls.Source;
import com.leave.design.action.adapter.cls.Targetable;

public class Wrapper implements Targetable {
	
	private Source source;  
	
	public Wrapper(Source source){  
        super();  
        this.source = source;  
    }  
	
	@Override
	public void method1() {
		source.method1();
	}

	@Override
	public void method2() {
		 System.out.println("this is the targetable method!");  
	}

}
