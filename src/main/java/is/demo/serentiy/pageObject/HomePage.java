package is.demo.serentiy.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class HomePage extends PageObject
{


    private  By  cjtxtUsuario= By.id("LoginPanel0_Username");

    private By cjtxtClave=By.id("LoginPanel0_Password");


    private By btnIniciarSesion =By.id("LoginPanel0_LoginButton");
    private By alertFallidoLogin=By.xpath( "//div[@class='toast-message']");

    private By alertCamposVaciosIncompletos=By.xpath("//div[@class='show toast toast-error']");




    public By getCjtxtUsuario() {
        return cjtxtUsuario;
    }

    public By getCjtxtClave() {
        return cjtxtClave;
    }

    public By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public By getAlertFallidoLogin() {
        return alertFallidoLogin;
    }

    public By getAlertCamposVaciosIncompletos() {
        return alertCamposVaciosIncompletos;
    }
}
