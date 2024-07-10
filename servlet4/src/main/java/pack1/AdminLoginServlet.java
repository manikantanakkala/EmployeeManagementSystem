package pack1;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@SuppressWarnings("serial")
@WebServlet("/Admn")
public class AdminLoginServlet extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		try
		{
		
		String un=req.getParameter("uName");
		String up=req.getParameter("PWord");
		
		AdminLoginDAO ad=new AdminLoginDAO();
		AdminBean as=(AdminBean)ad.insert(un,up);
		if(as==null)
		{
			req.setAttribute("msg", "Invalid Login Process ");
			RequestDispatcher rs=req.getRequestDispatcher("msg.jsp");
			rs.forward(req, res);
			
		}
		else
		{
			HttpSession hs=req.getSession();
			hs.setAttribute("abean", as);
			
			RequestDispatcher rs=req.getRequestDispatcher("AdminLogin.jsp");
			rs.forward(req, res);
			
			
		}
		}
		catch(Exception e )
		{
			e.printStackTrace();
		}
	}

}
