 import java.io.*;
public class Car 
{      
	public static void gas()
{
System.out.println("���ͣ�");
int i;
for(i=10;i<70;i=i+5)
{
	System.out.println(i);
	if(i==65)
	System.out.println("�����Ѽ���\n");
}


}
public  static void run()
{
	int y=650;
System.out.println("���Ӵ�Լ������ʻ");

System.out.println(y+"����");
}
 public static void main(String[] args)throws IOException
	{ 
     String name="Benchi";
	 final  int tank=65;
	 int oilConsumption=10;
	  BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in)); 
     
      System.out.println("����ȷ��������֪��������:"); 
      String str = buffer.readLine();  
      if (str=="name")
      System.out.println(name); 
      else if (str=="tank")
          System.out.println(tank);   
      else if (str=="oilConsumption")
              System.out.println(oilConsumption); 
      else 
    	  System.out.println("���������ԷǷ�������������");
      System.out.println(str);

	System.out.println("����Ʒ�ƣ�"+name);
	System.out.println( "ƽ��ÿ���ʹ�Լ��ʻ:"+oilConsumption+"����");
	System.out.println("����������"+tank+"L");
	gas();
	run();
	
	}

}




