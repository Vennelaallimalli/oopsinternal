import java.util.*;
class MulMatrix{
 public static void main(String args[]){
   int m,n,p,q,i,j; 
   Scanner input=new Scanner(System.in);
   System.out.println("enter no. of rows and columns first matrix: ");
   m=input.nextInt();
   n=input.nextInt();
   int a[][]=new int[m][n];
   System.out.println("enter elements of first mattrix :");
   for(i=0;i<m;i++)
    for(j=0;j<n;j++)
     a[i][j]=input.nextInt();
   System.out.println("enter no. of rows and columns second matrix: ");
   p=input.nextInt();
   q=input.nextInt();
   if(n!=p){
    System.out.println("multiplication not possible");
   }
   int b[][]=new int[p][q];
   int c[][]=new int[m][q];
   System.out.println("enter elements of second matrix :");
   for(i=0;i<p;i++)
    for(j=0;j<q;j++)
      b[i][j]=input.nextInt();
   
   for(i=0;i<m;i++)
    for(j=0;j<q;j++)
      
      for(int k=0;k<p;k++){
        c[i][j]=c[i][j]+a[i][k]*b[k][j];
     }
   System.out.println("Mul of matrices:");
   for(i=0;i<m;i++){
    for(j=0;j<q;j++){
      System.out.print(c[i][j]+"\t");}
    System.out.println("\n");
   
  }
}
}    
   
   