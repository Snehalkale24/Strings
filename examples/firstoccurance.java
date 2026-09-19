public class firstoccurance{
	public static int first(String str,char ch)
	{
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==ch)
			{
				return i;
			}
		}
		return -1;
	}
	public static  void main(String args[])
	{
		System.out.println(first("programming",'g'));
	}
}