package irynabai.springboot2.Controllers;


import irynabai.springboot2.Dao.UserDAO;
import irynabai.springboot2.Models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
@Autowired
private UserDAO userDAO;
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("msg","all work");
        System.out.println("all ok");
        return "indexx.html";
    }

    @PostMapping("/save")
    public String save(@RequestParam String username,Model model){
        System.out.println(username);
        User user = new User();
        user.setName(username);

        return "result.html";
    }

}
