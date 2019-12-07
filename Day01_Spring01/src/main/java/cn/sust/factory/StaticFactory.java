package cn.sust.factory;

import cn.sust.service.AccountService;
import cn.sust.service.impl.AccountServiceImpl;

/**
 * 模拟一个静态工厂，创建业务层实现类对象
 */
public class StaticFactory {
    public static AccountService createAccountService(){
        return new AccountServiceImpl();
    }
}
