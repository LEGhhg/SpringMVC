package client;

import business.iface.UserBusinessIface;
import business.impl.UserBusinessImp1;
import business.impl.UserBusinessImp2;
import dao.iface.UserDaoIface;
import dao.impl.UserDaoImp1;
import dao.impl.UserDaoImp2;

public class ClientTest {
	
	public static void main(String[] args) {
		UserDaoIface userDao = new UserDaoImp1();
		UserBusinessIface user_service1 = new UserBusinessImp2(userDao);
		user_service1.validateLogin("hhg", "123888");
		user_service1.selectEmpName();
	}
}
