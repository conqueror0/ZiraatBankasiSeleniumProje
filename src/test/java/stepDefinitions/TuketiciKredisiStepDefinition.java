package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.TuketiciKredisiPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TuketiciKredisiStepDefinition {

    TuketiciKredisiPage tuketiciKredisiPage = new TuketiciKredisiPage();
    @Given("kullanici ziraat anasayfasina gider")
    public void kullaniciAnasayfasinaGider() {
        Driver.getDriver().get(ConfigReader.getProperty("ziraatURL"));
    }

    @Then("Tuketici Kredisi gorunur oluncaya kadar bekler")
    public void tuketiciKredisiGorunurOluncayaKadarBekler() {
        ReusableMethods.waitForVisibility(tuketiciKredisiPage.tuketiciKredisi,10);
    }

    @Then("Tuketici kredisine tiklanilir")
    public void tuketiciKredisiTiklanilir() {
        tuketiciKredisiPage.tuketiciKredisi.click();
    }

    @Then("50000 Tl tutar girilir")
    public void tutarGirilir50() {
        tuketiciKredisiPage.tutarAlani.clear();
        tuketiciKredisiPage.tutarAlani.sendKeys("50000" + Keys.ENTER);
    }

    @Then("100000 Tl tutar girilir")
    public void tutarGirilir100() {
        tuketiciKredisiPage.tutarAlani.clear();
        tuketiciKredisiPage.tutarAlani.sendKeys("100000" + Keys.ENTER);
    }


    @Then("Hesapla butonuna tiklanilir")
    public void hesaplaButonuTiklanilir() {
        tuketiciKredisiPage.hesaplaButon.click();
    }

    @Then("Yillik Maliyet Orani gorunur oluncaya kadar bekler")
    public void yillikMaliyetVisible(){
        ReusableMethods.waitForVisibility(tuketiciKredisiPage.yillikMaliyetText,10);
    }

    @Then("Kredi DropDownList tiklanir Dijital Kredi Ürün Paketi secilir")
    public void clickDropDownKrediList(){
        tuketiciKredisiPage.dropDownKrediListesi.click();
        tuketiciKredisiPage.dropDownTextArea.sendKeys("Dijital Kredi" + Keys.ENTER);
    }

    @Then("Kredi DropDownList tiklanir Tuketici Kredi Ürün Paketi secilir")
    public void clickDropDownKrediListUrunPaketi(){
        tuketiciKredisiPage.dropDownKrediListesi.click();
        tuketiciKredisiPage.dropDownTextArea.sendKeys("Tüketici Kredisi Ürün Paketi" + Keys.ENTER);
    }



    @Then("Vade 3 ay secilir")
    public void vadeSecilir(){
        tuketiciKredisiPage.vadeAy.clear();
        tuketiciKredisiPage.vadeAy.sendKeys("3" + Keys.ENTER);
    }

    @And("sayfa kapatilir")
    public void sayfayiKapatir() {
        Driver.closeDriver();
    }

    @Then("Faiz Orani 1 secilir")
    public void faizSecilir(){
        tuketiciKredisiPage.faizOrani.sendKeys("1" + Keys.ENTER);
    }

    @And("sonuclarin Tüketici Kredisi icerdigini test eder")
    public void sonuclarIcerdiginiTestEder() {
        String expectedWord="Tüketici Kredisi";
        String actualWord= tuketiciKredisiPage.tuketiciKredisiText.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));
    }



    @And("Hesaplama sonuclarının dogrulugu kontrol edilir")
    public void sonuclarKontrolEdilir() {
        String expectedWord="34.203,73";
        String actualWord= tuketiciKredisiPage.taksitTutarSonucu.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));

        String expectedWord2="% 20.896";
        String actualWord2= tuketiciKredisiPage.yillikMaliyetSonucu.getText();
        Assert.assertTrue(actualWord2.contains(expectedWord2));

    }

    @And("Hesaplama sonuclarının dijital kredi icin dogrulugu kontrol edilir")
    public void sonuclarKontrolEdilirDijital() {
        String expectedWord="17.101,87";
        String actualWord= tuketiciKredisiPage.taksitTutarSonucu.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));

        String expectedWord2="% 20.896";
        String actualWord2= tuketiciKredisiPage.yillikMaliyetSonucu.getText();
        Assert.assertTrue(actualWord2.contains(expectedWord2));

    }

    @Then("Odeme plani alanina tiklanir")
    public void odemeButonuTiklanilir() {
        tuketiciKredisiPage.odemeAlani.click();
    }


    @And("Odeme alani kontrolu saglanir")
    public void deleteButonununGorunutOldugunuTestEder() {
        Assert.assertTrue(tuketiciKredisiPage.odemeAlaniTablosu.isDisplayed());

        String expectedWord="17.101,87";
        String actualWord= tuketiciKredisiPage.taksitTutarSonucu.getText();
        Assert.assertTrue(actualWord.contains(expectedWord));

        String expectedWord2="% 20.896";
        String actualWord2= tuketiciKredisiPage.yillikMaliyetSonucu.getText();
        Assert.assertTrue(actualWord2.contains(expectedWord2));
    }


    @Then("kullanici iphone icin arama yapar")
    public void kullaniciIphoneIcinAramaYapar() {
        tuketiciKredisiPage.searchBox.sendKeys("iphone" + Keys.ENTER);
    }


    @Then("kullanici {string} icin arama yapar")
    public void kullaniciIcinAramaYapar(String searchWord) {
        tuketiciKredisiPage.searchBox.sendKeys(searchWord,Keys.ENTER);
    }

    @Given("kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String searchUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(searchUrl));
    }

    @When("url'nin {string} icerdigini test eder")
    public void urlNinIcerdiginiTestEder(String searchUrl) {
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(searchUrl));
    }

    @Then("kullanici {int} saniye bekler")
    public void kullaniciSaniyeBekler(int waiting) {
        try {
            Thread.sleep(waiting*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @And("sonuclarin \"<istenenKelimeKontrol>' icerdigini test eder")
    public void sonuclarinIstenenKelimeKontrolIcerdiginiTestEder(String searcWordCheck) throws Throwable {
        //Assert.assertTrue(tuketiciKredisiPage.searchResultWE.getText().contains(searcWordCheck));
    }

    @And("sayfalari kapatir")
    public void sayfalariKapatir() {
        Driver.quitDriver();
    }
}
