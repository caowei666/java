package com.caowei.ex;

public class UserSerivce {
	public User login(String username,String password)throws MyException {
		if(!"admin".equals(username)) {
			throw new MyException("�û�������");
		}else if(!"12345".equals(password)) {
			throw new MyException("�������");
		}
		User user = new User("adming","12345",18,"��");
				return user;
	}
}
