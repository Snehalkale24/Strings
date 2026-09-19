// import java.util.*;
// public class replace
// {
// 	public static void main(String args[])
// 	{
// 		Scanner s=new Scanner(System.in);
// 		System.out.println("enter string:");
// 		String str=s.nextLine();

// 		for
// 	}
// }

import java.util.*;

public class replace
{
    public static void main(String args[])
    {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter string: ");
        String str = s.nextLine();

        int count = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char ch = Char.toLowerCase(str.charAt(i));

            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }

        System.out.println("Number of vowels = " + count);
    }
}