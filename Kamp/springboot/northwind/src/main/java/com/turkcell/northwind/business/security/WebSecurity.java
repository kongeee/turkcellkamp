package com.turkcell.northwind.business.security;

import javax.servlet.http.HttpServletResponse;

import com.turkcell.northwind.business.abstracts.UserService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import io.swagger.v3.oas.models.PathItem.HttpMethod;

@Configuration
@EnableWebSecurity
public class WebSecurity extends WebSecurityConfigurerAdapter {
    private UserService userService;
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public WebSecurity(UserService userService, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userService = userService;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {

        http.csrf().disable(); // belirlenen uygulamanin disindakileri actik

        http.authorizeRequests()
                // Our public endpoints
                .antMatchers("/api/public/**").permitAll()
                .anyRequest().authenticated();

        http.addFilter(getAuthenticationFilter());

        /*
         * // Enable CORS and disable CSRF
         * http = http.cors().and().csrf().disable();
         * 
         * // Set session management to stateless
         * http = http
         * .sessionManagement()
         * .sessionCreationPolicy(SessionCreationPolicy.STATELESS)
         * .and();
         * 
         * // Set unauthorized requests exception handler
         * http = http
         * .exceptionHandling()
         * .authenticationEntryPoint(
         * (request, response, ex) -> {
         * response.sendError(
         * HttpServletResponse.SC_UNAUTHORIZED,
         * ex.getMessage()
         * );
         * }
         * )
         * .and();
         * 
         * // Set permissions on endpoints
         * http.authorizeRequests()
         * // Our public endpoints
         * .antMatchers("/api/**").permitAll()
         * .anyRequest().authenticated();
         */

    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(this.userService).passwordEncoder(this.bCryptPasswordEncoder);
    }

    private AuthenticationFilter getAuthenticationFilter() throws Exception {
        AuthenticationFilter authenticationFilter = new AuthenticationFilter(authenticationManager(), userService);
        authenticationFilter.setFilterProcessesUrl("/login");
        return authenticationFilter;
    }

    
}
