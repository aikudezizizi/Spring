package cn.sust.servlet;

import cn.sust.dao.AccountDao;
import cn.sust.service.AccountService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 模拟表现层
 */
public class Cliet {
    public static void main(String[] args) {
        //使用ApplicationContext接口，就是在获取ioc容器
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        //根据bean的id获取对象
        AccountService accountService = (AccountService)ac.getBean("accountService2");
        accountService.saveAccount();
        System.out.println(accountService);
        AccountDao accountDao = (AccountDao)ac.getBean("accountDao");
//        accountDao.saveAccount();
//        System.out.println(accountDao);
    }
}
