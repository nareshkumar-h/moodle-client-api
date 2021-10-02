package in.spinsoft.moodleapi.controller;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class WeatherResponse {

	@JsonProperty("temp_int")
	@JsonAlias({ "temp_int" })
	private Integer temperature;
}
