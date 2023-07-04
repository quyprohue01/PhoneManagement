package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DienThoai_Bean;
import bo.DienThoai_Bo;
import bo.LoaiDT_Bo;


/**
 * Servlet implementation class HomePageController
 */
@WebServlet("/HomePageController")
public class HomePageController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HomePageController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		
		LoaiDT_Bo lbo=new LoaiDT_Bo();
	
		//ArrayList<loaibean> dsloai=lbo.getloai();
		request.setAttribute("dsloai", lbo.getloai());
		
		DienThoai_Bo dtbo = new DienThoai_Bo();
		ArrayList<DienThoai_Bean> dssach=dtbo.getDienThoai();
		String maloai = request.getParameter("ml");
		String key = request.getParameter("txttk");
		if (maloai != null)
			try {
				dssach = dtbo.TimMa(maloai);
			} catch (Exception e) {
				e.printStackTrace();
			}
		else 
			if (key != null)
			dssach = dtbo.Tim(key);
		request.setAttribute("dssach", dssach);
		
		RequestDispatcher rd=request.getRequestDispatcher("HomePage.jsp");
		rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
