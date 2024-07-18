package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class IbanHesaplamaPage {
    public IbanHesaplamaPage() { //constructor olusturup public yapmamiz gerekir

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "musteriNo-error")
    public WebElement musteriNoBosHata;

    @FindBy(id = "ekNo-error")
    public WebElement ekNoBosHata;


    @FindBy(id = "musteriNo-error")
    public WebElement musteriNoHata;

    @FindBy(id = "ekNo-error")
    public WebElement ekNoHata;


    @FindBy(id = "ekNo")
    public WebElement ekNo;

    @FindBy(xpath = "(//*[@class=\"col-md-4 col-sm-6 col-xs-12 height-columns\"])[2]")
    public WebElement ıbanHesaplama;

    @FindBy(xpath = "//*[@id=\"ctl00_DeltaPlaceHolderMain\"]/div[1]/div[1]/h1")
    public WebElement ıbanHesaplamaText;

    @FindBy(xpath = "//*[@class=\"radio-box sort-code\"]")
    public WebElement subeKodlariCheckBox;

    @FindBy(id = "select2-ddlSube-container")
    public WebElement subeKodAdlari;

    @FindBy(id = "select2-ddlSube-container")
    public WebElement subeIsimleri;

    @FindBy(xpath = "//*[@class=\"radio-box sort-name\"]")
    public WebElement subeIsimleriCheckBox;

    @FindBy(id = "musteriNo")
    public WebElement musteriNo;

    @FindBy(xpath = "//*[@id=\"ddlSube\"]/option[3]")
    public WebElement subeAlani;

    @FindBy(xpath = "//*[@id=\"ctl00_ctl45_g_5e695900_fa27_4b93_9f42_078763fb2ef5\"]/div/div[6]/div[2]/div/span")
    public WebElement ibanNoText;

}
