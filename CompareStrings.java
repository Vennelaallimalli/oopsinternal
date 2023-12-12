import java.util.*;
class CompareStrings{
  public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter string1:");
  String s1=input.nextLine();
  System.out.println("enter string2:");
  String s2=input.nextLine();
  if(s1.compareTo(s2)>0){
    System.out.println(s1 + " greater than " + s2);
  }
  else if(s1.compareTo(s2)<0){
    System.out.println(s1 + " lesserthan " + s2);
  }
  else{
   System.out.println("both strings are equal");
  }
 }
}