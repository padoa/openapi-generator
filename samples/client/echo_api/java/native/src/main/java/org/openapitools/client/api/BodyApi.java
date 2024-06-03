/*
 * Echo Server API
 * Echo Server API
 *
 * The version of the OpenAPI document: 0.1.0
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api;

import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Pair;

import java.io.File;
import org.openapitools.client.model.Pet;
import org.openapitools.client.model.StringEnumRef;
import org.openapitools.client.model.Tag;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;

import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.http.HttpRequest;
import java.nio.channels.Channels;
import java.nio.channels.Pipe;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0-SNAPSHOT")
public class BodyApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public BodyApi() {
    this(new ApiClient());
  }

  public BodyApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Test binary (gif) response body
   * Test binary (gif) response body
   * @return File
   * @throws ApiException if fails to make API call
   */
  public File testBinaryGif() throws ApiException {
    ApiResponse<File> localVarResponse = testBinaryGifWithHttpInfo();
    return localVarResponse.getData();
  }

  /**
   * Test binary (gif) response body
   * Test binary (gif) response body
   * @return ApiResponse&lt;File&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<File> testBinaryGifWithHttpInfo() throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testBinaryGifRequestBuilder();
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testBinaryGif", localVarResponse);
        }
        return new ApiResponse<File>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<File>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testBinaryGifRequestBuilder() throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/binary/gif";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "image/gif");

    localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param body  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testBodyApplicationOctetstreamBinary(File body) throws ApiException {
    ApiResponse<String> localVarResponse = testBodyApplicationOctetstreamBinaryWithHttpInfo(body);
    return localVarResponse.getData();
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param body  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testBodyApplicationOctetstreamBinaryWithHttpInfo(File body) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testBodyApplicationOctetstreamBinaryRequestBuilder(body);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testBodyApplicationOctetstreamBinary", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testBodyApplicationOctetstreamBinaryRequestBuilder(File body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/body/application/octetstream/binary";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/octet-stream");
    localVarRequestBuilder.header("Accept", "text/plain");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test array of binary in multipart mime
   * Test array of binary in multipart mime
   * @param files  (required)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testBodyMultipartFormdataArrayOfBinary(List<File> files) throws ApiException {
    ApiResponse<String> localVarResponse = testBodyMultipartFormdataArrayOfBinaryWithHttpInfo(files);
    return localVarResponse.getData();
  }

  /**
   * Test array of binary in multipart mime
   * Test array of binary in multipart mime
   * @param files  (required)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testBodyMultipartFormdataArrayOfBinaryWithHttpInfo(List<File> files) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testBodyMultipartFormdataArrayOfBinaryRequestBuilder(files);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testBodyMultipartFormdataArrayOfBinary", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testBodyMultipartFormdataArrayOfBinaryRequestBuilder(List<File> files) throws ApiException {
    // verify the required parameter 'files' is set
    if (files == null) {
      throw new ApiException(400, "Missing the required parameter 'files' when calling testBodyMultipartFormdataArrayOfBinary");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/body/application/octetstream/array_of_binary";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain");

    MultipartEntityBuilder multiPartBuilder = MultipartEntityBuilder.create();
    boolean hasFiles = false;
    for (int i=0; i < files.size(); i++) {
        multiPartBuilder.addBinaryBody("files", files.get(i));
        hasFiles = true;
    }
    HttpEntity entity = multiPartBuilder.build();
    HttpRequest.BodyPublisher formDataPublisher;
    if (hasFiles) {
        Pipe pipe;
        try {
            pipe = Pipe.open();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new Thread(() -> {
            try (OutputStream outputStream = Channels.newOutputStream(pipe.sink())) {
                entity.writeTo(outputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        formDataPublisher = HttpRequest.BodyPublishers.ofInputStream(() -> Channels.newInputStream(pipe.source()));
    } else {
        ByteArrayOutputStream formOutputStream = new ByteArrayOutputStream();
        try {
            entity.writeTo(formOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        formDataPublisher = HttpRequest.BodyPublishers
            .ofInputStream(() -> new ByteArrayInputStream(formOutputStream.toByteArray()));
    }
    localVarRequestBuilder
        .header("Content-Type", entity.getContentType().getValue())
        .method("POST", formDataPublisher);
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test single binary in multipart mime
   * Test single binary in multipart mime
   * @param myFile  (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testBodyMultipartFormdataSingleBinary(File myFile) throws ApiException {
    ApiResponse<String> localVarResponse = testBodyMultipartFormdataSingleBinaryWithHttpInfo(myFile);
    return localVarResponse.getData();
  }

  /**
   * Test single binary in multipart mime
   * Test single binary in multipart mime
   * @param myFile  (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testBodyMultipartFormdataSingleBinaryWithHttpInfo(File myFile) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testBodyMultipartFormdataSingleBinaryRequestBuilder(myFile);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testBodyMultipartFormdataSingleBinary", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testBodyMultipartFormdataSingleBinaryRequestBuilder(File myFile) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/body/application/octetstream/single_binary";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "text/plain");

    MultipartEntityBuilder multiPartBuilder = MultipartEntityBuilder.create();
    boolean hasFiles = false;
    multiPartBuilder.addBinaryBody("my-file", myFile);
    hasFiles = true;
    HttpEntity entity = multiPartBuilder.build();
    HttpRequest.BodyPublisher formDataPublisher;
    if (hasFiles) {
        Pipe pipe;
        try {
            pipe = Pipe.open();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        new Thread(() -> {
            try (OutputStream outputStream = Channels.newOutputStream(pipe.sink())) {
                entity.writeTo(outputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
        formDataPublisher = HttpRequest.BodyPublishers.ofInputStream(() -> Channels.newInputStream(pipe.source()));
    } else {
        ByteArrayOutputStream formOutputStream = new ByteArrayOutputStream();
        try {
            entity.writeTo(formOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        formDataPublisher = HttpRequest.BodyPublishers
            .ofInputStream(() -> new ByteArrayInputStream(formOutputStream.toByteArray()));
    }
    localVarRequestBuilder
        .header("Content-Type", entity.getContentType().getValue())
        .method("POST", formDataPublisher);
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet testEchoBodyAllOfPet(Pet pet) throws ApiException {
    ApiResponse<Pet> localVarResponse = testEchoBodyAllOfPetWithHttpInfo(pet);
    return localVarResponse.getData();
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @return ApiResponse&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Pet> testEchoBodyAllOfPetWithHttpInfo(Pet pet) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testEchoBodyAllOfPetRequestBuilder(pet);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testEchoBodyAllOfPet", localVarResponse);
        }
        return new ApiResponse<Pet>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Pet>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testEchoBodyAllOfPetRequestBuilder(Pet pet) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/echo/body/allOf/Pet";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(pet);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test free form object
   * Test free form object
   * @param body Free form object (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyFreeFormObjectResponseString(Object body) throws ApiException {
    ApiResponse<String> localVarResponse = testEchoBodyFreeFormObjectResponseStringWithHttpInfo(body);
    return localVarResponse.getData();
  }

  /**
   * Test free form object
   * Test free form object
   * @param body Free form object (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testEchoBodyFreeFormObjectResponseStringWithHttpInfo(Object body) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testEchoBodyFreeFormObjectResponseStringRequestBuilder(body);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testEchoBodyFreeFormObjectResponseString", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testEchoBodyFreeFormObjectResponseStringRequestBuilder(Object body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/echo/body/FreeFormObject/response_string";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @return Pet
   * @throws ApiException if fails to make API call
   */
  public Pet testEchoBodyPet(Pet pet) throws ApiException {
    ApiResponse<Pet> localVarResponse = testEchoBodyPetWithHttpInfo(pet);
    return localVarResponse.getData();
  }

  /**
   * Test body parameter(s)
   * Test body parameter(s)
   * @param pet Pet object that needs to be added to the store (optional)
   * @return ApiResponse&lt;Pet&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Pet> testEchoBodyPetWithHttpInfo(Pet pet) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testEchoBodyPetRequestBuilder(pet);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testEchoBodyPet", localVarResponse);
        }
        return new ApiResponse<Pet>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Pet>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testEchoBodyPetRequestBuilder(Pet pet) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/echo/body/Pet";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(pet);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test empty response body
   * Test empty response body
   * @param pet Pet object that needs to be added to the store (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyPetResponseString(Pet pet) throws ApiException {
    ApiResponse<String> localVarResponse = testEchoBodyPetResponseStringWithHttpInfo(pet);
    return localVarResponse.getData();
  }

  /**
   * Test empty response body
   * Test empty response body
   * @param pet Pet object that needs to be added to the store (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testEchoBodyPetResponseStringWithHttpInfo(Pet pet) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testEchoBodyPetResponseStringRequestBuilder(pet);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testEchoBodyPetResponseString", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testEchoBodyPetResponseStringRequestBuilder(Pet pet) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/echo/body/Pet/response_string";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(pet);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test string enum response body
   * Test string enum response body
   * @param body String enum (optional)
   * @return StringEnumRef
   * @throws ApiException if fails to make API call
   */
  public StringEnumRef testEchoBodyStringEnum(String body) throws ApiException {
    ApiResponse<StringEnumRef> localVarResponse = testEchoBodyStringEnumWithHttpInfo(body);
    return localVarResponse.getData();
  }

  /**
   * Test string enum response body
   * Test string enum response body
   * @param body String enum (optional)
   * @return ApiResponse&lt;StringEnumRef&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<StringEnumRef> testEchoBodyStringEnumWithHttpInfo(String body) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testEchoBodyStringEnumRequestBuilder(body);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testEchoBodyStringEnum", localVarResponse);
        }
        return new ApiResponse<StringEnumRef>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<StringEnumRef>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testEchoBodyStringEnumRequestBuilder(String body) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/echo/body/string_enum";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(body);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Test empty json (request body)
   * Test empty json (request body)
   * @param tag Tag object (optional)
   * @return String
   * @throws ApiException if fails to make API call
   */
  public String testEchoBodyTagResponseString(Tag tag) throws ApiException {
    ApiResponse<String> localVarResponse = testEchoBodyTagResponseStringWithHttpInfo(tag);
    return localVarResponse.getData();
  }

  /**
   * Test empty json (request body)
   * Test empty json (request body)
   * @param tag Tag object (optional)
   * @return ApiResponse&lt;String&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<String> testEchoBodyTagResponseStringWithHttpInfo(Tag tag) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = testEchoBodyTagResponseStringRequestBuilder(tag);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("testEchoBodyTagResponseString", localVarResponse);
        }
        // for plain text response
        if (localVarResponse.headers().map().containsKey("Content-Type") &&
                "text/plain".equalsIgnoreCase(localVarResponse.headers().map().get("Content-Type").get(0).split(";")[0].trim())) {
          java.util.Scanner s = new java.util.Scanner(localVarResponse.body()).useDelimiter("\\A");
          String responseBodyText = s.hasNext() ? s.next() : "";
          return new ApiResponse<String>(
                  localVarResponse.statusCode(),
                  localVarResponse.headers().map(),
                  responseBodyText
          );
        } else {
            throw new RuntimeException("Error! The response Content-Type is supposed to be `text/plain` but it's not: " + localVarResponse);
        }
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder testEchoBodyTagResponseStringRequestBuilder(Tag tag) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/echo/body/Tag/response_string";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "text/plain");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(tag);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}
