package controllers;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import forms.RegistrationForm;

@Controller
public class RegistrationController {
	
	RegistrationForm users = new RegistrationForm();
	@GetMapping("index")
	public ModelAndView register(RegistrationForm user) {
		return new ModelAndView("register");
	}

	@PostMapping("/register")
	public ModelAndView create(RegistrationForm user) {
		ModelAndView model = new ModelAndView("viewUser");
		// user bean will be automatically binded to view . refer @ModelAttribute
			users.setName(user.getName());
			users.setEmail(user.getEmail());			
		return model;
	}

	@GetMapping("/register")
	public ModelAndView viewData(RegostrationForm user) {

		ModelAndView model = new ModelAndView("register");
		return model;
	}

}