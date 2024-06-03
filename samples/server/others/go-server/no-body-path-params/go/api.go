// Code generated by OpenAPI Generator (https://openapi-generator.tech); DO NOT EDIT.

/*
 * Simple no path and body param spec
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * API version: 1.0.0
 */

package petstoreserver

import (
	"context"
	"net/http"
)



// BodyAPIRouter defines the required methods for binding the api requests to a responses for the BodyAPI
// The BodyAPIRouter implementation should parse necessary information from the http request,
// pass the data to a BodyAPIServicer to perform the required actions, then write the service results to the http response.
type BodyAPIRouter interface { 
	Body(http.ResponseWriter, *http.Request)
}
// BothAPIRouter defines the required methods for binding the api requests to a responses for the BothAPI
// The BothAPIRouter implementation should parse necessary information from the http request,
// pass the data to a BothAPIServicer to perform the required actions, then write the service results to the http response.
type BothAPIRouter interface { 
	Both(http.ResponseWriter, *http.Request)
}
// NoneAPIRouter defines the required methods for binding the api requests to a responses for the NoneAPI
// The NoneAPIRouter implementation should parse necessary information from the http request,
// pass the data to a NoneAPIServicer to perform the required actions, then write the service results to the http response.
type NoneAPIRouter interface { 
	One(http.ResponseWriter, *http.Request)
}
// PathAPIRouter defines the required methods for binding the api requests to a responses for the PathAPI
// The PathAPIRouter implementation should parse necessary information from the http request,
// pass the data to a PathAPIServicer to perform the required actions, then write the service results to the http response.
type PathAPIRouter interface { 
	Path(http.ResponseWriter, *http.Request)
}


// BodyAPIServicer defines the api actions for the BodyAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type BodyAPIServicer interface { 
	Body(context.Context, BodyRequest) (ImplResponse, error)
}


// BothAPIServicer defines the api actions for the BothAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type BothAPIServicer interface { 
	Both(context.Context, string, BodyRequest) (ImplResponse, error)
}


// NoneAPIServicer defines the api actions for the NoneAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type NoneAPIServicer interface { 
	One(context.Context) (ImplResponse, error)
}


// PathAPIServicer defines the api actions for the PathAPI service
// This interface intended to stay up to date with the openapi yaml used to generate it,
// while the service implementation can be ignored with the .openapi-generator-ignore file
// and updated with the logic required for the API.
type PathAPIServicer interface { 
	Path(context.Context, string) (ImplResponse, error)
}
