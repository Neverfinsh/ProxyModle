package com.proxy.testjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import com.proxy.static1.Car;
import com.proxy.static1.Moveable;

/****
 * 
 * 功能:动态代理：不需要要写很多的代理类，
 * JDK:实现了接口的
 * 
 * @author Lw
 * 2017年8月17日
 *
 */

public class Test1 {
	public static void main(String[] args) {
		Car car=new Car();
		InvocationHandler h=new TimeHandler(car);
		Class <?> cls=car.getClass();
		/***
		 * 参数：
		 * 
		 * loader:       类的加载器;
		 * interfaces:   实现类的接口
		 * h:            invocationHandler
		 */
		 Moveable m =(Moveable) Proxy.newProxyInstance(cls.getClassLoader(), cls.getInterfaces(), h);
	     m.move();
	}
}
  