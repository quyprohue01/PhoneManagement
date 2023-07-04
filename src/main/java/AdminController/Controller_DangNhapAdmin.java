package AdminController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.Admin_DangNhapBean;
import bo.Admin_DangNhapBo;

/**
 * Servlet implementation class Controller_DangNhapAdmin
 */
@WebServlet("/Controller_DangNhapAdmin")
public class Controller_DangNhapAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller_DangNhapAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String TenDN = request.getParameter("TenDN");
		  String MatKhau=request.getParameter("MatKhau");
		  System.out.println(TenDN + MatKhau);
		  if(TenDN != null && MatKhau != null){
			  Admin_DangNhapBo adbo = new Admin_DangNhapBo();
			  Admin_DangNhapBean admin = adbo.ktdn(TenDN, MatKhau);
		  if(admin != null){
			  //Tao ra doi tuong session
			  HttpSession session = request.getSession();
			  session.setAttribute("admin", admin);
			  response.sendRedirect("Admin_HomePage.jsp");
		  }else //Dang nhap sai
			  response.sendRedirect("Controller_DangNhapAdmin?kt=1");
		  } else//Chay lan dau
			  response.sendRedirect("Admin_DangNhap.jsp");
		  //nem request va response qua trang khac 
//		  rd.forward(request, response);  
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
