package com.abenezer.personalfinancetrackerjmsconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class PersonalFinanceTrackerJmsConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PersonalFinanceTrackerJmsConsumerApplication.class, args);
    }

}
