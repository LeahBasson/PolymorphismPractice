
package za.ac.cput;


public class Student {
    private String studNumber;
    private String studName;
    
    public Student(String studNumber, String studName){
        this.studNumber = studNumber;
        this.studName = studName;   
    }

    // you have to add this otherwise it will display the address.
    // if you dont add this the system will still run but output somethig else.
    @Override
    public String toString() {
        return "Student{" + "studNumber=" + studNumber + ", studName=" + studName + '}';
    }
    
    
}// end of class
