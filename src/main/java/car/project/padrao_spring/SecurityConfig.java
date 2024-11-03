// package car.project.padrao_spring;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import static org.springframework.security.config.Customizer.withDefaults;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.web.SecurityFilterChain;

// @Configuration
// @EnableWebSecurity
// public class SecurityConfig {

//     @SuppressWarnings("deprecation")
//     @Bean
//     public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//         http
//                 .csrf(csrf -> csrf.disable()) 
//                 .authorizeRequests(requests -> {
//             try {
//                 requests
//                         .requestMatchers("/api/cars/**").permitAll()
//                         .anyRequest().authenticated() 
//                         .and()
//                         .httpBasic(withDefaults());
//             } catch (Exception ex) {
//             }
//         }); // Habilita autenticação básica, caso necessário

//         return http.build();
//     }
// }
