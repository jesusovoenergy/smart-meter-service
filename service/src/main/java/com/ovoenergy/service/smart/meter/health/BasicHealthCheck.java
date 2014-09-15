package com.ovoenergy.service.smart.meter.health;

import com.yammer.metrics.core.HealthCheck;
import org.springframework.stereotype.Component;

@Component
public class BasicHealthCheck extends HealthCheck {

    public BasicHealthCheck() {
        super("application-health");
    }

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
