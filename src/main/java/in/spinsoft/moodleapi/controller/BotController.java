package in.spinsoft.moodleapi.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/bot")
public class BotController {

	@PostMapping
	public WeatherResponse sendRequest(@RequestBody WeatherRequest request) {
		System.out.println("Send Request" + request.getCity());

		WeatherResponse response = new WeatherResponse();
		response.setTemperature(50);
		return response;
	}

}
