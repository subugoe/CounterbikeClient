/*
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 5
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-11-19T15:05:33.742+01:00[Europe/Berlin]")
public class Tracking {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("clientIP")
  private String clientIP = null;

  @JsonProperty("platform")
  private String platform = null;

  @JsonProperty("docDatabase")
  private String docDatabase = null;

  @JsonProperty("trackingEvent")
  private String trackingEvent = null;

  @JsonProperty("trackingDate")
  private OffsetDateTime trackingDate = null;

  @JsonProperty("documentId")
  private String documentId = null;

  @JsonProperty("documentUrl")
  private String documentUrl = null;

  @JsonProperty("documentTitle")
  private String documentTitle = null;

  @JsonProperty("chapter")
  private String chapter = null;

  @JsonProperty("author")
  private String author = null;

  @JsonProperty("publisher")
  private String publisher = null;

  @JsonProperty("accessMethod")
  private String accessMethod = null;

  @JsonProperty("accessType")
  private String accessType = null;

  @JsonProperty("dataType")
  private String dataType = null;

  @JsonProperty("sectionType")
  private String sectionType = null;

  @JsonProperty("reportType")
  private String reportType = null;

  @JsonProperty("yop")
  private String yop = null;

  @JsonProperty("sessionId")
  private String sessionId = null;

  @JsonProperty("created")
  private Integer created = null;

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public Integer getId() {
    return id;
  }

  public Tracking customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Tracking clientIP(String clientIP) {
    this.clientIP = clientIP;
    return this;
  }

   /**
   * Get clientIP
   * @return clientIP
  **/
  @ApiModelProperty(value = "")
  public String getClientIP() {
    return clientIP;
  }

  public void setClientIP(String clientIP) {
    this.clientIP = clientIP;
  }

  public Tracking platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  @ApiModelProperty(required = true, value = "")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public Tracking docDatabase(String docDatabase) {
    this.docDatabase = docDatabase;
    return this;
  }

   /**
   * Get docDatabase
   * @return docDatabase
  **/
  @ApiModelProperty(value = "")
  public String getDocDatabase() {
    return docDatabase;
  }

  public void setDocDatabase(String docDatabase) {
    this.docDatabase = docDatabase;
  }

  public Tracking trackingEvent(String trackingEvent) {
    this.trackingEvent = trackingEvent;
    return this;
  }

   /**
   * Get trackingEvent
   * @return trackingEvent
  **/
  @ApiModelProperty(required = true, value = "")
  public String getTrackingEvent() {
    return trackingEvent;
  }

  public void setTrackingEvent(String trackingEvent) {
    this.trackingEvent = trackingEvent;
  }

  public Tracking trackingDate(OffsetDateTime trackingDate) {
    this.trackingDate = trackingDate;
    return this;
  }

   /**
   * Get trackingDate
   * @return trackingDate
  **/
  @ApiModelProperty(value = "")
  public OffsetDateTime getTrackingDate() {
    return trackingDate;
  }

  public void setTrackingDate(OffsetDateTime trackingDate) {
    this.trackingDate = trackingDate;
  }

  public Tracking documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Get documentId
   * @return documentId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  public Tracking documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

   /**
   * Get documentUrl
   * @return documentUrl
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public Tracking documentTitle(String documentTitle) {
    this.documentTitle = documentTitle;
    return this;
  }

   /**
   * Get documentTitle
   * @return documentTitle
  **/
  @ApiModelProperty(required = true, value = "")
  public String getDocumentTitle() {
    return documentTitle;
  }

  public void setDocumentTitle(String documentTitle) {
    this.documentTitle = documentTitle;
  }

  public Tracking chapter(String chapter) {
    this.chapter = chapter;
    return this;
  }

   /**
   * Get chapter
   * @return chapter
  **/
  @ApiModelProperty(value = "")
  public String getChapter() {
    return chapter;
  }

  public void setChapter(String chapter) {
    this.chapter = chapter;
  }

  public Tracking author(String author) {
    this.author = author;
    return this;
  }

   /**
   * Get author
   * @return author
  **/
  @ApiModelProperty(value = "")
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public Tracking publisher(String publisher) {
    this.publisher = publisher;
    return this;
  }

   /**
   * Get publisher
   * @return publisher
  **/
  @ApiModelProperty(value = "")
  public String getPublisher() {
    return publisher;
  }

  public void setPublisher(String publisher) {
    this.publisher = publisher;
  }

  public Tracking accessMethod(String accessMethod) {
    this.accessMethod = accessMethod;
    return this;
  }

   /**
   * Get accessMethod
   * @return accessMethod
  **/
  @ApiModelProperty(value = "")
  public String getAccessMethod() {
    return accessMethod;
  }

  public void setAccessMethod(String accessMethod) {
    this.accessMethod = accessMethod;
  }

  public Tracking accessType(String accessType) {
    this.accessType = accessType;
    return this;
  }

   /**
   * Get accessType
   * @return accessType
  **/
  @ApiModelProperty(value = "")
  public String getAccessType() {
    return accessType;
  }

  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }

  public Tracking dataType(String dataType) {
    this.dataType = dataType;
    return this;
  }

   /**
   * Get dataType
   * @return dataType
  **/
  @ApiModelProperty(value = "")
  public String getDataType() {
    return dataType;
  }

  public void setDataType(String dataType) {
    this.dataType = dataType;
  }

  public Tracking sectionType(String sectionType) {
    this.sectionType = sectionType;
    return this;
  }

   /**
   * Get sectionType
   * @return sectionType
  **/
  @ApiModelProperty(value = "")
  public String getSectionType() {
    return sectionType;
  }

  public void setSectionType(String sectionType) {
    this.sectionType = sectionType;
  }

  public Tracking reportType(String reportType) {
    this.reportType = reportType;
    return this;
  }

   /**
   * Get reportType
   * @return reportType
  **/
  @ApiModelProperty(value = "")
  public String getReportType() {
    return reportType;
  }

  public void setReportType(String reportType) {
    this.reportType = reportType;
  }

  public Tracking yop(String yop) {
    this.yop = yop;
    return this;
  }

   /**
   * Get yop
   * @return yop
  **/
  @ApiModelProperty(value = "")
  public String getYop() {
    return yop;
  }

  public void setYop(String yop) {
    this.yop = yop;
  }

  public Tracking sessionId(String sessionId) {
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @ApiModelProperty(required = true, value = "")
  public String getSessionId() {
    return sessionId;
  }

  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  public Tracking created(Integer created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  @ApiModelProperty(required = true, value = "")
  public Integer getCreated() {
    return created;
  }

  public void setCreated(Integer created) {
    this.created = created;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tracking tracking = (Tracking) o;
    return Objects.equals(this.id, tracking.id) &&
        Objects.equals(this.customerId, tracking.customerId) &&
        Objects.equals(this.clientIP, tracking.clientIP) &&
        Objects.equals(this.platform, tracking.platform) &&
        Objects.equals(this.docDatabase, tracking.docDatabase) &&
        Objects.equals(this.trackingEvent, tracking.trackingEvent) &&
        Objects.equals(this.trackingDate, tracking.trackingDate) &&
        Objects.equals(this.documentId, tracking.documentId) &&
        Objects.equals(this.documentUrl, tracking.documentUrl) &&
        Objects.equals(this.documentTitle, tracking.documentTitle) &&
        Objects.equals(this.chapter, tracking.chapter) &&
        Objects.equals(this.author, tracking.author) &&
        Objects.equals(this.publisher, tracking.publisher) &&
        Objects.equals(this.accessMethod, tracking.accessMethod) &&
        Objects.equals(this.accessType, tracking.accessType) &&
        Objects.equals(this.dataType, tracking.dataType) &&
        Objects.equals(this.sectionType, tracking.sectionType) &&
        Objects.equals(this.reportType, tracking.reportType) &&
        Objects.equals(this.yop, tracking.yop) &&
        Objects.equals(this.sessionId, tracking.sessionId) &&
        Objects.equals(this.created, tracking.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, customerId, clientIP, platform, docDatabase, trackingEvent, trackingDate, documentId, documentUrl, documentTitle, chapter, author, publisher, accessMethod, accessType, dataType, sectionType, reportType, yop, sessionId, created);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Tracking {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    clientIP: ").append(toIndentedString(clientIP)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    docDatabase: ").append(toIndentedString(docDatabase)).append("\n");
    sb.append("    trackingEvent: ").append(toIndentedString(trackingEvent)).append("\n");
    sb.append("    trackingDate: ").append(toIndentedString(trackingDate)).append("\n");
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    documentTitle: ").append(toIndentedString(documentTitle)).append("\n");
    sb.append("    chapter: ").append(toIndentedString(chapter)).append("\n");
    sb.append("    author: ").append(toIndentedString(author)).append("\n");
    sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
    sb.append("    accessMethod: ").append(toIndentedString(accessMethod)).append("\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    sectionType: ").append(toIndentedString(sectionType)).append("\n");
    sb.append("    reportType: ").append(toIndentedString(reportType)).append("\n");
    sb.append("    yop: ").append(toIndentedString(yop)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

