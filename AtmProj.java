import java.util.Scanner;

class ATM {
    float Balance;
    int pin = 9;
    public void checkPin() {
        System.out.println("Enter your pin");
        Scanner sc = new Scanner(System.in);
        int enteredpin = sc.nextInt();
        if (enteredpin == pin) {
          menu();
        } else {
            System.out.println("Enter a valid pin");
        }
    }
    public void menu() {
        System.out.println("Enter Your Choice : ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");

        Scanner sc = new Scanner(System.in);
        int opt = sc.nextInt();
        if (opt == 1) {
            checkBalance();
        } else if (opt == 2) {
            withdrawMoney();
        } else if (opt == 3) {
            depositMoney();
        } else if (opt == 4) {
            return;
        } else {
            System.out.println("Enter a valid choice");
        }
    }
    public void checkBalance() {
        System.out.println("Balance is : " + Balance);
        menu();
    }
    public void withdrawMoney() {
        System.out.println("Enter amount to Withdraw");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if (amount > Balance) {
            System.out.println("Itna Paisa Ni h");
        } else {
            Balance = Balance - amount;
            System.out.println("Money Withdrawn");
        }
        menu();
    }
    public void depositMoney() {
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        Balance = Balance + amount;
        System.out.println("Money Deposited Successfully");
        menu();
    }
}
public class AtmProj {
    public static void main(String[] args) {
       ATM obj1 = new ATM();
       obj1.checkPin();
    }
}
