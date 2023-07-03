package is.demo.serenity.pageObject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class EmpleadoVinculadoPage extends PageObject {
    By SelectorEmpleados = By.xpath("//div[@id='s2id_Serenity_Demo_Northwind_OrderDialog15_EmployeeID']");
    By listaEmpleados = By.xpath("//*[@id='select2-results-9']//li");
    By btnAplicarCambios = By.xpath("//div[@data-action='apply-changes']");


    public By getSelectorEmpleados() {
        return SelectorEmpleados;
    }

    public By getListaEmpleados() {
        return listaEmpleados;
    }

    public By getBtnAplicarCambios() {
        return btnAplicarCambios;
    }
}



