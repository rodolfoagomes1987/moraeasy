package com.moraeasy;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WebController {

	@GetMapping("/home")
	public String home(Model model) {
		model.addAttribute("title", "Welcome to My App");
		model.addAttribute("message", "Hello from Thymeleaf on Railway!");
		model.addAttribute("currentTime",
				LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")));

		// Add a list of features
		List<String> features = Arrays.asList("Spring Boot Framework", "Thymeleaf Template Engine",
				"Bootstrap CSS Framework", "Deployed on Railway", "Responsive Design");
		model.addAttribute("features", features);

		return "home";
	}

	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "About This App");
		model.addAttribute("description",
				"This is a simple Spring Boot application using Thymeleaf templates, deployed on Railway.");
		model.addAttribute("version", "1.0.0");
		model.addAttribute("author", "Your Name");
		return "about";
	}

	@GetMapping("/greet")
	public String greet(@RequestParam(name = "name", defaultValue = "World") String name, Model model) {
		model.addAttribute("title", "Personal Greeting");
		model.addAttribute("name", name);
		model.addAttribute("greeting", "Hello, " + name + "! Welcome to our Thymeleaf app!");
		return "greet";
	}
}