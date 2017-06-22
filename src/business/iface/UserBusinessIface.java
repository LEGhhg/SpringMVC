package business.iface;

public interface UserBusinessIface {
	public boolean validateLogin(String id , String pwd);
	public String selectEmpName();
}
