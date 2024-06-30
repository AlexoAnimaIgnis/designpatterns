package com.alexo.designpatterns.creational.factorymethod.ex01;

public class Developer implements Interviewer {
    @Override
    public void askQuestions() {
        System.out.println("Ask about design patterns");
    }
}
