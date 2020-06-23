package edu.microservice.controller;

import edu.microservice.model.User;

import java.util.Arrays;
import java.util.List;

public class UserTestData {

    public static final User user1 = new User("Denis", "denis@mail.ru");
    public static final User user2 = new User("Ann", "Anna@gmail.com");
    public static final User user3 = new User("Piter", "pit@ya.ru");
    public static final User user4 = new User("Eliza", "Eliza@mail.ru");


    public static final List<User> userList = Arrays.asList(user1, user2, user3);

}
