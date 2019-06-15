package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class OwnerServiceController {

	@RequestMapping("/ownerService")
	public String toOwnerService(Model model) {
		return "zap/ownerService";
	}
}
