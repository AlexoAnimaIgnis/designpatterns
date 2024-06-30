package com.alexo.designpatterns.creational.factorymethod.ex01;

public class CommunityExecutive implements Interviewer{
    @Override
    public void askQuestions() {
        System.out.println("Ask about community building");
    }
}
