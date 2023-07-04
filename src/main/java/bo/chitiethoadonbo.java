package bo;

import dao.chitiethoadondao;

public class chitiethoadonbo {
	chitiethoadondao ctdao=new chitiethoadondao();
	public int Them(String madt,long soluongmua,long MaHoaDon){
		return ctdao.Them(madt, soluongmua, MaHoaDon);
	}
}
