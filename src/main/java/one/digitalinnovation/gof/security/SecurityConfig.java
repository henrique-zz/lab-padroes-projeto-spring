package one.digitalinnovation.gof.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .csrf().disable()  // Desative CSRF para simplificar os testes, habilite em produção.
                .authorizeRequests()
                .antMatchers("/clientes/**").hasRole("USERS")  // Permite acesso apenas para o papel USERS
                .anyRequest().authenticated()
                .and()
                .httpBasic();  // Use autenticação HTTP Basic para simplificação
    }
}