package tests;

import manager.HelperUser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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
    @Test
    public void CheckBox()

    {////open all check boxes:

        app.getUser().clickOnElements();
        app.getUser().pause(5000);
        app.getUser().clickOnCheckBox();
        app.getUser().pause(5000);
        app.getUser().click(By.xpath("//button[@title='Toggle']//*[name()='svg']"));
        app.getUser().click(By.xpath("(//*[name()='svg'][@class='rct-icon rct-icon-expand-close'])[1]"));
        app.getUser().click(By.xpath("//li[2]//span[1]//button[1]//*[name()='svg']"));
        app.getUser().click(By.xpath("//li[3]//span[1]//button[1]//*[name()='svg']"));
        app.getUser().click(By.xpath("//body//div[@id='app']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[@class='rct-node rct-node-parent rct-node-expanded']//li[1]//span[1]//button[1]//*[name()='svg']"));
        app.getUser().click(By.xpath("//li[@class='rct-node rct-node-parent rct-node-collapsed']//button[@title='Toggle']//*[name()='svg']"));

        //// click all opened check boxes:

        app.getUser().click(By.xpath("//label[@for='tree-node-notes']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().click(By.xpath("//label[@for='tree-node-commands']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().click(By.xpath("//label[@for='tree-node-react']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().click(By.xpath("//label[@for='tree-node-angular']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().click(By.xpath("//label[@for='tree-node-veu']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().click(By.xpath("//label[@for='tree-node-public']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().pause(1000);
        app.getUser().click(By.xpath("//label[@for='tree-node-private']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().pause(1000);
        app.getUser().click(By.xpath("//label[@for='tree-node-classified']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().click(By.xpath("//label[@for='tree-node-general']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().pause(1000);
        app.getUser().click(By.xpath("//label[@for='tree-node-wordFile']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().pause(1000);
        app.getUser().click(By.xpath("//label[@for='tree-node-excelFile']//span[@class='rct-checkbox']//*[name()='svg']"));
        app.getUser().pause(1000);
        app.getUser().click(By.xpath("//label[@for='tree-node-home']//span[@class='rct-checkbox']//*[name()='svg']//*[name()='path' and contains(@d,'M19 3H5c-1')]"));


        WebElement sub = wd.findElement(By.xpath("//div[@id='result']"));
        String SubText = sub.getText();
        Assert.assertNotNull(SubText);
    }
    @Test
    public void radioButton()
    {

        app.getUser().clickOnElements();
        app.getUser().click(By.xpath("(//li[@id='item-2'])[1]"));

        app.getUser().click(By.xpath("(//label[normalize-space()='Yes'])[1]"));
        app.getUser().pause(5000);
        Assert.assertEquals(app.getUser().textElement(By.xpath("//span[@class='text-success' and .='Yes']")),"Yes");

        app.getUser().click(By.xpath("(//label[normalize-space()='Impressive'])[1]"));
        Assert.assertEquals(app.getUser().textElement(By.xpath("//span[@class='text-success' and .='Impressive']")),"Impressive");



    }
    @Test
    public void clicksOnButtons()
    {
        app.getUser().clickOnElements();
        app.getUser().pause(2000);
        wd.findElement(By.xpath("(//li[@id='item-4'])[1]")).click();
        app.getUser().pause(4000);


       WebElement DoubleClick =  wd.findElement(By.cssSelector("#doubleClickBtn"));
        Actions actions = new Actions(wd);
        actions.doubleClick(DoubleClick).perform();


       WebElement RightClick = wd.findElement(By.cssSelector("#rightClickBtn"));
       actions.contextClick(RightClick).perform();


       app.getUser().click(By.cssSelector("#ouKrp"));



    }

}

