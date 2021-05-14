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
public  abstract class  AbstractLoanFactory {
    //public IHomeLoan ih;
    //public IPersonalLoan ip;
    public abstract IHomeLoan  getHomeLoan(int i );
    public abstract IPersonalLoan getPersonalLoan(int i );
    public static AbstractLoanFactory getFactory(int i)
    {
        if ( i== 1 )
            return new HomeLoanFactory();
        else if( i == 2)
            return new PersonalLoanFactory();
        else 
            return null;
    }

}
