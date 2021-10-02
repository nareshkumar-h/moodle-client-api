package in.spinsoft.moodleapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.spinsoft.moodleapi.client.MoodleClient;

@Service
public class AuthService {

	@Autowired
	private MoodleClient moodleClient;

	public Object login(String username, String password) {
		return moodleClient.login(username, password);
	}
}
