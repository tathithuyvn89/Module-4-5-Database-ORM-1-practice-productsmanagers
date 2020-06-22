package cg.wbd.grandemonstration.service.impl;

import cg.wbd.grandemonstration.model.Customer;

import java.util.List;

public interface ICustomerservice {
    public List<Customer> findAll();
    public Customer findOne(Long id);
    public Customer save(Customer customer);
    public List<Customer> save(List<Customer> customers);
    public  boolean exist(Long id);
    public List<Customer> findAll(List<Long> ids);
    public int count();
    public void delete(Customer customer);
    public void delete(List<Customer> customers);
    public void deleteAll();
}
