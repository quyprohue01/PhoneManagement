package AdminController;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import bean.DienThoai_Bean;
import dao.DienThoai_Dao;


/**
 * Servlet implementation class Controller_AddUpdate
 */
@WebServlet("/Controller_AddUpdate")
public class Controller_AddUpdate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller_AddUpdate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 DiskFileItemFactory factory = new DiskFileItemFactory();
		 DiskFileItemFactory fileItemFactory = new DiskFileItemFactory();
		 ServletFileUpload upload = new ServletFileUpload(fileItemFactory);
		 String dirUrl1 = request.getServletContext().getRealPath("") +  File.separator + "ImagePhone";
		 response.getWriter().println(dirUrl1);
		 String madt = null, tendt = null,maloai= null,anh= null, dungluong = null,color=null, Add = null, Update = null;;
		 Long gia = null,soluong = null;
		 Date ngaynhap = null;
		 
		 RequestDispatcher rd = null ;
		 
		 
		try {
			//request.getContentLength(request) < 0;
			List<FileItem> fileItems = upload.parseRequest(request);
				for (FileItem fileItem : fileItems) {
		 			 if (!fileItem.isFormField()) {
						anh = fileItem.getName();
						System.out.println("Tên ở đây: "+anh);
						
						if (!anh.equals("")) {
					           
							String dirUrl = request.getServletContext().getRealPath("") +  File.separator + "ImagePhone";
							File dir = new File(dirUrl);
							if (!dir.exists()) {
								dir.mkdir();
							}
						           String fileImg = dirUrl + File.separator + anh;
						           
						           File file = new File(fileImg);
						            try {
						               fileItem.write(file);
						              System.out.println("UPLOAD THÀNH CÔNG...!");
						              System.out.println("Đường dẫn lưu file là: "+dirUrl);
						 } catch (Exception e) {
						    e.printStackTrace();
						}
					}
				 }
					else//Neu la control
					{
						String tentk=fileItem.getFieldName();
						if(tentk.equals("madt"))
							 madt = fileItem.getString();
						if(tentk.equals("tendt"))
							 tendt = fileItem.getString();
						if(tentk.equals("soluong"))
							 soluong = Long.parseLong(fileItem.getString()) ;
						if(tentk.equals("gia"))
							 gia = Long.parseLong(fileItem.getString()) ;
						if(tentk.equals("maloai"))
							 maloai = fileItem.getString();
						if(tentk.equals("ngaynhap"))
							 ngaynhap =Date.valueOf(fileItem.getString()) ;
						if(tentk.equals("dungluong"))
							 dungluong = fileItem.getString() ;
						if(tentk.equals("color"))
							 color = fileItem.getString();
						if(tentk.equals("Add"))
							 Add = fileItem.getString();
					}
		 			
					}
				DienThoai_Dao sd = new DienThoai_Dao();
				if(Add!=null) {
					sd.ThemSanPham(madt,tendt,soluong,gia,maloai,"ImagePhone/"+anh,ngaynhap,dungluong,color);	
		 			response.sendRedirect("Controller_QuanLyDienThoai");
				}else
	 			{
	 				sd.UpdateSanPham(new DienThoai_Bean(madt, tendt, soluong, gia, maloai, anh, ngaynhap, dungluong, color));
	 				response.sendRedirect("Controller_QuanLyDienThoai");
	 			}
	 			
		} catch (FileUploadException e) {
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
