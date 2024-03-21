package stepdefinitions;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.java.en.Given;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Apk {
    AndroidDriver<AndroidElement> driver;
    @Given("Kullanici gerekli kurulumlari yaparak istenilen uygulamayi {string} cep telefonuna yukler")
    public void kullanici_gerekli_kurulumlari_yaparak_istenilen_uygulamayi_cep_telefonuna_yukler(String dosyaYolu) throws MalformedURLException {
        DesiredCapabilities capabilities=new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"Pixel 2");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability("app",dosyaYolu);
        // capabilities.setCapability(MobileCapabilityType.APP, "/Users/yusuf/IdeaProjects/Appium_T120/Apps/Apk Bilgisi_2.3.4_apkcombo.com (1).apk");

        driver=new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

    }
}
