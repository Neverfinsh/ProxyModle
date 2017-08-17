package com.proxy.dynamic;

import com.proxy.static1.Car;


/****
 * 
 * 功能：可以进行代理类的
 * 
 * @author Lw
 * 2017年8月17日
 *
 */
public class TestDynamic {
public static void main(String[] args) {
	
	Car car=new Car();
	CarTimeProxy time=new CarTimeProxy(car);
	CarLogProxy log=new CarLogProxy(time);
	log.move();
	 
}
}
