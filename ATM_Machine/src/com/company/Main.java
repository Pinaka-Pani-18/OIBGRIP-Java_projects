package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ATM_Machine_Operation_Interface atmOperation = new ATM_Machine_Operation_Implements();

        int atm_Number = 1234567890;
        int atm_Pin = 1234;

        Scanner sc = new Scanner(System.in);

        System.out.println("\nWelcome to the ATM Machine !");

        System.out.print("Enter the ATM Number: ");
        int login_Atm_Number = sc.nextInt();

        System.out.print("Enter the Pin Number: ");
        int login_Atm_Pin = sc.nextInt();

        if( (atm_Number == login_Atm_Number) && ( atm_Pin == login_Atm_Pin) ){
            while(true){

                System.out.println("\n1. Transaction History\n2. Withdraw \n3. Deposit \n4. Check Balance\n5. Quit");
                System.out.println("Enter your operation which you want to perform: ");
                int op = sc.nextInt();

                if( op == 1 ){
                    atmOperation.transactionHistory();
                }
                else if( op == 2 )
                {
                    System.out.println("Enter the amount to withdraw : ");
                    double withdrawAmount = sc.nextDouble();
                    atmOperation.withdrawAmount(withdrawAmount);
                }
                else if( op == 3 )
                {
                    System.out.println("Enter the amount to Deposit : ");
                    double depositAmount = sc.nextDouble();
                    atmOperation.depositAmount(depositAmount);
                }
                else if( op == 4 )
                {
                    atmOperation.checkBalance();
                }
                else if( op == 5)
                {
                    System.out.println("\nCollect your ATM card\nThank you for using ATM Machine...!");
                    System.exit(0);
                }
                else
                {
                    System.out.println("\nOops...!!!\nEnter the above operations to perform...!");
                }
            }
        }
        else{
            System.out.println("Oops...!\nIncorrect Atm Number or Pin Number");
            System.exit(0);
        }
    }
}
