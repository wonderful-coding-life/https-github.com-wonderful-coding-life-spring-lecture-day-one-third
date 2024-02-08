package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class HanbitTelevision implements HanbitAppliance {
    public void powerOn() {
        System.out.println("Television is turned on");
    }
    public void powerOff() {
        System.out.println("Television is turned off");
    }
}
