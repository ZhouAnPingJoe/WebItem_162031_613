package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FeeCollectionController {

	@RequestMapping("/feeCollection")
	public String toFeeCollection(Model model) {
		return "zap/feeCollection";
	}
}
