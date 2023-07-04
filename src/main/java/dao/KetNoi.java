package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class KetNoi {
	public Connection cn;
    public void KetNoi() {
    	try {
    		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        	System.out.print("Xong b1");
    		String url="jdbc:sqlserver://JOSEPHQUY:1433;databaseName=DeTaiThiJava;user=sa; password=DuongQuy2001";
    		cn=DriverManager.getConnection(url);
        	System.out.print("Xong b2");
    	} catch (Exception e) {
    		e.printStackTrace();
    	}
    	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KetNoi kn = new KetNoi();
		kn.KetNoi();
	}
}
