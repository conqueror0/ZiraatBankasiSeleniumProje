package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MevduatGetirisiPage {
    public MevduatGetirisiPage() { //constructor olusturup public yapmamiz gerekir

        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(id = "dovizCinsi")
    public WebElement dovizCinsi;

    @FindBy(xpath = "(//*[@class='col-md-4 col-sm-6 col-xs-12 height-columns'])[1]")
    public WebElement mevduatGetirisi;

    @FindBy(xpath = "//*[@id=\"ctl00_DeltaPlaceHolderMain\"]/div[1]/div[1]/h1")
    public WebElement mevduatGetirisiText;

    @FindBy(id = "deposit-calc-vade")
    public WebElement vadeGunu;

    @FindBy(id = "tutar")
    public WebElement vadeTutari;

    @FindBy(xpath = "//*[@class=\"btn btn-red btn-save\"]")
    public WebElement hesaplaButon;

    @FindBy(xpath = "//*[@id=\"ctl00_ctl45_g_8bc5c561_6670_4a97_a958_6d696309d779\"]/div/div[4]/div[2]/div[1]/span")
    public WebElement vadeSonucu;

    @FindBy(xpath = "//*[@id=\"ctl00_ctl45_g_8bc5c561_6670_4a97_a958_6d696309d779\"]/div/div[4]/div[2]/div[2]/span")
    public WebElement faizOraniSonucu;

    @FindBy(xpath = "//*[@id=\"dovizCinsi\"]/option[2]")
    public WebElement dovizCinsiUSD;

    @FindBy(xpath = "//*[@id=\"dovizCinsi\"]/option[3]")
    public WebElement dovizCinsiEURO;
}
