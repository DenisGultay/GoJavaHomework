package com.denisgultay.practice.module03.task034;

public class User {

    private String name;
    private int balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public static void main(String[] args) {

        User userPiter = new User("Piter", 15000, 8, "Kyivstar", 7000, " UAH");
//        userPiter.setCompanyName("GoIt");
        userPiter.paySalary();
        userPiter.withdrawlFromBalance(2500);
        userPiter.companyNameLenght();
        userPiter.monthIncreaser(4);
    }

    public User(String name, int balance, int monthOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthOfEmployment = monthOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getMonthOfEmployment() {
        return monthOfEmployment;
    }

    public void setMonthOfEmployment(int monthOfEmployment) {
        this.monthOfEmployment = monthOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void paySalary() {
        balance += salary;
        System.out.println(getBalance() + getCurrency());
    }

    public void withdrawlFromBalance(int summOfWithdrawl) {
        double valueOfCommisionLess1000 = 0.05;
        double valueOfCommisionMore1000 = 0.1;

        if (summOfWithdrawl < 1000) {
            balance -= (summOfWithdrawl + (summOfWithdrawl * valueOfCommisionLess1000));
        } else {
            balance -= (summOfWithdrawl + (summOfWithdrawl * valueOfCommisionMore1000));
        }
        System.out.println(getBalance() + getCurrency());
    }

    public void companyNameLenght() {
        System.out.println(companyName.length());
    }

    public void monthIncreaser(int addMonth) {
        monthOfEmployment += addMonth;
        System.out.println(getMonthOfEmployment());
    }
}
