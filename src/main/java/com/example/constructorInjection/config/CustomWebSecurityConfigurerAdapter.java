/*
 * package com.example.constructorInjection.config; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * import org.springframework.security.config.annotation.web.configuration.
 * EnableWebSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; import
 * org.springframework.security.crypto.password.PasswordEncoder; import
 * org.springframework.security.web.authentication.www.
 * BasicAuthenticationFilter;
 * 
 * @Configuration
 * 
 * @EnableWebSecurity public class CustomWebSecurityConfigurerAdapter extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.authorizeRequests() .antMatchers("/private/**") .authenticated()
 * .antMatchers("/public/**") .permitAll() .and() .httpBasic(); }
 * 
 * @Autowired public void configureGlobal(AuthenticationManagerBuilder auth)
 * throws Exception { auth.inMemoryAuthentication() .withUser("admin")
 * .password("{noop}password") .roles("USER"); } }
 */