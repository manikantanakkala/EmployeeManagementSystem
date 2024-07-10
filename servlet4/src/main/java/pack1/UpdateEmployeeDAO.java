package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateEmployeeDAO 
{
	int k=0;
	public int update(EmployeeBean e) throws SQLException
	{
		try
		{
			Connection con=DBConnection.getCon();
			PreparedStatement ps=con.prepareStatement(" update  employee59 set Bsal=?,Hra=?,Da=?,TOTSAL=? where eId='hhh' ");
			ps.setFloat(1, e.geteBsal());
			ps.setFloat(2, e.geteHra());
			ps.setFloat(3, e.geteDa());
			ps.setFloat(4, e.geteTsal());
			k=ps.executeUpdate();
			
		}
		catch(Exception e1)
		{
			e1.printStackTrace();
		}
		
		return k;
	}

	
}
