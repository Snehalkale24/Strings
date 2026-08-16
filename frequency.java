// public class frequency
// {
//     public static void main(String args[])
//     {
//         String str = "hello";

//         for(int i = 0; i < str.length(); i++)
//         {
//             int count = 0;

//             for(int j = 0; j < str.length(); j++)
//             {
//                 if(str.charAt(i) == str.charAt(j))
//                 {
//                     count++;
//                 }
//             }

//             System.out.println(str.charAt(i) + " = " + count);
//         }
//     }
// }


public class frequency {
    public static void freq(String str) {
        char ch[] = str.toCharArray();
        for(int i = 0; i < ch.length; i++) {
            int count = 0;
            for(int j = 0; j < ch.length; j++) {
                if(ch[i] == ch[j]) {
                    count++;
                }
            }
            System.out.println(ch[i]+" "+count);
        }
    }
    public static void main(String args[]) {
        String str = "snehaal";
        freq(str);
    }
}