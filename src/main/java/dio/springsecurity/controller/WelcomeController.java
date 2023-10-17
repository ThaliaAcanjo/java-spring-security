package dio.springsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
		@GetMapping
		public String welcome(){
				return "welcome";
		}

		@GetMapping("/users")
		public String users(){
				return "Authorizes user";
		}

		@GetMapping("/managers")
		public String managers(){
				return "Authorizes manager";
		}
}
