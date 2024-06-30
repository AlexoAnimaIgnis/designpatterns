package com.alexo.designpatterns.creational.factorymethod.ex02.dialog;

import com.alexo.designpatterns.creational.factorymethod.ex02.button.Button;
import com.alexo.designpatterns.creational.factorymethod.ex02.button.WindowsButton;

public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
