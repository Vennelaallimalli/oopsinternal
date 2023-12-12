import java.util.*;
class VowelConsonant{
  public static void main(String args[]){
  Scanner input=new Scanner(System.in);
  System.out.println("enter text:");
  String text=input.nextLine();
  int vowels=0,con=0;
  char ch;
  text=text.toLowerCase();
  for(int i=0;i<text.length();i++){
    ch=text.charAt(i);
    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='O'||ch=='I'||ch=='O'||ch=='U'){
       vowels++;
    }
    else{
     con++;
    }
 }
 System.out.println("total no. of vowels are : " +  vowels + "and consonants are: " + con);
}
} 