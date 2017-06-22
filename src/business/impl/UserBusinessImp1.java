package business.impl;

import dao.iface.UserDaoIface;
import business.iface.UserBusinessIface;

public class UserBusinessImp1 implements UserBusinessIface{

	private UserDaoIface userDao;
	public UserBusinessImp1 (UserDaoIface userDao){
		this.userDao=userDao;
	}
	public boolean validateLogin(String id, String pwd) {
		userDao.login(id, pwd);
		return true;
	}
	public String selectEmpName() {
		String str = userDao.getEmpName() + "call the selectEmpName() method";
		return str;
	}

}
