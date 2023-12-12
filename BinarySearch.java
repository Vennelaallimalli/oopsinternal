import java.util.*;
class BinarySearch{
 public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter array size:");
  int n=input.nextInt();
  int a[]=new int[n];
  System.out.println("enter " + n + " elements:");
  for(int i=0;i<n;i++){
   a[i]=input.nextInt();
  }
  System.out.println("enter search element:");
  int search=input.nextInt();
  int low=0,high=n-1;
  int mid=(low+high)/2;
  while(low<=high){
    if(a[mid]==search){
     System.out.println("elment " + search + " found at index " + (mid+1));
     break;
    }
   else if(a[mid]<search){
    low=mid+1;
   }
   else{
     high=mid-1;
   }
   mid=(low+high)/2;
 }
 if(low>high){
   System.out.println("not found");
 }
}
}