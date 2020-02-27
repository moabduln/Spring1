package co.pragra.springlearning;

public class GSM3G implements GSM {
    private String type;
    @Override
    public String getversion() {
        return "GSM3G";
    }
    public String getType(){
        return type;
    }
    public void setType(String type){
        this.type = type;
    }


}
