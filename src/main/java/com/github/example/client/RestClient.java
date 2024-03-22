package main.java.com.github.example.client;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import main.java.com.github.example.util.EnvironmentReader;

import java.util.HashMap;

public class RestClient {

    private RequestSpecification baseRequestSpecification;

    public RestClient() {
        baseRequestSpecification = createBaseRequestSpecification();
    }

    private RequestSpecification createBaseRequestSpecification() {
        return new RequestSpecBuilder()
                .setBaseUri(EnvironmentReader.getBaseUri())
                .addHeader("X-GitHub-Api-Version", "2022-11-28")
                .build()
                .log().all();
    }

    private RequestSpecification createRequestSpecification() {
        return baseRequestSpecification;
    }

    public Response executePostRequest(String requestBody, HashMap<String, String> headers, String apiPath) {
        return RestAssured.given()
                .spec(createRequestSpecification())
                .headers(headers)
                .body(requestBody)
                .post(apiPath)
                .thenReturn();
    }

    public Response executeDeleteRequest(String apiPath) {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Accept", "application/vnd.github+json");
        headers.put("Authorization", "token " + EnvironmentReader.getAccessToken());

        return RestAssured.given()
                .spec(createRequestSpecification())
                .headers(headers)
                .delete(apiPath)
                .thenReturn();
    }
}
