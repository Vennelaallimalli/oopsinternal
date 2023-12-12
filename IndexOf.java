import java.util.*;
class IndexOf{
  public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter text:");
  String text=input.nextLine();
  System.out.println("enter a character:");
  char ch=input.next().charAt(0);
  int count=0;
  for(int i=0;i<text.length();i++){
   if(text.charAt(text.indexOf(ch))==text.charAt(i)){
    count++;
   }
  }
  System.out.println(ch+" is present "+count+ " times");
 }
}
