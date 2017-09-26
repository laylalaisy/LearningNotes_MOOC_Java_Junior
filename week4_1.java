import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
			Scanner in = new Scanner(System.in);
			int StartIndex = in.nextInt();
			int EndIndex = in.nextInt();
			int Sum = 0;
			int Value = 2;
			int Index = 0;
			
			while( Index <= EndIndex)
			{
				if( isPrime(Value) )
				{
					Index += 1;
					if( StartIndex <= Index && Index <= EndIndex)
					{
						Sum += Value;
					}
				}
				Value++;
			}
			System.out.print(Sum);	
	}
			
	public static boolean isPrime(int Value)
	{
		if(Value == 2) 
		{
			return true;
		}
		for(int i=2; i < Math.sqrt(Value) +1 ; i++)
		{
			if(Value%i==0)
			{
				return false;
			}
		}
		return true;
	}

}
