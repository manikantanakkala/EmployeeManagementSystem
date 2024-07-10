package pack1;
import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("/logout")
public class LogoutServlet extends HttpServlet
{
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
	{
		HttpSession hs=req.getSession();
		if(hs==null)
		{
			req.setAttribute("msg"," session expired ");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}
		else
		{
			hs.removeAttribute("alist");
			hs.getAttribute("abean");
			hs.invalidate();// Destroying Session
			req.setAttribute("msg", " Logout Successfully");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		}	
	}
}
