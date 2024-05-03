package co.com.reto_siigo_automation.certificacion.utils.apis;

public enum ConcatenarMetodos {
    LISTA_COMPLETA_DE_EMPLEADOS("/api/users"),
    EMPLEADO_ESPECIFICO("/api/v1/employee/%s"),
    ELIMINAR_EMPLEADO("/public/api/v1/delete/%s"),
    CREAR_EMPLEADO("/api/v1/create");

    private final String uri;

    ConcatenarMetodos(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() { return uri; }

}



