package Practice7_8;
import java.util.ArrayList;
import java.util.List;

public class Company {
    private double income =0;
    private ArrayList<Employee> employeeArrayList = new ArrayList<>();

    public void hire(Employee employees){
        employeeArrayList.add(employees);
    }

    public void hireAll(ArrayList<Employee> listEmployee){
        employeeArrayList.addAll(listEmployee);
    }

    public void fire(int employee){
        employeeArrayList.remove(employee);
    }

    public double getIncome(){
        return income;
    }

    public void calcIncome(){
        this.income = 0;
        for(Employee item : employeeArrayList)
            if(item.getPost() instanceof Manager){
                income += ((Manager) item.getPost()).Sum();
            }
    }

    List<Employee> getTopSalaryStaff(int count){
        ArrayList<Employee> temp = employeeArrayList;
        Employee x;
        for(int i = 0;i < temp.size() - 1; i++){
            for(int j = i + 1; j < temp.size(); j++){
                if(temp.get(i).getPost().calcSalary(temp.get(i).getSalary()) < temp.get(j).getPost().calcSalary(temp.get(j).getSalary())) {
                    x = temp.get(j);
                    temp.set(j, temp.get(i));
                    temp.set(i, x);
                }
            }
        }
        return temp.subList(0, count);
    }

    List<Employee> getLowestSalaryStaff(int count){
        ArrayList<Employee> temp = employeeArrayList;
        Employee x;
        for(int i = 0;i < temp.size() - 1; i++) {
            for (int j = i + 1; j < temp.size(); j++) {
                if(temp.get(i).getPost().calcSalary(temp.get(i).getSalary()) > temp.get(j).getPost().calcSalary(temp.get(j).getSalary())) {
                    x = temp.get(j);
                    temp.set(j, temp.get(i));
                    temp.set(i, x);
                }
            }
        }
        return temp.subList(0, count);
    }

    public int getStaffSize(){
        return employeeArrayList.size();
    }
}
