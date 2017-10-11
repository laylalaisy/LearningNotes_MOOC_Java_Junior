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
		if(hour<10)
		{
			System.out.print("0"+hour+":");
		}
		else
		{
			System.out.print(hour+":");
		}
		min = Integer.parseInt(inputStr.substring((loc+3), loc +5));
		if(min<10)
		{
			System.out.print("0"+min+":");
		}
		else
		{
			System.out.print(min+":");
		}
		sec = Integer.parseInt(inputStr.substring((loc+5), loc+7));
		if(hour<10)
		{
			System.out.print("0"+sec);
		}
		else
		{
			System.out.print(sec);
		}
	}
	
	public static boolean checkState(String inputStr)
	{
		int loc = 0;
		loc = inputStr.indexOf(',');
		loc = inputStr.indexOf(',',loc+1);
		if(inputStr.charAt(loc+1) == 'A' && inputStr.charAt(loc+2) == ',')
		{
			//System.out.print("StateYes ");
			return true;
		}
		else
		{
			//System.out.print("StateYes ");
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
			//System.out.print("NumYes ");
			return true;
		}
		else
		{
			//System.out.print("NumNO ");
			return false;
		}
	}
}
