package come.rest.APITestingFramework.Pojo;

import java.util.List;

public class AssetCreate {

    private String storeId;
    private List<Fields> fields;




    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public List<Fields> getFields() {
        return fields;
    }

    public void setFields(List<Fields> fields) {
        this.fields = fields;
    }
}