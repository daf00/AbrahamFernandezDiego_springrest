package com.learningjava.rest.spring.front.seguridad;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
@EnableWebSecurity
@Configuration

public class SeguridadSpring extends WebSecurityConfigurerAdapter {
    @Autowired
    public void configureGlobalSecurity (AuthenticationManagerBuilder au) throws Exception {
        au.inMemoryAuthentication().withUser("admin").password("1234").roles("ADMIN");
        au.inMemoryAuthentication().withUser("user").password("1234").roles("USER");
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http.authorizeRequests()
                .antMatchers("/", "/public/**").permitAll()
                .antMatchers("/rest/api/v1/restaurants").hasRole("ADMIN")
                .antMatchers("/restUse.html").hasRole("ADMIN")
                .and().formLogin()
                .and().httpBasic()
                .and().logout()
                .logoutUrl("/logout")
                .invalidateHttpSession(true)
                .logoutSuccessUrl("/").permitAll();
    }
}
