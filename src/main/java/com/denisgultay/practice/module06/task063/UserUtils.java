package com.denisgultay.practice.module06.task063;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module06.task062.User;

import java.util.Arrays;

public class UserUtils {

    public static User[] users = new User[10];
    public static User[] newUser = new User[users.length];


    public static User[] uniqueUsers(User[] users) {
        User[] uniqueUserArray = new User[users.length];
        int count = 0;
        for (int i =0; i < users.length; i++) {
            if (users[i]!=null && !(users[i].equals(users[i+1]))) {
                uniqueUserArray[count] = users[i+1];
                count++;
            }
        }
        uniqueUserArray = arrayDecrease(uniqueUserArray);
        System.out.println(Arrays.toString(uniqueUserArray));
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
        contitionalBalanceUsers = arrayDecrease(contitionalBalanceUsers);
        System.out.println(Arrays.toString(contitionalBalanceUsers));
        return contitionalBalanceUsers;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        System.arraycopy(users,0,newUser,0,users.length);
        int newBalance;
        for (int i = 0; i < newUser.length; i++) {
            newBalance = users[i].getSalary() + users[i].getBalance();
            newUser[i].getBalance();
        }
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
        System.out.println(Arrays.toString(usersId));
        return usersId;
    }

    public static User[] deleteEmptyUsers(User[] users) {
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

    public static User[] arrayDecrease(User[] array) {         // метод для зменшення массиву(відкидаємо "null")
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

