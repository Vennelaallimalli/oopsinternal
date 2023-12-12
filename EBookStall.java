import java.util.*;
class Book{
 String Bname;
 String Author;
 int Bcount;
 public Book(String Bname,String Author,int Bcount){
   this.Bname=Bname;
   this.Author=Author;
   this.Bcount=Bcount;
  }
  public void sell(int n){
   if(n<=Bcount){
     Bcount=Bcount-n;
     System.out.println("sold "+n+" copies of books "+ Bname);
     System.out.println("remaining copies = "+Bcount);
   }
   else{
    System.out.println("Stock not available");
   }
 }
}
class Customer{
  int cid;
  String cname;
  String address;
  public Customer(int cid,String cname,String address){
    this.cid=cid;
     this.cname=cname;
    this.address=address;
  }
  public void buy(Book b,int n){
   System.out.println(cname +" is buying book");
   b.sell(n);
  }
}

class EBookStall{
 public static void main(String args[]){
 Book b1=new Book("hello","vennela",20);
 Book b2=new Book("world","shiva",10);
 Customer c1=new Customer(1,"gullu","xyz");
 Customer c2=new Customer(2,"megha","pqr");
 c1.buy(b1,2);
 c2.buy(b2,10);
 c1.buy(b2,4);
 }
}
 
   