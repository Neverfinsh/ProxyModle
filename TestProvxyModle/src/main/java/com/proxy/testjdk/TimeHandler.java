package com.proxy.testjdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;


/***
 * 
 * 功能:总的的代理类,可以为给各种实例进行代理
 * 
 * @author Lw
 * 2017年8月17日
 *
 */
public class TimeHandler implements InvocationHandler {

	// 聚合方式有什么好处？

	private Object target;

	public TimeHandler(Object target) {
		super();
		this.target = target;
	}

	/***
	 * 参数：被代理的对象
	 * 
	 * proxy： 被代理的对象 agrs: 代理的参数 methon: 代理的方法
	 */

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
		 throws Throwable {
          //增加业务代码
		  long startime=System.currentTimeMillis();
          System.out.println("汽车开始 >>>>>>>>>>>>>>>>");
		  method.invoke(target);//被代理的对象
		  long endtime=System.currentTimeMillis();
          System.out.println("汽车结束行驶 <<<<<<<<<<<");
          System.out.println("汽车行驶的时间："+(endtime-startime)+"毫秒");
		  return null;
	}
}
