import java.util.*;
class SortStrings{
 public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter no. of strings:");
  int n=input.nextInt();
  String arr[]=new String[n];
  System.out.println("enter strings:");
  for(int i=0;i<n;i++)
    arr[i]=input.next();
   for(int i=0;i<n;i++){
     for(int j=i+1;j<n;j++){
       if(arr[i].compareTo(arr[j])>0){
         String temp;
         temp=arr[i];
         arr[i]=arr[j];
         arr[j]=temp;
       }
     }
   }
  System.out.println(Strings after sorting:);
  for(int i=0;i<n;i++)
   System.out.println(arr[i]);
 }
}