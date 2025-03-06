// import java.util.Scanner;
// public class Reverse{
//     public static void main(String args[]){
//         String obj=new String("Hello");
//         String reverse="";
//         for(int i=0;i<obj.length();i++){
//             reverse=obj.charAt(i)+reverse;
//         }
//         System.out.println(reverse);
//     }
// }










import java.util.Scanner;
public class Reverse{
    public static void main(String args[]){
        String str="Hello";
        char a[]=str.toCharArray();
        for(int i=0;i<a.length;i++){
            for(int j=a.length-1;j>=0;j--){
                if(i<j){
                    char temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                    System.out.println(a);
                    
                }
                
            }break;
            
        }
        // String obj=new String(a);
        // System.out.println(obj);
        
    }
}






// import java.util.Scanner;
// public class Reverse{
//     public static void main(String args[]){
//         String str="Hello";
//         char a[]=str.toCharArray();
//         int start=0;
//         int end=a.length-1;
//         while(start<end){
//             char temp=a[start];
//             a[start]=a[end];
//             a[end]=temp;

//             start++;
//             end--;
//         }
//         String obj=new String(a);
//         System.out.println(obj);
        
//     }
// }