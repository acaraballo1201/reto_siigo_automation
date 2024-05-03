package co.com.reto_siigo_automation.certificacion.utils.apis.enums;

public enum EnumsTransversal {

  NAME("name", "morpheus"),
  JOB("job", "leader"),
  NEW_JOB("job", "zion resident"),
  EMAIL("email", "eve.holt@reqres.in"),
  PASSWORD("password", "pistol");

  private final String llave;
  private final String valor;

  EnumsTransversal(String llave, String valor) {
    this.llave = llave;
    this.valor = valor;
  }

  public String getLlave() {
    return llave;
  }

  public String getValor() {
    return valor;
  }

}
