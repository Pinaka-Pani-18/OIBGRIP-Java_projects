package com.company;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class ATM_Machine_Operation_Implements implements ATM_Machine_Operation_Interface {

        ATM atm = new ATM();

        Map<Integer,String> statement = new TreeMap<>();

        int transactionHistoryCount = 0;

    @Override
    public void transactionHistory() {
        if( transactionHistoryCount > 0 ) {
            System.out.println("\nTransaction History : ");
            for ( Map.Entry<Integer, String> s : statement.entrySet() ) {
                System.out.println( s.getKey() + "" + s.getValue());
            }
        }else{
            System.out.println("\nTill Now, There is no single transactions has been made...!");
        }
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount%100==0) {
            if (withdrawAmount <= atm.getBalance()) {
                String str = ". The amount " + withdrawAmount + " Rs had been withdrawn";
                statement.put( transactionHistoryCount,str);
                System.out.println("Collect the Amount " + withdrawAmount + " Rs");
                atm.setBalance(atm.getBalance() - withdrawAmount);
                checkBalance();
                transactionHistoryCount++;
            } else {
                System.out.println("Oops...!\nInsufficient Balance...!");
            }
        }
        else {
            System.out.println("\nOops...!\nYou can withdraw the amount with the multiple of 100's omly");
        }
    }

    @Override
    public void depositAmount(double depositAmount) {
        String str = ". The amount " + depositAmount + " Rs amount had been deposited";
        statement.put(transactionHistoryCount, str);
        System.out.println("The amount " + depositAmount +" Rs has Successfully Deposited...!");
        atm.setBalance(atm.getBalance() + depositAmount);
        transactionHistoryCount++;
        checkBalance();
    }

    @Override
    public void checkBalance(){
        System.out.println("Available Balance is : "+ atm.getBalance() + " Rs");
    }
}
