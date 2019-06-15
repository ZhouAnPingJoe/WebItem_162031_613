package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class QueryBillController {

	@RequestMapping("/queryBill")
	public String toQueryBill(Model model) {
		return "zap/queryBill";
	}
}
