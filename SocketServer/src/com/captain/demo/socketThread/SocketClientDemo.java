package com.captain.demo.socketThread;
import java.io.*;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class SocketClientDemo {
	public static void main(String[]args) {
		Socket client=null;
		try {
			client=new Socket("localhost",7070);
			//��һ��ͨѶ
			//д����Ϣ��������
			PrintWriter out= new PrintWriter(client.getOutputStream());
			out.println("����ĳĳ");
			out.flush();
			//��ȡ�ӷ��������ص���Ϣ
			Reader reader = new InputStreamReader(client.getInputStream());
			BufferedReader in = new BufferedReader(reader);
			String serverMessage = in.readLine();//��ȡһ�пͻ��˴�������Ϣ������
			System.out.println("���������ص���Ϣ:"+serverMessage);
			TimeUnit.SECONDS.sleep(1);
			//�ڶ���ͨѶ
			out.println("�����ڲ������·������ȼ�գ�");
			out.flush();
			serverMessage = in.readLine();
			System.out.println("���������صİ��ţ�"+serverMessage);
		    
			
			
			
		}catch(IOException|InterruptedException e) {
			e.printStackTrace();
		}finally {
			try {
				if(client!=null) {
					client.close();
					
				}
			}catch (IOException e) {
		    
			e.printStackTrace();
			
		}
	}

}
}
