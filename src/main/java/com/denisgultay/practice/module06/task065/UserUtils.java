package com.denisgultay.practice.module06.task065;

import com.denisgultay.practice.module06.task064.User;

import java.util.Arrays;

public class UserUtils {

    public static User[] users = new User[7];

    public static final User[] uniqueUsers(User[] users) {
        User[] uniqueUserArray = new User[users.length];
        int count = 0;
        for (int i = count + 1; i < users.length; i++) {
            if (!(users[count].equals(users[i]))) {
                uniqueUserArray[count] = users[i];
                System.out.println(uniqueUserArray[count]);
            }
        }
        count++;
        return uniqueUserArray;
    }

    public static final User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] contitionalBalanceUsers = new User[users.length];
        int count = 0;
        for (int i = 0; i < contitionalBalanceUsers.length; i++) {
            if (balance == users[i].getBalance()) {
                contitionalBalanceUsers[count] = users[i];
                count++;
            }
        }
        String printBalanceUsers = Arrays.toString(contitionalBalanceUsers);
        System.out.println(printBalanceUsers);
        return contitionalBalanceUsers;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        int newBalance;
        for (int i = 0; i < users.length; i++) {
            newBalance = users[i].getBalance() + users[i].getSalary();
            users[i].setBalance(newBalance);
        }
        String usersWithNewBalance = Arrays.toString(users);
        System.out.println(usersWithNewBalance);
        return users;
    }

    public long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            usersId[count] = users[i].getId();
            System.out.println(usersId[count]);
            count++;
        }
        String printUsersId = Arrays.toString(usersId);
        System.out.println(printUsersId);
        return usersId;
    }

   public User[] deleteEmptyUsers(User[] users) {
        User[] notEmptyUsers = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                notEmptyUsers[count] = users[i];
                System.out.println(notEmptyUsers[count]);
                count++;
            }
        }
        return notEmptyUsers;
    }

}

