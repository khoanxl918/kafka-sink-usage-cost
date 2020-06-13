package com.example.kafkasinkusagecost.config;

import com.example.kafkasinkusagecost.model.UsageCostDetail;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;

@Configuration
public class UsageCostLogger {

    public static final Logger logger = LoggerFactory.getLogger(UsageCostLogger.class);

    @Bean
    public Consumer<UsageCostDetail> process() {
        return usageCostDetail -> {
          logger.info(usageCostDetail.toString());
        };
    }
}
