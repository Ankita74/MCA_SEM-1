/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author ajay
 */
import java.util.Scanner;
public class AbstractFactoryCleint {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //public IHomeLoan hl;
        //public IPersonalLoan pl;
        //AbstractLoanFactory lf;
		
        int choice1,choice2;
        Scanner in = new Scanner(System.in);
        /*System.out.println("1. Home Loan");
        System.out.println("2. Personal Loan");
        System.err.print("Enter your choice :- ");
        choice1 = in.nextInt();*/
        System.out.println("1.State bank of India ");
        System.out.println("2. Bank of Baroad ");
        System.out.print("Select  your Bank :- ");
        choice2 = in.nextInt();
         AbstractBankLoanFactory lf1  = AbstractBankLoanFactory.getFactory(choice2);
         IHomeLoan hl = lf1.getHomeLoan();
         System.out.println(hl.TearmCond());
         
         
         
        
        
        /*lf = AbstractLoanFactory.getFactory(choice1);
        if (choice1 == 1 )
        {
            IHomeLoan hl = lf.getHomeLoan(choice2);
            IPersonalLoan pl = lf.getPersonalLoan(choice2);
            hl.TearmCond();
        }
        else
        {
            IPersonalLoan pl = lf.getPersonalLoan(choice2);
            pl.TearmCond();
        }*/
            
        
    }
    
}   

