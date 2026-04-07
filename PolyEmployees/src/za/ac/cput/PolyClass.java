
package za.ac.cput;

import java.util.ArrayList;

public class PolyClass {

    
    public static void main(String[] args) {
        Salary salaryObj;
        salaryObj = new EmployeeClass();//polymorphic assignment statement        
        salaryObj.insertsalary(100000);
        System.out.println(salaryObj.printSalary());
        
        salaryObj = new SupplierClass();//polymorphic assignment statement
        salaryObj.insertsalary(200000);
        System.out.println(salaryObj.printSalary());
        
        ArrayList<Salary> myObjectsList = new ArrayList<>();
        myObjectsList.add(new EmployeeClass(2500));//polymorphic assignment statement
        myObjectsList.add(new SupplierClass(1200));//polymorphic assignment statement
        for (Salary objs : myObjectsList) {
            System.out.println(objs.printSalary());
        }       
    }// end of main
    
}// end of class
