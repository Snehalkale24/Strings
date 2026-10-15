// public class anagram{
// 	public static void main(String args[])
// 	{
// 		String str1="listen";
// 		String str2="silent";

// 		char arr1[]=str1.toCharArray();
// 		char arr2[]=str2.toCharArray();


// 		Arrays.sort(arr1);
// 		Arrays.sort(arr2);

// 		if(Arrays.equals(arr1,arr2))
// 		{
// 			System.out.println("anagram");
// 		}
// 		else{
// 			System.out.println("not anagram");
// 		}

// 	}
// }


import java.util.*;
public class anagram{
    public static boolean check(String s1,String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }

        for(int i=0;i<s1.length();i++)
        {
            if(s1.length()==s2.length())
            {
                return true;
            }
        }
        return
    }
}