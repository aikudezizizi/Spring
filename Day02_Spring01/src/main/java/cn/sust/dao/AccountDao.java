package cn.sust.dao;

import cn.sust.domain.Account;

import java.util.List;

/**
 * 用户持久层接口
 */
public interface AccountDao {
    /**
     * 保存账户
     */
     void save(Account account);
    /**
     * 更新账户
     */
     void update(Account account);
    /**
     * 删除账户
     */
     void delete(Integer accountId);
    /**
     * 根据id查询一个账户
     */
    public Account findById(Integer accountid);
    /**
     * 查询所有账户
     */
    public List<Account> findAll();
}
