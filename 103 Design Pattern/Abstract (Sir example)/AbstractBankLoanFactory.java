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
public abstract class AbstractBankLoanFactory {
    public abstract IHomeLoan  getHomeLoan( );
    public abstract IPersonalLoan getPersonalLoan( );
    public static AbstractBankLoanFactory getFactory(int i)
    {
        if ( i == 1 )
        {
            return new SBILoanFactory();
        }
        else if(i == 2 )
        {
            return new BOBLoanFactory();
        }
        else 
        {
            return null;
        }
    }
}
