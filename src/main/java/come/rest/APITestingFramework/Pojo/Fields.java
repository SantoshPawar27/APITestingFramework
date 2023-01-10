package come.rest.APITestingFramework.Pojo;

public class Fields {

    private String name;
    private String inputValue;

    public Fields(String name, String inputValue){
        this.name = name;
        this.inputValue=inputValue;
    }

    public Fields() {

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
    }
}