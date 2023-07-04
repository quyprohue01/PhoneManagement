package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.DienThoai_Bean;
import bo.DienThoai_Bo;
import bo.giohangbo;

/**
 * Servlet implementation class giohangController
 */
@WebServlet("/giohangController")
public class giohangController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public giohangController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String madt=request.getParameter("madt");
		String tendt=request.getParameter("ts");
		if(madt!=null) {
		long soluong=(long)1;
		long gia = Long.parseLong(request.getParameter("gia"));
		String anh=request.getParameter("anh");
		giohangbo gh;
		
		HttpSession session = request.getSession();
		
		//Neu mua hang lan dau
		if(session.getAttribute("gio")==null){
			gh=new giohangbo();//cap vung nho
			session.setAttribute("gio", gh);//tao session
		}
		//b1: Luu session ra bien
		gh=(giohangbo)session.getAttribute("gio");
		//b2: Thao tac tren bien
		gh.Them(madt, tendt, soluong, gia, anh);
		//b3: Luu bien vao session
		session.setAttribute("gio", gh);
		session.setAttribute("i", gh.ds.size());
		}
		//Hien thi hang
		response.sendRedirect("HomePageController");
	}

		
//		HttpSession session = request.getSession();
//		giohangbo gh;
//		//Neu mua lan dau
//		if(session.getAttribute("gio")==null){
//			gh= new giohangbo();
//			session.setAttribute("gio", gh);
//		}
//		gh=(giohangbo) session.getAttribute("gio");
//		
//		String key=request.getParameter("dathang"); 
//		// lay ds dien thoai ve
//		DienThoai_Bo dtbo = new DienThoai_Bo();
//		ArrayList<DienThoai_Bean> ds = dtbo.getDienThoai();
//		
//		int n= ds.size();
//		for(int i=0;i<n;i++){	
//	    	DienThoai_Bean s =ds.get(i);
//	    	if (s.getMadt().equals(key))
//	    	{
//	    		gh.Them(s.getMadt(), s.getTendt(),1, s.getGia(), s.getAnh());
//	    		break;
//	    		// tìm đúng 1 lần xong thoát vòng lặp, do m chưa thoát nỡ, nhớ 
//	    	}
//	    	
//	    }
//		 session.setAttribute("gio", gh);
//		    RequestDispatcher rd=request.getRequestDispatcher("htgio.jsp");
//		    rd.forward(request, response);
//	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
