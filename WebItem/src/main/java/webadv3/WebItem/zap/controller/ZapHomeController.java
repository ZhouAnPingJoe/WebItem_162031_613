package webadv3.WebItem.zap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ZapHomeController {

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
	@RequestMapping("/ownerComplain")
	public String toOwnerComplain(Model model) {
		return "zap/ownerComplain";
	}
	@RequestMapping("/ownerService")
	public String toOwnerService(Model model) {
		return "zap/ownerService";
	}
	@RequestMapping("/feeCollection")
	public String toFeeCollection(Model model) {
		return "zap/feeCollection";
	}
	@RequestMapping("/queryBill")
	public String toQueryBill(Model model) {
		return "zap/queryBill";
	}
	
	@RequestMapping("/carPartsInfo")
	public String toCarPartsInfo(Model model) {
		return "zap/carPartsInfo";
	}
	
	@RequestMapping("/carPartsSale")
	public String toCarPartsSale(Model model) {
		return "zap/carPartsSale";
	}
	
	@RequestMapping("/carInOrOut")
	public String toCarInOrOut(Model model) {
		return "zap/carInOrOut";
	}
	
	@RequestMapping("/securityManage")
	public String toSecurityManage(Model model) {
		return "zap/securityManage";
	}
	
	@RequestMapping("/dutyManage")
	public String toDutyManage(Model model) {
		return "zap/dutyManage";
	}
	
	@RequestMapping("/noticeManage")
	public String toNoticeManage(Model model) {
		return "zap/noticeManage";
	}
	
	@RequestMapping("/ruleManage")
	public String toRuleManage(Model model) {
		return "zap/ruleManage";
	}
	
	
}
