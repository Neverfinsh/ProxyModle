package com.proxy.static1;



public class Car implements Moveable {


	/***
	 * 具体实现接口
	 */
	@Override
	public void move() {	
          try {
			Thread.sleep(100);
			System.out.println("---------汽车行驶中 ------------");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
          
	}



}
