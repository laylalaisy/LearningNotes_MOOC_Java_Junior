//如下有两个版本
//版本1：莫名AC自己写的（主要是利用indexOf(",")来定位判断）
//版本2：网上copy的方法（主要是先利用split完成属性分割，再进行定位判断）

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String inputStr = new String(in.nextLine());
		String lastStr = new String("");

		while(inputStr.equals("END") == false )
		{
			String[] part = inputStr.split(",");
			if(inputStr.startsWith("$GPRMC,"))
			{
				if(checkState(inputStr) && checkInt(inputStr)) 
				{
					lastStr = inputStr;
				}
			}
			inputStr = in.nextLine();
		}
		if(lastStr == "") System.exit(0);
		getTime(lastStr);
	}

	

	public static void getTime(String inputStr)
	{
		int loc = 0;
		loc = inputStr.indexOf(',');
		int hour = 0, min = 0, sec = 0;
		String hh = inputStr.substring(loc+1, loc+3);
		String mm = inputStr.substring(loc+3, loc+5);
		String ss = inputStr.substring(loc+5, loc+7);
		hour = Integer.parseInt(hh);
		hour = (hour + 8) % 24;
		min = Integer.parseInt(inputStr.substring((loc+3), loc +5));
		sec = Integer.parseInt(inputStr.substring((loc+5), loc+7));

		System.out.print(String.format("%02d", hour));
		System.out.print(":");
		System.out.print(String.format("%02d", min));
		System.out.print(":");
		System.out.print(String.format("%02d", sec));
	}

	public static boolean checkState(String inputStr)
	{
		int loc = 0;
		loc = inputStr.indexOf(',');
		loc = inputStr.indexOf(',',loc+1);
		if(inputStr.charAt(loc+1) == 'A' && inputStr.charAt(loc+2) == ',')
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	public static boolean checkInt(String inputStr)
	{
		int i;
		int testNum = 0;
		char ch = inputStr.charAt(1);
		testNum = ch;
		for(i = 2; i < inputStr.length(); i++)
		{
			ch = inputStr.charAt(i);
			if(ch == '*')
			{
				break;
			}
			testNum ^= ch;
		}
		testNum = (int)testNum % 65536;

		String checkNum = inputStr.substring(inputStr.indexOf('*')+1);
		checkNum = checkNum.toLowerCase();
		if(checkNum.equals(Integer.toHexString(testNum)))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}



import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		String now = null;
		String str = in.nextLine();
		String judge = new String("END");
		String right = new String("$GPRMC");
		while(!str.equals(judge))//输入为END ，结束输入
		{
			String[] ss = str.split(",");//以逗号为分割 吧str分割为若干字符串 放入数组ss
			
			if(!ss[0].equals(right))//如果第一个逗号以前的部分不为所要求，读入下一列，结束这一行处理
				{str=in.nextLine();continue;}
			boolean tag=false;
			int i,result=0;
			char ch;
			
			ch=str.charAt(1);//从第二个字符开始做异或，存入result
			for(result=str.charAt(1),i=2;ch!='*';i++,ch=str.charAt(i)){
				ch=str.charAt(i);
				result^=(int)ch;
			}
			result%=65536;
			String num = str.substring(i+1, i+3);//取*后面两位
			
			char state = ss[2].charAt(0);
			num=num.toLowerCase();//转化为小写
			if(num.equals(Integer.toHexString(result))&&state=='A')//如果相同 且 状态为A 存入时间
				now=ss[1];
			str=in.nextLine();
		}
		if(now==null)System.exit(0);
		String hh=now.substring(0, 2);
		String mm =now.substring(2, 4);
		String ss =now.substring(4, 6);
		int hour = Integer.parseInt(hh);
		hour=(hour+8)%24;
		if(hour<10)
			System.out.print(0);
		System.out.println(hour+":"+mm+":"+ss);//输出时间
	}
}
