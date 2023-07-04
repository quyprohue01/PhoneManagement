package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.KhachHang_Bean;
import bo.KhachHang_Bo;


/**
 * Servlet implementation class ktdk
 */
@WebServlet("/ktdk")
public class ktdk extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ktdk() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String HoTen = request.getParameter("HoTen");
			String DiaChi = request.getParameter("DiaChi");
			String SoDT = request.getParameter("SoDT");
			String Email = request.getParameter("Email");
			String MatKhau = request.getParameter("MatKhau");
			String MatKhaunhaplai = request.getParameter("MatKhaunhaplai");
			KhachHang_Bo khbo = new KhachHang_Bo();
			if(MatKhau.equals(MatKhaunhaplai)) {
				KhachHang_Bean kh = new KhachHang_Bean(0, HoTen, DiaChi, SoDT, Email, Email, MatKhau);	
				khbo.DangKy(kh);
			RequestDispatcher rd = request.getRequestDispatcher("HomePageController");// Chuyen tiep ve trang htsach.jsp
			rd.forward(request, response);
			}else
			{
				RequestDispatcher rd = request.getRequestDispatcher("DangKyController");// Chuyen tiep ve trang htsach.jsp
				request.setAttribute("ktdk", "Re-entered password is incorrect");
				rd.forward(request, response);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
}
