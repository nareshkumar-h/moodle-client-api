package in.spinsoft.moodleapi.client;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import in.spinsoft.moodleapi.dto.NewCategoryRequest;

@Component
public class MoodleClient {

	@Autowired
	private RestTemplate restTemplate;

	String domainName = "https://moodle.spinsoft.in";
	String mobileAccessToken = "3801183884302d779447372caf9d3eb0";
	String token = "322b73f2ba2140b9c2ed81114c636944";

	private String getUrl(MoodleFunction functionName) {

		String serverurl = domainName + "/webservice/rest/server.php" + "?wstoken=" + token + "&wsfunction="
				+ functionName.getFunctionName() + "&moodlewsrestformat=json";

		return serverurl;
	}

	public void createCategory(NewCategoryRequest category) {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		// headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		HttpEntity<Object> request = new HttpEntity<Object>(category, headers);

		String url = getUrl(MoodleFunction.CREATE_CATEGORY);
		System.out.println(url);

		ResponseEntity<Object> postForEntity = restTemplate.postForEntity(url, request, Object.class);
		System.out.println(postForEntity);
		Object response = postForEntity.getBody();
		System.out.println(response);

	}

	public Object getCategories() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		String url = getUrl(MoodleFunction.GET_CATEGORIES);
		System.out.println(url);

		ResponseEntity<Object> postForEntity = restTemplate.getForEntity(url, Object.class, headers);
		Object response = postForEntity.getBody();
		System.out.println(response);
		return response;

	}

	public Object getCourses() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		String url = getUrl(MoodleFunction.GET_COURSES);
		System.out.println(url);

		ResponseEntity<Object> postForEntity = restTemplate.getForEntity(url, Object.class, headers);
		Object response = postForEntity.getBody();
		System.out.println(response);
		return response;

	}

	public Object getUsers() {

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		String url = getUrl(MoodleFunction.GET_CATEGORIES);
		System.out.println(url);

		ResponseEntity<Object> postForEntity = restTemplate.getForEntity(url, Object.class, headers);
		Object response = postForEntity.getBody();
		System.out.println(response);
		return response;

	}

	public Object login(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getCourse(Integer courseId) {
		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));

		String url = getUrl(MoodleFunction.GET_COURSE_BY_FIELDS) + "&field=id&value=" + courseId;
		System.out.println(url);

		ResponseEntity<Object> postForEntity = restTemplate.getForEntity(url, Object.class, headers);
		Object response = postForEntity.getBody();
		System.out.println(response);
		return response;
	}

	public Object getCourseModules(Integer courseId) {
		return null;
	}

}
