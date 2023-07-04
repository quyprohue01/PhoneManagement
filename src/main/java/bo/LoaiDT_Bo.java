package bo;

import java.util.ArrayList;

import bean.LoaiDT_Bean;
import dao.LoaiDT_Dao;

public class LoaiDT_Bo {
	LoaiDT_Dao ldao=new LoaiDT_Dao();
	ArrayList<LoaiDT_Bean> ds;
	public ArrayList<LoaiDT_Bean> getloai() {
		ds=ldao.getloai();
		return ds;
	}
	public static void main(String[] args) {
		
		ArrayList<LoaiDT_Bean> loai = new LoaiDT_Bo().getloai();
		System.out.println(loai.get(0).getTenloai());
	}
}