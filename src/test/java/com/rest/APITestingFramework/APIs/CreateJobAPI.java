package com.rest.APITestingFramework.APIs;

import com.rest.APITestingFramework.SetUp.BaseTest;
import come.rest.APITestingFramework.Pojo.AssetCreate;
import come.rest.APITestingFramework.Pojo.JobCreate;
import io.restassured.http.ContentType;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class CreateJobAPI extends BaseTest {

    public static Map sendPostRequestToCreateJOBAPI(JobCreate jobCreate){

        Map response = given()
                .header("CLIENT_ID", config.getProperty("clientID"))
                .header("Content-Type", config.getProperty("contentType"))
                .contentType(ContentType.JSON).body(jobCreate)
                .post(config.getProperty("jobCreateAPIEndPoint"))
                .as(Map.class);
        return response;
    }


}

