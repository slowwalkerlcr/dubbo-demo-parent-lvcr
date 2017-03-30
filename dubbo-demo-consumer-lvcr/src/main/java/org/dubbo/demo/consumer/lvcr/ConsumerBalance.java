package org.dubbo.demo.consumer.lvcr;

import org.dubbo.demo.api.lvcr.IHelloWorldService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * TODO 客户端-------负载均衡
 * 
 * @Date 2017年3月29日 下午10:24:18
 * @author Administrator
 * @version
 */
public class ConsumerBalance {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer-loadbalance.xml" });
		IHelloWorldService helloService = (IHelloWorldService) context
				.getBean("demoService");
		for(int i=0;i<20;i++){
		String reStr = helloService.sayHello("WORLD");
		System.out.println(reStr);
	}
	}

}
