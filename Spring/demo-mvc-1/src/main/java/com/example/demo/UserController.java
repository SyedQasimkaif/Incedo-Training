

//@Controller
//public class UserController {
//	@GetMapping("/")
//	public String home() {
//		return "index.jsp";
//	}
//
//
//}

package com.example.demo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class UserController {
	@GetMapping("/home")
	public String home(){
		return "index.jsp";
	}
	@PostMapping("/processForm")
    public String processForm(@RequestParam String username,
                              @RequestParam String email,
                              Model model) {
        model.addAttribute("username", username);
        model.addAttribute("email", email);
        return "userdetails.jsp"; // Maps to user-details.jsp
    }
}
