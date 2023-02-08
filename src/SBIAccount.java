import java.util.UUID;

public class SBIAccount implements BankInterface{
    private String name;
    private String accountNo;
    private int balance;
    private String Password;
    private double rateOfInterest;
public SBIAccount(String name,int balance,String password)
{
    this.name=name;
    this.balance=balance;
    this.Password=password;
    this.rateOfInterest=6.6;
    this.accountNo=String.valueOf(UUID.randomUUID());
}
    public SBIAccount() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance+=amount;
        return "Paisa hi Paisa";
    }

    @Override
    public String withdrawMoney(int amount,String pass) {
    if(pass.equals(Password))
    {
      if(balance<amount)
      {
          return "Bhai paise kmm h";
      }
      else{
          balance-=amount;
          return "Money Deducted";
      }
    }
    else
        return "Nalle Berojgar,password galat h";

    }

    @Override
    public double calculateInterest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }
}
