package com.denisgultay.practice.module06.task066;

import com.denisgultay.practice.module06.task064.User;
import com.denisgultay.practice.module06.task065.UserUtils;

public class ExempleUsers {

    public static void main(String[] args) {

        User[] users = new User[7];

        users[0] = new User(1L, "Denis", "Gultay", 4000, 5000);
        users[1] = new User(2L, "David", "Beckham", 44000, 150000);
        users[2] = new User(3L, "Oksana", "Gultay", 5000, 5000);
        users[3] = new User(4L, "Viktoria", "Beckham", 15000, 90000);
        users[4] = new User(5L, "Denis", "Gultay", 4000, 5000);
        users[5] = new User(6L, "Lionel", "Messi", 200000, 15000000);
        users[6] = new User(7L, "Neymar", null, 150000, 10000000);

        UserUtils userUtils = new UserUtils();
 //       userUtils.usersWithContitionalBalance(users, 5000);
        userUtils.uniqueUsers(users);


    }
}
