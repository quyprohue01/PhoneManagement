	package AdminController;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.DienThoai_Bean;
import bean.LoaiDT_Bean;
import bo.DienThoai_Bo;
import dao.LoaiDT_Dao;


/**
 * Servlet implementation class Controller_QuanLySach
 */
@WebServlet("/Controller_QuanLyDienThoai")
public class Controller_QuanLyDienThoai extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller_QuanLyDienThoai() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DienThoai_Bo sb = new DienThoai_Bo();
		LoaiDT_Dao ld = new LoaiDT_Dao();
		ArrayList<DienThoai_Bean> dsSanPham = sb.getDienThoai();
		ArrayList<LoaiDT_Bean> dsLoai = ld.getloai();
		request.setAttribute("dsSanPham", dsSanPham);
		request.setAttribute("dsLoai", dsLoai);
		RequestDispatcher rd = request.getRequestDispatcher("Admin_QuanLyDienThoai.jsp");
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
