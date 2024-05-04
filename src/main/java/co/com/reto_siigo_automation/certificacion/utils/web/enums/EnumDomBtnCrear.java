package co.com.reto_siigo_automation.certificacion.utils.web.enums;

public enum EnumDomBtnCrear {

    SHADOW_0_BTN_CREAR(".data-siigo-five9.hydrated"),
    SEARCH_CONTEXT_BTN_CREAR("siigo-button-atom[type='button'][class='hydrated'][color='primary-green']"),
    SHADOW_1_BTN_CREAR(".btn-element.size-m");

    private final String nombreVariable;

    EnumDomBtnCrear(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

    @Override
    public String toString() {
        return nombreVariable;
    }


}
