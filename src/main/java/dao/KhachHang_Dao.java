package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.KhachHang_Bean;


public class KhachHang_Dao {
	public KhachHang_Bean ktdn(String TenDN, String MatKhau) {
		try {
			KetNoi kn= new KetNoi();
			kn.KetNoi();
			String sql="select * from KhachHang where tendn=? and pass=?";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			cmd.setString(1, TenDN);
			cmd.setString(2, MatKhau);
			ResultSet rs= cmd.executeQuery();
			KhachHang_Bean KhachHang= null;
			if(rs.next()) {//Dang nhap thanh cong
				int makh= rs.getInt("makh");
				String hoten=rs.getString("hoten");
				String diachi=rs.getString("diachi");
				String sodt=rs.getString("sodt");
				String email=rs.getString("email");
				KhachHang= new KhachHang_Bean(makh, hoten, diachi, sodt, email, TenDN, MatKhau);
			}
			return KhachHang;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public boolean DangKy(KhachHang_Bean kh) {
		try {
			KetNoi kn= new KetNoi();
			kn.KetNoi();
			String sql="insert into KhachHang (hoten, diachi, sodt, email, tendn, pass) values(?,?,?,?,?,?)";
			PreparedStatement cmd= kn.cn.prepareStatement(sql);
			cmd.setString(1, kh.getHoten());
			cmd.setString(2, kh.getDiachi());
			cmd.setString(3, kh.getSodt());
			cmd.setString(4, kh.getEmail());
			cmd.setString(5, kh.getTendn());
			cmd.setString(6, kh.getPass());
			cmd.execute();
			return true;
		} catch (Exception e) {
//			e.printStackTrace();
			return false;
		}
		
	}
	
}