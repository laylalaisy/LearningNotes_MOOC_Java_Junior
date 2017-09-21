import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize
		int InputNum;
		int OddCount = 0, EvenCount = 0;
		Scanner in = new Scanner(System.in);
		
		//Excute
		InputNum = in.nextInt();
		while(InputNum != -1)
		{
			//Even
			if(InputNum%2 != 0)
			{
				OddCount++;
			}
			else
			{
				EvenCount++;
			}
			InputNum = in.nextInt();
		}
		
		System.out.print(OddCount + " " + EvenCount);
		
	}
}