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
public class PersonalLoanFactory extends AbstractLoanFactory{

    @Override
    public IHomeLoan getHomeLoan(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public IPersonalLoan getPersonalLoan(int i) {
        if ( i== 1 )
        {
            return new SBIPersonalLoan();
        }
        else if ( i== 2 )
        {
            return new BOBPersonalLoan();
        }
        else
        {
            return null;
        }
    }
    
}
