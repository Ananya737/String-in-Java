// import java.util.Scanner;
// public class Subsequence{

//     static boolean subseq(String str1,String str2){
//         int i=0;
//         int j=0;
//         while(i<str1.length() && j<str2.length()){
//             if(str1.charAt(i)==str2.charAt(j)){
//                 i++;
//             }
            
//                 j++;
           
//         }

//         return i==str1.length();

//     }

//     public static void main(String args[]){
//         String str1="abc";
//         String str2="abcd";
//         if(subseq(str1,str2)){
//             System.out.println("Yes");
//         }
//         else{
//             System.out.println("No");
//         }
    
//     }
// }


  


//using For loop


  public class Subsequence{
    public static void main(String args[]){
        String str1="abcd";
        String str2="acb";
        
        int j=0;
        for(int i=0;i<str2.length();i++){
            if(str1.charAt(i)==str2.charAt(j)){
                j++;
            }
        }

        if(j==str2.length()){
            System.out.println("Subsequence");
        }else{
            System.out.println("Not Subsequence");
        }
    }
  }