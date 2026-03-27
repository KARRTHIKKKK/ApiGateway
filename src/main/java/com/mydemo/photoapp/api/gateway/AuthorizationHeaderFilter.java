package com.mydemo.photoapp.api.gateway;

import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Component;

@Component
public class AuthorizationHeaderFilter extends AbstractGatewayFilterFactory<AuthorizationHeaderFilter>
{
    public static class Config
    {
    }

    @Override
    public GatewayFilter apply(AuthorizationHeaderFilter config) {
        return null;
    }
}
