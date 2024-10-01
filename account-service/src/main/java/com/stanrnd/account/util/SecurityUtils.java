package com.stanrnd.account.util;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import reactor.core.publisher.Mono;

public class SecurityUtils {

    public static Mono<Boolean> hasRole(String role) {
        return Mono.deferContextual(context -> {
            Authentication authentication = context.get(Authentication.class);
            if (authentication == null) {
                return Mono.just(false);
            }
            return Mono.just(authentication.getAuthorities().stream()
                    .map(GrantedAuthority::getAuthority)
                    .anyMatch(grantedAuthority -> grantedAuthority.equals("ROLE_" + role)));
        });
    }

}
