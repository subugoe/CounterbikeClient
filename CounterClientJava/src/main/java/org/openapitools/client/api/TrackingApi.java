package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.EncodingUtils;

import org.openapitools.client.model.Tracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import feign.*;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2018-11-19T15:05:33.742+01:00[Europe/Berlin]")
public interface TrackingApi extends ApiClient.Api {


  /**
   * Retrieves a Tracking resource.
   * 
    * @param id  (required)
   * @return Tracking
   */
  @RequestLine("GET /api/counter/trackings/{id}")
  @Headers({
    "Accept: application/json",
  })
  Tracking getTrackingItem(@Param("id") String id);

  /**
   * Creates a Tracking resource.
   * 
    * @param tracking The new Tracking resource (optional)
   * @return Tracking
   */
  @RequestLine("POST /api/counter/trackings")
  @Headers({
    "Content-Type: application/ld+json",
    "Accept: application/json",
  })
  Tracking postTrackingCollection(Tracking tracking);
}
