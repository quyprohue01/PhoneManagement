package bean;

public class LoaiDT_Bean {
	private String maloai;
	private String tenloai;
	
	public LoaiDT_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoaiDT_Bean(String maloai, String tenloai) {
		super();
		this.maloai = maloai;
		this.tenloai = tenloai;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	public String getTenloai() {
		return tenloai;
	}
	public void setTenloai(String tenloai) {
		this.tenloai = tenloai;
	}
}