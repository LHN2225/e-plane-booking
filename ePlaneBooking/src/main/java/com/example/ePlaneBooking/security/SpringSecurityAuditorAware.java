//package com.example.ePlaneBooking.security;
//
//import org.springframework.data.domain.AuditorAware;
//
//import java.util.UUID;
//
//public class SpringSecurityAuditorAware implements AuditorAware<UUID> {
//    @Bean
//    public AuditorAware<UUID> auditorAware() {
//        return new SpringSecurityAuditorAware();
//    }
//
//    @Override
//    public Optional<UUID> getCurrentAuditor() {
//        User user = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//        return Optional.of(UUID.fromString(user.getUsername()));
//    }
//}
