package is.demo.serenity.pageObject;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class TableroPage extends PageObject {
    By linkTablero = By.xpath("//a[@href='/Northwind/Order?shippingState=0' and contains(@class, 'card-footer')]");

    public By getLnkOpenOrden() {
        return linkTablero;
    }
}
