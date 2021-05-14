/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author ajay
 * product B2
 */
public class BOBPersonalLoan implements IPersonalLoan{
    
    double amt, ri;
    int ny;
    public BOBPersonalLoan()
    {
        amt = 0.0;
        ri = 0.0;
        ny = 0;
    }
    @Override
    public double getInterest() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       return amt - (amt*ri*ny)/100;
    }

    @Override
    public void SetRateofInt(double r) {
        
        this.ri = r;
    }

    @Override
    public void setLoanAmount(double lamt) {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       this.amt = lamt;
    }

    @Override
    public void setNoofYear(int n) {
        
        this.ny= n;
    }

    @Override
    public String TearmCond() {
            return "Terms and condition for Personal Loan  Min Amt 10000 and Mix Amt 500000"   ;  
    }
   
}
