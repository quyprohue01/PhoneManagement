package dao;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.DienThoai_Bean;


public class DienThoai_Dao {
	ArrayList<DienThoai_Bean> ds = new ArrayList<DienThoai_Bean>();
	public ArrayList<DienThoai_Bean> getDienThoai(){
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql="select * from DienThoai";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			ResultSet rs = cmd.executeQuery();
			while(rs.next()) {

				String madt = rs.getString("madt");
				String tendt = rs.getString("tendt");
				long soluong = rs.getLong("soluong");
				long gia = rs.getLong("gia");
				String maloai = rs.getString("maloai");
				String anh = rs.getString("anh");
				Date ngaynhap = rs.getDate("ngaynhap");
				String dungluong = rs.getString("dungluong");
				String color = rs.getString("color");
				
				ds.add(new DienThoai_Bean(madt, tendt, soluong, gia, maloai, anh, ngaynhap, dungluong, color));
				
			}
			rs.close();
			kn.cn.close();
			return ds;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	public boolean ThemSanPham(String madt, String tendt, long soluong, long gia, String maloai, String anh, Date ngaynhap,
			String DungLuong, String Color){
		try {
			KetNoi kn = new KetNoi();
			kn.KetNoi();
			String sql="INSERT INTO dbo.DienThoai"
					+ " VALUES (?,?,?,?,?,?,?,?,?);";
			PreparedStatement cmd = kn.cn.prepareStatement(sql);
			cmd.setString(1, madt);
			cmd.setString(2, tendt);
			cmd.setLong(3, soluong);
			cmd.setLong(4, gia);
			cmd.setString(5, maloai);
			cmd.setString(6, anh);
			cmd.setDate(7, ngaynhap);
			cmd.setString(8, DungLuong);
			cmd.setString(9, Color);
			cmd.execute();
			kn.cn.close();
			return true;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}	
	}
		public boolean XoaSanPham(String masanpham){
			try {
				KetNoi kn = new KetNoi();
				kn.KetNoi();
				String sql="DELETE FROM dbo.DienThoai WHERE madt=?";
				PreparedStatement cmd = kn.cn.prepareStatement(sql);
				cmd.setString(1, masanpham);
				cmd.execute();
				kn.cn.close();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
			
	}
		public boolean UpdateSanPham(DienThoai_Bean infoDT){
			try {
				KetNoi kn = new KetNoi();
				kn.KetNoi();
				String sql="INSERT INTO dbo.DienThoai\r\n"
						+ "tendt=?, soluong=?, gia=?,maloai=?,anh=?,NgayNhap=?,DungLuong=?,Color=?\r\n"
						+ "WHERE masach=?;";
				PreparedStatement cmd = kn.cn.prepareStatement(sql);
				cmd.setString(1, infoDT.getTendt());
				cmd.setLong(2, infoDT.getSoluong());
				cmd.setLong(3, infoDT.getGia());
				cmd.setString(4, infoDT.getMaloai());
				cmd.setString(5, infoDT.getAnh());
				cmd.setDate(6, infoDT.getNgaynhap());
				cmd.setString(7, infoDT.getDungluong());
				cmd.setString(8, infoDT.getColor());
				cmd.execute();
				kn.cn.close();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}
		}	

	public static void main(String[] args) {
		System.out.println(new DienThoai_Dao().getDienThoai().size()); 
	}
}
