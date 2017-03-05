package com.company;

/**
 * Created by idejesus on 05/03/2017.
 */
public class Account {

    private String mNumber;
    private double mBalance;
    private String mCustomerName;
    private String mCustomerEmailAddress;
    private String mCustomerPhoneNumber;

    public Account(String number, double balance, String customerName, String customerEmailAddress, String customerPhoneNumber) {
        mNumber = number;
        mBalance = balance;
        mCustomerName = customerName;
        mCustomerEmailAddress = customerEmailAddress;
        mCustomerPhoneNumber = customerPhoneNumber;
    }

    public String getNumber() {
        return mNumber;
    }

    public void setNumber(String number) {
        mNumber = number;
    }

    public double getBalance() {
        return mBalance;
    }

    public void setBalance(double balance) {
        mBalance = balance;
    }

    public String getCustomerName() {
        return mCustomerName;
    }

    public void setCustomerName(String customerName) {
        mCustomerName = customerName;
    }

    public String getCustomerEmailAddress() {
        return mCustomerEmailAddress;
    }

    public void setCustomerEmailAddress(String customerEmailAddress) {
        mCustomerEmailAddress = customerEmailAddress;
    }

    public String getCustomerPhoneNumber() {
        return mCustomerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        mCustomerPhoneNumber = customerPhoneNumber;
    }

    public void deposit(double depositAmount){
        mBalance += depositAmount;
        System.out.println("current balance now " + mBalance);

    }

    public void withdraw(double withdrawAmount){
        if(mBalance -withdrawAmount <= 0){
            System.out.println("Withdrawal not processed. not enough money");
        }else{
            mBalance -= withdrawAmount;
            System.out.println("balance remaining " + mBalance);

        }
    }
}
