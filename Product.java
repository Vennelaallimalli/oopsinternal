import java.util.*;
class Product{
 public static void main(String args[]){
  Scanner sc=new Scanner(System.in);
  double p1 =99.90;
  double p2=20.20;
  double p3=6.87;
  double p4=45.50;
  double p5=40.49;
  int quantity;
  double total=0;
  while(true){
   System.out.println("enter productid(1-5,0 to exit): ");
   System.out.println("p1:Rs.99.90\np2:Rs.20.20\np3:Rs.6.87\np4:Rs.45.50\np5:Rs.40.49\n");
   int pro_no=sc.nextInt();
   if(pro_no==0){
    break;
   }
   System.out.println("enter Quantity sold :");
   quantity=sc.nextInt();
   double price=0.0;
  switch(pro_no){
   case 1:
    price=p1;
    break;
   
   case 2:
    price=p2;
    break;
  
   case 3:
    price=p3;
    break;

   case 4:
    price=p4;
    break;

   case 5:
    price=p5;
    break;
   default:
    System.out.println("enter valid pid");
    continue;
  }
  double totalprice=price*quantity;
  total=total+totalprice;
}
 
 System.out.println("The total retail price of products sold\n"+total);
 }
}