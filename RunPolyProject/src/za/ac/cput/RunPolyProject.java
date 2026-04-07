
package za.ac.cput;


public class RunPolyProject {

    
    public static void main(String[] args) {
        // Creating variable of class Parent
        Parent parent;
 
        // Now we will be calling print methods       
 
        parent = new Parent();
        parent.print();

        parent = new SubClass1();
        parent.print();     
 
        parent = new SubClass2();
        parent.print();
        
        // if I want to use a method of a sub class I have to use instanceof.
        // parent.aMethod();
        
        
        Parent a;
//        a = new SubClass2();
//        if (a instanceof SubClass1)
//            System.out.println("this is a SubClass1 object");
//        else
//            //a.aMethod();
//            a.print();
        
        a = new SubClass1();
        if (a instanceof SubClass1) {
            System.out.println("*this is a SubClass1 object");
        } else {
            System.out.println("*this is NOT a SubClass1 object");
        }

    }// end of main
    
}// end of class
