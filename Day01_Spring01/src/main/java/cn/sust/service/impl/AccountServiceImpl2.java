package cn.sust.service.impl;

import cn.sust.service.AccountService;

import java.util.*;

/**
 * 账户的业务层实现类
 */
public class AccountServiceImpl2 implements AccountService {
//    private AccountDao accountDao;
    private String[] myStrs;
    private List<String> myList;
    private Set<String > mySets;
    private Map<String,String> myMap;
    private Properties myProp;

    public void setMyStrs(String[] myStrs) {
        this.myStrs = myStrs;
    }

    public void setMyList(List<String> myList) {
        this.myList = myList;
    }

    public void setMySets(Set<String> mySets) {
        this.mySets = mySets;
    }

    public void setMyMap(Map<String, String> myMap) {
        this.myMap = myMap;
    }

    public void setMyProp(Properties myProp) {
        this.myProp = myProp;
    }

    public void saveAccount() {
        System.out.println(Arrays.toString(myStrs));
        System.out.println(myList);
        System.out.println(mySets);
        System.out.println(myMap);
        System.out.println(myProp);
    }
}
