// public class length
// {
// 	public static void main(String args[])
// 	{
// 		String s="snehal";
// 		System.out.println(s.length());
// 	}
// }


public class length{
	public static void length(String str)
	{
		char ch[]=str.toCharArray();
		int count=0;
		for(char c:ch)
		{
			count++;
		}
		System.out.println("length:"+count);
	}
	public static  void main(String args[])
	{
		String str="helllldsf";
		length(str);
	}
}