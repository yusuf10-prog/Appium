package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import utils.Driver;
import utils.ReusableMethods;

import java.time.Duration;

public class AileButcemPage {
    public AileButcemPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver(), Duration.ofSeconds(15)), this);
    }

    public void loginMethodu() throws InterruptedException {
        for (int i=0; i<9; i++){
            Thread.sleep(5000);
            ReusableMethods.screenScroolDownMethod(968,1081,100,136,1081,100);

        }
    }
    @FindBy(xpath = "//*[@text='E-mail Adresi']")
    public MobileElement eMailBox;

    @FindBy(xpath = "//*[@text='Şifre']")
    public MobileElement passwordBox;

    @FindBy(xpath = "//*[@text='Başarıyla giriş yapıldı']")
    public MobileElement basariliGirisText;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement isimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement soyIsimKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement sehirKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement yasKutusu;

    @FindBy(xpath = "(//*[@class='android.widget.EditText'])[1]")
    public MobileElement meslekKutusu;

    public void hesabimBoxesClearMethod(){
        isimKutusu.clear();
        soyIsimKutusu.clear();
        sehirKutusu.clear();
        yasKutusu.clear();
        meslekKutusu.clear();
    }
    public void kullaniciBilgileriDegistirmeMethodu(String isim, String soyisim, String sehir, String yas, String meslek, String kaydet){
        hesabimBoxesClearMethod();
        isimKutusu.sendKeys(isim);
        soyIsimKutusu.sendKeys(soyisim);
        sehirKutusu.sendKeys(sehir);
        yasKutusu.sendKeys(yas);
        meslekKutusu.sendKeys(meslek);
        ReusableMethods.scrollWithUiScrollable(kaydet);
    }

    public void kullaniciBilgileriAssertion(String isim, String soyisim, String sehir, String yas, String meslek){
        Assert.assertTrue(isimKutusu.getText().contains(isim));
        Assert.assertTrue(soyIsimKutusu.getText().contains(soyisim));
        Assert.assertTrue(sehirKutusu.getText().contains(sehir));
        Assert.assertTrue(yasKutusu.getText().contains(yas));
        Assert.assertTrue(meslekKutusu.getText().contains(meslek));

    }
}
