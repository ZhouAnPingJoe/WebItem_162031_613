package webadv3.WebItem.zap.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import webadv3.WebItem.entity.Propertyadmin;
import webadv3.WebItem.entity.User;
import webadv3.WebItem.zap.service.IPropertyAdminService;

@Controller
public class ChangeInfoController {

	@Autowired 
	private HttpServletRequest request ;
	
	@Autowired
	private IPropertyAdminService propertyAdmin;
	
	@RequestMapping("/changeInfo")
	public ModelAndView toChangeInfo() {
		//获取session
		User user = (User) request.getSession().getAttribute("user");
		//获取物业管理员的基本资料
		
		Propertyadmin  propertyadmin= propertyAdmin.getPropertyAdminInfo(user);
		return new ModelAndView("zap/changeInfo").addObject(propertyadmin);
	}
	@PostMapping("/changeInfo")
	public ModelAndView changeInfo( Propertyadmin propertyadmin,Model model) {
		ModelAndView mv = new ModelAndView();
		/*
		 * 在使用 jpa 的save更新数据时，更新全部字段时会正常实现，可是在只更新部分字段时，会发现没有更新的字段被置为null；
		 */
		User user = (User) request.getSession().getAttribute("user");
		//添加未更新的字段信息
		propertyadmin.setPassword(user.getPassword());
		propertyadmin.setType(user.getType());
		propertyAdmin.changePropertyAdminInfo(propertyadmin);
		
		String message = "修改成功";
		model.addAttribute("message",message);
		mv.addObject(model);
		mv.addObject(propertyadmin);
		mv.setViewName("zap/changeInfo");
		return mv;
		
	}
}
