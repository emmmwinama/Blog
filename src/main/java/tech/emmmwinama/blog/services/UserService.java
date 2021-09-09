package tech.emmmwinama.blog.services;

import tech.emmmwinama.blog.models.User;

import java.util.ArrayList;
import java.util.List;

public class UserService {
    private static List<User> users = new ArrayList<>();

    static {

    }

    public List<User> getUsers(){
        return users;
    }
}
