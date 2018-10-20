package fagongzi;
import java.util.Date;
import java.text.SimpleDateFormat;
//import java.util.Random;
import java.util.Scanner;

public class Employee extends Person 
{
	public static void employeeshow(){
	      System.out.println("请输入员工姓名：");
		  Scanner input =new Scanner(System.in);	  
	      String name = input.nextLine();
	 /*     Random rand = new Random();
	      int salary =(rand.nextInt(5000) + 10000);*/
	      int salary = 6000;          //可以随机抽取一个数作为工资，这里我们将salary初始值为6000
	      System.out.println(name+"的工资为:"+salary+"元"+"\n");
	      SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");//设置日期格式
	      System.out.println("现在时间为"+df.format(new Date()));// new Date()为获取当前系统时间
	      System.out.println("本月为"+name+"生日，奖励666元");
		
	     	
    }
	
}



package fagongzi;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Manager extends Person {
	
	public static void managershow() {
		System.out.println("请输入经理姓名：");
	    Scanner input =new Scanner(System.in);	  
	    String name = input.nextLine();
	     double salary=40000; 
	     int  bonus=1500;//经理工资为40000，每月奖金为1500
	     System.out.println(name+"的工资为："+salary+"元"+"\n"+"每月奖金为："+bonus+"元");   
	     SimpleDateFormat df = new SimpleDateFormat("yyyy-MM");//设置日期格式
	      System.out.println("现在时间为"+df.format(new Date()));// new Date()为获取当前系统时间
	     System.out.println("本月为"+name+"生日，奖励888元");
	}
}



package fagongzi;

import java.util.Random;
import java.util.Scanner;
public class Partner extends Person  {
	public static void partnershow() {
	 	Random rand = new Random();
	        double turnover=(rand.nextInt(1500000) + 1000000.30);     //随机选取一个在150万到250万之间的的数 
		   System.out.print("随机产生公司月销售额为:");
		   System.out.print(turnover+"\n");
		   System.out.println("请输入股东姓名：");
		   Scanner input =new Scanner(System.in);	  
		    String name = input.nextLine();                         //初步设定公司5名股东，每位股东股份为百分之20。
	         // Scanner input =new Scanner(System.in);	  
	         //String turnover = input.nextLine();   //手动输入公司营额    字符串      
		     //int turnover = input.nextInt();       //   int
		     //double turnover = input.nextDouble();
		        double  lirun = turnover-50*6000-2*40000-2*1500;  //每月利润=营业额-员工工资-经理工资-经理奖金,年终分红则*12
		        double fenhong=0.1*0.2*lirun*12;
		        System.out.println(name+"股东年终分红为："+fenhong+"元"); 
		        
	}


}




package fagongzi;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;


	class Gradation{
    static Connection con;      //声明connection对象
    static Statement sql;       // 声明statement对象
    static ResultSet res;       //创建RrsultSet对象
    public static Connection getConnection() {                           //连接数据库方法
    	String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Test";
		String userName="sa";
		String userPwd="wys19971209";
		try
		{
		Class.forName(driverName);
		System.out.println("加载驱动成功！");    
		}catch(Exception e){
		e.printStackTrace();
		System.out.println("加载驱动失败！");
		}
		try{
		con=DriverManager.getConnection(dbURL,userName,userPwd);  //创建的连接数据库对象con的creatStatement()方法获得Statement对象
		//Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
		System.out.println("连接数据库成功！");
	 
		}catch(Exception e)
		{
		e.printStackTrace();
		System.out.print("SQL Server连接失败！");
		}
		       return con;               //返回一个对象 	  
		          }
    
	public static void showTableSalary (){     //主方法
	    Gradation c= new Gradation();           // 创建本类对象 
	    con = c.getConnection();  
	      
	   
	    try {   
	    	sql = con.createStatement(); //实例化Statement对象
	      
	    	//执行SQL语句，返回结果集
	    	res = sql.executeQuery("select *from Table_Salary");
	    	System.out.print("下面为本公司Salary表"+"\n"); 
	    	while (res.next()) {                //如果当前语句不是最后一条，则进入循环
	    		String name = res.getString("姓名");//获取列名是id的字值段
	    		//获取列名是name的字值段
	    		String number = res.getString("序号");
	    		String position = res.getString("职位");
	    		String Salary = res.getString("工资");
	    		String birthday = res.getString("生日");
	    	
	    		System.out.print("序号:"+number+" ");
	    		System.out.print("姓名:"+name+" ");         //将列值输出
	    		System.out.print("职位:"+position+" ");  
	    		System.out.print("工资:"+Salary+" ");  
	    		System.out.print("生日:"+birthday+" "); 
	    		System.out.print("\n"); 
	    	}
	    	System.out.print("..."+"\n"); 
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	    
	    

	}
	}
	
	
	public class Person {           // 初步设定公司5名股东，2名经理，50名员工
		public String name;
		public String birthday;
		public double salary;
	public static void main(String[] args) { 
	
		System.out.print("开始连接数据库"+"\n");          
		//Gradation.getConnection();
        
		Gradation.showTableSalary();          //调用连接数据库函数并且操作数据库
		
		System.out.println("欢迎使用本公司财务系统，查询普通员工薪资待遇请输入1；查询经理薪资待遇请输入2；查询董事成员年终分红请输入3；");
		System.out.println("请输入：");
		while (true) {
			Scanner input = new Scanner(System.in);
			int A = input.nextInt();

			if (A == 1) {
				Employee.employeeshow();
				continue;
				}
			
			if (A == 2) {
				Manager.managershow();
				continue;
			}
			if (A == 3) {
				Partner.partnershow();
				continue;
			}

			else
			{
				System.out.println("输入错误，请重新输入");
		}
			

	}
		

	}
	
	}	
