package cn.sust.factory;

import cn.sust.dao.AccountDao;
import cn.sust.dao.impl.AccountDaoImpl;

public class InstanceFactory {
    public static AccountDao createAccountDao(){
        return new AccountDaoImpl();
    }
}
