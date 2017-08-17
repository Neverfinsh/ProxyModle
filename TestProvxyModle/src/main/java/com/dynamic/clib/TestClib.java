package com.dynamic.clib;

public class TestClib {
	public static void main(String[] args) {
//		创建代理类的对象
		CglibProxy proxy=new CglibProxy();
//	     创建一个具体类的代理类，即火车代理类的
		Train t=(Train) proxy.getProxy(Train.class);
		t.move();
	}

}
