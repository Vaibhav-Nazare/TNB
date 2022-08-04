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

import org.threeten.bp.OffsetDateTime;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

import io.swagger.annotations.ApiModelProperty;

/**
 * RunExpectation
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-07-12T10:19:43.430893315+02:00[Europe/Rome]")
public class RunExpectation {
    public static final String SERIALIZED_NAME_ID = "id";
    public static final String SERIALIZED_NAME_TEST_ID = "testId";
    public static final String SERIALIZED_NAME_EXPECTED_BEFORE = "expectedBefore";
    public static final String SERIALIZED_NAME_EXPECTED_BY = "expectedBy";
    public static final String SERIALIZED_NAME_BACKLINK = "backlink";
    @SerializedName(SERIALIZED_NAME_ID)
    private Long id;
    @SerializedName(SERIALIZED_NAME_TEST_ID)
    private Integer testId;
    @SerializedName(SERIALIZED_NAME_EXPECTED_BEFORE)
    private OffsetDateTime expectedBefore;
    @SerializedName(SERIALIZED_NAME_EXPECTED_BY)
    private String expectedBy;
    @SerializedName(SERIALIZED_NAME_BACKLINK)
    private String backlink;

    public RunExpectation() {
    }

    public RunExpectation id(Long id) {

        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RunExpectation testId(Integer testId) {

        this.testId = testId;
        return this;
    }

    /**
     * Get testId
     *
     * @return testId
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public Integer getTestId() {
        return testId;
    }

    public void setTestId(Integer testId) {
        this.testId = testId;
    }

    public RunExpectation expectedBefore(OffsetDateTime expectedBefore) {

        this.expectedBefore = expectedBefore;
        return this;
    }

    /**
     * Get expectedBefore
     *
     * @return expectedBefore
     **/
    @javax.annotation.Nonnull
    @ApiModelProperty(required = true, value = "")

    public OffsetDateTime getExpectedBefore() {
        return expectedBefore;
    }

    public void setExpectedBefore(OffsetDateTime expectedBefore) {
        this.expectedBefore = expectedBefore;
    }

    public RunExpectation expectedBy(String expectedBy) {

        this.expectedBy = expectedBy;
        return this;
    }

    /**
     * Get expectedBy
     *
     * @return expectedBy
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getExpectedBy() {
        return expectedBy;
    }

    public void setExpectedBy(String expectedBy) {
        this.expectedBy = expectedBy;
    }

    public RunExpectation backlink(String backlink) {

        this.backlink = backlink;
        return this;
    }

    /**
     * Get backlink
     *
     * @return backlink
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

    public String getBacklink() {
        return backlink;
    }

    public void setBacklink(String backlink) {
        this.backlink = backlink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunExpectation runExpectation = (RunExpectation) o;
        return Objects.equals(this.id, runExpectation.id) &&
            Objects.equals(this.testId, runExpectation.testId) &&
            Objects.equals(this.expectedBefore, runExpectation.expectedBefore) &&
            Objects.equals(this.expectedBy, runExpectation.expectedBy) &&
            Objects.equals(this.backlink, runExpectation.backlink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, testId, expectedBefore, expectedBy, backlink);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunExpectation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    testId: ").append(toIndentedString(testId)).append("\n");
        sb.append("    expectedBefore: ").append(toIndentedString(expectedBefore)).append("\n");
        sb.append("    expectedBy: ").append(toIndentedString(expectedBy)).append("\n");
        sb.append("    backlink: ").append(toIndentedString(backlink)).append("\n");
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
