package au.com.dius.android.template.model;

import java.util.Date;

public class Application {
  private String name;
  private Date released;
  private String version;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Date getReleased() {
    return released;
  }

  public void setReleased(Date released) {
    this.released = released;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }
}
