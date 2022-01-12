# ConceptApi

All URIs are relative to *http://vivo-proxy.ca-central-1.elasticbeanstalk.com/vivo-proxy*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createConcept**](ConceptApi.md#createConcept) | **POST** /concept/withIRI | Create a concept(skos:Concept) in VIVO
[**createConceptWithNewIRI**](ConceptApi.md#createConceptWithNewIRI) | **POST** /concept/createIRI | Create a concept(skos:Concept) in VIVO (IRI generated by VIVO)

<a name="createConcept"></a>
# **createConcept**
> ModelAPIResponse createConcept(body)

Create a concept(skos:Concept) in VIVO

This can only be done by the logged in person.

### Example
```java
// Import classes:
//import ca.uqam.tool.vivoproxy.swagger.client.handler.ApiClient;
//import ca.uqam.tool.vivoproxy.swagger.client.handler.ApiException;
//import ca.uqam.tool.vivoproxy.swagger.client.handler.Configuration;
//import ca.uqam.tool.vivoproxy.swagger.client.handler.auth.*;
//import ca.uqam.tool.vivoproxy.swagger.client.api.ConceptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ConceptApi apiInstance = new ConceptApi();
Concept body = new Concept(); // Concept | Created skos concept
try {
    ModelAPIResponse result = apiInstance.createConcept(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConceptApi#createConcept");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Concept**](Concept.md)| Created skos concept |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createConceptWithNewIRI"></a>
# **createConceptWithNewIRI**
> ModelAPIResponse createConceptWithNewIRI(body)

Create a concept(skos:Concept) in VIVO (IRI generated by VIVO)

This can only be done by the logged in person.

### Example
```java
// Import classes:
//import ca.uqam.tool.vivoproxy.swagger.client.handler.ApiClient;
//import ca.uqam.tool.vivoproxy.swagger.client.handler.ApiException;
//import ca.uqam.tool.vivoproxy.swagger.client.handler.Configuration;
//import ca.uqam.tool.vivoproxy.swagger.client.handler.auth.*;
//import ca.uqam.tool.vivoproxy.swagger.client.api.ConceptApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

ConceptApi apiInstance = new ConceptApi();
Concept body = new Concept(); // Concept | Created skos concept
try {
    ModelAPIResponse result = apiInstance.createConceptWithNewIRI(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ConceptApi#createConceptWithNewIRI");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**Concept**](Concept.md)| Created skos concept |

### Return type

[**ModelAPIResponse**](ModelAPIResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json
