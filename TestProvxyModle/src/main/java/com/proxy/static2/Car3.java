package com.proxy.static2;

import com.proxy.static1.Car;
import com.proxy.static1.Moveable;

public class Car3  implements Moveable{

	private Car car;

//	TODO:?为什么？
	public Car3(Car car) {
		super();
		this.car=car;
	}

	@Override
	public void move() {
		long startime=System.currentTimeMillis();
        System.out.println("汽车开始 >>>>>>>>>>>>>>>>");
        car.move();
        System.out.println("汽车结束行驶 <<<<<<<<<<<");
        long endtime=System.currentTimeMillis();
        System.out.println("汽车行驶的时间："+(endtime-startime)+"毫秒");
		
	}

}
