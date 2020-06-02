package web.dao;

import org.springframework.stereotype.Repository;
import web.model.user.User;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserDAO {
    //Field
    private List <User> listUser;

    //Constructor

    public UserDAO() {
    }

    //Function
    @PostConstruct
    private List <User> createList(){
        listUser = new ArrayList<>();
        listUser.add(new User(1L, 0L, "Ivan"));
        return listUser;
    }

    //Getter and Setter
    public List<User> getListUser() {
        return listUser;
    }

    public void addUser(User user) {
        listUser.add(user);
    }
}
