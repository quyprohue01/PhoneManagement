package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.KhachHang_Bean;
import bo.KhachHang_Bo;


/**
 * Servlet implementation class KiemTraDangNhapController
 */
@WebServlet("/KiemTraDangNhapController")
public class KiemTraDangNhapController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KiemTraDangNhapController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String TenDN = request.getParameter("TenDN");
		  String MatKhau=request.getParameter("MatKhau");
		  System.out.println(TenDN + MatKhau);
		  if(TenDN != null && MatKhau != null){
			  KhachHang_Bo khbo = new KhachHang_Bo();
			  KhachHang_Bean KhachHang = khbo.ktdn(TenDN, MatKhau);
		  if(KhachHang != null){
			  //Tao ra doi tuong session
			  HttpSession session = request.getSession();
			  session.setAttribute("NguoiDung", KhachHang);
			  response.sendRedirect("HomePageController");
		  }else //Dang nhap sai
			  response.sendRedirect("DangNhapController?kt=1");
		  } else//Chay lan dau
			  response.sendRedirect("DangNhapController");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
