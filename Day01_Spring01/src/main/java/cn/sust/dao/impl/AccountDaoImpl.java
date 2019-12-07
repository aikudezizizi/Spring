package cn.sust.dao.impl;

import cn.sust.dao.AccountDao;

/**
 * 账户持久层的实现类
 */
public class AccountDaoImpl implements AccountDao {

    public void saveAccount() {
        System.out.println("保存了账户");
    }
}
