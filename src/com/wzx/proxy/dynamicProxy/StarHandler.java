package com.wzx.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;

import javax.xml.ws.handler.Handler;
import javax.xml.ws.handler.HandlerResolver;
import javax.xml.ws.handler.PortInfo;

public class StarHandler implements InvocationHandler {

	Star realStar;
	

	public StarHandler(Star realStar) {
		super();
		this.realStar = realStar;
	}


	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		Object object=null;
		System.out.println("��������̸");
		System.out.println("�������ն���");
		System.out.println("�����˶���Ʊ");
		if(method.getName().equals("sing")) {			
			 object = method.invoke(realStar, args);
		}
		System.out.println("��������β��");
		
		
		return object;
	}

}
