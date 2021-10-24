
package javaapplication60;

/**
 *
 * @author BOODY
 */
public class JavaApplication60 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    { 
        ACCount ac = new ACCount();
        ac.setId(1234);
        ac.setBalance(30987);
        ac.setAnnualInterestRate(1000);
        ac.deposit(100);
        
    }
    
}
