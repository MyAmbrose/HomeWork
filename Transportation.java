the result��
��ѡ������Ҫ�Ľ�ͨ���ߣ�Car or Airplane or HighSpeed

�����أ�
�人
������Ŀ�ĵأ�
����
��ʹ�ý�ͨ����Ϊ����

���������ؾ��룺
560
���ܹ���Լ����ʱ��Ϊ�� 
81.92222222222223����
����Լ�ܹ����ѣ� 
179.20000000000002Ԫ
��ʹ�ý�ͨ����Ϊ�ɻ�
���������ؾ��룺
560
���ܹ���Լ����ʱ��Ϊ�� 
77.3����
����Լ�ܹ����ѣ� 
420.0Ԫ
��ʹ�ý�ͨ����Ϊ����
���������ؾ��룺
560
���ܹ���Լ����ʱ��Ϊ�� 
78.5����
����Լ�ܹ����ѣ� 
252.0Ԫ


code��
import java.util.Scanner;

public class Control  {
	public static void main (String[]args) {
		System.out.println("��ѡ������Ҫ�Ľ�ͨ���ߣ�Car or Airplane or HighSpeed");
		   Scanner input =new Scanner(System.in);	  
		   String name = input.nextLine();   
		System.out.println("�����أ�");
		  	String spacename1 = input.nextLine();   
		System.out.println("������Ŀ�ĵأ�");
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
		System.out.println("��ʹ�ý�ͨ����Ϊ����\n");
		System.out.println("���������ؾ��룺");
		Scanner input =new Scanner(System.in);
        double distance = input.nextDouble();
        
        runtime=distance/speed;
		double sumprice=price*distance;	                            //�ܹ�����
        double sumtime=gotime+returntime+gettickettime+waittime+runtime;//�ܹ�ʱ��
        show1();
    	System.out.println(sumtime+"����");
    	show2();
    	System.out.println(sumprice+"Ԫ");	
	 }

}



import java.util.Scanner;
public class Airplane extends A {
	 @Override
	 void jisuan() {
		  speed=350;
		  price=0.75;
			System.out.println("��ʹ�ý�ͨ����Ϊ�ɻ�");
			System.out.println("���������ؾ��룺");
			Scanner input =new Scanner(System.in);
	        double distance = input.nextDouble();
			 runtime=distance/speed;
			double sumprice=price*distance;	                            //�ܹ�����
	        double sumtime=gotime+returntime+gettickettime+waittime+runtime;//�ܹ�ʱ��
	        show1();
	    	System.out.println(sumtime+"����");
	    	show2();
	    	System.out.println(sumprice+"Ԫ");
	 }
	}

abstract class A{                        //���һ��������
	double gotime=20.6;                  //ȥ��վʱ��
	double returntime=19.3;              //�ӳ�վ����ʱ��
	double gettickettime=5.3;            //ȡƱʱ��   
	double checktime=1.3;                //����ʱ��
	double waittime=30.5;                //��ʱ��
	double runtime;                      //·����ʱ��
	int  speed;                       //�ٶ�
	double   price;                      //ƽ��ÿ����۸�
	abstract  void jisuan();
	void show() {jisuan();}
	void show1() {
		
	System.out.println("���ܹ���Լ����ʱ��Ϊ�� ");
   }
	void show2() {
		System.out.println("����Լ�ܹ����ѣ� ");
	}
}


import java.util.Scanner;
public class Airplane extends A {
	 @Override
	 void jisuan() {
		  speed=350;
		  price=0.75;
			System.out.println("��ʹ�ý�ͨ����Ϊ�ɻ�");
			System.out.println("���������ؾ��룺");
			Scanner input =new Scanner(System.in);
	        double distance = input.nextDouble();
			 runtime=distance/speed;
			double sumprice=price*distance;	                            //�ܹ�����
	        double sumtime=gotime+returntime+gettickettime+waittime+runtime;//�ܹ�ʱ��
	        show1();
	    	System.out.println(sumtime+"����");
	    	show2();
	    	System.out.println(sumprice+"Ԫ");
	 }
	}


abstract class A{                        //���һ��������
	double gotime=20.6;                  //ȥ��վʱ��
	double returntime=19.3;              //�ӳ�վ����ʱ��
	double gettickettime=5.3;            //ȡƱʱ��   
	double checktime=1.3;                //����ʱ��
	double waittime=30.5;                //��ʱ��
	double runtime;                      //·����ʱ��
	int  speed;                       //�ٶ�
	double   price;                      //ƽ��ÿ����۸�
	abstract  void jisuan();
	void show() {jisuan();}
	void show1() {
		
	System.out.println("���ܹ���Լ����ʱ��Ϊ�� ");
   }
	void show2() {
		System.out.println("����Լ�ܹ����ѣ� ");
	}
}
