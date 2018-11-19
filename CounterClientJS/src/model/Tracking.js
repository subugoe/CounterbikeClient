/**
 * 
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 5
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 *
 * OpenAPI Generator version: 3.3.0
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.OpenapiJsClient) {
      root.OpenapiJsClient = {};
    }
    root.OpenapiJsClient.Tracking = factory(root.OpenapiJsClient.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The Tracking model module.
   * @module model/Tracking
   * @version 5
   */

  /**
   * Constructs a new <code>Tracking</code>.
   * 
   * @alias module:model/Tracking
   * @class
   * @param customerId {String} 
   * @param platform {String} 
   * @param trackingEvent {String} 
   * @param documentId {String} 
   * @param documentUrl {String} 
   * @param documentTitle {String} 
   * @param sessionId {String} 
   * @param created {Number} 
   */
  var exports = function(customerId, platform, trackingEvent, documentId, documentUrl, documentTitle, sessionId, created) {
    var _this = this;


    _this['customerId'] = customerId;

    _this['platform'] = platform;

    _this['trackingEvent'] = trackingEvent;

    _this['documentId'] = documentId;
    _this['documentUrl'] = documentUrl;
    _this['documentTitle'] = documentTitle;









    _this['sessionId'] = sessionId;
    _this['created'] = created;
  };

  /**
   * Constructs a <code>Tracking</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Tracking} obj Optional instance to populate.
   * @return {module:model/Tracking} The populated <code>Tracking</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('id')) {
        obj['id'] = ApiClient.convertToType(data['id'], 'Number');
      }
      if (data.hasOwnProperty('customerId')) {
        obj['customerId'] = ApiClient.convertToType(data['customerId'], 'String');
      }
      if (data.hasOwnProperty('clientIP')) {
        obj['clientIP'] = ApiClient.convertToType(data['clientIP'], 'String');
      }
      if (data.hasOwnProperty('platform')) {
        obj['platform'] = ApiClient.convertToType(data['platform'], 'String');
      }
      if (data.hasOwnProperty('docDatabase')) {
        obj['docDatabase'] = ApiClient.convertToType(data['docDatabase'], 'String');
      }
      if (data.hasOwnProperty('trackingEvent')) {
        obj['trackingEvent'] = ApiClient.convertToType(data['trackingEvent'], 'String');
      }
      if (data.hasOwnProperty('trackingDate')) {
        obj['trackingDate'] = ApiClient.convertToType(data['trackingDate'], 'Date');
      }
      if (data.hasOwnProperty('documentId')) {
        obj['documentId'] = ApiClient.convertToType(data['documentId'], 'String');
      }
      if (data.hasOwnProperty('documentUrl')) {
        obj['documentUrl'] = ApiClient.convertToType(data['documentUrl'], 'String');
      }
      if (data.hasOwnProperty('documentTitle')) {
        obj['documentTitle'] = ApiClient.convertToType(data['documentTitle'], 'String');
      }
      if (data.hasOwnProperty('chapter')) {
        obj['chapter'] = ApiClient.convertToType(data['chapter'], 'String');
      }
      if (data.hasOwnProperty('author')) {
        obj['author'] = ApiClient.convertToType(data['author'], 'String');
      }
      if (data.hasOwnProperty('publisher')) {
        obj['publisher'] = ApiClient.convertToType(data['publisher'], 'String');
      }
      if (data.hasOwnProperty('accessMethod')) {
        obj['accessMethod'] = ApiClient.convertToType(data['accessMethod'], 'String');
      }
      if (data.hasOwnProperty('accessType')) {
        obj['accessType'] = ApiClient.convertToType(data['accessType'], 'String');
      }
      if (data.hasOwnProperty('dataType')) {
        obj['dataType'] = ApiClient.convertToType(data['dataType'], 'String');
      }
      if (data.hasOwnProperty('sectionType')) {
        obj['sectionType'] = ApiClient.convertToType(data['sectionType'], 'String');
      }
      if (data.hasOwnProperty('reportType')) {
        obj['reportType'] = ApiClient.convertToType(data['reportType'], 'String');
      }
      if (data.hasOwnProperty('yop')) {
        obj['yop'] = ApiClient.convertToType(data['yop'], 'String');
      }
      if (data.hasOwnProperty('sessionId')) {
        obj['sessionId'] = ApiClient.convertToType(data['sessionId'], 'String');
      }
      if (data.hasOwnProperty('created')) {
        obj['created'] = ApiClient.convertToType(data['created'], 'Number');
      }
    }
    return obj;
  }

  /**
   * @member {Number} id
   */
  exports.prototype['id'] = undefined;
  /**
   * @member {String} customerId
   */
  exports.prototype['customerId'] = undefined;
  /**
   * @member {String} clientIP
   */
  exports.prototype['clientIP'] = undefined;
  /**
   * @member {String} platform
   */
  exports.prototype['platform'] = undefined;
  /**
   * @member {String} docDatabase
   */
  exports.prototype['docDatabase'] = undefined;
  /**
   * @member {String} trackingEvent
   */
  exports.prototype['trackingEvent'] = undefined;
  /**
   * @member {Date} trackingDate
   */
  exports.prototype['trackingDate'] = undefined;
  /**
   * @member {String} documentId
   */
  exports.prototype['documentId'] = undefined;
  /**
   * @member {String} documentUrl
   */
  exports.prototype['documentUrl'] = undefined;
  /**
   * @member {String} documentTitle
   */
  exports.prototype['documentTitle'] = undefined;
  /**
   * @member {String} chapter
   */
  exports.prototype['chapter'] = undefined;
  /**
   * @member {String} author
   */
  exports.prototype['author'] = undefined;
  /**
   * @member {String} publisher
   */
  exports.prototype['publisher'] = undefined;
  /**
   * @member {String} accessMethod
   */
  exports.prototype['accessMethod'] = undefined;
  /**
   * @member {String} accessType
   */
  exports.prototype['accessType'] = undefined;
  /**
   * @member {String} dataType
   */
  exports.prototype['dataType'] = undefined;
  /**
   * @member {String} sectionType
   */
  exports.prototype['sectionType'] = undefined;
  /**
   * @member {String} reportType
   */
  exports.prototype['reportType'] = undefined;
  /**
   * @member {String} yop
   */
  exports.prototype['yop'] = undefined;
  /**
   * @member {String} sessionId
   */
  exports.prototype['sessionId'] = undefined;
  /**
   * @member {Number} created
   */
  exports.prototype['created'] = undefined;



  return exports;
}));

