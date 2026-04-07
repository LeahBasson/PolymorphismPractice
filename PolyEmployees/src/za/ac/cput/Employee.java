
package za.ac.cput;


abstract class Employee implements Payable{
    protected String empName;
    protected String empRole;
    
    abstract String getRole();
    abstract String getName();

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }
//     public double pay() {
//        return ????;
//    }
}// end of class
