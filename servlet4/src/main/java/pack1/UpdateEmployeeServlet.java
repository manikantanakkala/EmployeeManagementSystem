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
@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet 
{
	
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		try
		{
			
		
		HttpSession hs=req.getSession(false);
		if(hs==null)
		{
			req.setAttribute("msg","Session Expired");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
			
		}
		else
		{
			
			String eId=req.getParameter("eId");
			float bs=Float.parseFloat(req.getParameter("eBsal"));
			float hra=Float.parseFloat(req.getParameter("eHra"));
			float da=Float.parseFloat(req.getParameter("eDa"));
			
			float eBsal=bs;
			float eHra=(float)(bs*100)/hra;
			float eDa=(float) (bs*100)/da;
			float eTsal=(float) (eBsal+eHra+eDa);
			
			ArrayList<EmployeeBean> al=new ArrayList<EmployeeBean>();
			java.util.Iterator<EmployeeBean> it= al.iterator();
			while(it.hasNext())
			{
				EmployeeBean ab=(EmployeeBean)it.next();
				if(eId.equals(ab.geteId()))
				{
					UpdateEmployeeDAO ud=new UpdateEmployeeDAO();
					int k;
					k=ud.update(ab);
					
					
					if(k>0)
					{
						req.setAttribute("msg", "Employee Updated Successfully");
						req.getRequestDispatcher("msg.jsp");
					}
					else
					{
						req.setAttribute("msg1", "Employee Updated UN-Successfull");
						req.getRequestDispatcher("UpdateEmployee.jsp").forward(req, res);
					}
				}
			}// end of while loop
		}// end of else
		}// end of try
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
