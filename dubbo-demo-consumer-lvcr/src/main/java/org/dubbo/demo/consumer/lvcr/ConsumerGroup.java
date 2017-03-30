package org.dubbo.demo.consumer.lvcr;

import org.dubbo.demo.api.lvcr.IHelloWorldService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 
 * TODO 客户端-------dubbo分组（一个接口多个实现）
 * 
 * @Date 2017年3月29日 下午10:24:18
 * @author Administrator
 * @version
 */
public class ConsumerGroup {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "consumer-group.xml" });
		IHelloWorldService helloService = (IHelloWorldService) context
				.getBean("demoService");
		String reStr = helloService.sayHello("WORLD");
		System.out.println(reStr);
	}

}
