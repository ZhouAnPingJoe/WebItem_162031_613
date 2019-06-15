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
		//��ȡsession
		User user = (User) request.getSession().getAttribute("user");
		//��ȡ��ҵ����Ա�Ļ�������
		
		Propertyadmin  propertyadmin= propertyAdmin.getPropertyAdminInfo(user);
		return new ModelAndView("zap/changeInfo").addObject(propertyadmin);
	}
	@PostMapping("/changeInfo")
	public ModelAndView changeInfo( Propertyadmin propertyadmin,Model model) {
		ModelAndView mv = new ModelAndView();
		/*
		 * ��ʹ�� jpa ��save��������ʱ������ȫ���ֶ�ʱ������ʵ�֣�������ֻ���²����ֶ�ʱ���ᷢ��û�и��µ��ֶα���Ϊnull��
		 */
		User user = (User) request.getSession().getAttribute("user");
		//���δ���µ��ֶ���Ϣ
		propertyadmin.setPassword(user.getPassword());
		propertyadmin.setType(user.getType());
		propertyAdmin.changePropertyAdminInfo(propertyadmin);
		
		String message = "�޸ĳɹ�";
		model.addAttribute("message",message);
		mv.addObject(model);
		mv.addObject(propertyadmin);
		mv.setViewName("zap/changeInfo");
		return mv;
		
	}
}
