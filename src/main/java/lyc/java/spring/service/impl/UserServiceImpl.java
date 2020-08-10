package lyc.java.spring.service.impl;

import lyc.java.spring.dao.def.UserDao;
import lyc.java.spring.service.def.UserService;
import lyc.java.spring.dao.impl.UserDaoImpl_Mysql;


public class UserServiceImpl implements UserService {
    private UserDao user;
    public void setUser(UserDao user) {
        this.user = user;
    }
    public void getUser() {
        user.getUser();
    }
}
