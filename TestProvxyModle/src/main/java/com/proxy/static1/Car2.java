package com.proxy.static1;


/***
 * 
 * 功能:Car2对car的代理模式，通过继承的方式进行添加多余的的业务代码。
 * 
 * @author Lw
 * 2017年8月16日
 *
 */

public class Car2 extends Car {
	
	@Override
	  public void  move(){
		   long startime=System.currentTimeMillis();
           System.out.println("汽车开始 >>>>>>>>>>>>>>>>");
           super.move();
           long endtime=System.currentTimeMillis();
           System.out.println("汽车结束行驶 <<<<<<<<<<<");
           System.out.println("汽车行驶的时间："+(endtime-startime)+"毫秒");
		
	}
		
}
