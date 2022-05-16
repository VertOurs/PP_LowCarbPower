package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.BundledProductOfferingOption;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.
 */
@Schema(description = "A type of ProductOffering that belongs to a grouping of ProductOfferings made available to the market. It inherits of all attributes of ProductOffering.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-16T12:39:15.018Z[GMT]")


public class BundledProductOffering   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("lifecycleStatus")
  private String lifecycleStatus = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("bundledProductOfferingOption")
  private BundledProductOfferingOption bundledProductOfferingOption = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public BundledProductOffering id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Unique identifier of the BundledProductOffering
   * @return id
   **/
  @Schema(description = "Unique identifier of the BundledProductOffering")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BundledProductOffering href(String href) {
    this.href = href;
    return this;
  }

  /**
   * Unique reference of the BundledProductOffering
   * @return href
   **/
  @Schema(description = "Unique reference of the BundledProductOffering")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public BundledProductOffering lifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
    return this;
  }

  /**
   * Used to indicate the current lifecycle status
   * @return lifecycleStatus
   **/
  @Schema(description = "Used to indicate the current lifecycle status")
  
    public String getLifecycleStatus() {
    return lifecycleStatus;
  }

  public void setLifecycleStatus(String lifecycleStatus) {
    this.lifecycleStatus = lifecycleStatus;
  }

  public BundledProductOffering name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the BundledProductOffering
   * @return name
   **/
  @Schema(description = "Name of the BundledProductOffering")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public BundledProductOffering bundledProductOfferingOption(BundledProductOfferingOption bundledProductOfferingOption) {
    this.bundledProductOfferingOption = bundledProductOfferingOption;
    return this;
  }

  /**
   * Get bundledProductOfferingOption
   * @return bundledProductOfferingOption
   **/
  @Schema(description = "")
  
    @Valid
    public BundledProductOfferingOption getBundledProductOfferingOption() {
    return bundledProductOfferingOption;
  }

  public void setBundledProductOfferingOption(BundledProductOfferingOption bundledProductOfferingOption) {
    this.bundledProductOfferingOption = bundledProductOfferingOption;
  }

  public BundledProductOffering _atBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
    return this;
  }

  /**
   * When sub-classing, this defines the super-class
   * @return _atBaseType
   **/
  @Schema(description = "When sub-classing, this defines the super-class")
  
    public String getAtBaseType() {
    return _atBaseType;
  }

  public void setAtBaseType(String _atBaseType) {
    this._atBaseType = _atBaseType;
  }

  public BundledProductOffering _atSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
    return this;
  }

  /**
   * A URI to a JSON-Schema file that defines additional attributes and relationships
   * @return _atSchemaLocation
   **/
  @Schema(description = "A URI to a JSON-Schema file that defines additional attributes and relationships")
  
    public String getAtSchemaLocation() {
    return _atSchemaLocation;
  }

  public void setAtSchemaLocation(String _atSchemaLocation) {
    this._atSchemaLocation = _atSchemaLocation;
  }

  public BundledProductOffering _atType(String _atType) {
    this._atType = _atType;
    return this;
  }

  /**
   * When sub-classing, this defines the sub-class entity name
   * @return _atType
   **/
  @Schema(description = "When sub-classing, this defines the sub-class entity name")
  
    public String getAtType() {
    return _atType;
  }

  public void setAtType(String _atType) {
    this._atType = _atType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BundledProductOffering bundledProductOffering = (BundledProductOffering) o;
    return Objects.equals(this.id, bundledProductOffering.id) &&
        Objects.equals(this.href, bundledProductOffering.href) &&
        Objects.equals(this.lifecycleStatus, bundledProductOffering.lifecycleStatus) &&
        Objects.equals(this.name, bundledProductOffering.name) &&
        Objects.equals(this.bundledProductOfferingOption, bundledProductOffering.bundledProductOfferingOption) &&
        Objects.equals(this._atBaseType, bundledProductOffering._atBaseType) &&
        Objects.equals(this._atSchemaLocation, bundledProductOffering._atSchemaLocation) &&
        Objects.equals(this._atType, bundledProductOffering._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, lifecycleStatus, name, bundledProductOfferingOption, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledProductOffering {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    lifecycleStatus: ").append(toIndentedString(lifecycleStatus)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bundledProductOfferingOption: ").append(toIndentedString(bundledProductOfferingOption)).append("\n");
    sb.append("    _atBaseType: ").append(toIndentedString(_atBaseType)).append("\n");
    sb.append("    _atSchemaLocation: ").append(toIndentedString(_atSchemaLocation)).append("\n");
    sb.append("    _atType: ").append(toIndentedString(_atType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
