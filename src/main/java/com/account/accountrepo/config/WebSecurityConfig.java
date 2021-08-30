package com.account.accountrepo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
/*
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.authorizeRequests()
                .antMatchers("/admin").hasAuthority("ADMIN_ROLE")
                .antMatchers("/users").hasAnyAuthority("ADMIN_ROLE","USERS_ROLE")
                .and()
                .formLogin()
                .and()
                .httpBasic();
    }
}*/
