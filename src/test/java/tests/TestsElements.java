package tests;

import manager.HelperUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestsElements extends TestBase {

    WebDriver wd;

    @Test

    public void FillForm() {
        String FullName = "Evgeny Piyanzin";
        String Email = "Pivivar555@yandex.ru";
        String CurAddress = "Ashkelon, Ben-Gurion 5";
        String PerAddress = "Gaza , Hamas";

        app.getUser().clickOnElements();

        app.getUser().OpenTextBox();
        app.getUser().pause(15);
        app.getUser().fillForm(" Evgeny Piyanzin", " Pivivar555@yandex.ru",
                " Ashkelon, Ben-Gurion 5", " Gaza , Hamas");
        app.getUser().pause(12000);
        app.getUser().clickSubmit();

        Assert.assertEquals(app.getUser().textElement(By.cssSelector("p#name.mb-1")),"Name: Evgeny Piyanzin");
        Assert.assertEquals(app.getUser().textElement(By.cssSelector("p#email.mb-1")),"Email:Pivivar555@yandex.ru");
        Assert.assertEquals(app.getUser().textElement(By.cssSelector("p#currentAddress.mb-1")),"Current Address : Ashkelon, Ben-Gurion 5");
        Assert.assertEquals(app.getUser().textElement(By.cssSelector("p#permanentAddress.mb-1")),"Permananet Address : Gaza , Hamas");







    }
}

