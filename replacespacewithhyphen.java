public class replacespacewithhyphen
{
	public static void replace(String str)
	{
		String rev=" ";
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==' ')
			{
				rev=rev+'-';
			}
			else{
				rev=rev+ch;
			}
		}
		System.out.println(rev);
	}
	public static void main(String args[])
	{
		String str="java is easy";
		replace(str);
	}
}