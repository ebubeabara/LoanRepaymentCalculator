
/**
 * Write a description of class AutoLoan here.
 * 
 * @author (Ebubechukwu Nnabuihe Abara)
 * @student id (140399761)
 * @version (a version number or a date)
 */
import javax.swing.*;
public class AutoLoan extends Credit
{
    private double value; //state: instance variable
    private double deposit; //state: instance variable
    private double loanRequired; //state: instance variable
    private int repaymentYears; //state: instance variable
    private int repaymentMonths; //state: instance variable
    private double interestRate; //state: instance variable
    private double repaymentAmount; //state: instance variable
    private double monthlyRepayment; //state: instance variable
    private double profitPerSaleForecast; //state: instance variable
    
    
    //constructor    
    public AutoLoan(double v, double d, double lr, int ry, int rm, double ir, double ra, double mr, double ppsf)
    {
        super(v, d, lr, ry, rm, ir, ra, mr, ppsf);        
        value = v;
        deposit = d;
        loanRequired = lr;
        repaymentYears = ry;
        repaymentMonths = rm;
        interestRate = ir;
        repaymentAmount = ra;
        monthlyRepayment = mr;
        profitPerSaleForecast = ppsf;
    }
    
    //constructor
    public AutoLoan(int ry)
    {
        super(ry);
        repaymentYears = ry;
    }
    
    //instance setter method: sets fixed interest rate
    @Override
    public double calcInterestRate()
    {
        interestRate = repaymentYears * 5;
        return interestRate;
    }
}
