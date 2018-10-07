 姓名：王永生  班級：11601班   序号：32
public class Song {                                            
	String songName;// 歌名
	String singer;// 歌手
	double time;// 歌曲时间
       public  static void show() { 
    	   System.out.println("我们的歌曲有：");
        List<String>str1 = new ArrayList<String>();
			str1.add("1.That Girl");
			str1.add("歌手：Olly Murs");
			str1.add("歌曲时间：2.56分钟");
			List<String> str2 = new ArrayList<String>();
			str2.add("2.父亲");
			str2.add("歌手：筷子兄弟");
			str2.add("歌曲时间：5.00分钟");
			List<String> str3 = new ArrayList<String>();
			str3.add("3.BLUE");
			str3.add("歌手：BigBang");
			str3.add("歌曲时间：3.53分钟");
		for (int i = 0; i < str1.size(); i++) {
			System.out.println(str1.get(i));
		}
		
		for (int i = 0; i < str2.size(); i++) {
			System.out.println(str2.get(i));
		}
		for (int i = 0; i < str3.size(); i++) {
			System.out.println(str3.get(i));

	 }
	}
		public  static void show1() {
			List<String>str1 = new ArrayList<String>();
			str1.add("1.That Girl");
			str1.add("歌手：Olly Murs");
			str1.add("歌曲时间：2.56分钟");
			for (int i = 0; i < str1.size(); i++) {
			System.out.println(str1.get(i));
		}
			System.out.println("唱歌中...");
		}
			
		public  static void show2() { 
			List<String> str2 = new ArrayList<String>();
			str2.add("2.父亲");
			str2.add("歌手：筷子兄弟");
			str2.add("歌曲时间：5.00分钟");
			for (int i = 0; i < str2.size(); i++) {
				System.out.println(str2.get(i));
			}
			System.out.println("唱歌中...");
		}
		public  static void show3() {
			List<String> str3 = new ArrayList<String>();
			str3.add("3.BLUE");
			str3.add("歌手：BigBang");
			str3.add("歌曲时间：3.53分钟");
			for (int i = 0; i < str3.size(); i++) {
				System.out.println(str3.get(i));
            }
			System.out.println("唱歌中...");	
		}
		
	}
	




public class Master {

	public static void Master() { // 构造函数，初始化list
	    System.out.println("欢迎进入主持人模式");
		Song.show();
		System.out.println("......");
		play();
		

	}

	public static void play() { // 播放歌曲

		System.out.println("请选择喜欢歌曲对应的序号：");
		for (int m = 0; m < 4; m++) {
			int x;
			Scanner input = new Scanner(System.in);
			x = input.nextInt(); // 主持人输入歌单序号
			if (x == 1)
				
				Song.show1();
			else if (x == 2)
			
				Song.show2();
			else if (x == 3)
			
			
				Song.show3();
			else {
				System.out.println("您输入序号错误，请重新输入");
			}
		}
	}
}





public class Player {
	public static void addSong() { // 点歌
		System.out.println("欢迎进入用户模式:");
		Song.show();
		System.out.println("......");
		System.out.println("请输入您想添加的歌单序号:");
		for (int m = 0; m < 4; m++) {
			int x;
			Scanner input = new Scanner(System.in);
			x = input.nextInt(); // 客户输入歌单序号
			System.out.println("您点的歌曲为:");
			if (x == 1)
				Song.show1();
			else if (x == 2)
				Song.show2();
			else if (x == 3)
				Song.show3();
			else
				System.out.println("您输入序号错误，请重新输入");
	

		}
	}
}





public class SongDrive {
	public Master master;//主持人
	public Player player;//点歌的
	public SongDrive() {
		
		     
	}//初始化Master和player
	public static void main(String[] args) {                                //入口函数
		System.out.println("欢迎使用KTV控制平台，输入1，进入主持人模式，输入2进入用户模式");
		int x;
		Scanner input = new Scanner(System.in);
		x = input.nextInt();                                              //输入序号确定进入主持人模式or用户模式
		if(x==1)
		Master.Master();
		else if(x==2)
			Player.addSong();
		else System.out.println("输入错误，请重新输入");
	}
	
	}
	
	
	运行結果：欢迎使用KTV控制平台，输入1，进入主持人模式，输入2进入用户模式
1
2
3
23
欢迎进入主持人模式
我们的歌曲有：
1.That Girl
歌手：Olly Murs
歌曲时间：2.56分钟
2.父亲
歌手：筷子兄弟
歌曲时间：5.00分钟
3.BLUE
歌手：BigBang
歌曲时间：3.53分钟
......
请选择喜欢歌曲对应的序号：
2
2.父亲
歌手：筷子兄弟
歌曲时间：5.00分钟
唱歌中...
3
3.BLUE
歌手：BigBang
歌曲时间：3.53分钟
唱歌中...
23
您输入序号错误，请重新输入