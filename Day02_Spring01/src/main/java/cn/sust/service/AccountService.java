package cn.sust.service;

import cn.sust.domain.Account;

import java.util.List;

public interface AccountService {
    /**
     * 保存账户
     */
    public void save(Account account);
    /**
     * 更新账户
     */
    public void update(Account account);
    /**
     * 删除账户
     */
    public void delete(Integer accountId);
    /**
     * 根据id查询一个账户
     */
    public Account findById(Integer accountid);
    /**
     * 查询所有账户
     */
    public List<Account> findAll();
}
