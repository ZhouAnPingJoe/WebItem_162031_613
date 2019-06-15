package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerComplainController {

	@RequestMapping("/ownerComplain")
	public String toOwnerComplain(Model model) {
		return "zap/ownerComplain";
	}
}
