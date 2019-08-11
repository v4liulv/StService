package cn.com.hnisi.esb.webService.util;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WriteStringToFile {
	//将String一行一行写入txt文件
	public void WriteStringtoTxt(String filePath,String batchNo,String identify,
			String dataJson){
		try{
			File clt = new File(filePath);
			if (!clt.exists()) {
				clt.createNewFile();
			}
			FileWriter fw=new FileWriter(filePath,true);
			BufferedWriter bw=new BufferedWriter(fw);
			bw.append(batchNo);
			bw.append("\t");
			bw.append(identify);
			bw.append("\t");
			bw.append(dataJson);
			bw.newLine();
			bw.close();
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
