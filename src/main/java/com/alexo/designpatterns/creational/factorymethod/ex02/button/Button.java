package com.alexo.designpatterns.creational.factorymethod.ex02.button;

/**
 * this is the product of the factory method
 *
 * Product declares the interface common to all objects that can be produced by the creator
 * and its subclasses
 */
public interface Button {
    void render();
    void onClick();
}
