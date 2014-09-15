package com.ovoenergy.service.smart;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.ovoenergy.dropwizard.spring.SpringServiceConfiguration;
import org.springframework.stereotype.Component;

@Component
public class SmartMeterServiceConfiguration extends SpringServiceConfiguration {


    @JsonProperty
    private String smartReadingUrl;

    public String getSmartReadingUrl() {
        return smartReadingUrl;
    }

    public void setSmartReadingUrl(String smartReadingUrl) {
        this.smartReadingUrl = smartReadingUrl;
    }
}
