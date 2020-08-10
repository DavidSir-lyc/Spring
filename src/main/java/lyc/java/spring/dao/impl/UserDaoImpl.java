package lyc.java.spring.dao.impl;

import lyc.java.spring.dao.def.UserDao;

public class UserDaoImpl implements UserDao {
    public void setUser () {
        System.out.println("设置姓名");
    }
    public String getUser () {
        System.out.println("获取姓名");
        return "获取姓名";
    }
}
