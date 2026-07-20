// public class longword
// {
// 	public static String longest(String str)
// 	{
// 		String words[]=str.split(" ");
// 		String longest=words[0];

// 		for(int i=1;i<words.length;i++)
// 		{
// 			if(words[i].length()>longest.length())
// 			{
// 				longest=words[i];
// 			}
// 		}

// 		return longest;
// 	}

// 	public static void main(String args[])
// 	{
// 		String str="welcome to sfgdfhhfdgdg";
// 		System.out.println("long:"+longest(str));
// 	}
// }

public class longword
{
	public static String longest(String str)
	{
		String words[]=str.split(" ");
		String longest=words[0];

		for(int i=1;i<words.length;i++)
		{
			if(words[i].length>longest.length())
			{
				longest=words[i];
			}
		}
		return longest;
	}
	public static  void main(String args[])
	{
		String str="wrefd gdsgd dhdsfs sgs";
		System.out.println("long:"+longest(str));
	}
}