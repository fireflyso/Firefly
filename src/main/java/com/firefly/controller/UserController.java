
package com.firefly.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.firefly.domain.User;
import com.firefly.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Resource
	private UserService userService; 
	
	@RequestMapping("/adminLoginPage")
	public String toAdmin(){
		return "adminLogin";
	}
	
	@RequestMapping("/userLoginPage")
	public String toUserLogin(){
		return "userLogin";
	}
	
	@RequestMapping("/addUserPage")
	public String addUserPage(HttpServletRequest request,Model model){
		return "addUserPage";
	}
	
	@RequestMapping("adminMainPage")
	public String adminMainPage(){
		return "adminMainPage";
	}
	
	@RequestMapping("/adminLogin")
	public ModelAndView adminLogin(User user,HttpSession session){
		User dbUser = this.userService.getUserByName(user.getUserName());
		ModelAndView model = new ModelAndView();
		if(null!=dbUser&&user.getUserPassword().equals(dbUser.getUserPassword())
				&&dbUser.getUserActive().equals("01")
				&&dbUser.getUserAdmin().equals("01")){
			session.setAttribute("admin", dbUser);
			model.setViewName("adminMainPage");
			List userList = this.userService.getAllUser();
			session.setAttribute("userList", userList);
			return model;
		}
		else{
			model.addObject("msg","login default chack your info and try again");
			model.setViewName("adminLogin");
			return model;
		}
	}
	
	@RequestMapping("/activeUser")
	public ModelAndView userActive(HttpServletRequest request,HttpSession session){ 
		User user = new User();
		user.setUserId(request.getParameter("userId"));
		user.setUserActive(request.getParameter("userActive"));
		this.userService.userActive(user);
		ModelAndView model = new ModelAndView();
		model.setViewName("adminMainPage");
		List userList = this.userService.getAllUser();
		session.setAttribute("userList", userList);
		return model;
		
	}
	
	@RequestMapping("/addUser")
	public String addUser(HttpSession session,User user){
		this.userService.addUser(user);
		
		session.setAttribute("userList", this.userService.getAllUser());
		return "adminMainPage";
		
	}
	
	@RequestMapping("/userLogin")
	public String userLogin(HttpSession session,User user,Model model){
		User dbUser = this.userService.getUserByName(user.getUserName());
		if(null!=dbUser&&user.getUserPassword().equals(dbUser.getUserPassword())
				&&dbUser.getUserActive().equals("01")
				&&dbUser.getUserAdmin().equals("00")){
			session.setAttribute("currentUser", dbUser);
			return "redirect:/folder/getFolderForTree";
		}
		else{
			model.addAttribute("msg","login default chack your info and try again");
			return "userLogin";
		}
	}
	
	 
	 
	
	 
}