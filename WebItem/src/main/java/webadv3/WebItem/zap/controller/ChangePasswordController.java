package webadv3.WebItem.zap.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import webadv3.WebItem.entity.User;
import webadv3.WebItem.zap.service.IPropertyAdminService;
import webadv3.WebItem.zap.service.IUserService;

@Controller
public class ChangePasswordController {

	@Autowired
	private HttpServletRequest request;
	@Autowired
	private IUserService userService;
	@Autowired
	private IPropertyAdminService propertyAdmin;
	@RequestMapping("/changePassword")
	public String toChangePassword(Model model) {
		return "zap/changePassword";
	}
	@PostMapping("/changePassword")
	public String changePassword(Model model,@RequestParam("oldPassword")String oldPassword,@RequestParam("newPassword")String newPassword) {
		//从sessoon中获取对象
		User user = (User) request.getSession().getAttribute("user");
		String message = "";
		if(!user.getPassword().equals(oldPassword)) {
			message = "原密码错误！";
			model.addAttribute("message",message);
			return "zap/changePassword";
		}else {
			//修改数据库的密码
			//修改User的密码
			userService.changePassword(newPassword,user.getAccount());
			message = "修改成功";
			
			//修改propertyAdmin的密码
			propertyAdmin.changePassword(newPassword, user.getAccount());
			//从session中移除数据
			request.getSession().removeAttribute("user");
			return "redirect:/login";
		}
		
	}
}
