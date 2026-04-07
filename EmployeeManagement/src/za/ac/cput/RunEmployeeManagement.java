
package za.ac.cput;

import javax.swing.JFrame;

public class RunEmployeeManagement {

    
    public static void main(String[] args) {
        EmployeeManagement myApp = new EmployeeManagement();

        // Method to enable you to close frame
        myApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Size of frame
        myApp.setSize(800, 500);

        // Frame is invisible by default, method to make it visible.
        myApp.setVisible(true); 
        
    }// end of main
    
}// end of class
