package com.denisgultay.practice.module06.task063;

import com.denisgultay.practice.module06.task062.User;

import java.util.Arrays;

public class UserUtils {

    public static User[] users = new User[10];

    public static User[] uniqueUsers(User[] users) {
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

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] contitionalBalanceUsers = new User[users.length];
        int count = 0;
        for (int i = 0; i < contitionalBalanceUsers.length; i++) {
            if (users[i] != null && balance == users[i].getBalance()) {
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
            if (users[i] != null) {
                newBalance = users[i].getBalance() + users[i].getSalary();
                users[i].setBalance(newBalance);
            }
        }
        String usersWithNewBalance = Arrays.toString(users);
        System.out.println(usersWithNewBalance);
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] usersId = new long[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                usersId[count] = users[i].getId();
                count++;
            }
        }
        String printUsersId = Arrays.toString(usersId);
        System.out.println(printUsersId);
        return usersId;
    }

    public static User[] deleteEmptyUsers(User[] users) {
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

