package is.demo.serentity.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import is.demo.serentiy.steps.DashboardSteps;
import is.demo.serentiy.steps.HomeSteps;
import is.demo.serentiy.utils.ControlarMensajeLogin;
import net.thucydides.core.annotations.Steps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.platform.commons.function.Try;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class LoginDemoSerenityStepDef {
    WebDriver driver;
    @Steps
    private HomeSteps homeSteps;
    @Steps
    private DashboardSteps dashboardSteps;
    @Steps
    private ControlarMensajeLogin controlarMensaje;

    @BeforeAll
    static void setupClass() {
        WebDriverManager.chromedriver().clearDriverCache().setup();
    }

    @BeforeEach
    void setupTest() {

        driver = new ChromeDriver();
    }



    @Given("que ingrese a la url de la pagina Demo Serenity")
    public void queIngreseALaUrlDeLaPaginaDemoSerenity() {
        homeSteps.openUrl();
        homeSteps.limpiarPantalla();
    }

    @When("ingreso las credenciales")
    public void ingresoLasCredenciales(DataTable dataTable) {
        homeSteps.ingresarUsuario(dataTable);
        homeSteps.ingresarPassWord(dataTable);

    }

    @When("presiona el boton iniciar sesion")
    public void presionaElBotonIniciarSesion() {

        homeSteps.iniciarSesion();
    }

    @Then("se visualizara el mensaje {string}")
    public void seVisualizaraElMensaje(String mensajeEsperado) {
        dashboardSteps.MensajeLogin(mensajeEsperado);



    }
    @AfterEach
    void teardown() {

        driver.quit();
    }
}











