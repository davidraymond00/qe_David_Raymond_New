package com.example.app.pages;

import io.appium.java_client.android.AndroidElement;
import org.openqa.selenium.By;

import static com.example.app.drivers.AndroidDriverInit.driver;

public class CalculatorPage {

    private By calculatorHeader = By.xpath("//android.view.View[@content-desc='Calculator']");
    private By inputNumber = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[3]/android.view.View");
    private By a = By.xpath("//android.view.View[@content-desc=\"3\"]");
    private By b = By.xpath("//android.view.View[@content-desc=\"4\"]");
    private By add = By.xpath("//android.view.View[@content-desc=\" + \"]");
    private By total = By.xpath("(//android.view.View[@content-desc=\"7\"])[1]");

    public void calculatorHeaderDisplayed(){
        AndroidElement headerElm = driver.findElement(calculatorHeader);
        headerElm.isDisplayed();
    }
    public void inputNumber(){
        AndroidElement inputnumber = driver.findElement(inputNumber);
        inputnumber.click();
    }
    public void a(){
        AndroidElement A = driver.findElement(a);
        A.click();
    }
    public void b(){
        AndroidElement B = driver.findElement(b);
        B.click();
    }
    public void add(){
        AndroidElement Add = driver.findElement(add);
        Add.click();
    }
    public void total(){
        AndroidElement Total = driver.findElement(total);
        Total.click();
    }
}
