package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DutyManageController {

	@RequestMapping("/dutyManage")
	public String toDutyManage(Model model) {
		return "zap/dutyManage";
	}
}
