package cn.com.hnisi.esb.webService.client;

import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
* @ClassName: DataPublishWebService 
* @Description: 数据发布方（客户端）
* @author cgw
* @date 2016-3-29 下午12:02:41  
 */
@WebService(serviceName = "DataPublishWebServiceService", targetNamespace = "http://webService.sinobest.cn/")
@SOAPBinding(style = Style.RPC)
public interface DataPublishWebService {
	
	/**
	* @Title: dataPublish 
	* @Description:     数据发布方法
	* @param identify   标识号（由服务总线引擎统一分配）
	* @param dataJson   数据体（发送的数据内容）
	* @throws Exception 
	* @return String    返回Json字符串 
	 */
	public String receive_cgcq(@WebParam(name = "batchNo") String batchNo,
			@WebParam(name = "identify") String identify,
			@WebParam(name = "dataJson") String dataJson);
	
}
