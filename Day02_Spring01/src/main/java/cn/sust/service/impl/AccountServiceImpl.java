package cn.sust.service.impl;

import cn.sust.dao.AccountDao;
import cn.sust.domain.Account;
import cn.sust.service.AccountService;

import java.util.List;

public class AccountServiceImpl implements AccountService {
    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void save(Account account) {
        accountDao.save(account);
    }

    @Override
    public void update(Account account) {
        accountDao.update(account);
    }

    @Override
    public void delete(Integer accountId) {
        accountDao.delete(accountId);
    }

    @Override
    public Account findById(Integer accountid) {
        return accountDao.findById(accountid);
    }

    @Override
    public List<Account> findAll() {
        return accountDao.findAll();
    }
}
