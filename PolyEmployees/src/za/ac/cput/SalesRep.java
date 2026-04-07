
package za.ac.cput;


public class SalesRep extends Employee{
    private double sales;
    private double commissionRate;
    public SalesRep(String name, String role, double saleValue, double commRate){
        empName = name;
        empRole = role;
        sales = saleValue;
        commissionRate = commRate;
    }
    
    @Override
    public String getRole() {
        return empRole;
    }
    @Override
    public String getName() {
        return empName;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
    }

    @Override
    public double pay() {
        return (commissionRate/100) * sales;
    }

    @Override
    public String toString() {
        return getName() + " sales=" + sales + ", commissionRate=" + commissionRate + "%  Pay = R" + pay()+ "\n";
    }

}// end of class
