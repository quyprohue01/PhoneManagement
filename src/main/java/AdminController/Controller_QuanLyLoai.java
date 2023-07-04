package AdminController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoaiDT_Bean;
import bo.LoaiDT_Bo;

/**
 * Servlet implementation class Controller_QuanLyLoai
 */
@WebServlet("/Controller_QuanLyLoai")
public class Controller_QuanLyLoai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller_QuanLyLoai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		LoaiDT_Bo lb = new LoaiDT_Bo();
		ArrayList<LoaiDT_Bean> dsLoai = lb.getloai();
		request.setAttribute("dsLoai", dsLoai);
		RequestDispatcher rd = request.getRequestDispatcher("Admin_QuanLyLoai.jsp");
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
