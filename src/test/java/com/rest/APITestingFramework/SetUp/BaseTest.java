package com.rest.APITestingFramework.SetUp;

import com.rest.APITestingFramework.Utilities.ExcelReader;
import io.restassured.RestAssured;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class BaseTest {

    public static Properties config = new Properties();
    public FileInputStream fis;
    //public static ExcelReader excel = new ExcelReader("./src/main/resources/Excels/testData.xlsx");
    @BeforeSuite
    public void setUp() throws IOException {

        fis = new FileInputStream("./src/main/resources/properties/config.properties");
        config.load(fis);


        RestAssured.baseURI = config.getProperty("baseURI");
        RestAssured.basePath = config.getProperty("basePATH");

    }
    @AfterSuite
    public void teatDown(){

    }
}
