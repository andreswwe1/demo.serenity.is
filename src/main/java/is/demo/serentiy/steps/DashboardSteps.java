package is.demo.serentiy.steps;



import is.demo.serentiy.utils.ControlarMensajeLogin;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;



public class DashboardSteps {


    @Page
    private ControlarMensajeLogin controlarMensajeLogin;

    @Step("validar mensaje de Login exioso o fallido")
      public void MensajeLogin(String mensaje) {
        controlarMensajeLogin.validarMensaje(mensaje);


        }








    }

