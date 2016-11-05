
/**
 * Write a description of class Credit here.
 * 
 * @author (Ebubechukwu Nnabuihe Abara)
 * @student id (140399761)
 * @version (a version number or a date)
 */
public class Credit
{
    private double value;
    private double deposit;
    private double loanRequired;
    private int repaymentYears;
    private int repaymentMonths;
    private double interestRate;
    private double repaymentAmount;
    private double monthlyRepayment;
    private double profitPerSaleForecast;
    
    //constructor: linked to MORTGAGE and AUTO LOAN
    public Credit(double v, double d, double lr, int ry, int rm, double ir, double ra, double mr, double ppsf)
    {
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
    public Credit(int ry)
    {
        repaymentYears = ry;
    }
    
    //constructor: linked to PERSONAL LOAN
    public Credit(double lr, int rm, double ir, double ra, double mr, double ppsf)
    {
        loanRequired = lr;
        repaymentMonths = rm;
        interestRate = ir;
        repaymentAmount = ra;
        monthlyRepayment = mr;
        profitPerSaleForecast = ppsf;
    }
    
    //instance getter method: gets property value
    public double getValue()
    {
        return value;
    }
    
    //instance getter method: gets deposit amount
    public double getDeposit()
    {
        return deposit;
    }

    //instance getter method: to calculate loan required
    public double calcLoanRequired()
    {
        loanRequired = value - deposit;
        return loanRequired;
    }
       
    //instance setter method: sets total number of months for repayment
    public int calcRepaymentMonths()
    {
        repaymentMonths = repaymentYears * 12;
        return repaymentMonths;
    }
    
    //instance setter method: sets fixed interest rate
    public double calcInterestRate()
    {
        interestRate = repaymentYears;
        return interestRate;
    }

    //instance setter method: sets fixed amount customer needs to repay
    public double calcRepaymentAmount()
    {
        repaymentAmount = ((100 + interestRate) / 100) * loanRequired;
        return repaymentAmount;
    }
    
    //instance setter method: sets fixed amount customer needs to pay monthly
    public double calcMonthlyRepayment()
    {
        monthlyRepayment = repaymentAmount / repaymentMonths;
        return monthlyRepayment;
    }
    
    //instance setter method: sets fixed profit company makes per sale (KPI)
    public double calcProfitPerSaleForecast()
    {
        profitPerSaleForecast = repaymentAmount - loanRequired;
        return profitPerSaleForecast;
    }
}
