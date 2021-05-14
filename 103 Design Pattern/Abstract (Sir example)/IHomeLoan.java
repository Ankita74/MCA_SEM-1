/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactory;

/**
 *
 * @author ajay
 * Abstract ProductA
 */
public interface IHomeLoan { 
    public double getloan();
    public double getInterest();
    public void SetRateofInt(double r);
    public void setLoanAmount(double lamt);
    public void setNoofYear(int n);
    public String TearmCond();
    
}
