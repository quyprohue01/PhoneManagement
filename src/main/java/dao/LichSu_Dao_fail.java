package dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import bean.LichSu_Bean;



public class LichSu_Dao_fail {
	public ArrayList<LichSu_Bean> lichsu() throws SQLException {
		ArrayList<LichSu_Bean> ds=new ArrayList<LichSu_Bean>();
		try {
			KetNoi kn = new KetNoi();
    		kn.KetNoi();
    		//b2: lay du lieu ve
    		String sql="select * from LichSuMuaHang";
    		PreparedStatement cmd = kn.cn.prepareStatement(sql);
    		ResultSet rs = cmd.executeQuery();
    		//luu all du lieu vao mang ds
    		while(rs.next()) {
    			SimpleDateFormat dd= new SimpleDateFormat("yyyy-MM-dd");
  
    			String makh = rs.getString("makh");
    			String MaHoaDon = rs.getString("MaHoaDon");
    			String tendt = rs.getString("tendt");
    			long SoLuongMua = rs.getLong("SoLuongMua");
    			long thanhtien = rs.getLong("thanhtien");
    			Date NgayMua =rs.getDate("NgayMua");
    			String damua = rs.getString("damua");
    			String anh = rs.getString("anh");
    			LichSu_Bean ls=new LichSu_Bean(makh, MaHoaDon, tendt, SoLuongMua, thanhtien, NgayMua, damua, anh);
    			ds.add(ls);
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
}
