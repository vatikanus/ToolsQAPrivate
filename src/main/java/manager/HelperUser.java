package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {
        super(wd);
    }
    public void clickOnElements()
    {
        click(By.xpath("(//div)[13]"));
        wd.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void OpenTextBox()
    {
        click(By.xpath("//span[normalize-space()='Text Box']"));
        wd.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }


    public void fillForm(String FullName,String Email,String CurAddress,String PerAddress)
    {
        type(By.cssSelector("#userName"),FullName);
        type(By.cssSelector("#userEmail"),Email);
        pause(5000);
        type(By.cssSelector("[placeholder='Current Address']"),CurAddress);
        pause(5000);
        type(By.cssSelector("#permanentAddress"),PerAddress);
    }

    public void clickSubmit()
    {
        click(By.cssSelector("[id='submit']"));
    }

    public  void ListElements()
    {
        WebElement nameText = wd.findElement(By.cssSelector("#name.mb-1"));
        String name = nameText.getText();
        WebElement mailText = wd.findElement(By.cssSelector("#email.mb-1"));
        String mail = mailText.getText();
        WebElement currAddress = wd.findElement(By.cssSelector("currentAddress.mb-1"));
        String curAdd = currAddress.getText();
        WebElement perAddress = wd.findElement(By.cssSelector("#permanentAddress.mb-1"));
        String perAdd = perAddress.getText();
    }


}


