package test.java.com.github.example;

import io.restassured.response.Response;
import main.java.com.github.example.ApiContext;
import main.java.com.github.example.models.requests.CreateRepositoryReq;
import main.java.com.github.example.models.responses.CreateRepositoryResp;
import main.java.com.github.example.models.responses.CreateRepositoryValidationErrorResp;
import main.java.com.github.example.util.EnvironmentReader;
import org.testng.Assert;
import org.testng.annotations.Test;
import test.java.com.github.example.base.BaseTest;

import java.util.HashMap;

public class CreateRepositoryTests extends BaseTest {

    private static final String CREATE_USER_REPOSITORIES_API_PATH = "/user/repos";


    @Test
    public void verifyAuthenticatedUserCanCreateRepository() {
        //Given
        CreateRepositoryReq requestBody = dataGenerator.generateCreateRepositoryPOSTRequest();
        String requestBodyString = convertObjectToJson(requestBody);
        HashMap<String, String> headers = createHeadersWithAuthorization();

        // When
        Response response = restClient.executePostRequest(requestBodyString, headers, CREATE_USER_REPOSITORIES_API_PATH);
        logResponse(response);

        setScenarioContextPOSTResponseRepoUserAndName(response);

        // Then
        CreateRepositoryResp createRepositoryResp = convertResponseToClass(response, CreateRepositoryResp.class);

        Assert.assertEquals(response.getStatusCode(), 201);
        Assert.assertEquals(createRepositoryResp.getName(), requestBody.getName());
        Assert.assertEquals(createRepositoryResp.getDescription(), requestBody.getDescription());
    }

    @Test
    public void verifyAuthenticatedUserCanNotCreateRepositoryWhenEmptyRepositoryName() {
        //Given
        CreateRepositoryReq requestBody = dataGenerator.generateCreateRepositoryPOSTRequest();
        requestBody.setName("");

        String requestBodyString = convertObjectToJson(requestBody);
        HashMap<String, String> headers = createHeadersWithAuthorization();

        // When
        Response response = restClient.executePostRequest(requestBodyString, headers, CREATE_USER_REPOSITORIES_API_PATH);
        logResponse(response);

        setScenarioContextPOSTResponseRepoUserAndName(response);

        // Then
        Assert.assertEquals(response.getStatusCode(), 422);
        Assert.assertEquals(response.jsonPath().getString("message"), "Repository creation failed.");
    }

    //TODO add test cases for maxRepositoryNameLength validation and successful create

    @Test
    public void verifyAuthenticatedUserCanNotCreateTheSameRepositorySecondTime() {
        //Given
        CreateRepositoryReq requestBody = dataGenerator.generateCreateRepositoryPOSTRequest();
        String requestBodyString = convertObjectToJson(requestBody);
        HashMap<String, String> headers = createHeadersWithAuthorization();

        // When
        Response response = restClient.executePostRequest(requestBodyString, headers, CREATE_USER_REPOSITORIES_API_PATH);
        logResponse(response);

        setScenarioContextPOSTResponseRepoUserAndName(response);

        Response secondResponse = restClient.executePostRequest(requestBodyString, headers, CREATE_USER_REPOSITORIES_API_PATH);
        logResponse(secondResponse);

        // Then
        Assert.assertEquals(secondResponse.getStatusCode(), 422);
        Assert.assertEquals(secondResponse.jsonPath().getString("message"), "Repository creation failed.");
    }

    @Test
    public void verifyUnauthorizedUserCanNotCreateRepository() {
        //Given
        CreateRepositoryReq requestBody = dataGenerator.generateCreateRepositoryPOSTRequest();
        String requestBodyString = convertObjectToJson(requestBody);
        HashMap<String, String> headers = createHeadersWithAuthorization();
        headers.put("Authorization", "");

        // When
        Response response = restClient.executePostRequest(requestBodyString, headers, CREATE_USER_REPOSITORIES_API_PATH);
        logResponse(response);

        // Then
        CreateRepositoryValidationErrorResp createRepositoryValidationErrorResp = response.as(CreateRepositoryValidationErrorResp.class);

        Assert.assertEquals(response.getStatusCode(), 401);
        Assert.assertEquals(createRepositoryValidationErrorResp.getMessage(), "Requires authentication");
        Assert.assertEquals(createRepositoryValidationErrorResp.getDocumentation_url(), "https://docs.github.com/rest/repos/repos#create-a-repository-for-the-authenticated-user");
    }


    @Test
    public void verifyAuthenticatedUserCanNotCreateRepositoryWhenWrongApiPath() {
        //Given
        CreateRepositoryReq requestBody = dataGenerator.generateCreateRepositoryPOSTRequest();
        String requestBodyString = convertObjectToJson(requestBody);
        HashMap<String, String> headers = createHeadersWithAuthorization();

        // When
        Response response = restClient.executePostRequest(requestBodyString, headers, CREATE_USER_REPOSITORIES_API_PATH + "//");
        logResponse(response);

        setScenarioContextPOSTResponseRepoUserAndName(response);

        // Then
        CreateRepositoryValidationErrorResp createRepositoryValidationErrorResp = response.as(CreateRepositoryValidationErrorResp.class);

        Assert.assertEquals(response.getStatusCode(), 404);
        Assert.assertEquals(createRepositoryValidationErrorResp.getMessage(), "Not Found");
        Assert.assertEquals(createRepositoryValidationErrorResp.getDocumentation_url(), "https://docs.github.com/rest");
    }

    @Test
    public void verifyUserCanNotCreateRepositoryWhenNotCorrectTokenValue() {
        //Given
        CreateRepositoryReq requestBody = dataGenerator.generateCreateRepositoryPOSTRequest();
        String requestBodyString = convertObjectToJson(requestBody);
        HashMap<String, String> headers = createHeadersWithAuthorization();
        headers.put("Authorization", "token " + "fake");

        // When
        Response response = restClient.executePostRequest(requestBodyString, headers, CREATE_USER_REPOSITORIES_API_PATH);
        logResponse(response);

        // Then
        CreateRepositoryValidationErrorResp createRepositoryValidationErrorResp = response.as(CreateRepositoryValidationErrorResp.class);

        Assert.assertEquals(response.getStatusCode(), 401);
        Assert.assertEquals(createRepositoryValidationErrorResp.getMessage(), "Bad credentials");
        Assert.assertEquals(createRepositoryValidationErrorResp.getDocumentation_url(), "https://docs.github.com/rest");
    }

    private HashMap<String, String> createHeadersWithAuthorization() {
        HashMap<String, String> headers = new HashMap<>();
        headers.put("Content-Type", "application/json");
        headers.put("Authorization", "token " + EnvironmentReader.getAccessToken());
        return headers;
    }

    private void setScenarioContextPOSTResponseRepoUserAndName(Response response) {
        //set in scenarioContext repository full name for delete at the end of the test
        if (response.getStatusCode() == 201) {
            String fullName = response.jsonPath().getString("full_name");
            scenarioContext.setContext(ApiContext.REPO_USER_AND_NAME, "/" + fullName);
        }
    }
}
