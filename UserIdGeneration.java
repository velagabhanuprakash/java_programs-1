import java.util.*;
public class UserIdGeneration {
    public static char casecheck(char b){
        if(Character.isUpperCase(b))
            return Character.toLowerCase(b);
        else
            return Character.toUpperCase(b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name");
        String first=sc.next();
        System.out.println("Enter second name");
        String second=sc.next();
        System.out.println("Enter pin");
        String pin=sc.next();
        System.out.println("Enter a number");
        int num=sc.nextInt();
        checkLongShort(first,second,pin,num);
    }
    public static void checkLongShort(String first,String second,String pin,int num){
        String large,small,a,b;
        if(first.length()>second.length()){
            large=first;
            small=second;
        }
        else if(first.length()<second.length()){
            large=second;  
            small=first;
        }
        else{
             a=first.toLowerCase();
             b=second.toLowerCase();
            if(a.compareTo(b)>0){
                small=second;
                large=first;
            }
            else{
                large=second;
                small=first;
            }
        }
        generateUserId(large,small,pin,num);
    }
    public static void generateUserId(String large,String small,String pin,int num){
        String gen="";
        char a=small.charAt(small.length()-1);
        gen+=casecheck(a);
        for(int i=0;i<large.length();i++){
            char b=large.charAt(i);
            gen+=casecheck(b);
        }
        StringBuffer str=new StringBuffer(pin);
        gen+=str.charAt(num-1);
        gen+=(str.reverse()).charAt(num-1);
        System.out.println(gen);            
    }   
}
