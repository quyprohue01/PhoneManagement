package bean;

import java.util.Date;


public class LichSu_Bean{
	private String makh;
	private String MaHoaDon;
	private String Tendt;
	private long SoLuongMua;
	private long thanhtien;
	private Date NgayMua;
	private String damua;
	private String anh;
	public LichSu_Bean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LichSu_Bean(String makh, String maHoaDon, String tendt, long soLuongMua, long thanhtien, Date ngayMua,
			String damua, String anh) {
		super();
		this.makh = makh;
		MaHoaDon = maHoaDon;
		Tendt = tendt;
		SoLuongMua = soLuongMua;
		this.thanhtien = thanhtien;
		NgayMua = ngayMua;
		this.damua = damua;
		this.anh = anh;
	}
	public String getMakh() {
		return makh;
	}
	public void setMakh(String makh) {
		this.makh = makh;
	}
	public String getMaHoaDon() {
		return MaHoaDon;
	}
	public void setMaHoaDon(String maHoaDon) {
		MaHoaDon = maHoaDon;
	}
	public String getTendt() {
		return Tendt;
	}
	public void setTendt(String tendt) {
		Tendt = tendt;
	}
	public long getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(long soLuongMua) {
		SoLuongMua = soLuongMua;
	}
	public long getThanhtien() {
		return thanhtien;
	}
	public void setThanhtien(long thanhtien) {
		this.thanhtien = thanhtien;
	}
	public Date getNgayMua() {
		return NgayMua;
	}
	public void setNgayMua(Date ngayMua) {
		NgayMua = ngayMua;
	}
	public String getDamua() {
		return damua;
	}
	public void setDamua(String damua) {
		this.damua = damua;
	}
	public String getAnh() {
		return anh;
	}
	public void setAnh(String anh) {
		this.anh = anh;
	}
	
}
