package stepdefinitions;

import io.cucumber.java.en.Given;
import pages.ObiletBrowserPage;
import utils.BrowserDriver;

public class OtobusComBrowser {
    ObiletBrowserPage page=new ObiletBrowserPage();

    @Given("{string} sayfasına gidilir.")
    public void https_www_obilet_com_en_sayfasina_gidilir(String URL) throws InterruptedException {
        BrowserDriver.getBrowserDriver().get(URL);
        Thread.sleep(5000);
    }
    @Given("dil olarak turkce secilir")
    public void dil_olarak_turkce_secilir() throws InterruptedException {
        page.menuButton.click();
        Thread.sleep(1000);
        page.languageBar.click();
        Thread.sleep(1000);
        page.turkishLanguage.click();
        Thread.sleep(1000);
    }
    @Given("para birimi olarak tl secilir")
    public void para_birimi_olarak_tl_secilir() throws InterruptedException {
        page.menuButton.click();
        Thread.sleep(1000);
        page.currenyBar.click();
        Thread.sleep(1000);
        page.turkishLira.click();
    }
    @Given("otobus bileti bul a tiklanir")
    public void otobus_bileti_bul_a_tiklanir() {

    }
    @Given("gelen bilet fiyatlarinin tl oldugu dogrulan")
    public void gelen_bilet_fiyatlarinin_tl_oldugu_dogrulan() {

    }
    }
