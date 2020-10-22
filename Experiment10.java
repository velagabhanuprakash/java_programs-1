/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
class Rational{
    int num;
    int den;
    int gcd;
    public Rational(int a,int b){
        num=a;
        den=b;
    }
    public int gcd(){
        if(den==0)
            return -1;
        for (int i = 1; i <=num && i<=den; i++) {
            if(num%i==0 && den%i==0)
                gcd=i;
        }
        return gcd;
    }
    public void findrational(){
        int a=gcd();
        if(a==-1){
            System.out.println("Enter denominator other than 0");
            return;
        }
        System.out.println("Rational number is "+(num/gcd)+"/"+(den/gcd));
    }
}
public class Experiment10 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numerator");
        int a=sc.nextInt();
        System.out.println("Enter denominator");
        int b=sc.nextInt();
        Rational obj=new Rational(a,b);
        obj.findrational();
    }
    
}
