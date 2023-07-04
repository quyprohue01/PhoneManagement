package bo;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;
import bean.LichSu_Bean;
import dao.LichSu_Dao_fail;

public class LichSu_Bo_fail {
	LichSu_Dao_fail ls=new LichSu_Dao_fail();
	
	ArrayList<LichSu_Bean> ds;
   public ArrayList<LichSu_Bean> lichsu() throws Exception{
	   ds=ls.lichsu();
	   return ds;
   }
}
