package cn.io.study02;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * �ֽ�����������
 * 1������Դ  ���ڲ�ά��
 * 2��ѡ������������Դ
 * 3������  ��д������
 * 4���ͷ���Դ�����Բ��ó�·
 * 
 * ��ȡ���ݣ�toByteArray();
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
			System.out.println("�����ɹ�");
		}
	}
}

