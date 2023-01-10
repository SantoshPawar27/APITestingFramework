package com.rest.APITestingFramework.Utilities;

import com.rest.APITestingFramework.SetUp.BaseTest;
import come.rest.APITestingFramework.Pojo.*;

import com.rest.APITestingFramework.SetUp.BaseTest;
import come.rest.APITestingFramework.Pojo.AssetCreate;
import come.rest.APITestingFramework.Pojo.Fields;
import org.testng.annotations.DataProvider;

import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;


public class DataUtility extends BaseTest {
    private static String projectPath = "/src/main/resources/Excels/testData.xlsx";
    protected ExcelReader excelReader = new ExcelReader(System.getProperty("user.dir") + projectPath);
    int totalRows = 0;
    int testCaseRowNum = 0;
    int dataStartRowNum = 0;
    int testRows = 0;
    int columnStartColumnNum = 0;
    int testColumns = 0;
    AssetCreate assetCreate = new AssetCreate();
    Fields fields = new Fields();
    JobCreate jobCreate = new JobCreate();

    public DataUtility() throws IOException {
    }

    @DataProvider(name = "getAssetData")
    public Object[][] getAssetData(Method method) throws IOException {
        ArrayList<String> createAssetData = new ArrayList<String>();
        String testName = method.getName();
        getExcelDetails(Constants.AssetDataSheet, testName);

        //Fetching  Data from Excel Sheet
        for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + testRows); rNum++) {
            for (int cNum = 0; cNum < testColumns; cNum++) {
                createAssetData.add(excelReader.getCellData(Constants.AssetDataSheet, cNum, rNum));
            }
        }
        assetCreate.setStoreId(createAssetData.get(0));
        Fields assetFields01 = new Fields("name", createAssetData.get(1));
        Fields assetFields02 = new Fields("mobileNo", createAssetData.get(2));
        List<Fields> allFields = new ArrayList<>();
        allFields.add(assetFields01);
        allFields.add(assetFields02);
        assetCreate.setFields(allFields);
        Object[][] obj = {{assetCreate}};
        return obj;

    }

    @DataProvider(name = "getJobData")
    public Object[][] getAJObData(Method method) throws IOException {

        String testName = method.getName();
        getExcelDetails(Constants.JobDataSheet, testName);
        ArrayList<String> createJobtData = new ArrayList<String>();
        //Printing Data
        for (int rNum = dataStartRowNum; rNum < (dataStartRowNum + testRows); rNum++) {
            for (int cNum = 0; cNum < testColumns; cNum++) {
                //System.out.println(excelReader.getCellData(Constants.AssetDataSheet,cNum,rNum));
                createJobtData.add(excelReader.getCellData(Constants.JobDataSheet, cNum, rNum));
            }
        }
        jobCreate.setStoreCode(createJobtData.get(0));
        jobCreate.setJobCode(createJobtData.get(1));
        jobCreate.setAssetCode(createJobtData.get(2));
        jobCreate.setAssetName(createJobtData.get(3));
        jobCreate.setSecondoryUniqueId(createJobtData.get(4));
        jobCreate.setCustomerName(createJobtData.get(5));
        jobCreate.setCustomerMobileNo(createJobtData.get(6));
        jobCreate.setDropAddress(createJobtData.get(7));
        jobCreate.setDemand(Integer.parseInt(createJobtData.get(8)));
        jobCreate.setJobType(createJobtData.get(9));
        jobCreate.setTemplateId(Long.parseLong(createJobtData.get(10)));
        jobCreate.setCreateJobStatusId(Long.parseLong(createJobtData.get(11)));
        System.out.println("ID = " + Long.parseLong(createJobtData.get(11)));
        jobCreate.setDevEnvironment(Boolean.parseBoolean(createJobtData.get(12)));
        jobCreate.setOrderDateStr(createJobtData.get(13));
        jobCreate.setEtaStr(createJobtData.get(14));
        jobCreate.setExpectedTimeStr(createJobtData.get(15));
        jobCreate.setCollectableAmount(Integer.parseInt(createJobtData.get(16)));
        jobCreate.setTotalAmount(Integer.parseInt(createJobtData.get(17)));
        jobCreate.setDoGeocode(Boolean.parseBoolean(createJobtData.get(18)));
        jobCreate.setCustomerLatitude(Double.parseDouble(createJobtData.get(19)));
        jobCreate.setCustomerLongitude(Double.parseDouble(createJobtData.get(20)));
        jobCreate.setDropLatitude(Double.parseDouble(createJobtData.get(21)));
        jobCreate.setDropLongitude(Double.parseDouble(createJobtData.get(22)));
        jobCreate.setDropLocation(createJobtData.get(23));
        Object[][] obj = {{jobCreate}};
        System.out.println("Data = " + jobCreate.toString());
        return obj;

    }

    public void getExcelDetails(String sheetName, String testName) {

        totalRows = 0;
        testCaseRowNum = 0;
        dataStartRowNum = 0;
        testRows = 0;
        columnStartColumnNum = 0;
        testColumns = 0;
        totalRows = excelReader.getRowCount(sheetName);
        //  Find the test case starts Row
        testCaseRowNum = 1;
        for (testCaseRowNum = 1; testCaseRowNum <= totalRows; testCaseRowNum++) {
            String testCaseName = excelReader.getCellData(sheetName, 0, testCaseRowNum);
            if (testCaseName.equalsIgnoreCase(testName))
                break;
        }

        // Checking total rows in the test case
        dataStartRowNum = testCaseRowNum + 2;
        testRows = 0;
        while (!excelReader.getCellData(sheetName, 0, dataStartRowNum + testRows).equals("")) {
            testRows++;
        }

        // Checking total columns in the test case
        columnStartColumnNum = testCaseRowNum + 1;
        testColumns = 0;
        while (!excelReader.getCellData(sheetName, testColumns, columnStartColumnNum).equals("")) {
            testColumns++;
        }

    }


}






