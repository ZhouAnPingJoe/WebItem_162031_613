package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NoticeManageController {

	@RequestMapping("/noticeManage")
	public String toNoticeManage(Model model) {
		return "zap/noticeManage";
	}
	
}
