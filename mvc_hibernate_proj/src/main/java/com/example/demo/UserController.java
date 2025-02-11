package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@GetMapping("/showForm")
	public String showForm(Model model) {
		model.addAttribute("user", new User());
        return "index";
	}
	
	@PostMapping("/processForm")
    public String processForm(@ModelAttribute("user") User user) {
        userService.createUser(user);
        return "user-form";
    }
}
	


