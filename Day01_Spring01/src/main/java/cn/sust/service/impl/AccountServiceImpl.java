package cn.sust.service.impl;

import cn.sust.dao.AccountDao;
import cn.sust.dao.impl.AccountDaoImpl;
import cn.sust.service.AccountService;

import java.util.Date;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl implements AccountService {
//    private AccountDao accountDao;
    private String name;
    private Integer age;
    private Date birthday;

    public AccountServiceImpl() {
    }

    /*public AccountServiceImpl(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }*/

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public void saveAccount() {
        System.out.println(name+","+age+","+birthday);
    }
}
