import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int Result =0;
		int LengthTemp;
		
		String InputStr = in.nextLine();
		char[] InputCh = InputStr.toCharArray();
		LengthTemp = InputCh.length;
		for(int i = 0; i < InputCh.length ; i++)
		{
			Result *= 2;
			if( InputCh[i]%2 == LengthTemp %2 )
			{
				Result += 1;
			}
			LengthTemp--;
		}	
		System.out.print(Result);
	}
}
