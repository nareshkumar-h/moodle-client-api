package in.spinsoft.moodleapi.controller;

import com.fasterxml.jackson.annotation.JsonAlias;

import lombok.Data;

@Data
public class WeatherRequest {

	@JsonAlias({ "city_str" })
	private String city;
}
