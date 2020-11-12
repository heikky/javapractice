package Practice7_8;
import java.util.Random;

public class Employee {
    private String name;
    private String surname;
    private double salary;
    private EmployeePost post;

    Employee(String name, String surname, int salary, EmployeePost post){
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.post = post;
    }

    public double getSalary(){return salary;}
    public String getName(){return name;}
    public String getSurname(){return surname;}
    public EmployeePost getPost(){return post;}
    public void setName(String name){this.name=name;}
    public void setSurname(String surname){this.surname=surname;}
    public void setSalary(double salary){this.salary=salary;}
    public void setPost(EmployeePost post){this.post = post;}
}

class Manager implements EmployeePost {
    public Random random = new Random();
    private int sum;

    public int Sum(){
        this.sum = random.nextInt(25000) + 115000;
        return sum;
    }

    @Override
    public String getJobTitle() {
        return "Manager";
        }

    @Override
    public double calcSalary(double salary) {
        return (salary + sum * 0.05);
        }
    }

class TopManager implements EmployeePost {
    Company company;
    public TopManager(Company company){
        this.company = company;
        }

    @Override
    public String getJobTitle() {
            return "Top Manager";
        }

    @Override
    public double calcSalary(double salary) {
        if(company.getIncome() >= 10000000){
            return (salary + salary*1.5);
        }
        else{
            return salary;
        }
    }
}

class Operator implements EmployeePost
    {
        @Override
        public String getJobTitle() {
            return "Operator";
        }

        @Override
        public double calcSalary(double salary) {
            return salary;
        }
    }

