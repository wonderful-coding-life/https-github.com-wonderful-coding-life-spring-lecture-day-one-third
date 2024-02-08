package com.example.demo;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class HanbitTester {
    @Autowired
    private HanbitAppliance appliance;

    public void setAppliance(HanbitAppliance appliance) {
        this.appliance = appliance;
    }

    @PostConstruct
    public void test() {
        for (int i = 0; i < 5; i++) {
            appliance.powerOn();
            appliance.powerOff();
        }
    }
}
