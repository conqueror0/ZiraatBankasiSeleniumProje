package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.IbanHesaplamaPage;
import pages.MevduatGetirisiPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class IbanHesaplamaStepDefinition {

    IbanHesaplamaPage ibanHesaplamaPage = new IbanHesaplamaPage();

    @Given("kullanici ıban hesaplama icin ziraat anasayfasina gider")
    public void kullaniciAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("ziraatURL"));
    }

    @Then("Iban Hesaplma gorunur oluncaya kadar bekler")
    public void mevduatKredisiGorunurOluncayaKadarBekler() {
        ReusableMethods.waitForVisibility(ibanHesaplamaPage.ıbanHesaplama,10);
    }

    @Then("ekranda bos hata mesajlari geldiği gorulur")
    public void hataBosMesajKontrol() {
        String expectedWord="Bu alanın doldurulması zorunludur.";
        String actualWord= ibanHesaplamaPage.musteriNoBosHata.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));

        String expectedWord2="Bu alanın doldurulması zorunludur.";
        String actualWord2= ibanHesaplamaPage.ekNoBosHata.getText();
        Assert.assertTrue(actualWord2.contains(expectedWord2));

    }

    @Then("Iban geldigi kontrol edilir")
    public void ibanControl() {
        String expectedWord = "TR360001000001123512351235";
        String actualWord = ibanHesaplamaPage.ibanNoText.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Then("Iban Hesaplama alanina tiklanir")
    public void clickMevduatGetirisi(){
        ibanHesaplamaPage.ıbanHesaplama.click();
    }

    @Then("sube isimleri kontrol edilir")
    public void subeIsimleriKontrol(){
        String expectedWord="1.SANAYİ/İZMİR ŞUBESİ-(2515)";
        String actualWord= ibanHesaplamaPage.subeIsimleri.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }


    @And("sonuclarin IBAN Hesaplama icerdigini test eder")
    public void sonuclarinIcerigiTestEder() {
        String expectedWord="IBAN Hesaplama";
        String actualWord= ibanHesaplamaPage.ıbanHesaplamaText.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Then("Sube kodlari checkboxuna tiklanir")
    public void clickSubeKodlari(){
        ibanHesaplamaPage.subeKodlariCheckBox.click();
    }

    @Then("Sube isimleri checkboxuna tiklanir")
    public void clickSubeIsimleri(){
        ibanHesaplamaPage.subeIsimleriCheckBox.click();
    }

    @Then("sube ismi kontrol edilir")
    public void subeIsimKontrol(){
        String expectedWord="MERKEZ/ANKARA ŞUBESİ-(1)";
        String actualWord= ibanHesaplamaPage.subeKodAdlari.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Then("musteri no alanina 00 girer")
    public void musteriNoSendKey00() {
        ibanHesaplamaPage.musteriNo.sendKeys("00" + Keys.ENTER);
    }

    @Then("musteri ek no alanina 00 girer")
    public void ekNoSendKey00() {
        ibanHesaplamaPage.ekNo.sendKeys("00" + Keys.ENTER);
    }

    @Then("musteri ek no alanina 1235 girer")
    public void ekNoSendKey1235() {
        ibanHesaplamaPage.ekNo.sendKeys("1235" + Keys.ENTER);
    }

    @Then("musteri no alanina 12351235 girer")
    public void musteriNoSendKey12351235() {
        ibanHesaplamaPage.musteriNo.sendKeys("12351235" + Keys.ENTER);
    }

    @Then("ekranda hata mesajlari geldiği gorulur")
    public void hataMesajKontrol() {
        String expectedWord="Lütfen en az 8 karakter uzunluğunda bir değer giriniz.";
        String actualWord= ibanHesaplamaPage.musteriNoHata.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));

        String expectedWord2="Lütfen en az 4 karakter uzunluğunda bir değer giriniz.";
        String actualWord2= ibanHesaplamaPage.ekNoHata.getText();
        Assert.assertTrue(actualWord2.contains(expectedWord2));

    }

    @Then("sube secimi ayas ankara yapilir")
    public void clickDropDownKrediListUrunPaketi(){
        ibanHesaplamaPage.subeAlani.click();
    }



}
