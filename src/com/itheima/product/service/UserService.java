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
			ud.addUser(user);//�û�ע��
			
			String emailMsg = "ע��ɹ�����<a href='http://www.product.com?activeCode="+user.getActiveCode()+"'>������¼";
			SendJMail.sendMail(user.getEmail(), emailMsg);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserException("ע��ʧ��");
		}
	}
	public void activeUser(String activeCode) throws UserException {
		//���ݼ������ҵ��û�
		try { 
			User user = ud.findUserByActiveCode(activeCode);
			if(user != null) {
				//�����û�
				ud.activeCode(activeCode);
				return ;
			}
			throw new UserException("����ʧ��");
		}catch(SQLException e) {
			e.printStackTrace();
			throw new UserException("����ʧ��");
		}
		
	}
	public User login(String username, String password) throws UserException {
		// TODO Auto-generated method stub
	
		User user = null;
		try {
			user =  ud.findUserByUserNameAndPassword(username, password);
			if(user == null) {
				throw new UserException("�û������������");
			}
			if(user.getState() == 0) {
				throw new UserException("�û�δ����");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserException("�û������������");
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
			throw new UserException("�û�����ʧ��");
		}
	}
	public void modifyUser(User user) throws UserException {
		// TODO Auto-generated method stub
		try {
			ud.modifyUser(user);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new UserException("�޸�ʧ��");
		}
	}

}
