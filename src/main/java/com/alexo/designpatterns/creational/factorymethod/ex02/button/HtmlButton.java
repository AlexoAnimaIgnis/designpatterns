package com.alexo.designpatterns.creational.factorymethod.ex02.button;

/**
 * this is the concrete product
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button> Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Hello World! HtmlButton!");
    }
}
