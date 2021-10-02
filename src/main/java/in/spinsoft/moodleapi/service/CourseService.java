package in.spinsoft.moodleapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spinsoft.moodleapi.client.MoodleClient;
import in.spinsoft.moodleapi.dto.Category;
import in.spinsoft.moodleapi.dto.NewCategoryRequest;

@Service
public class CourseService {

	@Autowired
	private MoodleClient moodleClient;

	public Object getCategories() {
		return moodleClient.getCategories();
	}

	public void createCategory(String categoryName) {
		NewCategoryRequest request = new NewCategoryRequest();
		Category c = new Category(categoryName);
		request.add(c);
		try {
			moodleClient.createCategory(request);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Object getCourses() {
		// TODO Auto-generated method stub
		return moodleClient.getCourses();
	}

	public void createCourse(String courseName) {
		// TODO Auto-generated method stub

	}

	public Object getCourse(Integer courseId) {
		return moodleClient.getCourse(courseId);
	}

	public Object getCourseModules(Integer courseId) {
		// TODO Auto-generated method stub
		return moodleClient.getCourseModules(courseId);
	}

}
