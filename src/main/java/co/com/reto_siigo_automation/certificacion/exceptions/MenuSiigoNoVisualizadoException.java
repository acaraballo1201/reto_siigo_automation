package co.com.reto_siigo_automation.certificacion.exceptions;

public class MenuSiigoNoVisualizadoException extends AssertionError {
  public static final String MENU_VALIDACION_NO_ENCONTRADO = "Menu de SIIGO no visualizado";

  public MenuSiigoNoVisualizadoException(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
