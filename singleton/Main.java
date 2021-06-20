package com.company.singleton;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Hello world");
        Clipboard clipboard1 = Clipboard.getInstance();
        Clipboard clipboard2 = Clipboard.getInstance();

        clipboard1.copy("abc");
        clipboard1.paste();//
        clipboard1.paste();//abc
        clipboard2.copy("xyz");
        clipboard1.paste();//abc
        clipboard2.paste();//xyz
        clipboard1.copy("pqr");
        clipboard2.paste();//xyz

        Clipboard clipboard3 = Clipboard.getInstance();
        clipboard3.paste();
    }
}
