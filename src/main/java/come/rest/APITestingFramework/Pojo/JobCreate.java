package come.rest.APITestingFramework.Pojo;

public class JobCreate {

        private String storeCode;
        private String jobCode;
        private String assetCode;
        private String assetName;
        private String secondoryUniqueId;
        private  String customerName;
        private String customerMobileNo;
        private String dropAddress;
        private int demand;
        private String jobType;
        private long templateId;
        private long createJobStatusId;
        private boolean devEnvironment;
        private String orderDateStr;
        private String etaStr;

        private String expectedTimeStr;
        private int collectableAmount;
        private int totalAmount;
        private boolean doGeocode;
        private double customerLatitude;
        private double customerLongitude;
        private double dropLatitude;
        private double dropLongitude;
        private String dropLocation;

        public String getStoreCode() {
                return storeCode;
        }

        public void setStoreCode(String storeCode) {
                this.storeCode = storeCode;
        }

        public String getJobCode() {
                return jobCode;
        }

        public void setJobCode(String jobCode) {
                this.jobCode = jobCode;
        }

        public String getAssetCode() {
                return assetCode;
        }

        public void setAssetCode(String assetCode) {
                this.assetCode = assetCode;
        }

        public String getAssetName() {
                return assetName;
        }

        public void setAssetName(String assetName) {
                this.assetName = assetName;
        }

        public String getSecondoryUniqueId() {
                return secondoryUniqueId;
        }

        public void setSecondoryUniqueId(String secondoryUniqueId) {
                this.secondoryUniqueId = secondoryUniqueId;
        }

        public String getCustomerName() {
                return customerName;
        }

        public void setCustomerName(String customerName) {
                this.customerName = customerName;
        }

        public String getCustomerMobileNo() {
                return customerMobileNo;
        }

        public void setCustomerMobileNo(String customerMobileNo) {
                this.customerMobileNo = customerMobileNo;
        }

        public String getDropAddress() {
                return dropAddress;
        }

        public void setDropAddress(String dropAddress) {
                this.dropAddress = dropAddress;
        }

        public int getDemand() {
                return demand;
        }

        public void setDemand(int demand) {
                this.demand = demand;
        }

        public String getJobType() {
                return jobType;
        }

        public void setJobType(String jobType) {
                this.jobType = jobType;
        }

        public long getTemplateId() {
                return templateId;
        }

        public void setTemplateId(long templateId) {
                this.templateId = templateId;
        }

        public long getCreateJobStatusId() {
                return createJobStatusId;
        }

        public void setCreateJobStatusId(long createJobStatusId) {
                this.createJobStatusId = createJobStatusId;
        }

        public boolean isDevEnvironment() {
                return devEnvironment;
        }

        public void setDevEnvironment(boolean devEnvironment) {
                this.devEnvironment = devEnvironment;
        }

        public String getOrderDateStr() {
                return orderDateStr;
        }

        public void setOrderDateStr(String orderDateStr) {
                this.orderDateStr = orderDateStr;
        }

        public String getEtaStr() {
                return etaStr;
        }

        public void setEtaStr(String etaStr) {
                this.etaStr = etaStr;
        }

        public int getCollectableAmount() {
                return collectableAmount;
        }

        public void setCollectableAmount(int collectableAmount) {
                this.collectableAmount = collectableAmount;
        }

        public int getTotalAmount() {
                return totalAmount;
        }

        public void setTotalAmount(int totalAmount) {
                this.totalAmount = totalAmount;
        }

        public boolean isDoGeocode() {
                return doGeocode;
        }

        public void setDoGeocode(boolean doGeocode) {
                this.doGeocode = doGeocode;
        }

        public double getCustomerLatitude() {
                return customerLatitude;
        }

        public void setCustomerLatitude(double customerLatitude) {
                this.customerLatitude = customerLatitude;
        }

        public double getCustomerLongitude() {
                return customerLongitude;
        }

        public void setCustomerLongitude(double customerLongitude) {
                this.customerLongitude = customerLongitude;
        }

        public double getDropLatitude() {
                return dropLatitude;
        }

        public void setDropLatitude(double dropLatitude) {
                this.dropLatitude = dropLatitude;
        }

        public double getDropLongitude() {
                return dropLongitude;
        }

        public void setDropLongitude(double dropLongitude) {
                this.dropLongitude = dropLongitude;
        }

        public String getDropLocation() {
                return dropLocation;
        }

        public void setDropLocation(String dropLocation) {
                this.dropLocation = dropLocation;
        }
        public String getExpectedTimeStr() {
                return expectedTimeStr;
        }

        public void setExpectedTimeStr(String expectedTimeStr) {
                this.expectedTimeStr = expectedTimeStr;
        }

}
