import java.util.*;
class StringRev{
  public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter String:");
  String s=input.nextLine();
  int n=s.length();
  for(int i=n-1;i>=0;i--){
   char rev=s.charAt(i);
   System.out.println(rev);
   }
  System.out.println(" ");
 }
}