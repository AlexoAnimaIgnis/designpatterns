package com.alexo.designpatterns.creational.factorymethod.ex01;

abstract class HiringManager {
    abstract Interviewer makeInterviewer();

    public void takeInterview(){
        Interviewer interviewer = makeInterviewer();
        interviewer.askQuestions();
    }
}
