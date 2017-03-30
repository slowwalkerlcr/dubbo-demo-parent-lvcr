

import java.io.IOException;

import com.alibaba.dubbo.container.Main;


/**
 * 
 * TODO 启动服务入口 
 * @Date  2017年3月29日 下午10:17:07   	 
 * @author Administrator  
 * @version
 */
public class BootStrap {
	
	public static void main(String[] args) {
		
		try {
			Main.main(args);
			System.in.read();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
