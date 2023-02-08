public interface BankInterface {
    int getBalance();
    String depositMoney(int amount);
    String withdrawMoney(int amount,String pass);
    double calculateInterest(int time);
}
