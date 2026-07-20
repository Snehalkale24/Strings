import java.util.*;
public class concatenate
{
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);


		System.out.println("enter first string:");
		String str1=s.nextLine();

		System.out.println("enter second String:");
		String str2=s.nextLine();

		String str3=str1 + str2;

		System.out.println("concatenate:"+str3);
	}
}