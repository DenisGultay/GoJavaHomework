package com.denisgultay.practice.module06.task065;

import com.denisgultay.practice.module06.task064.User;

public class UserUtils {

    public static User[] users = new User[3];

  //  User[] uniqueUsers(User[] users) {
 //   }
   public User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] contitionalBalanceUsers = new User[users.length];
        int count =0;
        for (int i = 0; i < contitionalBalanceUsers.length; i++) {
                if (balance == users[i].getBalance()) {
                    contitionalBalanceUsers[count] = users[i];
                    System.out.println(users[i].getFirstName() + " " + users[i].getLastName() + " " + users[i].getBalance());
                }
            }
        return contitionalBalanceUsers;
    }

    public User[] paySalaryToUsers(User[] users) {
       int newBalance;
        for (int i = 0; i < users.length; i++) {
            newBalance = users[i].getBalance() + users[i].getSalary();
            users[i].setBalance(newBalance);
            System.out.println(users[i].getFirstName() + " " + users[i].getBalance());
        }
        return users;
    }

    public long[] getUsersId(User[] users) {
       long[] usersId = new long[users.length];
       int count =0;
        for (int i = 0; i < users.length; i++) {
         usersId[count] = users[i].getId();
            System.out.println(usersId[count]);
         count++;
        }
        return usersId;
    }

 //   User[] deleteEmptyUsers(User[] users) {

  // }

}

