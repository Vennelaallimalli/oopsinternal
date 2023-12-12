import java.util.*;
class PrimeFactors{
 public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter a positive integer: ");
  int n=input.nextInt();
  int count=0;
  System.out.println("prime factors of " + n + "are : ");
  if(n>=2 && n%2==0){
   System.out.println("2");
  }
   for(int i=1;i<=n;i++){
     if(n%i==0){
       for(int j=2;j<i;j++){
          if(i%j==0){
             count=0;
             break;
     
           }
          else
           count=1;
        }
        if(count==1)
          System.out.println(i);
   
  }
}
}
}