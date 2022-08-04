/*
 * Horreum API
 * Horreum data repository API
 *
 * The version of the OpenAPI document: 0.1-SNAPSHOT
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package software.tnb.horreum.validation.generated.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * Transformer
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class Transformer {
    public static final String SERIALIZED_NAME_OWNER = "owner";
    public static final String SERIALIZED_NAME_ACCESS = "access";
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_NAME = "name";
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    public static final String SERIALIZED_NAME_TARGET_SCHEMA_URI = "targetSchemaUri";
    public static final String SERIALIZED_NAME_EXTRACTORS = "extractors";
    public static final String SERIALIZED_NAME_FUNCTION = "function";
    public static final String SERIALIZED_NAME_SCHEMA_ID = "schemaId";
    public static final String SERIALIZED_NAME_SCHEMA_URI = "schemaUri";
    public static final String SERIALIZED_NAME_SCHEMA_NAME = "schemaName";
    @SerializedName(SERIALIZED_NAME_OWNER)
    private String owner;
    @SerializedName(SERIALIZED_NAME_ACCESS)
    private Access access;
    @SerializedName(SERIALIZED_NAME_ID)
    private Integer id;
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    @SerializedName(SERIALIZED_NAME_TARGET_SCHEMA_URI)
    private String targetSchemaUri;
    @SerializedName(SERIALIZED_NAME_EXTRACTORS)
    private List<Extractor> extractors = new ArrayList<Extractor>();
    @SerializedName(SERIALIZED_NAME_FUNCTION)
    private String function;
    @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
    private Integer schemaId;
    @SerializedName(SERIALIZED_NAME_SCHEMA_URI)
    private String schemaUri;
    @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
    private String schemaName;

    public Transformer() {
    }

    public Transformer owner(String owner) {

        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     *
     * @return owner
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Transformer access(Access access) {

        this.access = access;
        return this;
    }

    /**
     * Get access
     *
     * @return access
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(required = true, value = "")

    public Access getAccess() {
        return access;
    }

    public void setAccess(Access access) {
        this.access = access;
    }

    public Transformer id(Integer id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Transformer name(String name) {

        this.name = name;
        return this;
    }

    /**
     * Get name
     *
     * @return name
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Transformer description(String description) {

        this.description = description;
        return this;
    }

    /**
     * Get description
     *
     * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Transformer targetSchemaUri(String targetSchemaUri) {

        this.targetSchemaUri = targetSchemaUri;
        return this;
    }

    /**
     * Get targetSchemaUri
     *
     * @return targetSchemaUri
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getTargetSchemaUri() {
        return targetSchemaUri;
    }

    public void setTargetSchemaUri(String targetSchemaUri) {
        this.targetSchemaUri = targetSchemaUri;
    }

    public Transformer extractors(List<Extractor> extractors) {

        this.extractors = extractors;
        return this;
    }

    public Transformer addExtractorsItem(Extractor extractorsItem) {
        this.extractors.add(extractorsItem);
        return this;
    }

    /**
     * Get extractors
     *
     * @return extractors
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public List<Extractor> getExtractors() {
        return extractors;
    }

    public void setExtractors(List<Extractor> extractors) {
        this.extractors = extractors;
    }

    public Transformer function(String function) {

        this.function = function;
        return this;
    }

    /**
     * Get function
     *
     * @return function
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public Transformer schemaId(Integer schemaId) {

        this.schemaId = schemaId;
        return this;
    }

    /**
     * Get schemaId
     *
     * @return schemaId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(Integer schemaId) {
        this.schemaId = schemaId;
    }

    public Transformer schemaUri(String schemaUri) {

        this.schemaUri = schemaUri;
        return this;
    }

    /**
     * Get schemaUri
     *
     * @return schemaUri
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getSchemaUri() {
        return schemaUri;
    }

    public void setSchemaUri(String schemaUri) {
        this.schemaUri = schemaUri;
    }

    public Transformer schemaName(String schemaName) {

        this.schemaName = schemaName;
        return this;
    }

    /**
     * Get schemaName
     *
     * @return schemaName
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Transformer transformer = (Transformer) o;
        return Objects.equals(this.owner, transformer.owner) &&
            Objects.equals(this.access, transformer.access) &&
            Objects.equals(this.id, transformer.id) &&
            Objects.equals(this.name, transformer.name) &&
            Objects.equals(this.description, transformer.description) &&
            Objects.equals(this.targetSchemaUri, transformer.targetSchemaUri) &&
            Objects.equals(this.extractors, transformer.extractors) &&
            Objects.equals(this.function, transformer.function) &&
            Objects.equals(this.schemaId, transformer.schemaId) &&
            Objects.equals(this.schemaUri, transformer.schemaUri) &&
            Objects.equals(this.schemaName, transformer.schemaName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, access, id, name, description, targetSchemaUri, extractors, function, schemaId, schemaUri, schemaName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Transformer {\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    access: ").append(toIndentedString(access)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    targetSchemaUri: ").append(toIndentedString(targetSchemaUri)).append("\n");
        sb.append("    extractors: ").append(toIndentedString(extractors)).append("\n");
        sb.append("    function: ").append(toIndentedString(function)).append("\n");
        sb.append("    schemaId: ").append(toIndentedString(schemaId)).append("\n");
        sb.append("    schemaUri: ").append(toIndentedString(schemaUri)).append("\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
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
