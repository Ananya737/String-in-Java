import java.util.Scanner;
public class ToUpperCase{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        String str="MaDam";


        // char arr[]=str.toCharArray();
        
        // for(int i=0;i<arr.length;i++){
        //     if(arr[i]>='A' && arr[i]<='Z'){
        //         System.out.print( (char)(arr[i]+32));
        //     }
        //     else if(arr[i]>='a' && arr[i]<='z'){
        //         System.out.print( (char)(arr[i] -32));
        //     }
        //     else{
        //         System.out.print( "Not");
        //     }
        // }











        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);



            if(c>='A' && c<='Z'){
                
                c=(char)(c+32);
               
            }
            else if(c>='a' && c<='z'){
                c=(char)(c-32);
                
            }

            System.out.print(c);
        }
    }
}








 