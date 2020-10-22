/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package experiment9;
import java.util.Scanner;
class Employee{
  String Emp_name;
  int Emp_id;
  String Address;
  String Mail_id;
  String Mobile_no;

    public String getEmp_name() {
        return Emp_name;
    }

    public void setEmp_name(String Emp_name) {
        this.Emp_name = Emp_name;
    }

    public int getEmp_id() {
        return Emp_id;
    }

    public void setEmp_id(int Emp_id) {
        this.Emp_id = Emp_id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getMail_id() {
        return Mail_id;
    }

    public void setMail_id(String Mail_id) {
        this.Mail_id = Mail_id;
    }

    public String getMobile_no() {
        return Mobile_no;
    }

    public void setMobile_no(String Mobile_no) {
        this.Mobile_no = Mobile_no;
    }
  
}
class Faculty extends Employee{
    int Basic_Pay;
    String designation;
    int num;
    int bp;
    String str[]={"programmer","Assistant Professor","Associate Professor","Professor"};
    int arr[]={10000,12000,15500,13000};
    
    public int getBasic_Pay() {
        return arr[num-1];
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.num=designation;
        this.designation = str[designation-1];
    }
    public void show(){
        System.out.println("\n1.Programmer\n2.Assistant Professor\n3.Associate Professor\n4.Professor");
    }
    public double grosssalary(){
        bp=getBasic_Pay();
        bp+=((bp*97)/100);
        bp+=((bp*10)/100);
        return bp;
    }
    public double netsalary(){
        bp-=((bp*12)/100);
        bp-=((bp*0.1)/100);
        return bp;
    }
    
}
public class Experiment9 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Faculty obj=new Faculty();
        System.out.println("Enter Employee Name...");
        obj.setEmp_name(sc.nextLine());
        System.out.println("Enter Employee Id...");
        obj.setEmp_id(sc.nextInt());
        sc.nextLine();
        System.out.println("Enter Employee Address");
        obj.setAddress(sc.nextLine());
        System.out.println("Enter Employee Mail Id");
        obj.setMail_id(sc.nextLine());
        System.out.println("Enter Employee Mobile number");
        obj.setMobile_no(sc.next());
        System.out.println("choose Faculty");
        obj.show();
        obj.setDesignation(sc.nextInt());
        System.out.println("Gross Salary is "+obj.grosssalary());
        System.out.println("Net Salary is "+obj.netsalary());
    }
    
}
