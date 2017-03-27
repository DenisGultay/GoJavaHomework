package com.denisgultay.practice.module06.task063;

import com.denisgultay.practice.module06.task062.NewBalanceUser;
import com.denisgultay.practice.module06.task062.User;
import com.denisgultay.practice.module06.task063.UserUtils;

public class MainUsers {

    public static void main(String[] args) {

        User[] users = new User[10];

        users[0] = new User(1L, "Denis", "Gultay", 4000, 5000);
        users[1] = new User(2L, "David", "Beckham", 44000, 150000);
        users[2] = new User(3L, "Oksana", "Gultay", 5000, 5000);
        users[3] = new User(5L, "Andriy", "Yarmolenko", 30000, 150000);
        users[4] = new User(1L, "Denis", "Gultay", 4000, 5000);
        users[5] = null;
        users[6] = new User(6L, "Lionel", "Messi", 200000, 15000000);
        users[7] = new User(7L, "Neymar", null, 150000, 10000000);
        users[8] = new User(5L, "Andriy", "Shevchenko", 35000, 150000);
        users[9] = null;

        NewBalanceUser[] newUsers = new NewBalanceUser[10];

         newUsers[0] = new NewBalanceUser(11, "Denis","Gultay", 4000, 5000);
         newUsers[1] = new NewBalanceUser(22, "Denis","Gultay", 4000, 5000);
         newUsers[2] = new NewBalanceUser(33, "Denis","Gultay", 4000, 5000);
         newUsers[3] = new NewBalanceUser(44, "Denis","Gultay", 4000, 5000);
         newUsers[4] = new NewBalanceUser(55, "Denis","Gultay", 4000, 5000);
         newUsers[5] = new NewBalanceUser(66, "Denis","Gultay", 4000, 5000);
         newUsers[6] = new NewBalanceUser(77, "Denis","Gultay", 4000, 5000);
         newUsers[7] = new NewBalanceUser(88, "Denis","Gultay", 4000, 5000);
         newUsers[8] = new NewBalanceUser(99, "Denis","Gultay", 4000, 5000);
         newUsers[8] = new NewBalanceUser(101, "Denis","Gultay", 4000, 5000);

         UserUtils userUtils = null;
//        userUtils.usersWithContitionalBalance(users, 150000);
//        System.out.println("----------------------------------");
//        userUtils.getUsersId(users);
//        System.out.println("----------------------------------");
//        userUtils.uniqueUsers(users);
//        System.out.println("----------------------------------");
//        userUtils.deleteEmptyUsers(users);
//        System.out.println("----------------------------------");
          userUtils.paySalaryToUsers(users);


    }
}
