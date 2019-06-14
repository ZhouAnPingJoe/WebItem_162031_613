package webadv3.WebItem.commonController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import webadv3.WebItem.entity.User;

@Controller
public class HomeController {

	@RequestMapping("/")
	public ModelAndView initForm() {
		User user = new User();
		return new ModelAndView("common/login").addObject(user);
	}
	@PostMapping("/login")
	public String check(@Validated User user, BindingResult bindingResult, Model model) {
		System.out.println("获取id:"+user.getAccount());
		System.out.println("获取password:"+user.getPassword());
		System.out.println("获取身份信息为:"+user.getType());
			if (bindingResult.hasFieldErrors()) {
				model.addAttribute(user);
				return "login";
			}else if(user.getType().equals("owner")){
				return "zzj/ownerIndex.html";
			}else if(user.getType().equals("propertyAdmin")) {
				return "zap/adminIndex";
			}else if(user.getType().equals("systemAdmin")) {
				return "zxh/managerIndex";
			}
				
			return null;
		}
}
