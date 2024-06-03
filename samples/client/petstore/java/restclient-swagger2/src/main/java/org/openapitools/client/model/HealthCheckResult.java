/*
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.
 */
@Schema(description = "Just a string to inform instance is up and running. Make it nullable in hope to get it as pointer in generated model.")
@JsonPropertyOrder({
  HealthCheckResult.JSON_PROPERTY_NULLABLE_MESSAGE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class HealthCheckResult {
  public static final String JSON_PROPERTY_NULLABLE_MESSAGE = "NullableMessage";
  private JsonNullable<String> nullableMessage = JsonNullable.<String>undefined();

  public HealthCheckResult() {
  }

  public HealthCheckResult nullableMessage(String nullableMessage) {
    this.nullableMessage = JsonNullable.<String>of(nullableMessage);
    
    return this;
  }

   /**
   * Get nullableMessage
   * @return nullableMessage
  **/
  @jakarta.annotation.Nullable
  @Schema(requiredMode = Schema.RequiredMode.NOT_REQUIRED, description = "")
  @JsonIgnore

  public String getNullableMessage() {
        return nullableMessage.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NULLABLE_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNullableMessage_JsonNullable() {
    return nullableMessage;
  }
  
  @JsonProperty(JSON_PROPERTY_NULLABLE_MESSAGE)
  public void setNullableMessage_JsonNullable(JsonNullable<String> nullableMessage) {
    this.nullableMessage = nullableMessage;
  }

  public void setNullableMessage(String nullableMessage) {
    this.nullableMessage = JsonNullable.<String>of(nullableMessage);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResult healthCheckResult = (HealthCheckResult) o;
    return equalsNullable(this.nullableMessage, healthCheckResult.nullableMessage);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(nullableMessage));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResult {\n");
    sb.append("    nullableMessage: ").append(toIndentedString(nullableMessage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

