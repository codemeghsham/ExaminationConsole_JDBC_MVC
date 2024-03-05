package examApp.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import com.mysql.cj.protocol.Resultset;


public class DB_config {
	protected Connection con ;
	protected PreparedStatement preStmt;
	protected Resultset rs;
	public DB_config() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/examapp","root","root"); 
		} catch (Exception e) {
			System.out.println("Error Occured !!!");
			e.printStackTrace();
		}
	}
}
