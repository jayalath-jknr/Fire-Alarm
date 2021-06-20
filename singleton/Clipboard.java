package com.company.singleton;

public class Clipboard {

    private String content;
    //creat constructor
    private static Clipboard clipboard = null;
    private Clipboard(){
        System.out.println("Clipboard object created");

    }

    public static Clipboard getInstance(){
        if(clipboard==null){
           clipboard = new Clipboard() ;
        }
        return clipboard;
    }
    //copy
    public void copy(String text){
        this.content =text;
    }
    //paste
    public void paste(){
        System.out.println(this.content);
    }
}
