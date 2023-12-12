import java.util.*;
class EqualStrings{
  public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter string1:");
  String s1=input.nextLine();
  System.out.println("enter string2:");
  String s2=input.nextLine();
  if(s1.equals(s2)){
    System.out.println(s1 + " and " + s2 + " are equal");
  }
  else if(s1.equalsIgnoreCase(s2)){
    System.out.println(s1 + " and " + s2 + "are equal by ignoring the case of characters");
  }
  else{
   System.out.println("both strings are not equal");
  }
 }
}