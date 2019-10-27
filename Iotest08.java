package cn.io.study02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * 字节数组输入流
 * 1，创建源  ：内部维护
 * 2，选择流：不关联源
 * 3，操作  ：写出内容
 * 4，释放资源：可以不用出路
 * 
 * 获取数据：toByteArray();
 * @author dell
 *
 */

public class Iotest08 {
	public static void main(String[] args) {
		ByteArrayOutputStream os=null;
		byte[] src=null;
		os=new ByteArrayOutputStream();
		String str="sun warm  sun";
		src=str.getBytes();
		os.write(src,0,src.length);
		
		try {
			os.flush();
			byte[] temp=os.toByteArray();
			String res=new String(temp);
		    System.out.println(res);
		    
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			System.out.println("操作成功");
		}
	}
}

