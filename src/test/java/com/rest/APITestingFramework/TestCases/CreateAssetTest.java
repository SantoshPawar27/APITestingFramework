package com.rest.APITestingFramework.TestCases;
import static io.restassured.RestAssured.*;

import com.rest.APITestingFramework.APIs.CreateAssetAPI;
import com.rest.APITestingFramework.Listeners.ExtentListeners;
import com.rest.APITestingFramework.SetUp.BaseTest;
import com.rest.APITestingFramework.Utilities.DataUtility;
import come.rest.APITestingFramework.Pojo.AssetCreate;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Map;

public class CreateAssetTest extends BaseTest {

    @Test(dataProviderClass = DataUtility.class, dataProvider = "getAssetData", priority = 0)
    public void ValidateCreateAssetAPI(AssetCreate assetCreate){
        Map response = CreateAssetAPI.sendPostRequestToCreateAssetAPI(assetCreate);
        ExtentListeners.testReport.get().info("This API for asset creation with valid Mobile Number.");
        ExtentListeners.testReport.get().info("Validating post asset creation message.");

        //Reading the Nested JSON response & extracting the values
        //https://www.youtube.com/watch?v=VtKATzX5nJ0
        Assert.assertEquals((String) response.get("status"), "success",(String) response.get("message"));
        /*if(status.equalsIgnoreCase("success")){
            Map<String,String> data = (Map<String, String>) response.get("data");
            Assert.assertEquals(data.get("assetStatus"), "CREATED", "Asset did not Created.");
        } else if (status.equalsIgnoreCase("failure")) {

            Assert.assertEquals(response.get("message"), "Asset with this code already exists");
        }*/

        // response.prettyPrint();
    }

    @Test(dataProviderClass = DataUtility.class, dataProvider = "getAssetData", priority = 1)
    public void ValidateDuplicateCreateAssetAPI(AssetCreate assetCreate){
        Response response = CreateAssetAPI.sendPostRequestToCreateAssetWithDuplicateAssetIDAPI(assetCreate);
        ExtentListeners.testReport.get().info(assetCreate.toString());
        response.prettyPrint();
        JsonPath jsonPath = response.jsonPath();
        String message = jsonPath.get("message");
        String status = jsonPath.get("status");

        Assert.assertEquals(jsonPath.get("message"), "Asset with this code already exists", "Given Mobile number already exist in the system.");
    }

}


























