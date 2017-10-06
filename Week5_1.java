import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int[] coe1 = new int[101];
		int[] coe2 = new int[101];
		Scanner in = new Scanner(System.in);
		int isFirst = 1;
		int isZero = 1;
		int coeTemp = 0;
		int expTemp = 0;
		int coeResult = 0;
		
		do
		{
			expTemp = in.nextInt();
			coeTemp = in.nextInt();
			coe1[expTemp] = coeTemp;
		}while(expTemp != 0);
		
		do
		{
			expTemp = in.nextInt();
			coeTemp = in.nextInt();
			coe2[expTemp] = coeTemp;
		}while(expTemp != 0);
		
		for(int i = 100; i >= 0; i--)
		{
			coeResult = coe1[i] + coe2[i];
			if(coeResult != 0)
			{
				if(isFirst != 1)
				{
					if(coeResult>0)
					{
						System.out.print("+");
					}
				}
				if(coeResult != 1)
				{
					System.out.print(coeResult);
				}
				if(i==1)
				{
					System.out.print("x");
				}
				else if( i != 0 && i != 1)
				{
					System.out.print("x"+i);
				}
				isFirst = 0;
				isZero = 0;
			}
		}	
		
		if(isZero == 1)
		{
			System.out.print("0");
		}
	}

}
