import java.util.*;
class AddMatrix{
 public static void main(String args[]){
   int r,c,i,j;
   Scanner input=new Scanner(System.in);
   System.out.println("enter no. of rows and columns: ");
   r=input.nextInt();
   c=input.nextInt();
   int a[][]=new int[r][c];
   int b[][]=new int[r][c];
   int d[][]=new int[r][c];
   System.out.println("enter elements of first mattrix :");
   for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      a[i][j]=input.nextInt();
   System.out.println("enter elements of second mattrix :");
   for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      b[i][j]=input.nextInt();
   for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      d[i][j]=a[i][j]+b[i][j];
   System.out.println("sum of matrices :");
   for(i=0;i<r;i++){ 
    for(j=0;j<c;j++)
      System.out.print(d[i][j] +"\t");
    System.out.println();
   }
}
}