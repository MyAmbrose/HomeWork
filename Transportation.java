the result：
请选择你需要的交通工具：Car or Airplane or HighSpeed

出发地：
武汉
请输入目的地：
荆州
您使用交通工具为汽车

请输入两地距离：
560
您总共大约花费时间为： 
81.92222222222223分钟
您大约总共花费： 
179.20000000000002元
您使用交通工具为飞机
请输入两地距离：
560
您总共大约花费时间为： 
77.3分钟
您大约总共花费： 
420.0元
您使用交通工具为高铁
请输入两地距离：
560
您总共大约花费时间为： 
78.5分钟
您大约总共花费： 
252.0元


code：
import java.util.Scanner;

public class Control  {
	public static void main (String[]args) {
		System.out.println("请选择你需要的交通工具：Car or Airplane or HighSpeed");
		   Scanner input =new Scanner(System.in);	  
		   String name = input.nextLine();   
		System.out.println("出发地：");
		  	String spacename1 = input.nextLine();   
		System.out.println("请输入目的地：");
		    String spacename2 = input.nextLine(); 
	  
		    Car c1 =new Car();
			c1.show();
			Airplane c2=new Airplane();
			c2.show();
			HighSpeedTrain c3=new HighSpeedTrain();			
			c3.show();	
	}

}



import java.util.Scanner;
public class Car extends A {
	 @Override
	  void jisuan() {
		speed=90;
		price=0.32;
		System.out.println("您使用交通工具为汽车\n");
		System.out.println("请输入两地距离：");
		Scanner input =new Scanner(System.in);
        double distance = input.nextDouble();
        
        runtime=distance/speed;
		double sumprice=price*distance;	                            //总共花费
        double sumtime=gotime+returntime+gettickettime+waittime+runtime;//总共时间
        show1();
    	System.out.println(sumtime+"分钟");
    	show2();
    	System.out.println(sumprice+"元");	
	 }

}



import java.util.Scanner;
public class Airplane extends A {
	 @Override
	 void jisuan() {
		  speed=350;
		  price=0.75;
			System.out.println("您使用交通工具为飞机");
			System.out.println("请输入两地距离：");
			Scanner input =new Scanner(System.in);
	        double distance = input.nextDouble();
			 runtime=distance/speed;
			double sumprice=price*distance;	                            //总共花费
	        double sumtime=gotime+returntime+gettickettime+waittime+runtime;//总共时间
	        show1();
	    	System.out.println(sumtime+"分钟");
	    	show2();
	    	System.out.println(sumprice+"元");
	 }
	}

abstract class A{                        //设计一个抽象类
	double gotime=20.6;                  //去车站时间
	double returntime=19.3;              //从车站返回时间
	double gettickettime=5.3;            //取票时间   
	double checktime=1.3;                //安检时间
	double waittime=30.5;                //候车时间
	double runtime;                      //路程中时间
	int  speed;                       //速度
	double   price;                      //平均每公里价格
	abstract  void jisuan();
	void show() {jisuan();}
	void show1() {
		
	System.out.println("您总共大约花费时间为： ");
   }
	void show2() {
		System.out.println("您大约总共花费： ");
	}
}


import java.util.Scanner;
public class Airplane extends A {
	 @Override
	 void jisuan() {
		  speed=350;
		  price=0.75;
			System.out.println("您使用交通工具为飞机");
			System.out.println("请输入两地距离：");
			Scanner input =new Scanner(System.in);
	        double distance = input.nextDouble();
			 runtime=distance/speed;
			double sumprice=price*distance;	                            //总共花费
	        double sumtime=gotime+returntime+gettickettime+waittime+runtime;//总共时间
	        show1();
	    	System.out.println(sumtime+"分钟");
	    	show2();
	    	System.out.println(sumprice+"元");
	 }
	}


abstract class A{                        //设计一个抽象类
	double gotime=20.6;                  //去车站时间
	double returntime=19.3;              //从车站返回时间
	double gettickettime=5.3;            //取票时间   
	double checktime=1.3;                //安检时间
	double waittime=30.5;                //候车时间
	double runtime;                      //路程中时间
	int  speed;                       //速度
	double   price;                      //平均每公里价格
	abstract  void jisuan();
	void show() {jisuan();}
	void show1() {
		
	System.out.println("您总共大约花费时间为： ");
   }
	void show2() {
		System.out.println("您大约总共花费： ");
	}
}
