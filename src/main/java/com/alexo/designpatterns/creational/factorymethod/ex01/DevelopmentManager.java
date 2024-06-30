package com.alexo.designpatterns.creational.factorymethod.ex01;

public class DevelopmentManager extends HiringManager{
    @Override
    Interviewer makeInterviewer() {
        return new Developer();
    }
}
