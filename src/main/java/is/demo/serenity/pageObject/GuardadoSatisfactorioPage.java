package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class GuardadoSatisfactorioPage extends PageObject {

    By guardadoSatisfactorio= By.xpath("//div[@class='toast-message']");

    public By getGuardadoSatisfactorio() {
        return guardadoSatisfactorio;
    }
}
