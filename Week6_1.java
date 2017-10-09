import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		String inputStr = new String(in.nextLine());
		
		if( inputStr == null) 
		{
			return;
		}
		else if("".equals(inputStr.trim()))
		{
			return;
		}
		else
		{
			String words[] = inputStr.split(" ");
			for(String word: words)
			{
				if("".equals(word.trim()))
				{
					continue;
				}
				else if(".".equals(word.trim()))
				{
					return;
				}
				int wordLength = word.length();
				if(word.endsWith("."))
				{
					wordLength--;
					System.out.print(wordLength);
					break;
				}
				System.out.print(wordLength + " ");
			}
		}
	}

}
