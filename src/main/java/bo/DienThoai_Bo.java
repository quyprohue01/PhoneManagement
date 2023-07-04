package bo;

import java.util.ArrayList;

import bean.DienThoai_Bean;
import dao.DienThoai_Dao;

public class DienThoai_Bo {
	DienThoai_Dao dtdao= new DienThoai_Dao();
	ArrayList<DienThoai_Bean> ds;
	public ArrayList<DienThoai_Bean> getDienThoai() {
		ds=dtdao.getDienThoai();
		return ds;
	}
	//tìm mã dt
public ArrayList<DienThoai_Bean> TimMa(String maloai) throws Exception {
		ArrayList<DienThoai_Bean> tam = new ArrayList<DienThoai_Bean>();
		for (DienThoai_Bean s : ds)
			if(s.getMaloai().equals(maloai))	
				tam.add(s);
		return tam;
}
//Hàm Tìm kiếm theo đồng bộ
public ArrayList<DienThoai_Bean> Tim(String key){
	ArrayList<DienThoai_Bean> tam= new ArrayList<DienThoai_Bean>();
	for(DienThoai_Bean s: ds)
		if(s.getTendt().toLowerCase().trim().contains(
		key.toLowerCase().trim())||s.getDungluong().toLowerCase().trim().contains(
				key.toLowerCase().trim())||
				s.getMaloai().toLowerCase().trim().contains(
						key.toLowerCase().trim())
						)
					tam.add(s);
			return tam;
		}
}
