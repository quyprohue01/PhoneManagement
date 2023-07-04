package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bo.giohangbo;

/**
 * Servlet implementation class suaxoaController
 */
@WebServlet("/suaxoaController")
public class suaxoaController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public suaxoaController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		giohangbo gh = (giohangbo) session.getAttribute("gio");
		String[] check = request.getParameterValues("check");
		if (check != null)
			for (String madt : check)
				try {
					gh.Xoa(madt);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		session.setAttribute("i", gh.ds.size());
		if (request.getParameter("butxoa") != null) {
			String madt = request.getParameter("butxoa");
			try {
				gh.Xoa(madt);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		if (request.getParameter("butsua") != null) {
			String madt = request.getParameter("butsua");
			String sl = request.getParameter(madt);
			// out.print(madt+":"+sl);
			//gh.Sua(madt, "", Long.parseLong(sl), 0, "");
			gh.Sua(madt, "", Long.parseLong(sl), 0, "");
		}
		session.setAttribute("i", gh.ds.size());
		session.setAttribute("gio", gh);
		if (gh.ds.size() == 0 || session.getAttribute("gio") == null) {
			session.removeAttribute("gio");
			session.setAttribute("i", 0);
			response.sendRedirect("HomePageController");
		}
		else 
			response.sendRedirect("htgioController");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
