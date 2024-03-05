package examApp.service;

import examApp.model.CourseModel;
import examApp.repository.CourseRepository;

public class CourseService {
	CourseRepository courseRepositoryObj= new CourseRepository(); 	
	public int addCourse (CourseModel courseModelObject) {
		return courseRepositoryObj.isAddCourse(courseModelObject)? 1: 0;
	}
}