import java.util.*;
class LinearSearch{
 public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter array size:");
  int flag=0;
  int n=input.nextInt();
  int a[]=new int[n];
  System.out.println("enter " + n + " elements:");
  for(int i=0;i<n;i++){
   a[i]=input.nextInt();
  }
  System.out.println("enter search element:");
  int search=input.nextInt();
  for(int i=0;i<n-1;i++){
   if(a[i]==search){
     System.out.println("elment " + search + " found at index " + i );
      flag=1;
     break;
   }
  
  }
 if(flag==0)
  System.out.println("not found");
 
  
}
}