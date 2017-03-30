package com.dubbo.demo.group.provider.lvcr;

import org.dubbo.demo.api.lvcr.IHelloWorldService;

/**
 * 
 * TODO 服务分组----一个接口不同实现 
 * @Date  2017年3月30日 下午9:57:39   	 
 * @author Administrator  
 * @version
 */
public class EnglishHelloServiceImpl implements IHelloWorldService {

	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return "Hello  English  "+str;
	}

}
