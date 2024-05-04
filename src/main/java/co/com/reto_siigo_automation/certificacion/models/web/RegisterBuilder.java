package co.com.reto_siigo_automation.certificacion.models.web;


import java.util.List;
import java.util.Map;

public class RegisterBuilder {
  private String nroid;

  public String getNroid() {
    return nroid;
  }

  public static RegisterBuilder con() {
    return new RegisterBuilder();
  }

  public RegisterBuilder nroid(List<Map<String, String>> datos) {
    this.nroid = datos.get(0).get("nro id");
    return this;
  }

  public Create build() {
    return new Create(this);
  }
}
