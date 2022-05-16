package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * A set of numbers that specifies the lower and upper limits for a ProductOffering that can be procured as part of the related BundledProductOffering. Values can range from 0 to unbounded
 */
@Schema(description = "A set of numbers that specifies the lower and upper limits for a ProductOffering that can be procured as part of the related BundledProductOffering. Values can range from 0 to unbounded")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2022-05-16T12:39:15.018Z[GMT]")


public class BundledProductOfferingOption   {
  @JsonProperty("numberRelOfferDefault")
  private Integer numberRelOfferDefault = null;

  @JsonProperty("numberRelOfferLowerLimit")
  private Integer numberRelOfferLowerLimit = null;

  @JsonProperty("numberRelOfferUpperLimit")
  private Integer numberRelOfferUpperLimit = null;

  @JsonProperty("@baseType")
  private String _atBaseType = null;

  @JsonProperty("@schemaLocation")
  private String _atSchemaLocation = null;

  @JsonProperty("@type")
  private String _atType = null;

  public BundledProductOfferingOption numberRelOfferDefault(Integer numberRelOfferDefault) {
    this.numberRelOfferDefault = numberRelOfferDefault;
    return this;
  }

  /**
   * Default number of produc offereings that should be procured as part of the related BundledProductOffering
   * @return numberRelOfferDefault
   **/
  @Schema(description = "Default number of produc offereings that should be procured as part of the related BundledProductOffering")
  
    public Integer getNumberRelOfferDefault() {
    return numberRelOfferDefault;
  }

  public void setNumberRelOfferDefault(Integer numberRelOfferDefault) {
    this.numberRelOfferDefault = numberRelOfferDefault;
  }

  public BundledProductOfferingOption numberRelOfferLowerLimit(Integer numberRelOfferLowerLimit) {
    this.numberRelOfferLowerLimit = numberRelOfferLowerLimit;
    return this;
  }

  /**
   * lower limit for a product offering that can be procured as part of the related BundledProductOffering
   * @return numberRelOfferLowerLimit
   **/
  @Schema(description = "lower limit for a product offering that can be procured as part of the related BundledProductOffering")
  
    public Integer getNumberRelOfferLowerLimit() {
    return numberRelOfferLowerLimit;
  }

  public void setNumberRelOfferLowerLimit(Integer numberRelOfferLowerLimit) {
    this.numberRelOfferLowerLimit = numberRelOfferLowerLimit;
  }

  public BundledProductOfferingOption numberRelOfferUpperLimit(Integer numberRelOfferUpperLimit) {
    this.numberRelOfferUpperLimit = numberRelOfferUpperLimit;
    return this;
  }

  /**
   * upper limit for a product offering that can be procured as part of the related BundledProductOffering
   * @return numberRelOfferUpperLimit
   **/
  @Schema(description = "upper limit for a product offering that can be procured as part of the related BundledProductOffering")
  
    public Integer getNumberRelOfferUpperLimit() {
    return numberRelOfferUpperLimit;
  }

  public void setNumberRelOfferUpperLimit(Integer numberRelOfferUpperLimit) {
    this.numberRelOfferUpperLimit = numberRelOfferUpperLimit;
  }

  public BundledProductOfferingOption _atBaseType(String _atBaseType) {
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

  public BundledProductOfferingOption _atSchemaLocation(String _atSchemaLocation) {
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

  public BundledProductOfferingOption _atType(String _atType) {
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
    BundledProductOfferingOption bundledProductOfferingOption = (BundledProductOfferingOption) o;
    return Objects.equals(this.numberRelOfferDefault, bundledProductOfferingOption.numberRelOfferDefault) &&
        Objects.equals(this.numberRelOfferLowerLimit, bundledProductOfferingOption.numberRelOfferLowerLimit) &&
        Objects.equals(this.numberRelOfferUpperLimit, bundledProductOfferingOption.numberRelOfferUpperLimit) &&
        Objects.equals(this._atBaseType, bundledProductOfferingOption._atBaseType) &&
        Objects.equals(this._atSchemaLocation, bundledProductOfferingOption._atSchemaLocation) &&
        Objects.equals(this._atType, bundledProductOfferingOption._atType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numberRelOfferDefault, numberRelOfferLowerLimit, numberRelOfferUpperLimit, _atBaseType, _atSchemaLocation, _atType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BundledProductOfferingOption {\n");
    
    sb.append("    numberRelOfferDefault: ").append(toIndentedString(numberRelOfferDefault)).append("\n");
    sb.append("    numberRelOfferLowerLimit: ").append(toIndentedString(numberRelOfferLowerLimit)).append("\n");
    sb.append("    numberRelOfferUpperLimit: ").append(toIndentedString(numberRelOfferUpperLimit)).append("\n");
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
