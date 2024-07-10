package pack1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AddEmployeeDAO
{
	int k=0;
	public int insert(EmployeeBean ab) throws SQLException
	{
		Connection con=DBConnection.getCon();
		PreparedStatement ps = con.prepareStatement("insert into employee59 values(?,?,?,?,?,?,?)");	
		ps.setString(1, ab.geteId());
		ps.setString(2, ab.geteName());
		ps.setString(3, ab.geteDesg());
		ps.setFloat(4, ab.geteBsal());
		ps.setFloat(5, ab.geteHra());
		ps.setFloat(6, ab.geteDa());
		ps.setFloat(7, ab.geteTsal());
		k=ps.executeUpdate();
		
		return k;
		
	}
}
