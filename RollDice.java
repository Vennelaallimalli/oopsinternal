import java.util.*;
class RollDice{
  public static void main(String args[]){
   Random random=new Random();
   int f1=0,f2=0,f3=0,f4=0,f5=0,f6=0;
   for(int roll=1;roll<10000;roll++){
    int dice1=1+random.nextInt(6);
    int dice2=1+random.nextInt(6);
    if(dice1==dice2){
      switch(dice1){
         case 1:
           f1++;
           break;
         case 2:
           f2++;
           break;
         case 3:
           f3++;
           break;
         case 4:
           f4++;
           break;
          case 5:
           f5++;
           break;
          case 6:
           f6++;
           break;
        }
       }
      }
      System.out.println("face \t count");
      System.out.println("1\t"+f1+"\n2\t"+f2+"\n3\t"+f3+"\n4\t"+f4+"\n5\t"+f5+"\n6\t"+f6);
   }
}