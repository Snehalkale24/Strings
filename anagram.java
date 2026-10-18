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
    public static void main(String args[])
    {
        String s1="listen";
        String s2="silent";

        char s11[]=s1.toCharArray();
        char s22[]=s2.toCharArray();

        Arrays.sort(s11);
        Arrays.sort(s22);

        if(Arrays.equals(s11,s22))
        {
            System.out.println("anagram");
        }
        else{
            System.out.println("not anagram");
        }
    }
}}