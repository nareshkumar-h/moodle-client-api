package in.spinsoft.moodleapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.spinsoft.moodleapi.service.CourseService;

@RestController
@RequestMapping("api/v1/courses")
public class CourseController {

	@Autowired
	private CourseService courseService;

	@GetMapping
	public Object list() {
		return courseService.getCourses();
	}

	@GetMapping("{id}")
	public Object getCourse(@PathVariable("id") Integer courseId) {
		return courseService.getCourse(courseId);
	}

	@GetMapping("{id}/modules")
	public Object getModules(@PathVariable("id") Integer courseId) {
		return courseService.getCourseModules(courseId);
	}

	@PostMapping
	public void create(@RequestParam("courseName") String courseName) {
		courseService.createCourse(courseName);
	}
}
