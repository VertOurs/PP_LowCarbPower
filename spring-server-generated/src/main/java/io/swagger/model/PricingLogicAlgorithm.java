package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.TimePeriod;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled bahavior in SID). Some of the parameters of the interface definiition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth)
 */
@Schema(description = "The PricingLogicAlgorithm entity represents an instantiation of an interface specification to external rating function (without a modeled bahavior in SID). Some of the parameters of the interface definiition may be already set (such as price per unit) and some may be gathered during the rating process from the event (such as call duration) or from ProductCharacteristicValues (such as assigned bandwidth)")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-16T12:39:15.018Z[GMT]")


public class PricingLogicAlgorithm   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("href")
  private String href = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("plaSpecId")
  private String plaSpecId = null;

  @JsonProperty("validFor")
  private TimePeriod validFor = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public PricingLogicAlgorithm id(String id) {
    this.id = id;
    return this;
  }

  /**
   * unique id of the PricingLogicAlgorithm
   * @return id
   **/
  @Schema(description = "unique id of the PricingLogicAlgorithm")
  
    public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PricingLogicAlgorithm href(String href) {
    this.href = href;
    return this;
  }

  /**
   * hyperlink reference of this PricingLogicAlgorithm
   * @return href
   **/
  @Schema(description = "hyperlink reference of this PricingLogicAlgorithm")
  
    public String getHref() {
    return href;
  }

  public void setHref(String href) {
    this.href = href;
  }

  public PricingLogicAlgorithm description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Description of the PricingLogicAlgorithm
   * @return description
   **/
  @Schema(description = "Description of the PricingLogicAlgorithm")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PricingLogicAlgorithm name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name given to the PricingLogicAlgorithm
   * @return name
   **/
  @Schema(description = "Name given to the PricingLogicAlgorithm")
  
    public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PricingLogicAlgorithm plaSpecId(String plaSpecId) {
    this.plaSpecId = plaSpecId;
    return this;
  }

  /**
   * id of corresponding PricingLogicAlgorithm specification
   * @return plaSpecId
   **/
  @Schema(description = "id of corresponding PricingLogicAlgorithm specification")
  
    public String getPlaSpecId() {
    return plaSpecId;
  }

  public void setPlaSpecId(String plaSpecId) {
    this.plaSpecId = plaSpecId;
  }

  public PricingLogicAlgorithm validFor(TimePeriod validFor) {
    this.validFor = validFor;
    return this;
  }

  /**
   * Get validFor
   * @return validFor
   **/
  @Schema(description = "")
  
    @Valid
    public TimePeriod getValidFor() {
    return validFor;
  }

  public void setValidFor(TimePeriod validFor) {
    this.validFor = validFor;
  }

  public PricingLogicAlgorithm _atBaseType(String _atBaseType) {
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

  public PricingLogicAlgorithm _atSchemaLocation(String _atSchemaLocation) {
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

  public PricingLogicAlgorithm _atType(String _atType) {
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
    PricingLogicAlgorithm pricingLogicAlgorithm = (PricingLogicAlgorithm) o;
    return Objects.equals(this.id, pricingLogicAlgorithm.id) &&
        Objects.equals(this.href, pricingLogicAlgorithm.href) &&
        Objects.equals(this.description, pricingLogicAlgorithm.description) &&
        Objects.equals(this.name, pricingLogicAlgorithm.name) &&
        Objects.equals(this.plaSpecId, pricingLogicAlgorithm.plaSpecId) &&
        Objects.equals(this.validFor, pricingLogicAlgorithm.validFor) &&
        Objects.equals(this._atBaseType, pricingLogicAlgorithm._atBaseType) &&
        Objects.equals(this._atSchemaLocation, pricingLogicAlgorithm._atSchemaLocation) &&
        Objects.equals(this._atType, pricingLogicAlgorithm._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, href, description, name, plaSpecId, validFor, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PricingLogicAlgorithm {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    href: ").append(toIndentedString(href)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    plaSpecId: ").append(toIndentedString(plaSpecId)).append("\n");
    sb.append("    validFor: ").append(toIndentedString(validFor)).append("\n");
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
