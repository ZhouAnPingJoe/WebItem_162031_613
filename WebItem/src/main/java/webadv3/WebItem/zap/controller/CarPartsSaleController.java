package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarPartsSaleController {

	@RequestMapping("/carPartsSale")
	public String toCarPartsSale(Model model) {
		return "zap/carPartsSale";
	}
}
