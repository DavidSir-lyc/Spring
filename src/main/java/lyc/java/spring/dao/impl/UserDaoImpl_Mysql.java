package lyc.java.spring.dao.impl;

import lyc.java.spring.dao.def.UserDao;

public class UserDaoImpl_Mysql implements UserDao {
    public void getUser () {
        System.out.println("用mysql获取姓名");
    }
}
