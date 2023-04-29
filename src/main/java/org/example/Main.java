package org.example;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static aquality.selenium.browser.AqualityServices.getElementFactory;

public class Main {

    @Test
    public void test1() throws InterruptedException {
        while (true) {
            AqualityServices.getBrowser().goTo("https://championsleague.cev.eu/en/women/mvp-of-4th-round/?fbclid=IwAR3cEonOXD7OxyP1YkphkzSj0FO8RohYk-cOEbimNXi3TiDTRRXHaoYithQ");
            AqualityServices.getBrowser().maximize();
            AqualityServices.getBrowser().waitForPageToLoad();

            final IButton test = getElementFactory()
                    .getButton(By.xpath("/html/body/div[2]/div/a[1]"),
                            "tastingsButtonPressed");

            test.click();


            final IButton tastingsButtonPressed = getElementFactory()
                    .getButton(By.xpath("//button[text() = 'Ann Kalandadze']"),
                            "tastingsButtonPressed");


            tastingsButtonPressed.click();


            if (AqualityServices.isBrowserStarted()) {
                AqualityServices.getBrowser().quit();
            }
        }
    }
}