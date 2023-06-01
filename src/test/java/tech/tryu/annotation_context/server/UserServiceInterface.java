package tech.tryu.annotation_context.server;

import java.util.List;

public interface UserServiceInterface {
    public void addUser(String username);

    public List<String> getUser();
}
