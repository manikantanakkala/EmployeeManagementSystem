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
@WebServlet("/edit")
public class EditEmployeeServlet extends HttpServlet 
{
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg","Session expired ");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
			
		}
		else
		{
			String eId=req.getParameter("eId");
			ArrayList<EmployeeBean> al=(ArrayList<EmployeeBean>)hs.getAttribute("alist");
			java.util.Iterator<EmployeeBean> it=al.iterator();
			while(it.hasNext())
			{
				EmployeeBean eb=(EmployeeBean)it.next();
				if(eId.equals(eb.geteId()))
				{
					req.setAttribute("ebean", eb);
					req.getRequestDispatcher("EditEmployee.jsp").forward(req, res);
					
				}
			}// end of loop
		}
	}
	
}
