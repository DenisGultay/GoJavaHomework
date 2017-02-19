package com.denisgultay.practice.module04.task045;

import com.denisgultay.practice.module04.task044.UserOfBank;

public interface BankSystem {

    void withdrawOfUser(UserOfBank user, int amount);

    void fundUser(UserOfBank user, int amount);

    void transferMoney(UserOfBank fromUser, UserOfBank toUser, int amount);

    void paySalary(UserOfBank user);
}
