import java.util.*;
class Employee{
  public static void main(String args[]){
   Scanner input=new Scanner(System.in);
   System.out.println("enter no. of employees:");
   int n=input.nextInt();
   System.out.println("enter "+ n + " employees details ");
   int id[]=new int[n];
   String name[]=new String[n];
   String gender[]=new String[n];
   String des[]=new String[n];
   String address[]=new String[n];
   int age[]=new int[n];
   int salary[]=new int[n];
   System.out.println("enter employee details\nIDNO.\nNAME\nGENDER\nDESIGNATION\nADDRESS\nAGE\nSALARY\n");
   for(int i=0;i<n;i++){
     System.out.println("enter employee " +(i+1)+ " details");
     id[i]=input.nextInt();
     name[i]=input.next();
     gender[i]=input.next();
     des[i]=input.next();
     address[i]=input.next();
     age[i]=input.nextInt();
     salary[i]=input.nextInt();
   }
   System.out.println("enter employee id whose details you require:");
   int ID=input.nextInt();
   System.out.println("employee id "+ ID+ " Details");
   for(int i=0;i<n;i++){
    if(ID==id[i]){
     System.out.println("Employee name is :" +name[i]);
     System.out.println("Employee age is :" +age[i]);
     System.out.println("Employee gender is :" +gender[i]);
     System.out.println("Employee address is :" +address[i]);
     System.out.println("Employee designation is :" +des[i]);
     System.out.println("Employee salary is :" +salary[i]);
    }
   }
 }
}
