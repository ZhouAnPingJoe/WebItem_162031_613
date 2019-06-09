package webadv3.WebItem.zzj.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
 

@Controller
public class LoginController {

    @GetMapping("/")
    public String login() {
        return "login";
    }
    
    @GetMapping("/ownerIndex.html")
    public String ownerIndex() {
        return "ownerIndex";
    }
    
    @GetMapping("/maintainHouse.html")
    public String maintainHouse() {
        return "maintainHouse";
    }
    
    @GetMapping("/decorateHouse.html")
    public String decorateHouse() {
        return "decorateHouse";
    }
    
    @GetMapping("/businessMember.html")
    public String businessMember() {
        return "businessMember";
    }
    
    @GetMapping("/applyService.html")
    public String applyService() {
        return "applyService";
    }
    
    @GetMapping("/complainAdvice.html")
    public String complainAdvice() {
        return "complainAdvice";
    }
    
    @GetMapping("/findWaterCost.html")
    public String findWaterCost() {
        return "findWaterCost";
    }
    
    @GetMapping("/findElectricCost.html")
    public String findElectricCost() {
        return "findElectricCost";
    }
    
    @GetMapping("/findPropertyCost.html")
    public String findPropertyCost() {
        return "findPropertyCost";
    }
    
    @GetMapping("/findPollutionCost.html")
    public String findPollutionCost() {
        return "findPollutionCost";
    }
    
    @GetMapping("/changePassword.html")
    public String changePassword() {
        return "changePassword";
    }
    
    @GetMapping("/changeData.html")
    public String changeData() {
        return "changeData";
    } 
    
    @GetMapping("/pay.html")
    public String pay() {
        return "pay";
    }
    
    @GetMapping("/login.html")
    public String login2() {
        return "login";
    }
}