package examApp.repository;

import java.sql.Connection;
import examApp.model.CourseModel;

public class CourseRepository extends DB_config{
	
	public boolean isAddCourse (CourseModel courseModelObject) {
		try {
			preStmt = con.prepareStatement("INSERT INTO CourseTable (courseName) VALUES (?)");

			
			//INSERT INTO table_name (column1, column2, column3, ...) VALUES (value1, value2, value3, ...);
			preStmt.setString(1, courseModelObject.getcourseName());
			int queryResult = preStmt.executeUpdate();
			return queryResult==1? true:false;
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
