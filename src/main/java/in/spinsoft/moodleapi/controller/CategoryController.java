package in.spinsoft.moodleapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.spinsoft.moodleapi.service.CourseService;

@RestController
@RequestMapping("api/v1/categories")
public class CategoryController {

	@Autowired
	private CourseService courseService;

	@GetMapping
	public Object list() {
		return courseService.getCategories();
	}

	@PostMapping
	public void create(@RequestParam("categoryName") String categoryName) {
		courseService.createCategory(categoryName);
	}
}
