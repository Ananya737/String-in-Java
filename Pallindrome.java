import java.util.Scanner;
public class Pallindrome{
    static void pall (String input)
{
char []chararray=input.toCharArray();
int start=0;
int end=chararray.length-1;
boolean pal=true;
while(start<end)
{
   if(chararray[start]!=chararray[end])
   {
    pal=false;
    break;
   }

    start++;
    end--;
}
if(pal)
{
    System.out.print("pallindrome");

}
else
{
System.out.print("not pallindrome");
}
}
public static void main(String args[]){
String str="Oyo";
        pall(str);
}
}