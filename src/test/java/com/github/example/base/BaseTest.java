package test.java.com.github.example.base;

import com.google.gson.Gson;
import io.restassured.response.Response;
import main.java.com.github.example.ApiContext;
import main.java.com.github.example.client.RestClient;
import main.java.com.github.example.context.ScenarioContext;
import main.java.com.github.example.data.DataGenerator;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;


public class BaseTest {
    protected RestClient restClient;
    protected DataGenerator dataGenerator;
    protected ScenarioContext scenarioContext;


    @BeforeTest
    public void setConfig() {
        restClient = new RestClient();
        dataGenerator = new DataGenerator();
        scenarioContext = new ScenarioContext();
    }

    @AfterMethod
    public void cleanup() {
        if (scenarioContext.containsContext(ApiContext.REPO_USER_AND_NAME)) {
            String deleteApiPath = (String) scenarioContext.getContext(ApiContext.REPO_USER_AND_NAME);

            Response response = restClient.executeDeleteRequest("/repos" + deleteApiPath);
            System.out.println("DELETE Repository response status code is : " + response.getStatusCode());
        }

        scenarioContext.clearContext();
    }

    protected void logResponse(Response response) {
        System.out.println("Logged response : ");
        response.then().log().all();
    }

    protected String convertObjectToJson(Object object) {
        return new Gson().toJson(object);
    }

    protected <T> T convertResponseToClass(Response response, Class<T> clazz) {
        return new Gson().fromJson(response.asString(), clazz);
    }
}
