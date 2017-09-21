import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double C = 0;
		int F = 0;
		Scanner in = new Scanner(System.in);
		F = in.nextInt();
		C = (F-32)/(9/5.0);
		System.out.println((int)(C));
	}

}