package com.denisgultay.practice.module03.task034;

public class User {


    private static final double VALUE_OF_COMMISION_LESS_1000 = 0.05;
    private static final double VALUE_OF_COMMISION_MORE_1000 = 0.1;
    private String name;
    private int balance;
    private int monthOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public static void main(String[] args) {

        User userPiter = new User("Piter", 15000, 8, "Kyivstar", 7000, "UAH");
        userPiter.paySalary();
        userPiter.withdrawlFromBalance(2500);
        userPiter.companyNameLenght();
        userPiter.monthIncreaser(4);

        User userDaniel = new User("Daniel", 7000, 4, "Google", 1000, "USD");
        userDaniel.paySalary();
        userDaniel.withdrawlFromBalance(7500);
        userDaniel.companyNameLenght();
        userDaniel.monthIncreaser(6);

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
        System.out.println("Отримано ЗП: " + salary + currency + ";" + " Баланс: " + balance + currency);
    }


    public void withdrawlFromBalance(int summOfWithdrawl) {

        double currentPersent;
        if (summOfWithdrawl < 1000) {
            currentPersent = summOfWithdrawl * VALUE_OF_COMMISION_LESS_1000;
        } else {
            currentPersent = summOfWithdrawl * VALUE_OF_COMMISION_MORE_1000;
        }
        if ((summOfWithdrawl + currentPersent) < balance) {
            balance -= (summOfWithdrawl + currentPersent);
            System.out.println("Знято з рахунку: " + summOfWithdrawl + currency + ";" + " Баланс: " + balance + currency);
        } else {
            System.out.println("Недостатньо коштів");
        }
    }


    public void companyNameLenght() {
        System.out.println("Довжина назви компанії: " + companyName.length() + " букв.");
    }

    public void monthIncreaser(int addMonth) {
        System.out.print("Попередній стаж роботи в компанії " + companyName + " " + monthOfEmployment + "; ");
        monthOfEmployment += addMonth;
        System.out.println("Загальний стаж роботи: " + monthOfEmployment);
    }
}
