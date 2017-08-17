package com.proxy.static2;

import com.proxy.static1.Car;
import com.proxy.static1.Moveable;

public class Test {
	public static void main(String[] args) {
		Car car=new Car();
		Moveable m=new Car3(car);
		m.move();
	}

}
