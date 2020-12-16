import java.io.*;
import java.util.*;
public class calculator
{
	public static void main(String args[])
	{
		int a,b,c;
		char ch;
		Scanner inp=new Scanner(System.in);
		a=inp.nextInt();
		b=inp.nextInt();
		ch=inp.next().charAt(0);
		if(ch=='+')
		{
			c=a+b;
		}
		else if(ch=='-')
		{
			c=a-b;
		}
		else if(ch=='/')
		{
			c=a/b;
		}
		else
		{
			c=a*b;
		}
		System.out.println("Answer is "+c);
	}
}