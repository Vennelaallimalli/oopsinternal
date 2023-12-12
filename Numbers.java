import java.util.*;
class Numbers{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  int a[]=new int[5];
  for(int i=0;i<5;i++){
    int count=0;
    System.out.println("enter element:");
    int e=sc.nextInt();
    for(int j=0;j<a.length;j++){
      if(e==a[j]){
       count=1;
       System.out.println("number already exists,enter another number");
       i=i-1;
       break;
      }
      else if(e<10||e>100){
        System.out.println("number not in range(10&100),enter valid number");
        i=i-1;
        break;
      }
    }
    if(count!=1){
      a[i]=e;
      System.out.println("elements are:");
      for(int k=0;k<=i;k++){
       System.out.println(a[k]+" ");
      }
    }
  }
 }
}