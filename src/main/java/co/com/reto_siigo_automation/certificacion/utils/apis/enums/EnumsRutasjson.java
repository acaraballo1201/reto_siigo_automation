package co.com.reto_siigo_automation.certificacion.utils.apis.enums;

public enum EnumsRutasjson {
    CAMPO_BODY("data");

    private final String uri;

    EnumsRutasjson(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() { return uri; }

}



