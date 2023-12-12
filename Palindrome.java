import java.util.*;
class Palindrome{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 System.out.println("enter num:");
 int n=sc.nextInt();
 int m=n;
 int rev=0,rem;
 while(n>0){
   rem=n%10;
   rev=rev*10+rem;
   n=n/10;
 }
 if(rev==m){
  System.out.println("palindrome");
 }
 else
    System.out.println(" not a palindrome");
}
}
  
 