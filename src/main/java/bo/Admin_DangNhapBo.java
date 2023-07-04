package bo;

import bean.Admin_DangNhapBean;
import dao.Admin_DangNhapDao;

public class Admin_DangNhapBo {
	Admin_DangNhapDao addao= new Admin_DangNhapDao();
	   public Admin_DangNhapBean ktdn(String tendn, String pass) {
		   return addao.ktdn(tendn, pass);
	   }
}
