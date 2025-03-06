

// Non return type:

// import java.util.Scanner;
// public class Parentheses{

//    static void parentheses(String str){
   
    
//     int count=0;
//         for (int i=0;i<str.length();i++){
//             char temp=str.charAt(i);
//            if(temp=='[')count++;
//            if(temp=='{')count++;
//            if(temp=='(')count++;
//            if(temp==']')count--;
//            if(temp=='}')count--;
//            if(temp==')')count--;
            
//         }
//         if(count==0){
//             System.out.println("Yes");
//         }
//         else{
//             System.out.println("No");
//         }

//    }


//     public static void main(String args[]){
//          Scanner obj=new Scanner(System.in);
//          System.out.println("Enter a string:");
//          String str=obj.nextLine();
//          parentheses(str);
        
        
        
//     }
// }



// Return type :


// import java.util.Scanner;
// public class Parentheses{

//    static int parentheses(String str){
   
    
//     int count=0;
//         for (int i=0;i<str.length();i++){
//             char temp=str.charAt(i);
//            if(temp=='[')count++;
//            if(temp=='{')count++;
//            if(temp=='(')count++;
//            if(temp==']')count--;
//            if(temp=='}')count--;
//            if(temp==')')count--;
            
//         }
//         if(count==0){
//             System.out.println("Yes");
//         }
//         else{
//             System.out.println("No");
//         }

//         return 0;

//    }


//     public static void main(String args[]){
//          Scanner obj=new Scanner(System.in);
//          System.out.println("Enter a string:");
//          String str=obj.nextLine();
//         parentheses(str);
        
        
        
//     }
// }




// Boolean:




import java.util.Scanner;
public class Parentheses{

   static boolean parentheses(String str){
   
    
    int count=0;
        for (int i=0;i<str.length();i++){
            char temp=str.charAt(i);
           if(temp=='[')count++;
           if(temp=='{')count++;
           if(temp=='(')count++;
           if(temp==']')count--;
           if(temp=='}')count--;
           if(temp==')')count--;
            
        }
        if(count==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        return true;

   }


    public static void main(String args[]){
         Scanner obj=new Scanner(System.in);
         System.out.println("Enter a string:");
         String str=obj.nextLine();
        parentheses(str);
        
        
        
    }
}