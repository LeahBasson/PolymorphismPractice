
package za.ac.cput;

import java.util.ArrayList;

public class PolyEmployees {

    
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<Employee>();
        employeeList.add(new Manager("Radford", "Manager", 10000));
        employeeList.add(new Intern("Buhle", "Intern", 40, 120.50));
        employeeList.add(new SalesRep("Thando", "Sales Rep", 50000, 12.5));
        //employeeList.add(new Supplier("WidgetCompany", 100, 20.50));
       
        StringBuilder info = new StringBuilder("Employee Information:\n-----------------------\n");        
        for (Employee employee : employeeList) {
            info.append(employee.getName().concat("\nRole: ").concat(employee.getRole()).concat("\nSalary R").concat("" + employee.pay()+"\n-----------\n"));
        }
//        for (Payable employee : employeeList) {
//            info.append(employee.toString());
//        }
        System.out.println(info);
    }// end of main
    
}// end of class
