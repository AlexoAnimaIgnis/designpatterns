package com.alexo.designpatterns.creational.factorymethod.ex01;

public class MarketingManager extends HiringManager{
    @Override
    Interviewer makeInterviewer() {
        return new CommunityExecutive();
    }
}
