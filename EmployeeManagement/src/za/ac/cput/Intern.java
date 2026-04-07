
package za.ac.cput;


public class Intern extends Employee{
    
    public Intern(String role, String name, double salary){
        empRole = role;
        empName = name;
        empSalary = salary;
    }
    
    @Override
    public String getName() {
       return empName; 
    }

    @Override
    public String getRole() {
       return empRole; 
    }

    @Override
    public double getSalary() {
       return empSalary; 
    }
    
}// end of class
