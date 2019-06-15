package webadv3.WebItem.commonController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import webadv3.WebItem.entity.Propertyadmin;
import webadv3.WebItem.entity.User;
import webadv3.WebItem.zap.service.IPropertyAdminService;
import webadv3.WebItem.zap.service.IUserService;

@SessionAttributes("user")
@Controller
public class HomeController {

	@Autowired
	private IUserService userService;
	
	@Autowired
	private IPropertyAdminService propertyAdmin;
	
	@RequestMapping("/")
	public ModelAndView initLoginForm() {
		User user = new User();
		return new ModelAndView("common/login").addObject(user);
	}
	@RequestMapping("/register")
	public ModelAndView initRegisterForm() {
		User user = new User();
		return new ModelAndView("common/register").addObject(user);
	}
	@PostMapping("/login")
	public String check(@Validated User user, Model model) {
				User validUser = userService.validUser(user);
				if(validUser!=null) {
					if(user.getType().equals("owner")) {
						return "zzj/ownerIndex.html";
					}
					
					else if(user.getType().equals("propertyAdmin")) {
						model.addAttribute("user",user);
						return "zap/adminIndex";
					}
					else if(user.getType().equals("systemAdmin")) {
						return "zxh/managerIndex";
					}		
				}else {
					String message = "�û������������";
					model.addAttribute("message",message);
					return "common/login";
				}
			
			return null;
		}
	@PostMapping("/register")
	public String register(@Validated User user, Model model) {
				User validUser = userService.validUser(user);
				if(validUser!=null) {
					String message = "���˺��Ѿ�ע��";
					model.addAttribute("message",message);
					
				}else {
					//ע���Ϊ�û�
					userService.InsertUser(user);
					//ע���Ϊ����Ա
					Propertyadmin propertyadmin = new Propertyadmin();
					propertyadmin.setAccount(user.getAccount());
					propertyadmin.setPassword(user.getPassword());
					propertyadmin.setType(user.getType());
					
					propertyAdmin.InsertPropertyadmin(propertyadmin);
					
					String message = "ע��ɹ���";
					model.addAttribute("message",message);
				}
				return "common/register";
		}
}
