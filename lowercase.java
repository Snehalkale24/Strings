// public class lowercase
// {
// 	public static void main(String args[])
// 	{
// 		String str="snehal";
// 		System.out.println(str.toUpperCase());
// 	}
// }
public class lowercase
{
	public static void lower(String str)
	{
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			System.out.println(ch[i]);
		}
	}
	public static void main(String args[])
	{
		String str="java";
		lower(str);
	}
}
