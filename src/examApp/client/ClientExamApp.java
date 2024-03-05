package examApp.client;
import java.sql.*;
import java.util.Scanner;

import examApp.model.CourseModel;
import examApp.service.CourseService;

public class ClientExamApp {

	public static void main(String[] args) throws SQLException {
		CourseService courseServiceObj = new CourseService();
		do {
			System.out.println("1. Add New Subject");
			System.out.println("Enter your choice ==> ");
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1:
				sc.nextLine();
				System.out.print("Enter Course Name ==>");
				String courseName = sc.nextLine();
				CourseModel courseModelObj = new CourseModel();
				courseModelObj.setcourseName(courseName);
				
				int result = courseServiceObj.addCourse(courseModelObj);
				System.out.println(result==1?"Subject Added Succesfully":"Subject Added Succesfully");
				break;

			default:
				System.out.println("Wrong Choice Entered !!! ");
				break;
			}
			
		} while (true);;
	}

}