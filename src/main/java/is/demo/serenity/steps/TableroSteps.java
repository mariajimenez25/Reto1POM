package is.demo.serenity.steps;

import is.demo.serenity.pageObject.TableroPage;
import net.thucydides.core.annotations.Step;



public class TableroSteps {
    TableroPage tableroPage = new TableroPage();

    @Step("Seleccionar More Info en el modulo de Open Orders")
    public void EntrarOpenOrden() {

        tableroPage.getDriver().findElement(tableroPage.getLnkOpenOrden()).click();

    }
    }
