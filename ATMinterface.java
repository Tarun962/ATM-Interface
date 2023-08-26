import java.util.*;

public class ATMinterface{
  static class ATM{
    float balance;
    int pin=7890;
    public void checkpin(){
        System.out.println("Enter your ATM pin");
        Scanner sc= new Scanner(System.in);
        int enterpin= sc.nextInt();
        if(enterpin==pin){
            menu();
        }
        else{
            System.out.println("Enter a valid ATM pin");
        }
    }

    public void menu(){
        System.out.println("Enter your Choice : ");
        System.out.println("1. Check A/C Balance ");
        System.out.println("2. Withdraw Money ");
        System.out.println("3. Deposit Money ");
        System.out.println("4. Exit");

        Scanner sc= new Scanner(System.in);
        int opt= sc.nextInt();
        if(opt==1){
            checkbalance();
        }else if(opt==2){
            withdrawmoney();
        }else if(opt==3){
            Depositmoney();
        }else if(opt==4){
            return;
        }else{
            System.out.println("Enter a valid option");
            
        }

    }

    public void checkbalance(){
        System.out.println("Balance: "+balance);
        menu();
    }

    public void withdrawmoney(){
        System.out.println("Enter Amount to withdraw : ");
        Scanner sc= new Scanner(System.in);
        float amt=sc.nextFloat();
        if(amt>balance){
            System.out.println("Insufficient Balance");
        }else{
            balance=balance-amt;
            System.out.println("Money Withdraw Successfully");
        }
        menu();
    }

    public void Depositmoney(){
        System.out.println("Enter Amount to Deposit : ");
        Scanner sc= new Scanner(System.in);
        float amt=sc.nextFloat();
        balance=balance+amt;
        System.out.println("Money Deposited Successfully");
        menu();
    }
 }

    public static void main(String args[]){
        ATM obj= new ATM();
        obj.checkpin();
    }

}

