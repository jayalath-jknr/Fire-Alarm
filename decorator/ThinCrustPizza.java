package com.company.decorator;

public class ThinCrustPizza extends Pizza {

    ThinCrustPizza(){

        this.description= "Thin crust Pizza";

    }

    @Override
    public double getCost() {
        return 1200;
    }
}
