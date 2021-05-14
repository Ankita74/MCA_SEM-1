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
public class HomeLoanFactory extends AbstractLoanFactory {

    @Override
    public IHomeLoan getHomeLoan(int i) {
        if ( i == 1 )
        {
             return new SBIHomeLoan();
        }
        else 
        {
            return new BOBHomeLoan();
        }
    }
    @Override
    public IPersonalLoan getPersonalLoan(int i ) {
        return new BOBPersonalLoan();
    }

      
}
