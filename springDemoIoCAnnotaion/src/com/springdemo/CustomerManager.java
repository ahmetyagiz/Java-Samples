package com.springdemo;

public class CustomerManager implements ICustomerService
{
	
	private ICustomerDal customerDal;
	
	//constructur injection
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() 
	{
		//iş kuralları
		customerDal.add();
	}
}