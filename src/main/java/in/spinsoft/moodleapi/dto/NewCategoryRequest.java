package in.spinsoft.moodleapi.dto;

import java.util.ArrayList;
import java.util.List;

import in.spinsoft.moodleapi.dto.Category;

public class NewCategoryRequest {

	public List<Category> categories = new ArrayList<>();

	public void add(Category category) {
		categories.add(category);
	}

}
