package com.sun.repository;

import com.sun.po.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 * @ClassName: PersonRepository
 * @Description:
 * @Author: liuchunyang
 * @CreateDate: 2019/5/16
 */
public interface CustomerRepository extends CrudRepository<Customer,Integer>{

}
