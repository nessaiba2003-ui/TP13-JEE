package ma.ens.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                // Stratégie d'accès : on laisse passer les ressources statiques et l'accueil
                // pour garantir une première expérience utilisateur fluide sans login immédiat.
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/", "/login**", "/css/**").permitAll()
                        .anyRequest().authenticated()
                )
                // Intégration du flux OAuth2 : l'authentification est déléguée au fournisseur
                // externe (Google). On redirige vers /profile après un succès pour charger
                // les données utilisateur récupérées.

                .oauth2Login(oauth2 -> oauth2
                        .loginPage("/login")
                        .defaultSuccessUrl("/profile", true)
                )
                .logout(logout -> logout
                        .logoutSuccessUrl("/")
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .deleteCookies("JSESSIONID")
                );
        return http.build();
    }
}