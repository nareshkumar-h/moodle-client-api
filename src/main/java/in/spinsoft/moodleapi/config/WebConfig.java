package in.spinsoft.moodleapi.config;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

	public String[] getCorsDomains() {
		Set<String> domains = new HashSet<>();
		domains.add("http://127.0.0.1:5500");

		return domains.toArray(new String[0]);
	}

	@Override
	public void addCorsMappings(CorsRegistry registry) {

		String[] origins = getCorsDomains();
		// {
		// "https://app-resulttracker-in.firebaseapp.com","https://customertracker-3b055.firebaseapp.com","https://userapp.coursetracker.in","https://admin.coursetracker.in","https://spinsoft.coursetracker.in","https://app.resulttracker.in","https://knowledgetracker.in"};
		registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "PATCH", "DELETE").allowedOrigins(origins)
				.allowedHeaders("*").allowCredentials(true);
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("swagger-ui.html").addResourceLocations("classpath:/META-INF/resources/");

		registry.addResourceHandler("/webjars/**").addResourceLocations("classpath:/META-INF/resources/webjars/");
	}
}
