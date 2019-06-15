package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerInfoController {

	@RequestMapping("/ownerInfo")
	public String toOwnerInfo(Model model) {
		return "zap/ownerInfo";
	}
}
