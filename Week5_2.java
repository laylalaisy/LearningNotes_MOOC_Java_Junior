import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count;
		Scanner in = new Scanner(System.in);
		int state = 0; /*state == 0: NIL; state == -1: O; state == 1:  X */
		
		count = in.nextInt();
		int array[][] = new int[count][count];
		
		for(int i = 0; i < count; i++)
		{
			for(int j = 0; j < count; j++)
			{
				array[i][j]=in.nextInt();
			}
		}
		
		
		int temp = 0;
		
		/* row */
		for(int i = 0; i < count; i++)
		{
			temp = 0;
			for(int j = 0; j < count; j++)
			{
				temp += array[i][j];
			}
			if(temp == count)
			{
				System.out.print("X");
				return;
			}
			else if(temp == 0)
			{
				System.out.print("O");
				return;
			}
		}
		
		/* cow */
		for(int i = 0; i < count; i++)
		{
			temp = 0;
			for(int j = 0; j < count; j++)
			{
				temp += array[j][i];
			}
			if(temp == count)
			{
				System.out.print("X");
				return;
			}
			else if(temp == 0)
			{
				System.out.print("O");
				return;
			}
		}
		
		/* diagonal */
		temp = 0;
		for(int i = 0; i < count; i++)
		{
			temp += array[i][i];
		}
		if(temp == count)
		{
			System.out.print("X");
			return;
		}
		else if(temp == 0)
		{
			System.out.print("O");
			return;
		}
		
		temp = 0;
		for(int i = 0; i < count; i++)
		{
			temp += array[i][count - 1 - i];
		}
		if(temp == count)
		{
			System.out.print("X");
			return;
		}
		else if(temp == 0)
		{
			System.out.print("O");
			return;
		}
		
		System.out.print("NIL");

	}

}
