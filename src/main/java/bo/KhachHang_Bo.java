package bo;

import bean.KhachHang_Bean;
import dao.KhachHang_Dao;

public class KhachHang_Bo {
	KhachHang_Dao khdao= new KhachHang_Dao();
	   public KhachHang_Bean ktdn(String tendn, String pass) {
		   return khdao.ktdn(tendn, pass);
	   }
	   public boolean DangKy(KhachHang_Bean kh) {
		   return khdao.DangKy(kh);
	   }
}
