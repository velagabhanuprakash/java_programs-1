import java.util.*;
public class Holmes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter incomplete with underscore");
        String a=sc.next();
        System.out.println("Enter group of words seperated with colon");
        String b=sc.next();
        identifyPossibleWords(a,b);
    }
    public static void identifyPossibleWords(String c,String d){
        String[] str=d.split(";");
        int g=0;
        String words="";
        for(String i:str){
            if(i.length()==c.length()){
                int count=0;
                for(int j=0;j<c.length();j++){
                    String e=i.toLowerCase();
                    String f=c.toLowerCase();
                    if(e.charAt(j)==f.charAt(j)){
                        count++;
                    }
                }
                if(count==c.length()-1){
                    g++;
                    words+=(i.toUpperCase()+";"); 
                }                 
            }
         
        }
        if(g==0)
            System.out.println("ERROR-009");
        else
            System.out.println(words.substring(0,words.length()-1));
    }
}

