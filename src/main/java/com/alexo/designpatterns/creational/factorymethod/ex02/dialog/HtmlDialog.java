package com.alexo.designpatterns.creational.factorymethod.ex02.dialog;

import com.alexo.designpatterns.creational.factorymethod.ex02.button.Button;
import com.alexo.designpatterns.creational.factorymethod.ex02.button.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
