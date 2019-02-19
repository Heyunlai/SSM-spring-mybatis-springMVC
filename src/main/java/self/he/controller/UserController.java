package self.he.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import self.he.pojo.User;
import self.he.service.UserService;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/user")
public class UserController {

    //注入UserService
    @Autowired
    private UserService userService;

    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        //(数据库检查)
        System.out.println(user.getName());
        user = userService.get(user);
        System.out.println("hh哈哈哈");


        if(user != null){

            System.out.println("....login...........");
            session.setAttribute("SESSION_USER",user);
            return "user";
        }else {
            return "redirect:/login.jsp";
        }
    }

    @RequestMapping("/delete")
    public String delete(){
        System.out.println("....可以为所欲为了delete...........");
        return "user";
    }
}
