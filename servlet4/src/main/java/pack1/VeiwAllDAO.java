package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class VeiwAllDAO 
{
	public ArrayList<EmployeeBean> al= null;
	public ArrayList<EmployeeBean> retrieve() throws SQLException
	{
		try
		{
			
		
		Connection con=DBConnection.getCon();
		PreparedStatement ps=con.prepareStatement(" select * from employee59 ");
		ResultSet rs=ps.executeQuery();
		al=new ArrayList<EmployeeBean>();
		while(rs.next())
		{
			EmployeeBean ab=new EmployeeBean();
			ab.seteId(rs.getString(1));
			ab.seteName(rs.getString(2));
			ab.seteDesg(rs.getString(3));
			ab.seteBsal(Float.parseFloat(rs.getString(4)));
			ab.seteHra(Float.parseFloat(rs.getString(5)));
			ab.seteDa(Float.parseFloat(rs.getString(6)));
			ab.seteTsal(Float.parseFloat(rs.getString(7)));
			al.add(ab);
			
		}
		}// end of try
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return al;
	}

}
