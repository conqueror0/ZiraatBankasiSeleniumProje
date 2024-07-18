package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import pages.MevduatGetirisiPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class MevduatGetirisiStepDefinition {

    WebDriver driver = new ChromeDriver();
    MevduatGetirisiPage mevduatGetirisiPage = new MevduatGetirisiPage();
    @Given("kullanici mevduat getirisi icin ziraat anasayfasina gider")
    public void kullaniciAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("ziraatURL"));
    }

    @Then("Mevduat Getirisi gorunur oluncaya kadar bekler")
    public void mevduatKredisiGorunurOluncayaKadarBekler() {
        ReusableMethods.waitForVisibility(mevduatGetirisiPage.mevduatGetirisi,10);
    }

    @Then("Mevduat Getirisi alanina tiklanir")
    public void clickMevduatGetirisi(){
        mevduatGetirisiPage.mevduatGetirisi.click();
    }

    @And("Hesaplama EURO getirisi kontrolu saglanir")
    public void sonuclarEuroKontrolEdilir() {
        String expectedWord="100.020,49";
        String actualWord= mevduatGetirisiPage.vadeSonucu.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));

        String expectedWord2="% 0,1";
        String actualWord2= mevduatGetirisiPage.faizOraniSonucu.getText();
        Assert.assertTrue(actualWord2.contains(expectedWord2));

    }

    @And("sonuclarin Mevduat Kredisi Hesaplama icerdigini test eder")
    public void sonuclarinNutellaIcerdiginiTestEder() {
        String expectedWord="Mevduat Kredisi Hesaplama";
        String actualWord= mevduatGetirisiPage.mevduatGetirisiText.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }

    @Then("Vade 100 gun girilir")
    public void vadeGirilir(){
        mevduatGetirisiPage.vadeGunu.clear();
        mevduatGetirisiPage.vadeGunu.sendKeys("100" + Keys.ENTER);
    }

    @And("Hesaplama USD getirisi kontrolu saglanir")
    public void sonuclarUSDKontrolEdilir() {
        String expectedWord="100.081,97";
        String actualWord= mevduatGetirisiPage.vadeSonucu.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));

        String expectedWord2="% 0,4";
        String actualWord2= mevduatGetirisiPage.faizOraniSonucu.getText();
        Assert.assertTrue(actualWord2.contains(expectedWord2));

    }

    @Then("Vade tutari 100000 girilir")
    public void tutarGirilir(){
        mevduatGetirisiPage.vadeTutari.clear();
        mevduatGetirisiPage.vadeTutari.sendKeys("100000" + Keys.ENTER);
    }

    @Then("Hesapla butonu tiklanilir")
    public void hesaplaButonuTiklanilir() {
        mevduatGetirisiPage.hesaplaButon.click();
    }

    @And("Hesaplama Tl getirisi kontrolu saglanir")
    public void sonuclarTLKontrolEdilir() {
        String expectedWord="111.625,69";
        String actualWord= mevduatGetirisiPage.vadeSonucu.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));

        String expectedWord2="% 46";
        String actualWord2= mevduatGetirisiPage.faizOraniSonucu.getText();
        Assert.assertTrue(actualWord2.contains(expectedWord2));

    }

    @Then("Doviz cinsi USD secilir")
    public void dovizCinsiSecilir() {
        mevduatGetirisiPage.dovizCinsiUSD.click();
    }

    @Then("Doviz cinsi EURO secilir")
    public void dovizCinsiEUROSecilir() {
        mevduatGetirisiPage.dovizCinsiEURO.click();
    }
}
