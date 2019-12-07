package cn.sust.test;

import cn.sust.domain.Account;
import cn.sust.service.AccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class AccountTest {
    /**
     * 测试保存
     */
    @Test
    public void testSave(){
        Account account = new Account();
        account.setName("sustTest");
        account.setMoney(2000f);
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = (AccountService)ac.getBean("accountService");
        service.save(account);
    }
    /**
     * 测试查询一个
     */
    @Test
    public void testFindOne(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = (AccountService)ac.getBean("accountService");
        Account account = service.findById(4);
        System.out.println(account);
    }
    /**
     * 测试更新
     */
    @Test
    public void testUpdate(){
        Account account = new Account();
        account.setId(4);
        account.setMoney(3000f);
        account.setName("陕科大");
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = (AccountService)ac.getBean("accountService");
        service.update(account);
    }
    /**
     * 测试删除
     */
    @Test
    public void testDelete(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = (AccountService)ac.getBean("accountService");
        service.delete(5);
    }
    /**
     * 测试查询所有
     */
    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        AccountService service = (AccountService)ac.getBean("accountService");
        List<Account> all = service.findAll();
        for (Account account : all) {
            System.out.println(account);
        }
    }
}

