package bean;

import java.sql.Date;

public class DienThoai_Bean {
	private String madt;
	private String tendt;
	private long soluong;
	private long gia;
	private String maloai;
	private String anh;
	private Date ngaynhap;
	private String dungluong;
	private String color;
	public DienThoai_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public DienThoai_Bean(String madt, String tendt, long soluong, long gia, String maloai, String anh, Date ngaynhap,
			String dungluong, String color) {
		super();
		this.madt = madt;
		this.tendt = tendt;
		this.soluong = soluong;
		this.gia = gia;
		this.maloai = maloai;
		this.anh = anh;
		this.ngaynhap = ngaynhap;
		this.dungluong = dungluong;
		this.color = color;
	}
	public String getMadt() {
		return madt;
	}
	public void setMadt(String madt) {
		this.madt = madt;
	}
	public String getTendt() {
		return tendt;
	}
	public void setTendt(String tendt) {
		this.tendt = tendt;
	}
	public long getSoluong() {
		return soluong;
	}
	public void setSoluong(long soluong) {
		this.soluong = soluong;
	}
	public long getGia() {
		return gia;
	}
	public void setGia(long gia) {
		this.gia = gia;
	}
	public String getMaloai() {
		return maloai;
	}
	public void setMaloai(String maloai) {
		this.maloai = maloai;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	public Date getNgaynhap() {
		return ngaynhap;
	}
	public void setNgaynhap(Date ngaynhap) {
		this.ngaynhap = ngaynhap;
	}
	public String getDungluong() {
		return dungluong;
	}
	public void setDungluong(String dungluong) {
		this.dungluong = dungluong;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
