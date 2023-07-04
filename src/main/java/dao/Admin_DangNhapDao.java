package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.Admin_DangNhapBean;

public class Admin_DangNhapDao {
	public Admin_DangNhapBean ktdn(String TenDN, String MatKhau) {
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql = "select * from Admin where TenDangNhap=? and MatKhau=?";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, TenDN);
			cmd.setString(2, MatKhau);
			ResultSet rs = cmd.executeQuery();
			Admin_DangNhapBean admin = null;
			if (rs.next()) {// Dang nhap thanh cong
				String TenDangNhap = rs.getString("TenDangNhap");
				String mk = rs.getString("MatKhau");
				boolean Quyen = rs.getBoolean("Quyen");;
				admin = new Admin_DangNhapBean(TenDangNhap, MatKhau, Quyen);
			}
			return admin;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
