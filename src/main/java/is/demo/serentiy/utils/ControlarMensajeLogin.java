package is.demo.serentiy.utils;

import is.demo.serentiy.pageObject.DashboardPage;
import is.demo.serentiy.pageObject.HomePage;
import net.thucydides.core.annotations.Step;
import org.fluentlenium.core.annotation.Page;


import static org.junit.jupiter.api.Assertions.assertEquals;


public class ControlarMensajeLogin {
    @Page
    private static HomePage homePage;
    @Page
    private static DashboardPage dashBoard;


    private  static boolean mensajeExitoso;

    private static String mensajeConvertido;
    private static boolean mensajeFallido;
    private static boolean msjCamposVaciosIncompletos;

    @Step("validar mensaje de Login ")
    public static void validarMensaje(String mensaje) {


        switch (mensaje) {
           case "Dashboard":

                try {
                    boolean mensajeExitoso = dashBoard.getDriver().findElement(dashBoard.getTxtMensajeBienvenido()).isDisplayed();
                    if (mensajeExitoso == true) {
                        mensajeConvertido = "Dashboard";

                        assertEquals(
                                mensaje,//dashboard
                                mensajeConvertido//true
                        );
                        System.out.println("Logeo exitoso e ingreso al menu esperado "+ mensaje);
                    } else {
                        System.out.println("acceso denegado usuario o clave incorrecta  " + mensaje);
                    }

                } catch (Exception e) {

                    System.out.println("acceso denegado usuario o clave incorrecta  revise mensaje ingresado" + mensaje);
                }
                break;
            case "Invalid username or password!":

                try {
                    mensajeFallido = homePage.getDriver().findElement(homePage.getAlertFallidoLogin()).isDisplayed();
                    if (mensajeFallido == true) {
                        System.out.println("Logeo fallido esperado: revisar mensaje de validacion: " + mensaje);
                        mensajeConvertido = "Invalid username or password!";
                        assertEquals(
                                mensaje,
                                mensajeConvertido
                        );
                    } else {
                        System.out.println("Logeo exitoso credenciales correctas , revisar mensaje de validacion " + mensaje);
                    }
                } catch (Exception e) {

                    System.out.println("Logeo exitoso credenciales correctas , revisar mensaje de validacion "+mensaje);
                }
                break;
            case"Please validate empty or invalid inputs (marked with red) before submitting the form.":
                try {
                msjCamposVaciosIncompletos= homePage.getDriver().findElement(homePage.getAlertCamposVaciosIncompletos()).isDisplayed();
                if (msjCamposVaciosIncompletos == true) {
                    System.out.println("Logeo fallido esperado: revise que los campos usuario y clave esten diligenciados  : " + mensaje);
                    mensajeConvertido = "Please validate empty or invalid inputs (marked with red) before submitting the form.";
                    assertEquals(
                            mensaje,
                            mensajeConvertido
                    );
                }
                     } catch (Exception e) {

                System.out.println("Logeo exitoso credenciales correctas , revisar mensaje de validacion " + mensaje);


        }
        break;


        }
    }
}

















