package in.spinsoft.moodleapi.client;

public enum MoodleFunction {

	GET_USER_BADGES("core_badges_get_user_badges"), CREATE_CATEGORY("core_course_create_categories"),
	GET_CATEGORIES("core_course_get_categories"), GET_COURSES("core_course_get_courses"),
	GET_COURSE_BLOCKS("core_block_get_course_blocks"), GET_COURSE_BY_FIELDS("core_course_get_courses_by_field");

	private String functionName;

	private MoodleFunction(String functionName) {
		this.functionName = functionName;
	}

	public String getFunctionName() {
		return this.functionName.toString();
	}
}
