package service;


import ann.MBean;
import dao.UserDao;

import javax.annotation.Resource;

@MBean("UserService")
public class UserService {

    @Resource
    UserDao userDao;

    public String getName(){
        Math.sqrt(11.2);
        return userDao.aa();
    }

}
