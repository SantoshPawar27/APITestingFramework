package com.rest.APITestingFramework.Utilities;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import come.rest.APITestingFramework.Pojo.JobCreate;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import com.rest.APITestingFramework.SetUp.BaseTest;
import come.rest.APITestingFramework.Pojo.AssetCreate;
import come.rest.APITestingFramework.Pojo.Fields;

import java.io.IOException;
import java.util.ArrayList;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

import org.testng.annotations.Test;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;
import org.json.*;
public class RoughClass {

    public static void main(String args[]) throws IOException {
    String projectPath = "/src/main/resources/Excels/testData.xlsx";

    ExcelReader excelReader = new ExcelReader(System.getProperty("user.dir") + projectPath);
        JobCreate jobCreate = new JobCreate();

        int totalRows = excelReader.getRowCount(Constants.JobDataSheet);
        System.out.println(totalRows);
        String testName = "ValidateCreateJobAPI";
        //  Find the test case starts Row
        int testCaseRowNum = 1;
        for(testCaseRowNum=1; testCaseRowNum<=totalRows;testCaseRowNum++){
            String testCaseName = excelReader.getCellData(Constants.JobDataSheet,0,testCaseRowNum);
            if(testCaseName.equalsIgnoreCase(testName))
            break;
        }
        System.out.println("Test Case starts from Row Numb:" + testCaseRowNum );

        // Checking total rows in the test case
        int dataStartRowNum = testCaseRowNum+2;
        int testRows = 0;
        while(!excelReader.getCellData(Constants.JobDataSheet,0,dataStartRowNum+testRows).equals("")){
            testRows++;
        }
       System.out.println("Total rows of data are " + testRows);

        // Checking total columns in the test case
        int columnStartColumnNum = testCaseRowNum+1;
        int testColumns = 0;
        while (!excelReader.getCellData(Constants.JobDataSheet,testColumns, columnStartColumnNum).equals("")) {
            testColumns++;
        }
        System.out.println("Total columns of data are " + testColumns);
        ArrayList<String> createAssetData = new ArrayList<String>();
        //Printing Data
        for(int rNum = dataStartRowNum; rNum<(dataStartRowNum+testRows); rNum++){
            for(int cNum = 0; cNum<testColumns;cNum++){
                //System.out.println(excelReader.getCellData(Constants.AssetDataSheet,cNum,rNum));
                createAssetData.add(excelReader.getCellData(Constants.JobDataSheet,cNum,rNum));
            }
        }
        System.out.println(createAssetData.get(0));
        System.out.println(createAssetData.get(8));
        System.out.println(createAssetData.get(10));
        System.out.println(createAssetData.get(11));
        System.out.println(createAssetData.get(12));
        System.out.println(createAssetData.get(13));
        System.out.println(createAssetData.get(19));

    }
}


