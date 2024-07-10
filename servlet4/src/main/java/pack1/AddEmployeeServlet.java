package pack1;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/add")
public class AddEmployeeServlet extends HttpServlet {
	int k = 0;

	@Override

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		HttpSession hs = req.getSession(false);
		if (hs == null) {
			req.setAttribute("msg", " session expired ");
			req.getRequestDispatcher("msg.jsp").forward(req, res);
		} else {
			EmployeeBean eb = new EmployeeBean();
			eb.seteId(req.getParameter("eId"));
			eb.seteName(req.getParameter("eName"));
			eb.seteDesg(req.getParameter("eDesg"));

			float b = Float.parseFloat(req.getParameter("bSal"));
			float h = Float.parseFloat(req.getParameter("eHra"));
			float d = Float.parseFloat(req.getParameter("eDa"));

			float hra = (float) (b * h) / 100;
			float da = (float) (b * d) / 100;
			float eTsal = (float) (b + hra + da);

			eb.seteBsal(b);
			eb.seteHra(hra);
			eb.seteDa(da);
			eb.seteTsal(eTsal);
			try {
				AddEmployeeDAO ed = new AddEmployeeDAO();
				int k = ed.insert(eb);
				if (k == 0) {
					req.setAttribute("msg", " session expired ");
					req.getRequestDispatcher("msg.jsp").forward(req, res);
				} else {

					req.setAttribute("msg", " Employee added successfully");
					req.getRequestDispatcher("AddEmployee.jsp").forward(req, res);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

	}
}
