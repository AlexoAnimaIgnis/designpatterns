package com.alexo.designpatterns.creational.factorymethod.ex02.dialog;

import com.alexo.designpatterns.creational.factorymethod.ex02.button.Button;

/**
 * creator class declares the factory method that returns the new product objects.
 *
 * its important that the return type of this method matches the product interface.
 */
public abstract class Dialog {

    /**
     * factory method should be declared as abstract to force all subclasses to implement
     * their own versions of the method.
     */
    public abstract Button createButton();

    public void render(){
        Button button = createButton();
        button.render();
    }
}
