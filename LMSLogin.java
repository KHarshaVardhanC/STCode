package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LMSLogin {
    public static void main(String[] args) {
        WebDriver driver;
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();


        driver.get("https://lms.kluniversity.in/login/index.php");

        driver.findElement(By.name("username")).sendKeys("2100030247");
        driver.findElement(By.name("password")).sendKeys("Vardhan1234@");

        driver.findElement(By.id("loginbtn")).click();
    }
}

