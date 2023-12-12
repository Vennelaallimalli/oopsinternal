import java.util.*;
class Cop{
 public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter 1st operand:");
  int a=input.nextInt();
  System.out.println("enter 2nd operand:");
  int b=input.nextInt();
  System.out.println("enter a num(1-5) for operation: \n1:add \n2:sub \n3:mul \n4:div \n5:mod");
  int n=input.nextInt();
  switch(n){
   case 1:
    System.out.println("sum of given nums is" + (a+b));
    break;
  
   case 2:
    System.out.println("diff of given nums is" +  (a-b));
    break;
   
   case 3:
    System.out.println("mul of given nums is" + (a*b));
    break;
   case 4:
    System.out.println("div of given nums is" +  (a/b));
    break;
   case 5:
    System.out.println("mod of given nums is" + (a%b)); 
    break;
  default:
    System.out.println("invalid");
    break;
}
}
}