import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		
		//get the value of number
		int num = in.nextInt();
		
		//execute
		if(isPrime(num))
		{
			System.out.print(num + "=" + num);
		}
		else
		{
			factorization(num);
		}
	}

	static void factorization(int num)
	{
		boolean isFirst = true;
    
		System.out.print(num+"=");
    
		for(int i = 2; i <= num; i++)
		{
			if(num < 2)
			{
				return;
			}
			while( isPrime(i) && num % i == 0)
			{
				if(isFirst) 
				{
					System.out.print(i);
					isFirst = false;
				}
				else
				{
					System.out.print("x" + i);
				}
				num /= i;
			}
		}
	}
	
	static boolean isPrime(int num)
	{
		int sqrtNum = (int) Math.sqrt(num) + 1;
		for(int i = 2; i < sqrtNum; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
