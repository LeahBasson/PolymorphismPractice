
package za.ac.cput;


public class SupplierClass implements Salary{
    int salary;

    public SupplierClass() {
    }

    public SupplierClass(int salary) {
        this.salary = salary;
    }
    
    @Override 
    public void insertsalary(int salary)
    {
        this.salary = salary;
    }
    @Override 
    public String printSalary() { 
        return "SupplierClass salary: R" + this.salary;
    }
}// end of class
