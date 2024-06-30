package com.alexo.designpatterns.creational.factorymethod.ex02;

import com.alexo.designpatterns.creational.factorymethod.ex02.dialog.Dialog;
import com.alexo.designpatterns.creational.factorymethod.ex02.dialog.HtmlDialog;
import com.alexo.designpatterns.creational.factorymethod.ex02.dialog.WindowsDialog;

public class Main {

    public static void main(String[] args) {
       Dialog windowsDialog = new WindowsDialog();
       windowsDialog.render();

       Dialog htmlDialog = new HtmlDialog();
       htmlDialog.render();
    }
}
