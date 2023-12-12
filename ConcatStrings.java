import java.util.*;
class ConcatStrings{
  public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter string1:");
  String s1=input.nextLine();
  System.out.println("enter string2:");
  String s2=input.nextLine();
  String s3=s1.concat(s2);
  System.out.println(s3);
 }
}