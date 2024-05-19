package is.demo.serentiy.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class DashboardPage extends PageObject {
   private By txtMensajeBienvenido=By.xpath("//*[@class='content-header']/h1");


    public By getTxtMensajeBienvenido() {
        return txtMensajeBienvenido;
    }



}
