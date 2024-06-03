/*
Echo Server API

Testing PathAPIService

*/

// Code generated by OpenAPI Generator (https://openapi-generator.tech);

package openapi

import (
	"context"
	"testing"

	openapiclient "github.com/GIT_USER_ID/GIT_REPO_ID"
	"github.com/stretchr/testify/assert"
	"github.com/stretchr/testify/require"
)

func Test_openapi_PathAPIService(t *testing.T) {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)

	t.Run("Test PathAPIService TestsPathStringPathStringIntegerPathInteger", func(t *testing.T) {

		t.Skip("skip test") // remove to run test

		var pathString string
		var pathInteger int32

		resp, httpRes, err := apiClient.PathAPI.TestsPathStringPathStringIntegerPathIntegerEnumNonrefStringPathEnumRefStringPath(context.Background(), pathString, pathInteger, pathString, openapiclient.SUCCESS).Execute()

		require.Nil(t, err)
		require.NotNil(t, resp)
		assert.Equal(t, 200, httpRes.StatusCode)

	})

}
