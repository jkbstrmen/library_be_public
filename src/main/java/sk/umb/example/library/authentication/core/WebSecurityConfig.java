package sk.umb.example.library.authentication.core;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import sk.umb.example.library.authentication.service.AuthenticationService;

import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig {
    private final DemoAuthenticationEntryPoint demoAuthenticationEntryPoint;
    private final AuthenticationService authenticationService;

    public WebSecurityConfig(DemoAuthenticationEntryPoint demoAuthenticationEntryPoint,
                             AuthenticationService authenticationService) {
        this.demoAuthenticationEntryPoint = demoAuthenticationEntryPoint;
        this.authenticationService = authenticationService;
    }


    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable()
                .authorizeHttpRequests(authz -> authz.anyRequest().authenticated())
                .exceptionHandling().authenticationEntryPoint(demoAuthenticationEntryPoint).and()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
                .addFilterBefore(new DemoAuthenticationFilter(authenticationService), UsernamePasswordAuthenticationFilter.class)
                .httpBasic(withDefaults())
                .build();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer() {
        return (web) -> web.ignoring()
                .requestMatchers(HttpMethod.POST, "/api/authentication")
                .requestMatchers(HttpMethod.GET, "/swagger-ui/index.html");
    }

//    @Override
//    public void configure(WebSecurity webSecurity) throws Exception {
//        webSecurity.ignoring().antMatchers(HttpMethod.POST, "/api/authentication");
//    }
//
//    @Override
//    protected void configure(HttpSecurity httpSecurity) throws Exception {
//        httpSecurity.csrf().disable()
//                .authorizeRequests().anyRequest().authenticated().and()
//                .exceptionHandling().authenticationEntryPoint(demoAuthenticationEntryPoint).and()
//                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
//                .addFilterBefore(new DemoAuthenticationFilter(authenticationService), UsernamePasswordAuthenticationFilter.class);
//    }
}
