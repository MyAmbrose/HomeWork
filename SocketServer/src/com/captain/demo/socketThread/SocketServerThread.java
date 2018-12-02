package com.captain.demo.socketThread;
import java.io.*;
import java.net.Socket;


public class SocketServerThread implements Runnable{
  private Socket socket;
  public SocketServerThread(Socket socket) { this.socket = socket;}
  
  @Override
public void run() {
	System.out.println("处理客户端线程业务");
	try {
		//第一次通讯，获取从客户端传来的信息
		Reader reader = new InputStreamReader(socket.getInputStream());
		BufferedReader in = new BufferedReader(reader);
		String clientMessage = in.readLine();//读取第一行客户端传来的信息，阻塞
		System.out.println("客户端传来的信息："+clientMessage);
		
		//回传信息客户端
		PrintWriter out = new PrintWriter(socket.getOutputStream());
		out.println("这是来自火星的问候");
		out.flush();
		//第二次通信
		clientMessage=in.readLine();
		System.out.print("客户端传来的暗号"+clientMessage);
		out.println("暴风雨就要来了!");
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
