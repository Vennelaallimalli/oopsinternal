import java.util.*;
class Sort{
 public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter array size: ");
  int n=input.nextInt(); 
  int a[]=new int[n];
  System.out.println("enter " + n + " elements: ");
  for(int i=0;i<n;i++){
   a[i]=input.nextInt();
  }
  for(int i=0;i<n;i++){ 
    for(int j=i+1;j<n;j++){
       if(a[i]>a[j]){
        int temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
     }
  }
  System.out.println("sorted array:");
  for(int i=0;i<n-1;i++){
    System.out.println(a[i]);
   }
  System.out.println(a[n-1]);
 }
}
  