package AdminController;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.LoaiDT_Dao;


/**
 * Servlet implementation class Controller_ThemLoaiSP
 */
@WebServlet("/Controller_ThemLoaiSP")
public class Controller_ThemLoaiSP extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller_ThemLoaiSP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String maloai = request.getParameter("maloai");
		String tenloai = request.getParameter("tenloai");
		LoaiDT_Dao ld = new LoaiDT_Dao();
		if(maloai!=""&&tenloai!="" && maloai!=null && tenloai!=null) ld.ThemLoaiSanPham(maloai, tenloai);
		response.sendRedirect("Controller_QuanLyLoai");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
