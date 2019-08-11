package cn.com.hnisi.esb.webService.server.impl;

import cn.com.hnisi.esb.webService.server.SubscibeDataWebService;
import net.sf.json.JSONObject;

import org.springframework.stereotype.Service;

import cn.com.hnisi.esb.webService.util.WriteStringToFile;

/**
 * @ClassName: SubscibeDataWebServiceImpl
 * @Description: 数据订阅WebService服务接口（服务端）
 * @author lichunming
 * @date 2017-7-09 下午12:04:40
 */
@Service("subscibeDataWebService")
public class SubscibeDataWebServiceImpl implements SubscibeDataWebService {
	public static String path="f:/订阅服务数据/";
	/* * 
	 * 数据接收方法
	 * @param batchNo
	 *            批次号
	 * @param identify
	 *            标识
	 * @param dataJson
	 *            json数据
	 * @return
	 * @throws Exception
	 */
	public String receive_data(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_cgcq(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_clhcyj(String batchNo, String identify,
			String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_glcl(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_glwp(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_gnlk(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_hccl(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_hchgry(String batchNo, String identify,
			String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_hcjg1(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_hcjg2(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_hcry(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_hcwp(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_jcj(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_jcjdc(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_jdcxx(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_jqry(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_jsrjsz(String batchNo, String identify,
			String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_ldxx(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_lkzs(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_mhdkdz(String batchNo, String identify,
			String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_qwlkzs(String batchNo, String identify,
			String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_ryhlyj(String batchNo, String identify,
			String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_sgxx(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_sqjw(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_wgrqz(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_yhjgts(String batchNo, String identify,
			String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_yyptsj(String batchNo, String identify,
			String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_fkjc(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}
	@Override
	public String receive_hcgp(String batchNo, String identify, String dataJson) {
		// 返回值
		JSONObject result = new JSONObject();
		result.put("batchNo", batchNo);
		if (batchNo == null || batchNo.equals("")) { // 批次号为空
			result.put("isSucceed", false);
			result.put("remark", "批次号为空");
			return result.toString();
		}
		if (identify == null || identify.equals("")) { // 服务标识号为空
			result.put("isSucceed", false);
			result.put("remark", "服务标识号为空");
			return result.toString();
		}
		if (dataJson == null || dataJson.equals("")) { // 数据包为空
			result.put("isSucceed", false);
			result.put("remark", "数据包为空");
			return result.toString();
		}
		result.put("isSucceed", true);
		result.put("remark", "");
		System.out.println("-----ESB推送信息------");
		System.out.println("批次号：" + batchNo);
		System.out.println("标识号：" + identify);
		System.out.println("数据体：" + dataJson);
		WriteStringToFile wf = new WriteStringToFile();
		wf.WriteStringtoTxt(path+identify+".txt", batchNo ,identify,
				dataJson);
		return result.toString();
	}

}
