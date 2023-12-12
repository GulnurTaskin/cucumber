package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.TestOtomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TestotomasyonuStepdefinitions {

    TestOtomasyonuPage testOtomasyonuPage = new TestOtomasyonuPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @Then("arama kutusuna phone yazip ENTER tusuna basar")
    public void arama_kutusuna_phone_yazip_enter_tusuna_basar() {
    testOtomasyonuPage.aramaKutusu.sendKeys("phone"+ Keys.ENTER);
    }

    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {

        int sonucSayisi = testOtomasyonuPage.bulunanUrunElementleriList.size();

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {

    }
    @Then("account butonuna basar")
    public void account_butonuna_basar() {

    }
    @Then("email olarak {string} girer")
    public void email_olarak_girer(String string) {

    }
    @Then("password olarak {string} girer")
    public void password_olarak_girer(String string) {

    }
    @Then("signIn butonuna basar")
    public void sign_in_butonuna_basar() {

    }
    @Then("basarili giris yapilabildigini test eder")
    public void basarili_giris_yapilabildigini_test_eder() {

    }


}
