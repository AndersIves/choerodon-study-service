package io.choerodon.todo.infra.dto;


import javax.persistence.Table;

@Table(name = "fd_project")
public class ProjectDTO {

  private Long id;
  private String name;
  private String code;
  private Long organizationId;
  private Long isEnabled = 1l;
  private String imageUrl;
  private Long objectVersionNumber;
  private Long createdBy;
  private java.sql.Timestamp creationDate;
  private Long lastUpdatedBy;
  private java.sql.Timestamp lastUpdateDate;
  private String type;
  private String category;

  @Override
  public String toString() {
    return "ProjectDTO{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", code='" + code + '\'' +
            ", organizationId=" + organizationId +
            ", isEnabled=" + isEnabled +
            ", imageUrl='" + imageUrl + '\'' +
            ", objectVersionNumber=" + objectVersionNumber +
            ", createdBy=" + createdBy +
            ", creationDate=" + creationDate +
            ", lastUpdatedBy=" + lastUpdatedBy +
            ", lastUpdateDate=" + lastUpdateDate +
            ", type='" + type + '\'' +
            ", category='" + category + '\'' +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  public Long getOrganizationId() {
    return organizationId;
  }

  public void setOrganizationId(Long organizationId) {
    this.organizationId = organizationId;
  }


  public Long getIsEnabled() {
    return isEnabled;
  }

  public void setIsEnabled(Long isEnabled) {
    this.isEnabled = isEnabled;
  }


  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public Long getObjectVersionNumber() {
    return objectVersionNumber;
  }

  public void setObjectVersionNumber(Long objectVersionNumber) {
    this.objectVersionNumber = objectVersionNumber;
  }


  public Long getCreatedBy() {
    return createdBy;
  }

  public void setCreatedBy(Long createdBy) {
    this.createdBy = createdBy;
  }


  public java.sql.Timestamp getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(java.sql.Timestamp creationDate) {
    this.creationDate = creationDate;
  }


  public Long getLastUpdatedBy() {
    return lastUpdatedBy;
  }

  public void setLastUpdatedBy(Long lastUpdatedBy) {
    this.lastUpdatedBy = lastUpdatedBy;
  }


  public java.sql.Timestamp getLastUpdateDate() {
    return lastUpdateDate;
  }

  public void setLastUpdateDate(java.sql.Timestamp lastUpdateDate) {
    this.lastUpdateDate = lastUpdateDate;
  }


  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

}
