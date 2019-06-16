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
		//��sessoon�л�ȡ����
		User user = (User) request.getSession().getAttribute("user");
		String message = "";
		if(!user.getPassword().equals(oldPassword)) {
			message = "ԭ�������";
			model.addAttribute("message",message);
			return "zap/changePassword";
		}else {
			//�޸����ݿ������
			//�޸�User������
			userService.changePassword(newPassword,user.getAccount());
			message = "�޸ĳɹ�";
			
			//�޸�propertyAdmin������
			propertyAdmin.changePassword(newPassword, user.getAccount());
			//��session���Ƴ�����
			request.getSession().removeAttribute("user");
			return "redirect:/login";
		}
		
	}
}
