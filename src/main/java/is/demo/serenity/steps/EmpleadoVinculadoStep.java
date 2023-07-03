package is.demo.serenity.steps;

import is.demo.serenity.pageObject.EmpleadoVinculadoPage;
import is.demo.serenity.utils.EsperaImplicita;
import is.demo.serenity.utils.Random;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebElement;

import java.util.List;

public class EmpleadoVinculadoStep {
    EmpleadoVinculadoPage empleadoVinculadoPage = new EmpleadoVinculadoPage();
    EsperaImplicita wait = new EsperaImplicita();

    @Step ("Lista de empleados vinculados")
    public void selectorEmpleados(){
       empleadoVinculadoPage.getDriver().findElement(empleadoVinculadoPage.getSelectorEmpleados()).click();

    }

    @Step("Seleccion aleatoria de empleado")
    public void seleccionEmpleado() {
        wait.esperaImplicita(3);
        List<WebElement> empleado = empleadoVinculadoPage.getDriver().findElements(empleadoVinculadoPage.getListaEmpleados());
        empleado.get(Random.IndexRandom.numeroAleatorioEnRango(0, empleado.size())).click();
    }

    @Step("Cambios Aplicados")
    public void accionAplicarCambios() {
        empleadoVinculadoPage.getDriver().findElement(empleadoVinculadoPage.getBtnAplicarCambios()).click();

    }
}
