package com.ovoenergy.service.smart;

import com.ovoenergy.dropwizard.spring.SpringService;
import com.ovoenergy.service.commons.EnvironmentOverrides;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

import java.util.TimeZone;

public class SmartMeterService extends Service<SmartMeterServiceConfiguration> {

    SpringService springService = new SpringService();

    public static void main(String[] args) throws Exception {
        new SmartMeterService().run(args);
    }

    @Override
    public void initialize(Bootstrap<SmartMeterServiceConfiguration> bootstrap) {
        bootstrap.setName("smart-meter-service");
    }

    @Override
    public void run(SmartMeterServiceConfiguration configuration, Environment environment) throws Exception {
        TimeZone.setDefault(TimeZone.getTimeZone("UTC"));
        new EnvironmentOverrides().overrideErrorHandlingToReturnJson(environment);
        springService.run(configuration, environment);
    }
}
