// //  import java.util.*;
// // public class concatenate
// // {
// // 	public static void main(String args[])
// // 	{
// // 		Scanner s=new Scanner(System.in);


// // 		System.out.println("enter first string:");
// // 		String str1=s.nextLine();

// // 		System.out.println("enter second String:");
// // 		String str2=s.nextLine();

// // 		String str3=str1 + str2;

// // 		System.out.println("concatenate:"+str3);
// // 	}
// // }

// import java.util.*;
// public class concatenate{
// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter first string:");
// 		String str1=s.nextLine();

// 		System.out.println("enter second string:");
// 		String str2=s.nextLine();

// 		String str3=str1+str2;
// 		System.out.println("concatenate:"+str3);
// 	}
// }

// import java.util.*;
// public class concatenate{
// 	public static String concatenate(String s1,String s2)
// 	{
// 		String result=" ";
// 		for(int i=0;i<s1.length();i++)
// 		{
// 			result=result+s1.charAt(i);
// 		}
// 		for(int i=0;i<s2.length();i++)
// 		{
// 			result=result+s2.charAt(i);
// 		}
// 		return result;
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println(concatenate("hello","world"));
// 	}
// }
public class concatenate{
	public static String conc(String s1,String s2)
	{
		String result=" ";
		for(int i=0;i<s1.length();i++)
		{
			result=result+s1.charAt(i);
		}
		for(int j=0;j<s2.length();j++)
		{
			result=result+s2.charAt(j);
		}
		return result;
	}
	public static void main(String args[])
	{
		System.out.println(conc("hello","sdf"));
	}
}