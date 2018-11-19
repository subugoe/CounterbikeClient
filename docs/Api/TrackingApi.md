# Subugoe\CounterClient\TrackingApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTrackingItem**](TrackingApi.md#getTrackingItem) | **GET** /api/counter/trackings/{id} | Retrieves a Tracking resource.
[**postTrackingCollection**](TrackingApi.md#postTrackingCollection) | **POST** /api/counter/trackings | Creates a Tracking resource.


# **getTrackingItem**
> \Subugoe\CounterClient\Model\Tracking getTrackingItem($id)

Retrieves a Tracking resource.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Subugoe\CounterClient\Api\TrackingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$id = 'id_example'; // string | 

try {
    $result = $apiInstance->getTrackingItem($id);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TrackingApi->getTrackingItem: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **string**|  |

### Return type

[**\Subugoe\CounterClient\Model\Tracking**](../Model/Tracking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/ld+json, application/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

# **postTrackingCollection**
> \Subugoe\CounterClient\Model\Tracking postTrackingCollection($tracking)

Creates a Tracking resource.

### Example
```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');

$apiInstance = new Subugoe\CounterClient\Api\TrackingApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client()
);
$tracking = new \Subugoe\CounterClient\Model\Tracking(); // \Subugoe\CounterClient\Model\Tracking | The new Tracking resource

try {
    $result = $apiInstance->postTrackingCollection($tracking);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling TrackingApi->postTrackingCollection: ', $e->getMessage(), PHP_EOL;
}
?>
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tracking** | [**\Subugoe\CounterClient\Model\Tracking**](../Model/Tracking.md)| The new Tracking resource | [optional]

### Return type

[**\Subugoe\CounterClient\Model\Tracking**](../Model/Tracking.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/ld+json, application/json, text/html
 - **Accept**: application/ld+json, application/json, text/html

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

