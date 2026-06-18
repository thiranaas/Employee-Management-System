import java.util.Scanner;
class Employee{
    int id;
    String name;
    int salary;
    Employee(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    void display(){
        System.out.println("ID:"+this.id+"\nName:"+this.name+"\nSalary:"+this.salary);
    }
}
class Manager extends Employee{
    String department;
    Manager(int id, String name, int salary, String department){
        super(id, name, salary);
        this.department=department;
    }
    void display(){
        System.out.println("Manager details:\nID:"+this.id+"\nName:"+this.name+"\nSalary:"+this.salary+"\nDepartment:"+this.department);
    }


}
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee name:");
        String name=sc.nextLine();
        System.out.println("Enter the Employee id:");
        int id=sc.nextInt();
        System.out.println("Enter the Employee salary:");
        int salary=sc.nextInt();
        System.out.println("Enter the Employee category (1-Manager, 2-Developer, 3-Intern):");
        int empc=sc.nextInt();
        if (empc==1){
            sc.nextLine();
            System.out.println("Enter the Employee department:");
            String department=sc.nextLine();
            Manager m=new Manager(id,name,salary,department);
            m.display();
        }
}}
