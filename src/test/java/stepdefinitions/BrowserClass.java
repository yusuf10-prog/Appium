package stepdefinitions;

import io.cucumber.java.en.Given;
import utils.BrowserDriver;
import utils.ReusableMethods;

public class BrowserClass {
    @Given("Kullanici browserDriver ayarlamalari yaparak browser i acar")
    public void kullanici_browser_driver_ayarlamalari_yaparak_browser_i_acar() throws InterruptedException {
        BrowserDriver.getBrowserDriver();

    }
    @Given("kullanici google a gider")
    public void kullanici_google_a_gider() {
        BrowserDriver.getBrowserDriver().get("https://www.google.com");

    }
}
