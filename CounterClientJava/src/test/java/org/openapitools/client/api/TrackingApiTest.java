package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.model.Tracking;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TrackingApi
 */
public class TrackingApiTest {

    private TrackingApi api;

    @Before
    public void setup() {
        api = new ApiClient().buildClient(TrackingApi.class);
    }

    
    /**
     * Retrieves a Tracking resource.
     *
     * 
     */
    @Test
    public void getTrackingItemTest() {
        String id = null;
        // Tracking response = api.getTrackingItem(id);

        // TODO: test validations
    }

    
    /**
     * Creates a Tracking resource.
     *
     * 
     */
    @Test
    public void postTrackingCollectionTest() {
        Tracking tracking = null;
        // Tracking response = api.postTrackingCollection(tracking);

        // TODO: test validations
    }

    
}
