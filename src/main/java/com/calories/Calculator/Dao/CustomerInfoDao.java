package com.calories.Calculator.Dao;

import java.util.List;

import com.calories.Calculator.Entity.CustomerInfo;

public interface CustomerInfoDao {
	
	public int addCustomer(CustomerInfo customer);
	public int updateCustomer(CustomerInfo customer);
	public int deleteCustomer(int id);
	public CustomerInfo getCustomer(int id);
	public List<CustomerInfo> getAllcustomers();
	
	

}
