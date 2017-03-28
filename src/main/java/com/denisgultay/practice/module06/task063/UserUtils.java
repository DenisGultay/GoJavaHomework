package com.denisgultay.practice.module06.task063;

import com.denisgultay.practice.module06.task062.User;

import java.util.Arrays;

public final class UserUtils {

    private UserUtils() {
    }

    public static final User[] uniqueUsers(User[] users) {
        User[] uniqueUserArray = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null && !(users[i].equals(users[i + 1]))) {
                uniqueUserArray[count] = users[i + 1];
                count++;
            }
        }
        uniqueUserArray = arrayDecrease(uniqueUserArray);
        System.out.println(Arrays.toString(uniqueUserArray));
        return uniqueUserArray;
    }

    public static final User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] contitionalBalanceUsers = new User[users.length];
        int count = 0;
        for (int i = 0; i < contitionalBalanceUsers.length; i++) {
            if (users[i] != null && balance == users[i].getBalance()) {
                contitionalBalanceUsers[count] = users[i];
                count++;
            }
        }
        contitionalBalanceUsers = arrayDecrease(contitionalBalanceUsers);
        System.out.println(Arrays.toString(contitionalBalanceUsers));
        return contitionalBalanceUsers;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        User[] newUsers = new User[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                newUsers[i] = new User(users[i].getId(), users[i].getFirstName(), users[i].getLastName(), users[i].getSalary(), users[i].getSalary() + users[i].getBalance());
            }
        }
        newUsers = arrayDecrease(newUsers);
        System.out.println(Arrays.toString(newUsers));
        return newUsers;
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
        System.out.println(Arrays.toString(usersId));
        return usersId;
    }

    public static final User[] deleteEmptyUsers(User[] users) {
        User[] notEmptyUsers = new User[users.length];
        int count = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                notEmptyUsers[count] = users[i];
                count++;
            }
        }
        notEmptyUsers = arrayDecrease(notEmptyUsers);
        System.out.println(Arrays.toString(notEmptyUsers));
        return notEmptyUsers;
    }

    public static final User[] arrayDecrease(User[] array) {         // метод для зменшення массиву(відкидаємо "null")
        int nullElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                nullElements++;
            }
        }
        int newSize = array.length - nullElements;
        User[] newUserArray = new User[newSize];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                newUserArray[count] = array[i];
                count++;
            }
        }
        //      System.out.println(Arrays.toString(newUserArray));
        return newUserArray;
    }
}

