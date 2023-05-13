package tests;

import org.testng.annotations.Test;

public class TestsElements extends TestBase {

    @Test

    public void FillForm() {
        String FullName = "Evgeny Piyanzin";
        String Email = "Pivivar555@yandex.ru";
        String CurAddress = "Ashkelon, Ben-Gurion 5";
        String PerAddress = "Gaza , Hamas";

        app.getUser().clickOnElements();

        app.getUser().OpenTextBox();
        app.getUser().pause(15);
        app.getUser().fillForm("Evgeny Piyanzin", "Pivivar555@yandex.ru",
                "Ashkelon, Ben-Gurion 5", "Gaza , Hamas");
        app.getUser().clickSubmit();


    }
}

