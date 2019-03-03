package com.kostya;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitElement {
    public static boolean isNotDisplayed(By by) {
        WebDriverWait wait = new WebDriverWait(Driver.driver1(), 1);
        wait.ignoring(NoSuchElementException.class);

        try {
            return wait.until(ExpectedConditions.visibilityOfElementLocated(by)) != null;
        } catch (TimeoutException ex) {
            return false;
        }
    }
}
