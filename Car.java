           软工11601班  班级序号 32  王永生
import java.io.*;
public class Car 
{      
	public static void gas()
{
System.out.println("加油：");
int i;
for(i=10;i<70;i=i+5)
{
	System.out.println(i);
	if(i==65)
	System.out.println("油箱已加满\n");
}


}
public  static void run()
{
	int y=650;
System.out.println("车子大约还能行驶");

System.out.println(y+"公里");
}
 public static void main(String[] args)throws IOException
	{ 
     String name="Benchi";
	 final  int tank=65;
	 int oilConsumption=10;
	  BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); 
     
      System.out.println("请正确输入你想知道的属性:"); 
      String str = buffer.readLine();  
      if (str=="name")
      System.out.println(name); 
      else if (str=="tank")
          System.out.println(tank);   
      else if (str=="oilConsumption")
              System.out.println(oilConsumption); 
      else 
    	  System.out.println("您输入属性非法，请重新输入");
      System.out.println(str);

	System.out.println("车子品牌："+name);
	System.out.println( "平均每升油大约行驶:"+oilConsumption+"公里");
	System.out.println("油箱容量："+tank+"L");
	gas();
	run();
	
	}

}

运行结果：
请正确输入你想知道的属性:
tank
您输入属性非法，请重新输入
tank
车子品牌：Benchi
平均每升油大约行驶:10公里
油箱容量：65L
加油：
10
15
...
65
油箱已加满

车子大约还能行驶
650公里


