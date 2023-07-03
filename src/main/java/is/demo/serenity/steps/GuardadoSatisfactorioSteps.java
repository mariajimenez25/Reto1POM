package is.demo.serenity.steps;

import is.demo.serenity.pageObject.GuardadoSatisfactorioPage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class GuardadoSatisfactorioSteps {
    GuardadoSatisfactorioPage guardadoSatisfactorioPage = new GuardadoSatisfactorioPage();

    @Step("Se guardaron los cambios exitosamente")
    public void CambiosGuardados() {
        Assert.assertTrue(
               guardadoSatisfactorioPage.getDriver().findElement(guardadoSatisfactorioPage.getGuardadoSatisfactorio()).isDisplayed()
        );
    }
}
