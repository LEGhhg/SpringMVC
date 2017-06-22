package dao.impl;

import dao.iface.UserDaoIface;

public class UserDaoImp1 implements UserDaoIface{

	@Override
	public boolean login(String id, String pwd) {
		System.out.println("-UserDaoImp 1-login()-" + "id" + "-" + pwd);
		return true;
	}

	@Override
	public String getEmpName() {
		System.out.println("--UserDaoImp 1.getEmpName()222--");
		return "call the method : UserDaoImp 1.getEmpName()";
	}

}
