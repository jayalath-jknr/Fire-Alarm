package com.company.decorator;

public class Main {
    public static void main(String[] args) {
        Pizza pizza=new ThinCrustPizza();
        Pizza bbqChickenPizza = new BBQChicken(pizza);
        Pizza bbqChickenWithExtraCheese = new ExtraCheese(bbqChickenPizza);

        System.out.println("Cost of bbq wth Extra cheese :" + bbqChickenWithExtraCheese.getCost());

        Pizza pizza1 = new PanPizza();
        Pizza thandooriChickenPizza = new ThandooriChicken(pizza1);
        Pizza thandooriChikenWithExtraCheese = new ExtraCheese(thandooriChickenPizza);
        System.out.println("Cost of Thandoori chicken Pizza wth Extra cheese :" + thandooriChikenWithExtraCheese.getCost());
//        double cost = pizza.getCost();
//
//        System.out.println(pizza.description+";"+cost);

        //pizza -> thin crust -> BBQ chicken -> extra cheese
        //pizza -> pan pizza -> mutton-> Tandoori chicken

        //....
    }
}
