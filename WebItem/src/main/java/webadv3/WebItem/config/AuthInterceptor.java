package webadv3.WebItem.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import webadv3.WebItem.entity.User;
//拦截器，没有登录系统不允许访问其他页面
public class AuthInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		//System.out.println("拦截器中查看user的账号："+user.getAccount());
		if( session.getAttribute("user")==null) {
			response.sendRedirect("/");
			return false;
		}else {
			return true;
		}
			
	}
}
