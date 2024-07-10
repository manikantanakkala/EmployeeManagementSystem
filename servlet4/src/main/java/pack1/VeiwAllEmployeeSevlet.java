package pack1;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.text.html.HTMLDocument.Iterator;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/veiw")
public class VeiwAllEmployeeSevlet extends HttpServlet
{	
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException 
	{
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg", "Session Expired ");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else
		{
			try
			{
				
			
			VeiwAllDAO ad=new VeiwAllDAO();
			ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
			al=ad.retrieve();
			if(al==null)
			{
				req.setAttribute("msg", "No Employees Are Available");
				req.getRequestDispatcher("msg.jsp").forward(req, res);				
			}
			else
			{
				hs.setAttribute("alist", al);
				req.getRequestDispatcher("VeiwAllEmployee.jsp").forward(req, res);
			}
			}// end of try
			catch(Exception e)
			{
				e.printStackTrace();
			}
			
			
		}
		
	}

}
