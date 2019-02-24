package com.tripeasy.web.TripEasy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication

//@EnableOAuth2Sso
public class TripEasyApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(TripEasyApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(TripEasyApplication.class);
	}

	@Bean
	public BCryptPasswordEncoder passwordEncoder() {
		BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();
		return bCryptPasswordEncoder;
	}

//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.logout()
//	    .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//	    .logoutSuccessUrl("/")
//	    .deleteCookies("JSESSIONID")
//	    .invalidateHttpSession(true);
//	}
}
