import java.util.Scanner;

public class SnakeAndLadder 
{
	
	 public static void display(char  []a)
	 {
		System.out.println(a[35]+" "+a[34]+" "+a[33]+" "+a[32]+" "+a[31]+" "+a[30]);
		System.out.println(a[24]+" "+a[25]+" "+a[26]+" "+a[27]+" "+a[28]+" "+a[29]);
		System.out.println(a[23]+" "+a[22]+" "+a[21]+" "+a[20]+" "+a[19]+" "+a[18]);
		System.out.println(a[12]+" "+a[13]+" "+a[14]+" "+a[15]+" "+a[16]+" "+a[17]);
		System.out.println(a[11]+" "+a[10]+" "+a[9]+" "+a[8]+" "+a[7]+" "+a[6]);
		System.out.println(a[0]+" "+a[1]+" "+a[2]+" "+  a[3]+" "+a[4]+" "+a[5]);
	 }
	 
	 public static void setup(char a[])
	 {
		a[2]='(';
		a[8]='(';
		a[16]='(';
		a[22]=')';
		a[26]=')';
		a[33]=')';
		a[11]='*';
		a[13]='*';
		a[21]='*';
		a[20]='*';
		a[28]='*';
		a[31]='*';
	 }
	 
	public static void main(String [] args)
	{
		int pos =0;
		int dice;
		boolean finish = true;
		Scanner s = new Scanner(System.in);
		int moves = 0;
		char a[] = new char [36];
		for(int i=0;i<36;i++)
			a[i]='0';
		setup(a);
		a[0]='+';
		
		System.out.println("NOTE:-");
		System.out.println("1>  the '*' represents snakes");
		System.out.println("2>  the braces '(' or ')' represents the ladders");
		System.out.println("3>  this is your starting position");
		display(a);
		
		System.out.println();
		System.out.println("START :))");
		while(finish)
		{
			System.out.println();System.out.println();
			display(a);
			System.out.println("enter a valid dice value between 1 and 6");
			dice = s.nextInt();
			if(dice>=1 && dice <=6)
			{
				if((dice+pos)<=35)
				{
					a[pos]='0';
					setup(a);
					pos+=dice;
					moves++;

					if(pos==35)
						{
						a[35]='+';
						display(a);
							System.out.println("u won in "+moves+" moves");
							break;
						}
					if(pos == 2)
					{
						pos = 16;
					}
					if(pos == 21)
					{
						pos = 11;
					}
					if(pos==22)
					{
						pos = 33;
					}
					if(pos == 31)
					{
						pos=20;
					}
					a[pos]='+';
					System.out.println("current position(represented by '+') : " + pos);
				}
				else
				{
					continue;
				}
			}
		}		
	}
}
