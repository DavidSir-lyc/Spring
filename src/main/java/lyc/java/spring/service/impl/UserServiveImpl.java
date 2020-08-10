package lyc.java.spring.service.impl;

import lyc.java.spring.dao.def.UserDao;
import lyc.java.spring.service.def.UserService;
import lyc.java.spring.dao.impl.UserDaoImpl;


public class UserServiveImpl implements UserService {
    private UserDao user = new UserDaoImpl();
    public void setUser () {
        user.setUser();
    }
    public String getUser() {
        user.getUser();
        return "getUser";
    }
}
