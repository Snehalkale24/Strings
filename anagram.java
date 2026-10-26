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
        String s1="snehal";
        String s2="silsent";
        char c1[]=s1.toCharArray();
        char c2[]=s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        if(Arrays.equals(c1,c2))
        {
            System.out.println("angram");
        }
        else{
            System.out.println("not");
        }
    }
}