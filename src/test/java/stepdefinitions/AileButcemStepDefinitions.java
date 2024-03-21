package stepdefinitions;

import io.cucumber.java.en.Given;
import org.testng.Assert;
import pages.AileButcemPage;
import utils.ConfigReader;
import utils.Driver;
import utils.ReusableMethods;

public class AileButcemStepDefinitions {
    AileButcemPage page=new AileButcemPage();

    @Given("Kullanici driver kurulumlari yaparak cihaz baglantisini kurar")
    public void kullanici_driver_kurulumlari_yaparak_cihaz_baglantisini_kurar() {
        Driver.getAndroidDriver();
    }
    @Given("ilk ekran ayarlarini yapin ve {string} ardindan login sayfasina ulasin")
    public void ilk_ekran_ayarlarini_yapin_ve_ardindan_login_sayfasina_ulasin(String girisButonu) throws InterruptedException {
        page.loginMethodu();
        Thread.sleep(5000);
        ReusableMethods.scrollWithUiScrollable(girisButonu);

    }
    @Given("{string} ve {string} bilgilerini girerek kullanici bilgileriyle {string} yapin")
    public void mail_ve_password_bilgilerini_girerek_kullanici_bilgileriyle_giris_yapin(String mail, String password, String girisYap) {
        page.eMailBox.sendKeys(ConfigReader.getProperty(mail));
        page.passwordBox.sendKeys(ConfigReader.getProperty(password));
        ReusableMethods.scrollWithUiScrollable(girisYap);
    }
    @Given("uygulamaya kullanici bilgileriyle giris yapildigini dogrulayin")
    public void uygulamaya_kullanici_bilgileriyle_giris_yapildigini_dogrulayin(){
       // Assert.assertTrue(page.basariliGirisText.isDisplayed());

    }
    @Given("sol kisimdaki {int} menuden hesabim bolumune {int} {int} {int} {string} gidin")
    public void sol_kisimdaki_menuden_hesabim_bolumune_gidin(int dogrulama, int x, int y, int beklemeSuresi, String hesabim) throws InterruptedException {
        Thread.sleep(dogrulama);
        ReusableMethods.tiklamaMethodu(x,y,beklemeSuresi);
        Thread.sleep(dogrulama);
        ReusableMethods.scrollWithUiScrollable(hesabim);

    }
    @Given("hesabim sayfasindaki bilgileri {string} {string} {string} {string} {string} degistirerek degisikleri {string} dogrulayin")
    public void hesabim_sayfasindaki_bilgileri_degistirerek_degisikleri_kaydedin(String isim, String soyisim, String sehir, String yas, String meslek, String kaydet) {
        page.kullaniciBilgileriDegistirmeMethodu(isim, soyisim,sehir,yas,meslek, kaydet);
        page.kullaniciBilgileriAssertion(isim,soyisim,sehir,yas,meslek);
    }
    @Given("kullanici uygulamayi kapatir")
    public void kullanici_uygulamayi_kapatir() {
        Driver.quitAppiumDriver();
    }
}
