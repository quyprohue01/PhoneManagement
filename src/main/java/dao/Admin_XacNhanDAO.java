package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.Admin_XacNhanBEAN;

public class Admin_XacNhanDAO {
	ArrayList<Admin_XacNhanBEAN> ds = new ArrayList<Admin_XacNhanBEAN>();
	public ArrayList<Admin_XacNhanBEAN> getXacNhan(){
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql="select * from ViewXacNhan";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while(rs.next()) {
				String maChiTiet = rs.getString("maChiTietHD");
				String hoTen = rs.getString("hoTen");
				String tenDT = rs.getString("tenDT");
				Date ngayMua = rs.getDate("ngayMua");
				int soLuongMua = rs.getInt("soLuongMua");
				int gia = rs.getInt("gia");
				int thanhTien = rs.getInt("thanhTien");
				boolean daMua = rs.getBoolean("daMua");
				ds.add(new Admin_XacNhanBEAN(maChiTiet, hoTen, tenDT, ngayMua, soLuongMua, gia, thanhTien, daMua));
			}
			rs.close();
			kn.cn.close();
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}	
	}
	//fc xác nhận đơn hàng
	public void XacNhanDonHang(String Machitiet){
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql="UPDATE ViewXacNhan\r\n"
					+ "SET damua = ?\r\n"
					+ "WHERE MaChiTietHD = ?;";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, "True");
			cmd.setString(2, Machitiet);
			cmd.execute();
			kn.cn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static void main(String[] args) {
		new Admin_XacNhanDAO().XacNhanDonHang("1");
	}
}
