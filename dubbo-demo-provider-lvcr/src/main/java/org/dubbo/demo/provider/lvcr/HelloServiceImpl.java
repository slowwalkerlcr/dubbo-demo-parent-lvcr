package org.dubbo.demo.provider.lvcr;

import org.dubbo.demo.api.lvcr.IHelloWorldService;

/**
 * 
 * TODO 负载均衡  服务器2
 * @Date  2017年3月30日 下午9:49:36   	 
 * @author Administrator  
 * @version
 */
public class HelloServiceImpl implements IHelloWorldService {

	public String sayHello(String str) {
		// TODO Auto-generated method stub
		return "Hello 我是服务器2"+str;
	}

}
