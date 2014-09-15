package com.ovoenergy.service.smart;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

public final class SmartMeterServiceConstants {

    public static final String STRING_FORMATTER =  "yyyyMMddHHmmss";

    public static final DateTimeFormatter FORMATTER = DateTimeFormat.forPattern(STRING_FORMATTER);

    public static final String ELECTRICITY_CONSUMPTION = "historicalElectricityConsumptionService";

    public static final String GAS_CONSUMPTION = "historicalGasConsumptionService";

    public static final String ELECTRICITY_PRICE = "historicalElectricityPriceService";

    public static final String GAS_PRICE = "historicalGasPriceService";

    private SmartMeterServiceConstants() {
        // restrict instantiation
    }
}
