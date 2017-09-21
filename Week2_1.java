import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize
		int BJT;
		int UTC;
		
		//Input
		Scanner in = new Scanner(System.in);
		BJT=in.nextInt();
		
		if(BJT<800)
		{
			UTC = BJT - 800 + 2400;
		}
		else
		{
			UTC = BJT - 800;
		}
		
		//Output
		System.out.println(UTC);
	}

}