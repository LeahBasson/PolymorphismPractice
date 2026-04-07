
package za.ac.cput;


public class Manager extends Employee{
    private double salary;
    public Manager(String name, String role, double sal){
        empName = name;
        empRole = role; 
        salary = sal;
    }
    
    @Override
    public String getRole() {
        return empRole;
    }

    public String getName() {
        return empName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double pay() {
        return salary;
    }
    @Override
    public String toString() {
        return empName + "  " + empRole + "  Pay = R" + pay() + "\n";
    }
}// end of class
