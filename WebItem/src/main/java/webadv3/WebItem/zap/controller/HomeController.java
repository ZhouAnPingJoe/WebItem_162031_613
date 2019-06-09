package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/index")
	public String toLogin(Model model) {
		return "index";
	}
	@RequestMapping("/adminIndex")
	public String toIndex(Model model) {
		return "zap/adminIndex"; 
	}
	@RequestMapping("/myMessage")
	public String toMyMessage(Model model) {
		return "zap/myMessage";
	}
	@RequestMapping("/mySuggestion")
	public String toMySuggestion(Model model) {
		return "zap/mySuggestion";
	}
	@RequestMapping("/ownerInfo")
	public String toOwnerInfo(Model model) {
		return "zap/ownerInfo";
	}
}
