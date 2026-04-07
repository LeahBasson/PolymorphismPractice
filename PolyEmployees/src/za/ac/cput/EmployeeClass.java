
package za.ac.cput;


public class EmployeeClass implements Salary{
    int salary;

    public EmployeeClass() {
    }

    public EmployeeClass(int salary) {
        this.salary = salary;
    }
    
    @Override 
    public void insertsalary(int salary)
    {
        this.salary = salary;
    }
    @Override 
    public String printSalary() { 
        return "EmployeeClass salary: R" + this.salary;
    }
}// end of class
