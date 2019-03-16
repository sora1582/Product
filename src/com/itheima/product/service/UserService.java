package com.itheima.product.service;

import java.sql.SQLException;

import com.itheima.product.dao.UserDao;
import com.itheima.product.domain.User;
import com.itheima.product.exception.UserException;
import com.itheima.product.util.SendJMail;

public class UserService {

	 UserDao ud = new UserDao();
	public void regist(User user) throws UserException {
		// TODO Auto-generated method stub
		try {
			ud.addUser(user);//用户注册
			
			String emailMsg = "注册成功，请<a href='http://www.product.com?activeCode="+user.getActiveCode()+"'>激活后登录";
			SendJMail.sendMail(user.getEmail(), emailMsg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserException("注冊失敗");
		}
	}
	public void activeUser(String activeCode) throws UserException {
		//根据激活码找到用户
		try { 
			User user = ud.findUserByActiveCode(activeCode);
			if(user != null) {
				//激活用户
				ud.activeCode(activeCode);
				return ;
			}
			throw new UserException("激活失败");
		}catch(SQLException e) {
			e.printStackTrace();
			throw new UserException("激活失败");
		}
		
	}
	public User login(String username, String password) throws UserException {
		// TODO Auto-generated method stub
	
		User user = null;
		try {
			user =  ud.findUserByUserNameAndPassword(username, password);
			if(user == null) {
				throw new UserException("用户名或密码错误");
			}
			if(user.getState() == 0) {
				throw new UserException("用户未激活");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserException("用户名或密码错误");
		}
		return user;
	}
	public User findUserById(String id) throws UserException {
		// TODO Auto-generated method stub
		try {
			return ud.findUserById(id);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserException("用户查找失败");
		}
	}
	public void modifyUser(User user) throws UserException {
		// TODO Auto-generated method stub
		try {
			ud.modifyUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserException("修改失败");
		}
	}

}
