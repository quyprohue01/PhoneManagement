package bo;

import java.util.ArrayList;

import bean.Admin_XacNhanBEAN;
import dao.Admin_XacNhanDAO;

public class Admin_XacNhanBO {
	Admin_XacNhanDAO ldao = new Admin_XacNhanDAO();
	public ArrayList<Admin_XacNhanBEAN> ds;
	public ArrayList<Admin_XacNhanBEAN> getXacNhan() {
		ds=ldao.getXacNhan();
		return ds;
	}
}
