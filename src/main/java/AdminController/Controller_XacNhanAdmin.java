package AdminController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.Admin_XacNhanBEAN;
import bo.Admin_XacNhanBO;
import dao.Admin_XacNhanDAO;


/**
 * Servlet implementation class Controller_XacNhanAdmin
 */
@WebServlet("/Controller_XacNhanAdmin")
public class Controller_XacNhanAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller_XacNhanAdmin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String machitiet = request.getParameter("machitiet");
		Admin_XacNhanBO lsbo = new Admin_XacNhanBO();
		Admin_XacNhanDAO xndao = new Admin_XacNhanDAO();
		if (machitiet != null) {
			xndao.XacNhanDonHang(machitiet);
		}
		ArrayList<Admin_XacNhanBEAN> dsXacNhan = lsbo.getXacNhan();
		request.setAttribute("dsXacNhan", dsXacNhan);
//		request.setAttribute("i", 0);
		RequestDispatcher rd = request.getRequestDispatcher("Admin_TrangXacNhan.jsp");
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
