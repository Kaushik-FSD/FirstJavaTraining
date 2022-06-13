package com.globalpayex.college.entities;

import java.lang.Thread.State;

public class Address {
    private String pin;
    private String Country;
    private String State;
    
    public Address(String pin, String country, String state) {
        this.pin = pin;
        Country = country;
        this.State = state;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String getState() {
        return State;
    }

    public void setState(String State) {
        this.State = State;
    }

    public String getDetailsAddress(){
        return String.format("Country: %s\nState: %s\nPincode: %s", Country, State, pin);
    }
}
