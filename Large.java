
import java.util.*;
class Large{
 public static void main(String args[]){
  int n,Large=-99999999,small=999999999,num;
  Scanner input=new Scanner(System.in);
  System.out.println("enter no. of inputs :");
  n=input.nextInt();
  System.out.println("enter " + n + " numbers :");
  for(int i=0;i<n;i++){
   num=input.nextInt();
  if(num>Large)
    Large=num;
  if(num<small)
    small=num;
  }
  System.out.println("Largest among given " + n + " numbers is :" + Large);

  System.out.println("smallest among given " + n + " numbers is :" + small);
 }
}
  