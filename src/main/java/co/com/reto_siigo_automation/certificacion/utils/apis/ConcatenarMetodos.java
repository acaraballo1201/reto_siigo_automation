package co.com.reto_siigo_automation.certificacion.utils.apis;

public enum ConcatenarMetodos {
    LISTA_COMPLETA_DE_EMPLEADOS("/api/users/"),
    EMPLEADO_ESPECIFICO("/api/users/%s"),
    ELIMINAR_EMPLEADO("/api/users/delete/%s"),
    CREAR_EMPLEADO("/api/users/create/");

    private final String uri;

    ConcatenarMetodos(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() { return uri; }

}



