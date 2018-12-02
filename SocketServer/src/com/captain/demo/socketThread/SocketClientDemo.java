package com.captain.demo.socketThread;
import java.io.*;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

public class SocketClientDemo {
	public static void main(String[]args) {
		Socket client=null;
		try {
			client=new Socket("localhost",7070);
			//第一次通讯
			//写入信息给服务器
			PrintWriter out= new PrintWriter(client.getOutputStream());
			out.println("呼唤某某");
			out.flush();
			//获取从服务器传回的信息
			Reader reader = new InputStreamReader(client.getInputStream());
			BufferedReader in = new BufferedReader(reader);
			String serverMessage = in.readLine();//读取一行客户端传来的信息，阻塞
			System.out.println("服务器传回的信息:"+serverMessage);
			TimeUnit.SECONDS.sleep(1);
			//第二次通讯
			out.println("空气在颤抖，仿佛天空在燃烧！");
			out.flush();
			serverMessage = in.readLine();
			System.out.println("服务器返回的暗号："+serverMessage);
		    
			
			
			
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
