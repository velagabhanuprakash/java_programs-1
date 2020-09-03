import java.util.*;
public class Palindrome{
      public static void main(String args[]){
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter a number");
           int num=sc.nextInt();
           String str=Integer.toString(num);
           for(int i=0;i<str.length();i++){
             StringBuffer a=new StringBuffer(str.substring(0,i)+str.substring(i+1));
             int b=Integer.parseInt(a.toString());
             int c=Integer.parseInt((a.reverse()).toString());
             if(b==c){
                System.out.println("Number to be removed to get palindrome is "+str.charAt(i));
                break;
             }
           }
      }
}
           