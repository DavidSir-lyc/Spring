package lyc.java.spring.dao.impl;

import lyc.java.spring.dao.def.UserDao;

public class UserDaoImpl_Redis implements UserDao {
    public void getUser() {
        System.out.println("用redis获取姓名");
    }
}
