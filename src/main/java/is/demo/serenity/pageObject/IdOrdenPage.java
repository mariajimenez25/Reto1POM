package is.demo.serenity.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;


public class IdOrdenPage extends PageObject {

    By linkModuloOrden =  By.xpath("//div[contains(@class, 'r0')]//a[@class='s-EditLink s-Demo-Northwind-OrderLink' and @data-item-id='11077']");

    public By getLinkModuloOrden() {
        return linkModuloOrden;
    }
}

