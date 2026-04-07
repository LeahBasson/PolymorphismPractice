
package za.ac.cput;


public class Intern extends Employee{
    private int hours;
    private double rate;
    public Intern(String name, String role, int hrs, double rt){
        empName = name;
        empRole = role;
        hours = hrs;
        rate = rt;
    }
    
    @Override
    public String getRole() {
        return empRole;
    }
    @Override
    public String getName() {
        return empName;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    @Override
    public double pay() {
        return hours * rate;
    }

    @Override
    public String toString() {
        return empName + "  " + empRole + "  hours= " + hours + ", rate= R" + rate + "  Pay = R" + pay()+ "\n";
    }
}// end of class
