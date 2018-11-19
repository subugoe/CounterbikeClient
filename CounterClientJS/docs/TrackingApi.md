# OpenapiJsClient.TrackingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrackingItem**](TrackingApi.md#getTrackingItem) | **GET** /api/counter/trackings/{id} | Retrieves a Tracking resource.
[**postTrackingCollection**](TrackingApi.md#postTrackingCollection) | **POST** /api/counter/trackings | Creates a Tracking resource.


<a name="getTrackingItem"></a>
# **getTrackingItem**
> Tracking getTrackingItem(id)

Retrieves a Tracking resource.

### Example
```javascript
var OpenapiJsClient = require('openapi-js-client');

var apiInstance = new OpenapiJsClient.TrackingApi();
var id = "id_example"; // String | 
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.getTrackingItem(id, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**|  | 

### Return type

[**Tracking**](Tracking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/ld+json, application/json, text/html

<a name="postTrackingCollection"></a>
# **postTrackingCollection**
> Tracking postTrackingCollection(opts)

Creates a Tracking resource.

### Example
```javascript
var OpenapiJsClient = require('openapi-js-client');

var apiInstance = new OpenapiJsClient.TrackingApi();
var opts = {
  'tracking': new OpenapiJsClient.Tracking() // Tracking | The new Tracking resource
};
var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
};
apiInstance.postTrackingCollection(opts, callback);
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tracking** | [**Tracking**](Tracking.md)| The new Tracking resource | [optional] 

### Return type

[**Tracking**](Tracking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/ld+json, application/json, text/html
 - **Accept**: application/ld+json, application/json, text/html

