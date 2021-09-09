package tech.emmmwinama.blog.services;

import org.springframework.stereotype.Service;
import tech.emmmwinama.blog.models.User;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private static List<User> users = new ArrayList<>();

    static {

    }

    public List<User> getUsers(){
        return users;
    }

    public User getUser(String id){
        for(User user: users){
            if(user.getId().equals(id)){
                return user;
            }
        }

        return null;
    }
}
