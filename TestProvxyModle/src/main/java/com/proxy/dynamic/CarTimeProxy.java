package com.proxy.dynamic;

import com.proxy.static1.Car;
import com.proxy.static1.Moveable;

/****
 *  聚合方式的静态代理
 * 代理类的中的：做功能的叠加
 * 
 * @author Lw
 * 2017年8月17日
 *
 */

public class CarTimeProxy implements Moveable {
	
    /***
     * 组合的
     */
	private Moveable m;
	public CarTimeProxy(Moveable m ) {
		super();
		this.m=m;
	}
	
	
	@Override
	public void move() {
		long startime=System.currentTimeMillis();
        System.out.println("汽车开始 >>>>>>>>>>>>>>>>");
        m.move();
        System.out.println("汽车结束行驶 <<<<<<<<<<<");
        long endtime=System.currentTimeMillis();
        System.out.println("汽车行驶的时间："+(endtime-startime)+"毫秒");
		
	}
	
	

}
