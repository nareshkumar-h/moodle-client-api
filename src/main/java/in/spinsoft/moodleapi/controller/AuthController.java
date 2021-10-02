package in.spinsoft.moodleapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import in.spinsoft.moodleapi.service.AuthService;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

	@Autowired
	private AuthService authService;

	@PostMapping("login")
	public Object login(@RequestParam("username") String username, @RequestParam("password") String password) {
		return authService.login(username, password);
	}
}
