package com.denisgultay.practice.module06.task065;

import com.denisgultay.practice.module06.task064.User;

public class UserUtils {

    public static User[] users = new User[3];

  //  User[] uniqueUsers(User[] users) {
 //   }
   public User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] contitionalBalanceUsers = new User[users.length];
        for (int i = 0; i < contitionalBalanceUsers.length; i++) {

            for (int j = 0; j < users.length; j++) {
                if (balance == users[j].getBalance()) {
                    contitionalBalanceUsers[i] = users[j];
                    System.out.println(users[j].toString());
                }

            }

        }

        return contitionalBalanceUsers;
    }

 /*   //user’s balance == balance
    User[] paySalaryToUsers(User[] users) {
    }

    long[] getUsersId(User[] users) {
    }

    User[] deleteEmptyUsers(User[] users) {

   }
*/
}

