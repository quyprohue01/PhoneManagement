package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.LoaiDT_Bean;

public class LoaiDT_Dao {
	  public ArrayList<LoaiDT_Bean> getloai() {
	    	ArrayList<LoaiDT_Bean> ds = new ArrayList<LoaiDT_Bean>();
	    	try {
	    		//b1: ket noi vs csdl
	    		KetNoi kn = new KetNoi();
	    		kn.KetNoi();
	    		//b2: lay du lieu ve
	    		String sql="select * from loaidt";
	    		PreparedStatement cmd = kn.cn.prepareStatement(sql);
	    		ResultSet rs = cmd.executeQuery();
	    		//luu all du lieu vao mang ds
	    		while(rs.next()) {
	    			String maloai = rs.getString("maloai");
	    			String tenloai = rs.getString("tenloai");
	    			ds.add(new LoaiDT_Bean(maloai, tenloai));
	    		} 
	    		//b4: dong ket noi
	    		rs.close();
	    		kn.cn.close();
	        	return ds;

	    	} catch(Exception e) {
				e.printStackTrace();
				return null;
			}
	  }
		public boolean XoaLoaiSanPham(String maloai){
			try {
				KetNoi kn = new KetNoi();
				kn.KetNoi();
				String sql="DELETE FROM dbo.loaidt WHERE maloai=?";
				PreparedStatement cmd = kn.cn.prepareStatement(sql);
				cmd.setString(1, maloai);
				cmd.execute();
				kn.cn.close();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
		}
		
		public boolean ThemLoaiSanPham(String maloai, String tenloai){
			try {
				KetNoi kn = new KetNoi();
				kn.KetNoi();
				String sql="INSERT INTO dbo.loaidt"
						+ " VALUES (?,?);";
				PreparedStatement cmd = kn.cn.prepareStatement(sql);
				cmd.setString(1, maloai);
				cmd.setString(2, tenloai);
				cmd.execute();
				kn.cn.close();
				return true;
			} catch (Exception e) {
				e.printStackTrace();
				return false;
			}	
		}
		
		public static void main(String[] args) {
			System.out.println(new LoaiDT_Dao().XoaLoaiSanPham("ccc")); 
		}
}
