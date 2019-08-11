package cn.com.hnisi.esb.webService;

import javax.xml.namespace.QName;

import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.hnisi.esb.webService.client.DataPublishWebService;

/**
* @ClassName: DataPublishWebServiceClient 
* @Description: 数据发布测试方法
* @author cgw
* @date 2016-3-29 下午12:06:25  
 */
public class DataPublishWebServiceClient {
	
	public static void main(String[] args) throws Exception {
		
		//第一种调用方法
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext-client.xml");
		DataPublishWebService service = ctx.getBean("dataPublishWebService",DataPublishWebService.class);
		String result;
		try {
			result = service.receive_cgcq("11111","SZNB52000022000000526", "{'value':'服务订阅数据包'}");
		} catch (Exception e) {
			e.printStackTrace();
			result = e.getMessage();
		}
		System.out.println("调用ESB发布服务返回值："+result);
		
	}
	
}
