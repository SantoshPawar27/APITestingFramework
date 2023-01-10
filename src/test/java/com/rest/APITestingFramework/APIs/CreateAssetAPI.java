package com.rest.APITestingFramework.APIs;

import com.rest.APITestingFramework.SetUp.BaseTest;
import come.rest.APITestingFramework.Pojo.AssetCreate;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

import static io.restassured.RestAssured.given;

public class CreateAssetAPI extends BaseTest {

    public static Map sendPostRequestToCreateAssetAPI(AssetCreate assetCreate){

        Map response = given()
                .header("CLIENT_ID", config.getProperty("clientID"))
                .header("SECRET_ID",config.getProperty("secretID"))
                .header("USER_ID",config.getProperty("userID"))
                .header("Content-Type", config.getProperty("contentType"))
                .header("Referer", config.getProperty("referer"))
                .contentType(ContentType.JSON).body(assetCreate)
                .post(config.getProperty("assetCreateAPIEndPoint"))
                .as(Map.class);
        return response;
    }

    public static Response sendPostRequestToCreateAssetWithDuplicateAssetIDAPI(AssetCreate assetCreate){
        Response response = given()
                .header("CLIENT_ID", config.getProperty("clientID"))
                .header("SECRET_ID",config.getProperty("secretID"))
                .header("USER_ID",config.getProperty("userID"))
                .header("Content-Type", config.getProperty("contentType"))
                .header("Referer", config.getProperty("referer"))
                .contentType(ContentType.JSON).body(assetCreate)
                .post(config.getProperty("assetCreateAPIEndPoint"));
        return response;

    }
}
