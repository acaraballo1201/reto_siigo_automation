package co.com.reto_siigo_automation.certificacion.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.webdriver.shadow.ByShadow;
import org.openqa.selenium.By;


public class CrearTerceroPage {

    public static final Target DESPLEGAR_TIPO_DE_PERSONA =
            Target.the("desplegar lista de tipo de persona").located(ByShadow.cssSelector("#s02a253a-51da-4f78-9adc-aa60ecf68c9d","#s6c74af8-0f1d-4759-a7f7-8176cb5c63ea > div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(1) > siigo-dropdownlist-web"));
    public static final Target OPCION_TIPO_DE_PERSONA =
            Target.the("opcion tipo de persona").located(ByShadow.cssSelector("#sc044c3d-2c06-42e0-99b1-e0ad8d71ebc0 > div > div > div:nth-child(1) > div.column.is-5 > div:nth-child(1) > siigo-dropdownlist-web","div > div > div.mdc-select__menu.mdc-menu.mdc-menu-surface.mdc-menu-surface--open.mdc-menu-surface--is-open-below > ul > li.mdc-list-item.mdc-list-item--selected"));
    public static final Target BTN_GUARDAR =
            Target.the("btn guardar tercero").located(By.xpath("(//button[normalize-space()='Guardar'])[1]"));
    private CrearTerceroPage() {}
}