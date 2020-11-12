package Practice7_8;
import java.util.List;

public class Loader {
    Company company = new Company();
    private int salary = 50000;
    private final String[] name = {"John", "Joseph", "Noah", "Bill", "Tim", "Tom", "Abraham", "Will", "Josh"};
    private final String[] surname = {"Baker", "Phillips", "Allen", "Adams", "Anderson", "Green"};

    public Loader(){
        createCompany();
        company.calcIncome();
        showTopSalary(15);
        showLowSalary(30);
        removeEmployee();
        showTopSalary(15);
        showLowSalary(30);
    }

    public void removeEmployee(){
        System.out.println("\nУвольнение...\n");
        for(int i = 0; i < company.getStaffSize(); i++){
            company.fire(i);
        }
    }

    public void createCompany(){
        for(int i = 0; i < 180; i++){
            company.hire(new Employee(name[i%9], surname[i%6], salary, new Operator()));
        }
        for(int i = 0; i < 80; i++){
            company.hire(new Employee(name[(i+2)%9], surname[(i+4)%6], salary, new Manager()));
        }
        for(int i = 0; i < 10; i++){
            company.hire(new Employee(name[(i+5)%9], surname[(i+3)%6], salary, new TopManager(company)));
        }
    }

    public void showTopSalary(int number){
        List<Employee> temp;
        temp = company.getTopSalaryStaff(number);
        System.out.println(" " + number + " самых высоких зарплат");
        for (int i = 0; i < number; i++){
            System.out.printf("%,d", (int) temp.get(i).getPost().calcSalary(temp.get(i).getSalary()));
            System.out.println(" руб\t\t" + temp.get(i).getPost().getJobTitle());
        }
    }

    public void showLowSalary(int number){
        List<Employee> temp;
        temp = company.getLowestSalaryStaff(number);
        System.out.println(" " + number + " самых низких зарплат");
        for (int i = 0; i < number; i++){
            System.out.printf("%,d", (int) temp.get(i).getPost().calcSalary(temp.get(i).getSalary()));
            System.out.println(" руб\t\t" + temp.get(i).getPost().getJobTitle());
        }
    }

    public static void main(String[] args) {
        new Loader();
    }
}
