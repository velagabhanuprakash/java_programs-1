/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment7;
import java.util.*;
class Generator{
    int arr[][];
    Random rand;
    public Generator(){
        arr=new int[2][6];
        rand=new Random();
    }
    public void generate(){
        for (int i = 0; i < 6; i++) {
            arr[0][i]=i+1;
            arr[1][i]=0;
        }
        for (int i = 0; i < 10000; i++) {
            int a=1+rand.nextInt(6);
            int b=1+rand.nextInt(6);
            System.out.println(a+" "+b);
            if(a==b)
                count(a);
        }
    }
    public void count(int a){
        arr[1][a-1]+=1;
    }
    public void show(){
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[0][i]+"    ");
        }
        System.out.println();
        for (int i = 0; i < 6; i++) {
            System.out.print(arr[1][i]+"  ");
        }
    }
}
public class Experiment7 {

    public static void main(String[] args) {
        // TODO code application logic here
        Generator obj=new Generator();
        obj.generate();
        obj.show();
    }
    
}
