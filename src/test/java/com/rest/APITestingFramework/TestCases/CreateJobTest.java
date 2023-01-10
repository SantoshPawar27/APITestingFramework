package com.rest.APITestingFramework.TestCases;

import com.rest.APITestingFramework.APIs.CreateAssetAPI;
import com.rest.APITestingFramework.APIs.CreateJobAPI;
import com.rest.APITestingFramework.Listeners.ExtentListeners;
import com.rest.APITestingFramework.SetUp.BaseTest;
import com.rest.APITestingFramework.Utilities.DataUtility;
import come.rest.APITestingFramework.Pojo.AssetCreate;
import come.rest.APITestingFramework.Pojo.JobCreate;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class CreateJobTest extends BaseTest {

    @Test(dataProviderClass = DataUtility.class, dataProvider = "getJobData", priority = 2)
    public void ValidateCreateJobAPI(JobCreate jobCreate){
        Map response = CreateJobAPI.sendPostRequestToCreateJOBAPI(jobCreate);
        ExtentListeners.testReport.get().info("This API for JOB creation with valid Details.");
        //Reading the Nested JSON response & extracting the values
        //https://www.youtube.com/watch?v=VtKATzX5nJ0
        String message = (String) response.get("message");

        Assert.assertEquals(message, "Asset is in checked out or created state in the system.", "Job Did not created.");
        // response.prettyPrint();
    }

}
