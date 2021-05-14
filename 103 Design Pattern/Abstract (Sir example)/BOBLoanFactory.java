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
public class BOBLoanFactory extends AbstractBankLoanFactory{

    @Override
    public IHomeLoan getHomeLoan() {
        return new BOBHomeLoan();
    }

    @Override
    public IPersonalLoan getPersonalLoan() {
        return new BOBPersonalLoan();
    }
    
}
