package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.model.user.User;

import java.util.List;

@Service
public class UserService {
    //Field
    @Autowired
    private UserDAO userDAO;

    //Constructor

    //Function
    public List<User> getListUser() {
        return userDAO.getListUser();
    }

    public void addUser(User user) {
        userDAO.addUser(user);
    }

    public User getUserFromID(Long id){
        return getListUser().get(id.intValue()-1);
    }

    //Getter and Setter
}
