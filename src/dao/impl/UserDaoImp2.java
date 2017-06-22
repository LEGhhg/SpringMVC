package dao.impl;

import dao.iface.UserDaoIface;
import business.iface.UserBusinessIface;

public class UserDaoImp2 implements UserDaoIface{

	@Override
	public boolean login(String id, String pwd) {
		System.out.println("-UserDaoImp 2-login()-" + "id" + "-" + pwd);
		return true;
	}

	@Override
	public String getEmpName() {
		System.out.println("--UserDaoImp 2.getEmpName()--");
		return "call the method : UserDaoImp 2.getEmpName()";
	}

}
