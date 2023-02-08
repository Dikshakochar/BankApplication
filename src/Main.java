import java.util.Scanner;

public class Main {
    //create interface
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name,password and balance");
        String name=sc.next();
        String Password=sc.next();
        int balance=sc.nextInt();
        SBIAccount dikshaACC=new SBIAccount(name,balance,Password);
        System.out.println("Your account number:"+dikshaACC.getAccountNo());
        ///get balance
        System.out.println("Your account balance is:"+dikshaACC.getBalance());
        //get deposit
        System.out.println(dikshaACC.depositMoney(500));
        System.out.println("New Balance is:"+dikshaACC.getBalance());
        //withdraw
        System.out.println("Enter amount to be withdrawn");
        int amount=sc.nextInt();
        System.out.println("Enter your password");
        String pass=sc.next();
        System.out.println(dikshaACC.withdrawMoney(amount,pass));
        System.out.println("Interest for balance:"+dikshaACC.getBalance()+"is"+dikshaACC.calculateInterest(4));


    }
}