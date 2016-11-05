
/**
 * Write a description of class CreditGuiFrame here.
 * 
 * @author (Ebubechukwu Nnabuihe Abara)
 * @version (31-03-2016)
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.GridLayout.*;
import javax.swing.*;
import java.io.*;
import java.util.*;
public class CreditGuiFrame extends Frame
{
    //9 mortgage textboxes
    private TextField mValueBox = new TextField(); //creating an abject
    private TextField mDepositBox = new TextField();
    private TextField mLoanRequiredBox = new TextField();
    private TextField mRepaymentYearsBox = new TextField();
    private TextField mRepaymentMonthsBox = new TextField();
    private TextField mInterestRateBox = new TextField();
    private TextField mRepaymentAmountBox = new TextField();
    private TextField mMonthlyRepaymentBox = new TextField();
    private TextField mProfitPerSaleForecastBox = new TextField();
    
    //6 personal loan textboxes
    private TextField pLoanRequiredBox = new TextField();
    private TextField pRepaymentMonthsBox = new TextField();
    private TextField pInterestRateBox = new TextField();
    private TextField pRepaymentAmountBox = new TextField();
    private TextField pMonthlyRepaymentBox = new TextField();
    private TextField pProfitPerSaleForecastBox = new TextField();
    
    //9 auto loan textboxes
    private TextField aValueBox = new TextField();
    private TextField aDepositBox = new TextField();
    private TextField aLoanRequiredBox = new TextField();
    private TextField aRepaymentYearsBox = new TextField();
    private TextField aRepaymentMonthsBox = new TextField();
    private TextField aInterestRateBox = new TextField();
    private TextField aRepaymentAmountBox = new TextField();
    private TextField aMonthlyRepaymentBox = new TextField();
    private TextField aProfitPerSaleForecastBox = new TextField();
    
    //5 kpi's textboxes
    private TextField mTotalProfitBox = new TextField();
    private TextField pTotalProfitBox = new TextField();
    private TextField aTotalProfitBox = new TextField();
    private TextField overallTotalProfitBox = new TextField();
    private TextField mostProfitSegmentBox = new TextField();
    
    //9 intance variables for mortgage kpi's
    private double mkpiValue = 0;
    private double mkpiDeposit = 0;
    private double mkpiLoanRequired = 0;
    private int mkpiRepaymentYears = 0;
    private int mkpiRepaymentMonths = 0;
    private double mkpiInterestRate = 0;
    private double mkpiRepaymentAmount = 0;
    private double mkpiMonthlyRepayment = 0;
    private double mkpiProfitPerSaleForecast = 0;
    
    //9 intance variables for personal loan kpi's
    private double pkpiLoanRequired = 0;
    private int pkpiRepaymentMonths = 0;
    private double pkpiInterestRate = 0;
    private double pkpiRepaymentAmount = 0;
    private double pkpiMonthlyRepayment = 0;
    private double pkpiProfitPerSaleForecast = 0;    
    
    //9 intance variables for auto loan kpi's
    private double akpiValue = 0;
    private double akpiDeposit = 0;
    private double akpiLoanRequired = 0;
    private int akpiRepaymentYears = 0;
    private int akpiRepaymentMonths = 0;
    private double akpiInterestRate = 0;
    private double akpiRepaymentAmount = 0;
    private double akpiMonthlyRepayment = 0;
    private double akpiProfitPerSaleForecast = 0;
    
    //5 instance variables for  all kpi buttons
    private double mTotalProfit = 0;
    private double pTotalProfit = 0;
    private double aTotalProfit = 0;
    private double overallTotalProfit = 0;
    private String mostProfitSegment = "";
    
    //9 instance variables for mortgage
    private double mValue = 0;
    private double mDeposit = 0;
    private double mLoanRequired = 0;
    private int mRepaymentYears = 0;
    private int mRepaymentMonths = 0;
    private double mInterestRate = 0;
    private double mRepaymentAmount = 0;
    private double mMonthlyRepayment = 0;
    private double mProfitPerSaleForecast = 0;
    
    //6 instance variables for personal loan
    private double pLoanRequired = 0;
    private int pRepaymentMonths = 0;
    private double pInterestRate = 0;
    private double pRepaymentAmount = 0;
    private double pMonthlyRepayment = 0;
    private double pProfitPerSaleForecast = 0;
        
    //9 instance variables for auto loan
    private double aValue = 0;
    private double aDeposit = 0;
    private double aLoanRequired = 0;
    private int aRepaymentYears = 0;
    private int aRepaymentMonths = 0;
    private double aInterestRate = 0;
    private double aRepaymentAmount = 0;
    private double aMonthlyRepayment = 0;
    private double aProfitPerSaleForecast = 0;
    
    
    public CreditGuiFrame()
    {
        super();
        JFrame cFrame = new JFrame("CreditGuiFrame");
        JPanel cPanel = new JPanel();
        
        setSize(1000, 800); //set size of window frame
        setLayout(new GridLayout(10, 1));
        
        //row 1
        add(new Label("MORTGAGE"));
        add(new Label(""));
        add(new Label("PERSONAL LOAN"));
        add(new Label(""));
        add(new Label("AUTO LOAN"));
        add(new Label(""));
        add(new Label("KPI Indicators"));
        add(new Label(""));
        
        //row 2
        add(new Label("Property Value"));
        add(mValueBox);
        add(new Label("N/A"));
        add(new Label("N/A"));
        add(new Label("Vehicle Value"));
        add(aValueBox);
        add(new Label("Mortgage KPI"));
        add(new Label(""));
        
        
        //row 3
        add(new Label("Deposit"));
        add(mDepositBox);
        add(new Label("N/A"));
        add(new Label("N/A"));
        add(new Label("Deposit"));
        add(aDepositBox);
        Button mButtontp = new Button("Total Profit");
        add(mButtontp);
        mButtontp.addActionListener(new TotalProfitButtonListenerM());
        add(mTotalProfitBox);
        
        //row 4
        Button mButtonlr = new Button("Loan Required");
        add(mButtonlr);
        mButtonlr.addActionListener(new LoanRequiredButtonListenerM());
        add(mLoanRequiredBox);
        add(new Label("Loan Required"));
        add(pLoanRequiredBox);
        Button aButtonlr = new Button("Loan Required");
        add(aButtonlr);
        aButtonlr.addActionListener(new LoanRequiredButtonListenerA());
        add(aLoanRequiredBox);
        add(new Label("Personal Loan KPI"));
        add(new Label(""));
        
        //row 5
        add(new Label("Repayment Years"));
        add(mRepaymentYearsBox);
        add(new Label("N/A"));
        add(new Label("N/A"));
        add(new Label("Repayment Years"));
        add(aRepaymentYearsBox);
        Button pButtontp = new Button("Total Profit");
        add(pButtontp);
        pButtontp.addActionListener(new TotalProfitButtonListenerP());
        add(pTotalProfitBox);
        
        //row 6
        Button mButtonrm = new Button("Repayment Months");
        add(mButtonrm);
        mButtonrm.addActionListener(new RepaymentMonthsButtonListenerM());
        add(mRepaymentMonthsBox);
        add(new Label("Repayment Months"));
        add(pRepaymentMonthsBox);        
        Button aButtonrm = new Button("Repayment Months");
        add(aButtonrm);
        aButtonrm.addActionListener(new RepaymentMonthsButtonListenerA());
        add(aRepaymentMonthsBox);
        add(new Label("Auto Loan KPI"));
        add(new Label(""));
        
        //row 7
        Button mButtonir = new Button("Interest Rate");
        add(mButtonir);
        mButtonir.addActionListener(new InterestRateButtonListenerM());
        add(mInterestRateBox);
        Button pButtonir = new Button("Interest Rate");
        add(pButtonir);
        pButtonir.addActionListener(new InterestRateButtonListenerP());
        add(pInterestRateBox);
        Button aButtonir = new Button("Interest Rate");
        add(aButtonir);
        aButtonir.addActionListener(new InterestRateButtonListenerA());
        add(aInterestRateBox);
        Button aButtontp = new Button("Total Profit");
        add(aButtontp);
        aButtontp.addActionListener(new TotalProfitButtonListenerA());
        add(aTotalProfitBox);
        
        //row 8
        Button mButtonra = new Button("Repayment Amount");
        add(mButtonra);
        mButtonra.addActionListener(new RepaymentAmountButtonListenerM());
        add(mRepaymentAmountBox);
        Button pButtonra = new Button("Repayment Amount");
        add(pButtonra);
        pButtonra.addActionListener(new RepaymentAmountButtonListenerP());
        add(pRepaymentAmountBox);
        Button aButtonra = new Button("Repayment Amount");
        add(aButtonra);
        aButtonra.addActionListener(new RepaymentAmountButtonListenerA());
        add(aRepaymentAmountBox);
        add(new Label("All Segments KPI"));
        add(new Label(""));
        
        //row 9
        Button mButtonmr = new Button("Monthly Repayment");
        add(mButtonmr);
        mButtonmr.addActionListener(new MonthlyRepaymentButtonListenerM());
        add(mMonthlyRepaymentBox);
        Button pButtonmr = new Button("Monthly Repayment");
        add(pButtonmr);
        pButtonmr.addActionListener(new MonthlyRepaymentButtonListenerP());
        add(pMonthlyRepaymentBox);
        Button aButtonmr = new Button("Monthly Repayment");
        add(aButtonmr);
        aButtonmr.addActionListener(new MonthlyRepaymentButtonListenerA());
        add(aMonthlyRepaymentBox);
        Button oButtontp = new Button("Overall Total Profit");
        add(oButtontp);
        oButtontp.addActionListener(new TotalProfitButtonListenerO());
        add(overallTotalProfitBox);
        
        //row 10
        Button mButtonppsf = new Button("Profit Per Sale Forecast");
        add(mButtonppsf);
        mButtonppsf.addActionListener(new ProfitPerSaleForecastButtonListenerM());
        add(mProfitPerSaleForecastBox);
        Button pButtonppsf = new Button("Profit Per Sale Forecast");
        add(pButtonppsf);
        pButtonppsf.addActionListener(new ProfitPerSaleForecastButtonListenerP());
        add(pProfitPerSaleForecastBox);
        Button aButtonppsf = new Button("Profit Per Sale Forecast");
        add(aButtonppsf);
        aButtonppsf.addActionListener(new ProfitPerSaleForecastButtonListenerA());
        add(aProfitPerSaleForecastBox);
        Button oButtonswmp = new Button("Segment with most Profit");
        add(oButtonswmp);
        oButtonswmp.addActionListener(new OverallSegmentWithMostProfitButtonListener());
        add(mostProfitSegmentBox);
        
        setVisible(true); //make frame visible
        addWindowListener(new CloseWindow()); //close window when X is pressed
    }  
    
    //row 3
    class TotalProfitButtonListenerM implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ArrayList <String> data = new ArrayList<String>();
            ArrayList <String> valueS = new ArrayList<String>();
            ArrayList <String> depositS = new ArrayList<String>();
            ArrayList <String> yearsS = new ArrayList<String>();            
            ArrayList <Double> value = new ArrayList<Double>();
            ArrayList <Double> deposit = new ArrayList<Double>();
            ArrayList <Double> years = new ArrayList<Double>();
            String tempValueS = "";
            double tempValue = 0;
            String countString = "";
            double count = 0;
            
            try
            {
                String filepath = "C:\\Users\\...\\mortgage.txt";
                BufferedReader inStream = new BufferedReader(new FileReader(filepath));                
                while(true)
                {
                    String line = inStream.readLine();
                    if(line == null)
                    {
                        break;
                    }
                    data.add(line);
                }            
                inStream.close(); //close file reading
            }
            catch(IOException t)
            {
                messagebox("File not found");
            }
            catch(NumberFormatException t)
            {
                messagebox("Error: Ensure all files contain only numbers. Letters and symbols are not allowed. Correct file and try again");
            }
            catch(IndexOutOfBoundsException t)
            {
                messagebox("Technical Error: ArrayList has been indexed with an integer equal to or greater than its size");
            }
            
            for(int i=0; i<data.size(); i++)
            {
                try{
                    String str = data.get(i);
                    ArrayList<String> splitArrayList = new ArrayList<>(Arrays.asList(str.split(" ")));
                    String splitA = splitArrayList.get(0);
                    String splitB = splitArrayList.get(1);
                    String splitC = splitArrayList.get(2);                
                    valueS.add(splitA);
                    depositS.add(splitB);
                    yearsS.add(splitC);   
                }
                catch(IndexOutOfBoundsException t)
                {
                    messagebox("Technical Error: ArrayList has been indexed with an integer equal to or greater than its size");
                }
            }
            for(int i=0; i<valueS.size(); i++)
            {
                tempValueS = valueS.get(i);
                tempValue = Double.parseDouble(tempValueS);
                value.add(tempValue);
            }
            for(int i=0; i<depositS.size(); i++)
            {
                tempValueS = depositS.get(i);
                tempValue = Double.parseDouble(tempValueS);
                deposit.add(tempValue);
            }
            for(int i=0; i<yearsS.size(); i++)
            {
                tempValueS = yearsS.get(i);
                tempValue = Double.parseDouble(tempValueS);
                years.add(tempValue);
            }
            
            for(int i=0; i<data.size(); i++)
            {
                mkpiValue = value.get(i);
                mkpiDeposit = deposit.get(i);
                double yearsDouble = years.get(i);
                mkpiRepaymentYears = (int) yearsDouble;
                
                if(mkpiRepaymentYears <= 0 || mkpiRepaymentYears > 25)
                {
                    messagebox("Error: You are only allowed to enter years from 1 to 25. Try again.");
                    mkpiRepaymentYears = 0;
                }
                
                if(mkpiValue <= mkpiDeposit)
                {
                    messagebox("Error: Ensure value is higher than deposit value. Try again.");
                    mkpiValue = 0;
                    mkpiDeposit = 0;
                }
                
                Credit mortgageTP = new Mortgage(mkpiValue, mkpiDeposit, mkpiLoanRequired, mkpiRepaymentYears, mkpiRepaymentMonths, mkpiInterestRate, mkpiRepaymentAmount, mkpiMonthlyRepayment, mkpiProfitPerSaleForecast);
                Mortgage mTP = (Mortgage) mortgageTP;
                                
                mkpiLoanRequired = mortgageTP.calcLoanRequired();
                mkpiRepaymentMonths = mortgageTP.calcRepaymentMonths();
                mkpiInterestRate = round((mortgageTP.calcInterestRate()), 2);
                mkpiRepaymentAmount = mortgageTP.calcRepaymentAmount();
                mkpiMonthlyRepayment = round((mortgageTP.calcMonthlyRepayment()), 2);                
                mkpiProfitPerSaleForecast = round(mortgageTP.calcProfitPerSaleForecast(), 2);
                
                count = count + mkpiProfitPerSaleForecast;
            }
            mTotalProfit = count;
            countString = Double.toString(count);
            mTotalProfitBox.setText("£" + countString);
        }
    }
    
    //row 4
    class LoanRequiredButtonListenerM implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try{
                String mValueString = mValueBox.getText();
                mValue = Double.parseDouble(mValueString);
                
                String mDepositString = mDepositBox.getText();
                mDeposit = Double.parseDouble(mDepositString);                
            }
            catch(NumberFormatException t){
                messagebox("Error: Please enter only numbers in PROPERTYn. VALUE AND DEPOSIT box and try again. Letters and symbols are not allowed.");
            }
            
            if(mValue <= mDeposit)
            {
                messagebox("Error: Ensure value is higher than deposit value. Try again.");
                mValue = 0;
                mDeposit = 0;
            }
            
            Credit mCustomer = new Mortgage(mValue, mDeposit, mLoanRequired, mRepaymentYears, mRepaymentMonths, mInterestRate, mRepaymentAmount, mMonthlyRepayment, mProfitPerSaleForecast);
            Mortgage mCust = (Mortgage) mCustomer;
            
            mLoanRequired = mCustomer.calcLoanRequired();   
            String mLoanRequiredString = Double.toString(mLoanRequired);
            mLoanRequiredBox.setText(mLoanRequiredString);
        }
    }
    class LoanRequiredButtonListenerA implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {   
            try{
                String aValueString = aValueBox.getText();
                aValue = Double.parseDouble(aValueString);
                
                String aDepositString = aDepositBox.getText();
                aDeposit = Double.parseDouble(aDepositString);
            }
            catch(NumberFormatException t){
                messagebox("Error: Please enter only numbers in VEHICLE VALUE AND DEPOSIT box and try again. Letters and symbols are not allowed.");
            }
            
            if(aValue <= aDeposit)
            {
                messagebox("Error: Ensure value is higher than deposit value. Try again.");
                aValue = 0;
                aDeposit = 0;
            }
            
            Credit aCustomer = new AutoLoan(aValue, aDeposit, aLoanRequired, aRepaymentYears, aRepaymentMonths, aInterestRate, aRepaymentAmount, aMonthlyRepayment, aProfitPerSaleForecast);
            AutoLoan aCust = (AutoLoan) aCustomer;
            
            aLoanRequired = aCustomer.calcLoanRequired();
            String aLoanRequiredString = Double.toString(aLoanRequired);
            aLoanRequiredBox.setText(aLoanRequiredString);
        }
    }
    
    //row 5
    class TotalProfitButtonListenerP implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ArrayList <String> data = new ArrayList<String>();
            ArrayList <String> loanS = new ArrayList<String>();
            ArrayList <String> monthsS = new ArrayList<String>();            
            ArrayList <Double> loan = new ArrayList<Double>();
            ArrayList <Double> months = new ArrayList<Double>();
            String tempValueS = "";
            double tempValue = 0;
            String countString = "";
            double count = 0;
            
            try
            {
                String filepath = "C:\\Users\\...\\personalloan.txt";
                BufferedReader inStream = new BufferedReader(new FileReader(filepath));                
                while(true)
                {
                    String line = inStream.readLine();
                    if(line == null)
                    {
                        break;
                    }
                    data.add(line);
                }            
                inStream.close(); //close file reading 
            }
            catch(IOException t)
            {
                messagebox("File not found");
            }
            catch(NumberFormatException t)
            {
                messagebox("Error: Ensure all files contain only numbers. Letters and symbols are not allowed. Correct file and try again");
            }
            catch(IndexOutOfBoundsException t)
            {
                messagebox("Technical Error: ArrayList has been indexed with an integer equal to or greater than its size");
            }
            
            for(int i=0; i<data.size(); i++)
            {
                try{
                    String str = data.get(i);
                    ArrayList<String> splitArrayList = new ArrayList<>(Arrays.asList(str.split(" ")));
                    String splitA = splitArrayList.get(0);
                    String splitB = splitArrayList.get(1);               
                    loanS.add(splitA);
                    monthsS.add(splitB);
                }
                catch(IndexOutOfBoundsException t)
                {
                    messagebox("Technical Error: ArrayList has been indexed with an integer equal to or greater than its size");
                }
            }
            for(int i=0; i<loanS.size(); i++)
            {
                tempValueS = loanS.get(i);
                tempValue = Double.parseDouble(tempValueS);
                loan.add(tempValue);
            }
            for(int i=0; i<monthsS.size(); i++)
            {
                tempValueS = monthsS.get(i);
                tempValue = Double.parseDouble(tempValueS);
                months.add(tempValue);
            }
            
            for(int i=0; i<data.size(); i++)
            {
                pkpiLoanRequired = loan.get(i);
                double monthsDouble = months.get(i);
                pkpiRepaymentMonths = (int) monthsDouble;
                
                if(pkpiRepaymentMonths <= 0 || pkpiRepaymentMonths > 60)
                {
                    messagebox("Error: You are only allowed to enter months from 1 to 60. Try again.");
                    pkpiRepaymentMonths = 0;
                }
                
                if(pkpiLoanRequired <= 49)
                {
                    messagebox("Error: Ensure loan required is greater than £50.");
                    pkpiLoanRequired = 0;
                }
                
                Credit personalloan = new PersonalLoan(pkpiRepaymentMonths);
                PersonalLoan pTP = (PersonalLoan) personalloan;
                double newInterestRate = pTP.calcInterestRate();
                
                Credit personalloanTP = new PersonalLoan( pkpiLoanRequired, pkpiRepaymentMonths, newInterestRate, pkpiRepaymentAmount, pkpiMonthlyRepayment, pkpiProfitPerSaleForecast);
                PersonalLoan pNewTP = (PersonalLoan) personalloanTP;
                
                pkpiInterestRate = round((pNewTP.calcInterestRate()), 2);
                pkpiRepaymentAmount = personalloanTP.calcRepaymentAmount();
                pkpiMonthlyRepayment = round((personalloanTP.calcMonthlyRepayment()), 2);                
                pkpiProfitPerSaleForecast = round(personalloanTP.calcProfitPerSaleForecast(), 2);
                
                count = count + pkpiProfitPerSaleForecast;
            }
            pTotalProfit = count;
            countString = Double.toString(count);
            pTotalProfitBox.setText("£" + countString);
        }
    }
    
    //row 6
    class RepaymentMonthsButtonListenerM implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String mRepaymentYearsString = mRepaymentYearsBox.getText();
            mRepaymentYears = Integer.parseInt(mRepaymentYearsString);
            
            if(mRepaymentYears <= 0 || mRepaymentYears > 25)
            {
                messagebox("Error: You are only allowed to enter years from 1 to 25. Try again.");
                mRepaymentYears = 0;
            }
                        
            Credit mCustomer = new Mortgage(mValue, mDeposit, mLoanRequired, mRepaymentYears, mRepaymentMonths, mInterestRate, mRepaymentAmount, mMonthlyRepayment, mProfitPerSaleForecast);
            Mortgage mCust = (Mortgage) mCustomer;
            
            mRepaymentMonths = mCustomer.calcRepaymentMonths();
            
            String mRepaymentMonthsString = Integer.toString(mRepaymentMonths);
            mRepaymentMonthsBox.setText(mRepaymentMonthsString);
        }
    }
    
    class RepaymentMonthsButtonListenerA implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String aRepaymentYearsString = aRepaymentYearsBox.getText();
            aRepaymentYears = Integer.parseInt(aRepaymentYearsString);
            
            if(aRepaymentYears <= 0 || aRepaymentYears > 5)
            {
                messagebox("Error: You are only allowed to enter years from 1 to 5. Try again.");
                aRepaymentYears = 0;
            }
            
            Credit aCustomer = new AutoLoan(aValue, aDeposit, aLoanRequired, aRepaymentYears, aRepaymentMonths, aInterestRate, aRepaymentAmount, aMonthlyRepayment, aProfitPerSaleForecast);
            AutoLoan aCust = (AutoLoan) aCustomer;
            
            aRepaymentMonths = aCustomer.calcRepaymentMonths();
            
            String aRepaymentMonthsString = Integer.toString(aRepaymentMonths);
            aRepaymentMonthsBox.setText(aRepaymentMonthsString);
        }
    }
    
    
    //row 7
    class InterestRateButtonListenerM implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {                        
            Credit mCustomer = new Mortgage(mValue, mDeposit, mLoanRequired, mRepaymentYears, mRepaymentMonths, mInterestRate, mRepaymentAmount, mMonthlyRepayment, mProfitPerSaleForecast);
            Mortgage mCust = (Mortgage) mCustomer;
            
            mInterestRate = round((mCustomer.calcInterestRate()), 2);
            String mInterestRateString = Double.toString(mInterestRate);
            mInterestRateBox.setText(mInterestRateString + "%");
        }
    }
    class InterestRateButtonListenerP implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            try{
                String pLoanRequiredString = pLoanRequiredBox.getText();
                pLoanRequired = Double.parseDouble(pLoanRequiredString);
                      
                String pRepaymentMonthsString = pRepaymentMonthsBox.getText();
                pRepaymentMonths = Integer.parseInt(pRepaymentMonthsString);
            }
            catch(NumberFormatException t){
                messagebox("Please enter only numbers in LOAN REQUIRED AND REPAYMENT MONTHS box and try again. Letters and symbols are not allowed.");
            }
            
            if(pRepaymentMonths <= 0 || pRepaymentMonths > 60)
            {
                messagebox("Error: You are only allowed to enter years from 1 to 60. Try again.");
                pRepaymentMonths = 0;
            }
            
            if(pLoanRequired <= 49)
                {
                    messagebox("Error: Ensure loan required is greater than £50.");
                    pkpiLoanRequired = 0;
                }
            
            Credit pCustomer = new PersonalLoan(pLoanRequired, pRepaymentMonths, pInterestRate, pRepaymentAmount, pMonthlyRepayment, pProfitPerSaleForecast);            
            PersonalLoan pCust = (PersonalLoan) pCustomer;
            
            pInterestRate = round((pCustomer.calcInterestRate()), 2);
            String pInterestRateString = Double.toString(pInterestRate);
            pInterestRateBox.setText(pInterestRateString + "%");
        }
    }
    class InterestRateButtonListenerA implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Credit aCustomer = new AutoLoan(aValue, aDeposit, aLoanRequired, aRepaymentYears, aRepaymentMonths, aInterestRate, aRepaymentAmount, aMonthlyRepayment, aProfitPerSaleForecast);
            AutoLoan aCust = (AutoLoan) aCustomer;
            
            aInterestRate = round((aCustomer.calcInterestRate()), 2);
            String aInterestRateString = Double.toString(aInterestRate);
            aInterestRateBox.setText(aInterestRateString + "%");
        }
    }
    class TotalProfitButtonListenerA implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            ArrayList <String> data = new ArrayList<String>();
            ArrayList <String> valueS = new ArrayList<String>();
            ArrayList <String> depositS = new ArrayList<String>();
            ArrayList <String> yearsS = new ArrayList<String>();            
            ArrayList <Double> value = new ArrayList<Double>();
            ArrayList <Double> deposit = new ArrayList<Double>();
            ArrayList <Double> years = new ArrayList<Double>();
            String tempValueS = "";
            double tempValue = 0;
            String countString = "";
            double count = 0;
            
            try
            {
                String filepath = "C:\\Users\\...\\autoloan.txt";
                BufferedReader inStream = new BufferedReader(new FileReader(filepath));                
                while(true)
                {
                    String line = inStream.readLine();
                    if(line == null)
                    {
                        break;
                    }
                    data.add(line);
                }            
                inStream.close(); //close file reading
            }
            catch(IOException t)
            {
                messagebox("File not found");
            }
            catch(NumberFormatException t)
            {
                messagebox("Error: Ensure all files contain only numbers. Letters and symbols are not allowed. Correct file and try again");
            }
            catch(IndexOutOfBoundsException t)
            {
                messagebox("Technical Error: ArrayList has been indexed with an integer equal to or greater than its size");
            }
            
            for(int i=0; i<data.size(); i++)
            {
                try{
                    String str = data.get(i);
                    ArrayList<String> splitArrayList = new ArrayList<>(Arrays.asList(str.split(" ")));
                    String splitA = splitArrayList.get(0);
                    String splitB = splitArrayList.get(1);
                    String splitC = splitArrayList.get(2);                
                    valueS.add(splitA);
                    depositS.add(splitB);
                    yearsS.add(splitC);
                }
                catch(IndexOutOfBoundsException t)
                {
                    messagebox("Technical Error: ArrayList has been indexed with an integer equal to or greater than its size");
                }
            }
            for(int i=0; i<valueS.size(); i++)
            {
                tempValueS = valueS.get(i);
                tempValue = Double.parseDouble(tempValueS);
                value.add(tempValue);
            }
            for(int i=0; i<depositS.size(); i++)
            {
                tempValueS = depositS.get(i);
                tempValue = Double.parseDouble(tempValueS);
                deposit.add(tempValue);
            }
            for(int i=0; i<yearsS.size(); i++)
            {
                tempValueS = yearsS.get(i);
                tempValue = Double.parseDouble(tempValueS);
                years.add(tempValue);
            }
            
            for(int i=0; i<data.size(); i++)
            {                
                akpiValue = value.get(i);
                akpiDeposit = deposit.get(i);
                double yearsDouble = years.get(i);
                akpiRepaymentYears = (int) yearsDouble;
                
                if(akpiRepaymentYears <= 0 || akpiRepaymentYears > 5)
                {
                    messagebox("Error: You are only allowed to enter years from 1 to 5. Try again.");
                    akpiRepaymentYears = 0;
                }
                
                if(akpiValue <= akpiDeposit)
                {
                    messagebox("Error: Ensure value is higher than deposit value. Try again.");
                    akpiValue = 0;
                    akpiDeposit = 0;
                }
                
                Credit autoloan = new AutoLoan(akpiRepaymentYears);
                AutoLoan aTP = (AutoLoan) autoloan;
                double newInterestRate = aTP.calcInterestRate();
                
                Credit autoloanTP = new AutoLoan(akpiValue, akpiDeposit, akpiLoanRequired, akpiRepaymentYears, akpiRepaymentMonths, newInterestRate, akpiRepaymentAmount, akpiMonthlyRepayment, akpiProfitPerSaleForecast);
                AutoLoan aNewTP = (AutoLoan) autoloanTP;
                                
                akpiLoanRequired = autoloanTP.calcLoanRequired();
                akpiRepaymentMonths = autoloanTP.calcRepaymentMonths();
                akpiInterestRate = round((aNewTP.calcInterestRate()), 2);
                akpiRepaymentAmount = autoloanTP.calcRepaymentAmount();
                akpiMonthlyRepayment = round((autoloanTP.calcMonthlyRepayment()), 2);                
                akpiProfitPerSaleForecast = round(autoloanTP.calcProfitPerSaleForecast(), 2);
                                
                count = count + akpiProfitPerSaleForecast;
            }
            aTotalProfit = count;
            countString = Double.toString(count);
            aTotalProfitBox.setText("£" + countString);
        }
    }
    
    //row 8
    class RepaymentAmountButtonListenerM implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Credit mCustomer = new Mortgage(mValue, mDeposit, mLoanRequired, mRepaymentYears, mRepaymentMonths, mInterestRate, mRepaymentAmount, mMonthlyRepayment, mProfitPerSaleForecast);
            Mortgage mCust = (Mortgage) mCustomer;
                        
            mRepaymentAmount = mCustomer.calcRepaymentAmount();            
            String mRepaymentAmountString = Double.toString(mRepaymentAmount);
            mRepaymentAmountBox.setText("£" + mRepaymentAmountString);
        }
    }
    class RepaymentAmountButtonListenerP implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Credit pCustomer = new PersonalLoan(pLoanRequired, pRepaymentMonths, pInterestRate, pRepaymentAmount, pMonthlyRepayment, pProfitPerSaleForecast);            
            PersonalLoan pCust = (PersonalLoan) pCustomer;
            
            pRepaymentAmount = pCustomer.calcRepaymentAmount();            
            String pRepaymentAmountString = Double.toString(pRepaymentAmount);
            pRepaymentAmountBox.setText("£" +pRepaymentAmountString);
        }
    }
    class RepaymentAmountButtonListenerA implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Credit aCustomer = new AutoLoan(aValue, aDeposit, aLoanRequired, aRepaymentYears, aRepaymentMonths, aInterestRate, aRepaymentAmount, aMonthlyRepayment, aProfitPerSaleForecast);
            AutoLoan aCust = (AutoLoan) aCustomer;
                        
            aRepaymentAmount = aCustomer.calcRepaymentAmount();            
            String aRepaymentAmountString = Double.toString(aRepaymentAmount);
            aRepaymentAmountBox.setText("£" + aRepaymentAmountString);
        }
    }
    
    //row9
    class MonthlyRepaymentButtonListenerM implements ActionListener
    {        
        public void actionPerformed(ActionEvent e)
        {
            Credit mCustomer = new Mortgage(mValue, mDeposit, mLoanRequired, mRepaymentYears, mRepaymentMonths, mInterestRate, mRepaymentAmount, mMonthlyRepayment, mProfitPerSaleForecast);
            Mortgage mCust = (Mortgage) mCustomer;
                       
            mMonthlyRepayment = round((mCustomer.calcMonthlyRepayment()), 2);
            String mMonthlyRepaymentString = Double.toString(mMonthlyRepayment);
            mMonthlyRepaymentBox.setText("£" + mMonthlyRepaymentString + " /m");
        }
    }
    class MonthlyRepaymentButtonListenerP implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Credit pCustomer = new PersonalLoan(pLoanRequired, pRepaymentMonths, pInterestRate, pRepaymentAmount, pMonthlyRepayment, pProfitPerSaleForecast);            
            PersonalLoan pCust = (PersonalLoan) pCustomer;
            
            pMonthlyRepayment = round((pCustomer.calcMonthlyRepayment()), 2);
            String pMonthlyRepaymentString = Double.toString(pMonthlyRepayment);
            pMonthlyRepaymentBox.setText("£" + pMonthlyRepaymentString + " /m");
        }
    }
    class MonthlyRepaymentButtonListenerA implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Credit aCustomer = new AutoLoan(aValue, aDeposit, aLoanRequired, aRepaymentYears, aRepaymentMonths, aInterestRate, aRepaymentAmount, aMonthlyRepayment, aProfitPerSaleForecast);
            //AutoLoan aCust = (AutoLoan) aCustomer;
                       
            aMonthlyRepayment = round((aCustomer.calcMonthlyRepayment()), 2);
            String aMonthlyRepaymentString = Double.toString(aMonthlyRepayment);
            aMonthlyRepaymentBox.setText("£" + aMonthlyRepaymentString + " /m");
        }
    }
    class TotalProfitButtonListenerO implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if((mTotalProfit == 0) || (pTotalProfit == 0) || (aTotalProfit == 0))
            {
                messagebox("Error: Click TOTAL PROFIT buttons for Mortgage, Personal Loan and Auto Loan before clicking OVERALL TOTAL PROFIT button. Try again.");
            } else {
                overallTotalProfit = (mTotalProfit + pTotalProfit + aTotalProfit);
                String overallTotalProfitString = Double.toString(overallTotalProfit);
                overallTotalProfitBox.setText("£" + overallTotalProfitString);
            }
        }
    }
    
    //row 10
    class ProfitPerSaleForecastButtonListenerM implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Credit mCustomer = new Mortgage(mValue, mDeposit, mLoanRequired, mRepaymentYears, mRepaymentMonths, mInterestRate, mRepaymentAmount, mMonthlyRepayment, mProfitPerSaleForecast);
            //Mortgage mCust = (Mortgage) mCustomer;
                       
            mProfitPerSaleForecast = round((mCustomer.calcProfitPerSaleForecast()), 2);
            String mProfitPerSaleForecastString = Double.toString(mProfitPerSaleForecast);
            mProfitPerSaleForecastBox.setText("£" + mProfitPerSaleForecastString + " profit");
        }
    }
    class ProfitPerSaleForecastButtonListenerP implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Credit pCustomer = new PersonalLoan(pLoanRequired, pRepaymentMonths, pInterestRate, pRepaymentAmount, pMonthlyRepayment, pProfitPerSaleForecast);            
            PersonalLoan pCust = (PersonalLoan) pCustomer;
            
            pProfitPerSaleForecast = round((pCustomer.calcProfitPerSaleForecast()), 2);
            String pProfitPerSaleForecastString = Double.toString(pProfitPerSaleForecast);
            pProfitPerSaleForecastBox.setText("£" + pProfitPerSaleForecastString + " profit");
        }
    }
    class ProfitPerSaleForecastButtonListenerA implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Credit aCustomer = new AutoLoan(aValue, aDeposit, aLoanRequired, aRepaymentYears, aRepaymentMonths, aInterestRate, aRepaymentAmount, aMonthlyRepayment, aProfitPerSaleForecast);
            AutoLoan aCust = (AutoLoan) aCustomer;
                       
            aProfitPerSaleForecast = round((aCustomer.calcProfitPerSaleForecast()), 2);
            String aProfitPerSaleForecastString = Double.toString(aProfitPerSaleForecast);
            aProfitPerSaleForecastBox.setText("£" + aProfitPerSaleForecastString + " profit");
        }
    }
    class OverallSegmentWithMostProfitButtonListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            String a = "Mortgage: £";
            String b = "Personal Loan: £";
            String c = "Auto Loan: £";
            String bestSegmentName = "";
            String bestSegmentValue = "";
            ArrayList <Double> data = new ArrayList<Double>();
            ArrayList <String> dataName = new ArrayList<String>(); 
            data.add(mTotalProfit);
            data.add(pTotalProfit);
            data.add(aTotalProfit);
            dataName.add(a);
            dataName.add(b);
            dataName.add(c);
            boolean sorted = false;
            
            while(!sorted)
            {
                try{
                    sorted = true;
                
                    //for loop for bubble sort
                    for(int i=0; i<data.size()-1; i++)
                    {
                        for(int j=1; (j<data.size()-i); j++)
                        {
                            if(data.get(j-1) < data.get(j))
                            {
                                double tempValue = data.get(j-1);
                                data.set(j-1, data.get(j));
                                data.set(j, tempValue);
                                
                                String tempValueName = dataName.get(j-1);
                                dataName.set(j-1, dataName.get(j));
                                dataName.set(j, tempValueName);
                                sorted = false;
                            }
                        }
                    }
                }
                catch(IndexOutOfBoundsException t)
                {
                    messagebox("Technical Error: ArrayList has been indexed with an integer equal to or greater than its size");
                }
            }
           
            bestSegmentName = dataName.get(0);
            bestSegmentValue = Double.toString(data.get(0));
            mostProfitSegmentBox.setText(bestSegmentName + bestSegmentValue);
        }
    }
    
    //class method outputs information on messagebox
    public static void messagebox(String input)
    {
        JOptionPane.showMessageDialog(null, input);//creating message dialog
    }
    
    //class method converts value to required decimal place
    public static double round(double value, int places)
        {
            if (places < 0) throw new IllegalArgumentException();
        
            long factor = (long) Math.pow(10, places);
            value = value * factor;
            long tmp = Math.round(value);
            return (double) tmp / factor;
        }
    
    //triggar close window
    class CloseWindow extends WindowAdapter
    {
        public void windowClosing(WindowEvent evt)
        {
            System.exit(0); //end program
        }
    }
    
    public static void main(String[] args) throws IOException
    {
        CreditGuiFrame cFrame = new CreditGuiFrame(); //calling CreditGuiFrame class
    }    
}
