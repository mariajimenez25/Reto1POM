package is.demo.serenity.steps;

import is.demo.serenity.pageObject.CredencialesPage;
import is.demo.serenity.utils.Excel;
import net.thucydides.core.annotations.Step;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;


public class CredencialesSteps {
    CredencialesPage credencialesPage = new CredencialesPage();

    @Step("Apertura del navegador")
    public void abrirNavegador() {
        credencialesPage.openUrl("https://demo.serenity.is");
    }

    @Step
    public void enviarUsuario() throws IOException {

       ArrayList<Map<String, String>> data=Excel.leerDatosDeHojaDeExcel("Data.xlsx", "credenciales");
        credencialesPage.getDriver().findElement(credencialesPage.getTxtUsuario()).clear();
        credencialesPage.getDriver().findElement(credencialesPage.getTxtUsuario()).sendKeys(data.get(0).get("Usuario"));
    }

    @Step
    public void enviarClave() throws IOException{
        ArrayList<Map<String, String>> data=Excel.leerDatosDeHojaDeExcel("Data.xlsx", "credenciales");
        credencialesPage.getDriver().findElement(credencialesPage.getTxtClave()).clear();
        credencialesPage.getDriver().findElement(credencialesPage.getTxtClave()).sendKeys(data.get(0).get("Clave"));
    }

    @Step
    public void IniciarSesion() {

        credencialesPage.getDriver().findElement(credencialesPage.getBtnLogin()).click();
    }

}
