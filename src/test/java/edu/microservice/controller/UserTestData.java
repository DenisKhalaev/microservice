package edu.microservice.controller;

import edu.microservice.model.User;

import java.util.Arrays;
import java.util.List;

class UserTestData {

    private static final User user1 = new User("Denis", "denis@mail.ru");
    private static final User user2 = new User("Ann", "Anna@gmail.com");
    private static final User user3 = new User("Piter", "pit@ya.ru");
    static final User user4 = new User("Eliza", "Eliza@mail.ru");


    static final List<User> userList = Arrays.asList(user1, user2, user3);

}
