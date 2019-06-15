package webadv3.WebItem.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

import webadv3.WebItem.entity.User;
//��������û�е�¼ϵͳ�������������ҳ��
public class AuthInterceptor implements HandlerInterceptor{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("user");
		//System.out.println("�������в鿴user���˺ţ�"+user.getAccount());
		if( session.getAttribute("user")==null) {
			response.sendRedirect("/");
			return false;
		}else {
			return true;
		}
			
	}
}
