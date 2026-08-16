// public class lastoccurance{
// 	public static int find(String str,char ch)
// 	{
// 		int pos=-1;
// 		for(int i=0;i<str.length();i++)
// 		{
// 			if(str.charAt(i)==ch)
// 			{
// 				pos=i;
// 			}
// 		}
// 		return pos;
// 	}
// 	public static void main(String args[])
// 	{
// 		System.out.println(find("programming",'g'));
// 	}
// }

public class lastoccurance
{
    public static int find(String str, char ch)
    {
        for(int i=str.length()-1; i>=0; i--)
        {
            if(str.charAt(i) == ch)
            {
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[])
    {
        String str="programming";

        System.out.println(find(str, 'm'));
    }
}