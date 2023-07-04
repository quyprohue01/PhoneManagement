package bean;

import java.sql.Date;

public class Admin_XacNhanBEAN {
	private String MaChiTiet;
	private String HoTen;
	private String TenDT;
	private Date NgayMua;
	private int SoLuongMua;
	private int Gia;
	private int ThanhTien;
	private boolean DaMua;
	public Admin_XacNhanBEAN() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Admin_XacNhanBEAN(String maChiTiet, String hoTen, String tenDT, Date ngayMua, int soLuongMua, int gia,
			int thanhTien, boolean daMua) {
		super();
		MaChiTiet = maChiTiet;
		HoTen = hoTen;
		TenDT = tenDT;
		NgayMua = ngayMua;
		SoLuongMua = soLuongMua;
		Gia = gia;
		ThanhTien = thanhTien;
		DaMua = daMua;
	}
	public String getMaChiTiet() {
		return MaChiTiet;
	}
	public void setMaChiTiet(String maChiTiet) {
		MaChiTiet = maChiTiet;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getTenDT() {
		return TenDT;
	}
	public void setTenDT(String tenDT) {
		TenDT = tenDT;
	}
	public Date getNgayMua() {
		return NgayMua;
	}
	public void setNgayMua(Date ngayMua) {
		NgayMua = ngayMua;
	}
	public int getSoLuongMua() {
		return SoLuongMua;
	}
	public void setSoLuongMua(int soLuongMua) {
		SoLuongMua = soLuongMua;
	}
	public int getGia() {
		return Gia;
	}
	public void setGia(int gia) {
		Gia = gia;
	}
	public int getThanhTien() {
		return ThanhTien;
	}
	public void setThanhTien(int thanhTien) {
		ThanhTien = thanhTien;
	}
	public boolean isDaMua() {
		return DaMua;
	}
	public void setDaMua(boolean daMua) {
		DaMua = daMua;
	}
}
