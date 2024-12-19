package com.ahmetyagiz.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ahmetyagiz.config.AppConfig;
import com.ahmetyagiz.model.User;
import com.ahmetyagiz.services.LoginService;
import com.ahmetyagiz.services.UserService;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		UserService userService = context.getBean(UserService.class);
		
		for (User user : userService.getUserList()) {
			System.out.println(user);
		}
		
		LoginService loginService = new LoginService();
		loginService.login();
	}

}
