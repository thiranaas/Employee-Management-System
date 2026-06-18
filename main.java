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
class Developer extends Employee{
    String language;
    Developer(int id, String name, int salary, String language){
        super(id,name,salary);
        this.language=language;
    }
    void display(){
        System.out.println("Developer Details:\nID:"+this.id+"\nName:"+this.name+"\nSalary:"+this.salary+"\nLanguage:"+this.language);
    }
}
class Intern extends Employee{
    String duration;
    Intern(int id, String name, int salary, String duration){
        super(id,name,salary);
        this.duration=duration;
    }
    void display(){
        System.out.println("Intern Details:\nID:"+this.id+"\nName:"+this.name+"\nSalary:"+this.salary+"\nDuration:"+this.duration);
    }
}
public class main{
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
            Manager o=new Manager(id,name,salary,department);
            o.display();
        }
        else if (empc==2){
            sc.nextLine();
            System.out.println("Enter the Programming Language:");
            String language=sc.nextLine();
            Developer o=new Developer(id,name,salary,language);
            o.display();
        }
        else if (empc==3){
            sc.nextLine();
            System.out.println("Enter the Employee's duration:");
            String duration=sc.nextLine();
            Intern o=new Intern(id,name,salary,duration);
            o.display();
        }
        else{
            System.out.println("Invalid Employee category");
        }
}}
