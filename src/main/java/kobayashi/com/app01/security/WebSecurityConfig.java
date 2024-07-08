package kobayashi.com.app01.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import kobayashi.com.app01.constant.Url;

@EnableWebSecurity
@Configuration
public class WebSecurityConfig {
    
    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http
            .authorizeHttpRequests(
                authorize -> authorize.requestMatchers(Url.NO_AUTHENTICATION).permitAll()
                    .anyRequest().authenticated())
            .formLogin(
                login -> login.loginPage(Url.SIGNIN_URL)
                    .defaultSuccessUrl(Url.PRIVATE_URL));
        
        return http.build();
    }
}