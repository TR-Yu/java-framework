package tech.tryu.annotation_context.server;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserServiceInterface{
    private List<String> users = new ArrayList<String>();

    public void addUser(String username) {
        users.add(username);
    }

    public List<String> getUser() {
        return this.users;
    }
}
