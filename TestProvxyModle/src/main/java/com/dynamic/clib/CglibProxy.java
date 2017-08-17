package com.dynamic.clib;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CglibProxy  implements MethodInterceptor{
	
    private Enhancer enhancer=new Enhancer();//  代理类的属性
    
   // 获取一个代理类,参数:要代理的对象.
	public Object getProxy(Class clazz){
       //创建代理类，即代理类的子类，设置创建子类的类
		enhancer.setSuperclass(clazz);
		//设置回调函数
		enhancer.setCallback(this);
		//创建一个子类的实例
		return enhancer.create();
		
	}
	/***
	 * 参数:  
	 * obj:        目标的实例
	 * method:     目标方法的对象
	 * args:       方法的参数
	 * proxy:      代理类的实例
	 * 
	 */

	@Override
	public Object intercept(Object obj, Method method, Object[] args,
			MethodProxy proxy) throws Throwable {
		
		   System.out.println("日志开始------");
//		      代理类调用父类的方法(即train类中的move的方法).
		   proxy.invokeSuper(obj, args);
		   System.out.println("日志结束------");
		   
		   return null;
	}

}
