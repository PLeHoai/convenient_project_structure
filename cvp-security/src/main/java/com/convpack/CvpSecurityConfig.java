package com.convpack;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AuthorizeHttpRequestsConfigurer;
import org.springframework.security.config.annotation.web.configurers.SessionManagementConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class CvpSecurityConfig
{

    @Bean
    @ConditionalOnProperty(
            prefix = "cvp-security",
            name = "enabled",
            matchIfMissing = false
    )
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception
    {
        http
                .authorizeHttpRequests(this::authorizeCustomizer)
                .sessionManagement(this::sessionCustimizer)
                .csrf()
                .cors();

        return http.build();
    }

    private void authorizeCustomizer(AuthorizeHttpRequestsConfigurer<HttpSecurity>.AuthorizationManagerRequestMatcherRegistry aac)
    {
        aac.requestMatchers(
                "/v3/api-docs/**",
                "/swagger-ui/**",
                "/swagger-ui.html",
                "/actuator/health",
                "/actuator/prometheus",
                "/otlp/**"
        )
                .permitAll()
                .requestMatchers("/api/**")
                .authenticated()
                .anyRequest()
                .authenticated();
    }

    private void sessionCustimizer(SessionManagementConfigurer<HttpSecurity> ssc)
    {
        ssc.disable();
    }
}
