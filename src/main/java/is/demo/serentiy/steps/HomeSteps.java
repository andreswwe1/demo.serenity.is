package is.demo.serentiy.steps;

import io.cucumber.datatable.DataTable;
import is.demo.serentiy.pageObject.HomePage;

import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;



public class HomeSteps {
@Page
    private HomePage homePage;

    @Step("Open Browser")
    public void openUrl(){
        homePage.openUrl("https://demo.serenity.is/Account/Login/?ReturnUrl=%2F");
    }

    @Step("limpiar pantalla")
    public void limpiarPantalla(){
        homePage.getDriver().findElement(homePage.getCjtxtUsuario()).clear();
        homePage.getDriver().findElement(homePage.getCjtxtClave()).clear();
    }
    @Step("ingresarUsuario")
    public void ingresarUsuario(DataTable dataTable){
try {
    String usuario = dataTable.column(0).get(1);
    homePage.getDriver().findElement(homePage.getCjtxtUsuario()).sendKeys(usuario);
}catch (Exception e) {
    System.out.println("el campo del usuario no se diligencio , por favor revisar ");

}
    }
    @Step("ingresarPass")
    public void ingresarPassWord(DataTable dataTable) {
        try {
            String password = dataTable.column(1).get(1);
            homePage.getDriver().findElement(homePage.getCjtxtClave()).sendKeys(password);

        } catch (Exception e) {
            System.out.println("el campo del password o clave no se diligencio , por favor revisar ");
        }
    }


    @Step("presiona boton iniciar sesion ")
    public void iniciarSesion(){

        homePage.getDriver().findElement(homePage.getBtnIniciarSesion()).click();
    }







}
