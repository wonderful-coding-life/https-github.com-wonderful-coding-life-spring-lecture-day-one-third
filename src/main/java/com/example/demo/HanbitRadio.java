package com.example.demo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class HanbitRadio implements HanbitAppliance {
    public void powerOn() {
        System.out.println("Radio is turned on");
    }
    public void powerOff() {
        System.out.println("Radio is turned off");
    }
}
