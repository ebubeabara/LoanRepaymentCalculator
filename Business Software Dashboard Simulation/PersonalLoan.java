
/**
 * Write a description of class PersonalLoan here.
 * 
 * @author (Ebubechukwu Nnabuihe Abara)
 * @student id (140399761)
 * @version (a version number or a date)
 */
public class PersonalLoan extends Credit
{
    private double loanRequired; //state: instance variable
    private int repaymentMonths; //state: instance variable
    private double interestRate; //state: instance variable
    private double repaymentAmount; //state: instance variable
    private double monthlyRepayment; //state: instance variable
    private double profitPerSaleForecast; //state: instance variable
    
    //constructor
    public PersonalLoan(double lr,int rm, double ir, double ra, double mr, double ppsf)
    {
        super(lr, rm, ir, ra, mr, ppsf);
        loanRequired = lr;
        repaymentMonths = rm;
        interestRate = ir;
        repaymentAmount = ra;
        monthlyRepayment = mr;
        profitPerSaleForecast = ppsf;        
    }
    
    //constructor
    public PersonalLoan(int rm)
    {
        super(rm);
        repaymentMonths = rm;
    }
    
    //instance setter method: sets fixed interest rate
    @Override
    public double calcInterestRate()
    {
        interestRate = repaymentMonths;
        return interestRate;
    }
}
