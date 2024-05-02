package com.reto_siigo_automation.certificacion.exceptions.autenticacion;

public class MenuSvpNoVisualizadoException extends AssertionError {
  public static final String MENU_VALIDACION_NO_ENCONTRADO = "Menu de SIIGO no visualizado";

  public MenuSvpNoVisualizadoException(String mensaje, Throwable causa) {
    super(mensaje, causa);
  }
}
