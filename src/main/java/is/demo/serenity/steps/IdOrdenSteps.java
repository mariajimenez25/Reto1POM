package is.demo.serenity.steps;

import is.demo.serenity.pageObject.IdOrdenPage;
import is.demo.serenity.utils.EsperaImplicita;
import net.thucydides.core.annotations.Step;

import static org.codehaus.groovy.runtime.StringGroovyMethods.findAll;

public class IdOrdenSteps {
    IdOrdenPage idOrdenPage = new IdOrdenPage();
    EsperaImplicita wait = new EsperaImplicita();

    @Step("Seleccionar la orden a modificar")
    public void SeleccionarIdOrden() {
        wait.esperaImplicita(3);
        idOrdenPage.getDriver().findElement(idOrdenPage.getLinkModuloOrden()).click();
    }
}



    

