package fr.formation.inti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.formation.inti.entity.Employee;
import fr.formation.inti.entity.User;
import fr.formation.inti.service.IEmployeeService;
import fr.formation.inti.service.IUserService;

@Controller
public class HomeController {
	@Autowired
	private IEmployeeService service;

	@Autowired
	private IUserService userService;

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String home(Model model) {
//		model.addAttribute("message", "Application Spring MVS");
//		model.addAttribute("user", new User("root", "123456", 3));

		return "login";
	}

//	@RequestMapping(value = "/home2", method = RequestMethod.GET)
//	public ModelAndView home() {
//
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("user", new User("root2", "123456", 3));
//		mv.setViewName("login");
//
//		return mv;
//	}

	@RequestMapping(value = "/home", method = RequestMethod.GET)
	public String pageLogin(Model model, @RequestParam("empid") int empID) {

		Employee emp = service.findById(empID);
		model.addAttribute("emp", emp);

		return "index";
	}

	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String home2(Model model, @RequestParam("login") String login, @RequestParam("password") String password) {

		model.addAttribute("message", "Application SPRING MVC method post :" + login + " " + password);

		User user = userService.findByLoginAndPassword(login, password);

		if (user != null) {
			Employee emp = user.getEmp();
			model.addAttribute("emp", emp);
			return "index";
		}
		return "login";
	}

}
