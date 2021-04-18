package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import java.util.List;

public class P1Ej14 {

    @Test
    public void netflixTest (){

        //Inicializando el driver
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.netflix.com/uy/");

        //Listando los elementos del tipo H1
        List<WebElement> listaH1= driver.findElements(By.tagName("h1"));
        for (WebElement elementosH1:listaH1) {
            System.out.println("H1 element: ");
            System.out.println(elementosH1.getText());
        }

        //Listando los elementos del tipo H2
        List<WebElement> listaH2= driver.findElements(By.tagName("h2"));
        for (WebElement elementosH2:listaH2) {
            System.out.println("H2 element: ");
            System.out.println(elementosH2.getText());
        }

        driver.navigate().refresh(); // Refreshing page

        //Listando los elementos del tipo button
        List<WebElement> listaBotones= driver.findElements(By.tagName("button"));
        for (WebElement botones:listaBotones) {
            System.out.println("Button name: ");
            System.out.println(botones.getText());
        }

        //Mostrando la cantidad de elementos del tipo div
        List<WebElement> elementosDiv = driver.findElements(By.tagName("div"));
        System.out.println("Amount of div elements: ");
        System.out.println(elementosDiv.size());

        //Obteniendo y mostrando el titulo de la pagina
        System.out.println("Website title: ");
        System.out.println(driver.getTitle());


        //Mostrando la cantidad de elementos del tipo link
        List<WebElement> elementosLink = driver.findElements(By.linkText(""));
        System.out.println("Amount of link elements: ");
        System.out.println(elementosLink.size());

        driver.close(); // Closing browser
        }
    }