package com.sun.repository;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * @ClassName: PersonRepositoryImpl
 * @Description:
 * @Author: liuchunyang
 * @CreateDate: 2019/5/17
 */
public class CustomerRepositoryImpl implements ICustomerRepository {

    public void CustomerRepositoryImpl(){
        System.out.println("init");
    }

    @Autowired
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public void findBySql() {
        String sql = "select * From customer";
        List resultList = entityManager.createNativeQuery(sql).getResultList();
        System.out.println(resultList);

    }
}
