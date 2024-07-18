package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TuketiciKredisiPage {
    public TuketiciKredisiPage() { //constructor olusturup public yapmamiz gerekir

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//*[@id=\"landingNav\"]/div[2]/div/div/div/div/div[1]/ul/li[1]")
    public WebElement tuketiciKredisi;

    @FindBy(xpath = "//*[@id=\"ctl00_DeltaPlaceHolderMain\"]/div[1]/div[1]/h1")
    public WebElement tuketiciKredisiText;

    @FindBy(id="calc-tutar")
    public WebElement tutarAlani;

    @FindBy(xpath="//*[@class='btn-item col-lg-6 col-md-6 col-sm-6 col-xs-12 pull-right']")
    public WebElement hesaplaButon;

    @FindBy(xpath="(//*[contains(text(), 'Yıllık Maliyet Oranı')])[1]")
    public WebElement yillikMaliyetText;

    @FindBy(xpath="//*[@class=\"form-item select-box col-xs-12\"]")
    public WebElement dropDownKrediListesi;

    @FindBy(xpath="//*[@class='select2-search__field']")
    public WebElement dropDownTextArea;

    @FindBy(id="calc-vade")
    public WebElement vadeAy;

    @FindBy(id="faiz-orani")
    public WebElement faizOrani;

    @FindBy(id="twotabsearchtextbox")
    public WebElement searchBox;

    @FindBy(xpath = "//*[@id=\"ctl00_ctl45_g_5e92fe74_b9f1_4d33_87ec_33a2ed2d8ea5\"]/div/div/div[3]/div[2]/div[1]/span")
    public WebElement taksitTutarSonucu;

    @FindBy(xpath = "//*[@id=\"ctl00_ctl45_g_5e92fe74_b9f1_4d33_87ec_33a2ed2d8ea5\"]/div/div/div[3]/div[2]/div[3]/span")
    public WebElement yillikMaliyetSonucu;

    @FindBy(xpath = "//*[@class='acc-box']")
    public WebElement odemeAlani;

    @FindBy(xpath = "//*[@class='acc-content']")
    public WebElement odemeAlaniTablosu;

}
