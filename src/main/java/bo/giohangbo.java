package bo;



import java.util.ArrayList;

import bean.GioHang_Bean;

public class giohangbo {
	public ArrayList<GioHang_Bean> ds=new ArrayList<GioHang_Bean>();
	
	public void Them(String madt, String tendt, long soluong, long gia, String anh) {
		for(GioHang_Bean g:ds)
			if(g.getMadt().trim().equals(madt.trim())) {
				g.setSoluong(soluong+g.getSoluong());
				return ;
			}
			ds.add(new GioHang_Bean(madt, tendt, soluong, gia, anh));
	}
	public void Sua(String madt, String tendt, long soluong, long gia, String anh) {
		for(GioHang_Bean g:ds)
			if(g.getMadt().trim().equals(madt.trim())) {
				g.setSoluong(soluong);
				return ;
			}
			ds.add(new GioHang_Bean(madt, tendt, soluong, gia, anh));
	}
	public long TongTien() {
		long s=0;
		for(GioHang_Bean g:ds) 
			s=s+g.getThanhtien();
			return s;
	}
	public void update(String madt, long soluong) {
		for(GioHang_Bean g:ds)
			if(g.getMadt().equals(madt)) {
				g.setSoluong(soluong);
				break;
			}
	}
		
	 public ArrayList<GioHang_Bean> Xoa(String madt) throws Exception{
	    	int n=ds.size();//lấy số phần tử trong mang
			for(int i=0;i<n;i++)
	    		if(ds.get(i).getMadt().equalsIgnoreCase(madt))
	    			{
	    				ds.remove(i);break;	
	    			}
	    	return ds;
	 }
}
