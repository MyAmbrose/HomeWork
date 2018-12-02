package com.captain.demo.socketThread;
import java.io.*;
import java.net.Socket;


public class SocketServerThread implements Runnable{
  private Socket socket;
  public SocketServerThread(Socket socket) { this.socket = socket;}
  
  @Override
public void run() {
	System.out.println("����ͻ����߳�ҵ��");
	try {
		//��һ��ͨѶ����ȡ�ӿͻ��˴�������Ϣ
		Reader reader = new InputStreamReader(socket.getInputStream());
		BufferedReader in = new BufferedReader(reader);
		String clientMessage = in.readLine();//��ȡ��һ�пͻ��˴�������Ϣ������
		System.out.println("�ͻ��˴�������Ϣ��"+clientMessage);
		
		//�ش���Ϣ�ͻ���
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("�������Ի��ǵ��ʺ�");
		out.flush();
		//�ڶ���ͨ��
		clientMessage=in.readLine();
		System.out.print("�ͻ��˴����İ���"+clientMessage);
		out.println("�������Ҫ����!");
		out.flush();
	
	}catch(IOException e) {
		e.printStackTrace();
		
	}finally {
		try{
			if(socket!=null) {
		
			socket.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
  
  
}
