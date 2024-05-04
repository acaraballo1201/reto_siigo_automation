package co.com.reto_siigo_automation.certificacion.utils.apis;

public enum ConcatenarMetodos {
    LISTA_COMPLETA_DE_EMPLEADOS("/api/users/"),
    USUARIO_ESPECIFICO("/api/users/%s"),
    ELIMINAR_USUARIO("/api/users/%s"),
    ACTUALIZAR_USUARIO("/api/users/%s"),
    REGISTRAR_USUARIO("/api/register"),
    CREAR_USUARIO("/api/users/create/");

    private final String uri;

    ConcatenarMetodos(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() { return uri; }

}



