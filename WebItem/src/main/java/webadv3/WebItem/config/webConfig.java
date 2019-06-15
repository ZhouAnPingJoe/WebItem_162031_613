package webadv3.WebItem.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class webConfig implements WebMvcConfigurer{

	  @Override
	    public void addInterceptors(InterceptorRegistry registry) {
	        InterceptorRegistration registration = registry.addInterceptor(new AuthInterceptor());     
	        registration.addPathPatterns("/**");         //����·����������
	        registration.excludePathPatterns("/","/register","/css/**","/js/**","/vendors/**");       //��Ӳ�����·��

	}
}
