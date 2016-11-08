package fi.otavanopisto.kuntaapi.server.index;

public class IndexableOrganization implements Indexable {

  @Field(index = "not_analyzed")
  private String organizationId;

  @Field(index = "not_analyzed")
  private String businessCode;

  private String businessName;

  @Field(index = "not_analyzed")
  private String language;

  @Override
  public String getId() {
    return String.format("%s_%s", businessName, language);
  }

  @Override
  public String getType() {
    return "organization";
  }

  public String getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(String organizationId) {
    this.organizationId = organizationId;
  }

  public String getBusinessCode() {
    return businessCode;
  }

  public void setBusinessCode(String businessCode) {
    this.businessCode = businessCode;
  }

  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

}