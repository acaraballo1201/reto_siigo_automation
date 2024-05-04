package co.com.reto_siigo_automation.certificacion.utils.web.enums;

public enum EnumDomBtnClientes {

    SEARCH_CONTEXT_BTN_CLIENTES(".data-siigo-five9.hydrated"),
    SHADOW_1_BTN_CLIENTES("div:nth-child(1) > header:nth-child(3) > nav:nth-child(1) > div:nth-child(1) > div:nth-child(2) > ul:nth-child(1) > li:nth-child(5) > siigo-header-create-button-dropdown:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > li:nth-child(2) > div:nth-child(1) > a:nth-child(2)");

    private final String nombreVariable;

    EnumDomBtnClientes(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    @Override
    public String toString() {
        return nombreVariable;
    }


}
