import java.util.Scanner;
interface Numbers
{
	int process(int x,int y);
}
class sum implements numbers
{
	public int process(int x,int y)
	{
		return (x+y);
	}
}
class average extends sum
{
	public int process(int x,int y)
	{
		return((x+y)/2);
	}
}
class u2_p5
{
	public static void main(String args[])
	{
		int x,y;
		sum s1 = new sum();
		average a1 = new average();
		Scanner n1 = new Scanner(System.in);
		System.out.print("Enter a number:");
		x = n1.nextInt();
		System.out.print("Enter a number:");
		y = n1.nextInt();
		System.out.println("Sum:"+s1.process(x,y));
		System.out.println("Average:"+a1.process(x,y));
	}
}
