package config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        CorsConfiguration corsConfig = new CorsConfiguration();
        corsConfig.addAllowedOrigin("*"); // Permitir qualquer origem (isso deve ser ajustado para produção)
        corsConfig.addAllowedMethod("*"); // Permitir qualquer método (GET, POST, etc.)
        corsConfig.addAllowedHeader("*"); // Permitir qualquer cabeçalho
        corsConfig.setAllowCredentials(true); // Permitir credenciais (cookies, autenticação, etc.)

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", corsConfig);

        return new CorsFilter(source);
    }
}