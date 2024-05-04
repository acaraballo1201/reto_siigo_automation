package co.com.reto_siigo_automation.certificacion.models.web;

public class Create {

  private final String nroid;

  public Create(RegisterBuilder builder) {
    this.nroid = builder.getNroid();
  }

  public String getNroid() {
    return nroid;
  }

}
