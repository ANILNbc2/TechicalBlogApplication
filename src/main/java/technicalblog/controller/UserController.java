package technicalblog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import technicalblog.Service.PostService;
import technicalblog.model.User;

@Controller
public class UserController {

    @Autowired
    PostService postService;

    @RequestMapping("users/login")
    public String login(){

        return "users/login";
    }

    @RequestMapping("users/registration")
    public String logout(){
        return "users/registration";
    }

    @RequestMapping(value="users/login", method=RequestMethod.POST)
    public String loginUser(User user){
        System.out.println(user.getUsername());
        System.out.println(user.getPassword());
        return "redirect:/posts";
    }

    @RequestMapping(value = "users/logout", method=RequestMethod.POST)
    public String logoutUser(Model model){
        model.addAttribute("posts", postService.getAllPosts());
        return "redirect:/";
    }

}
