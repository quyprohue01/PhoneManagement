package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LichSu_Bean;
import bean.LoaiDT_Bean;
import bo.LichSu_Bo_fail;
import bo.LoaiDT_Bo;


/**
 * Servlet implementation class lichsuController
 */
@WebServlet("/lichsuController")
public class lichsuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public lichsuController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			LoaiDT_Bo lbo=new LoaiDT_Bo();
			ArrayList<LoaiDT_Bean> dsloai=lbo.getloai();
			request.setAttribute("dsloai", dsloai); 
			
			LichSu_Bo_fail lsbo = new LichSu_Bo_fail();
			ArrayList<LichSu_Bean> ls=lsbo.lichsu();
			request.setAttribute("ls", ls);
			
			
			RequestDispatcher rd=request.getRequestDispatcher("lichsu.jsp");
			rd.forward(request, response);
			
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
