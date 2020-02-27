package co.pragra.springlearning;

import java.text.NumberFormat;

public class Iphone {
    private GSM gsm;
    private NumberFormat format;


    public Iphone(GSM gsm) {
        this.gsm = gsm;
    }
    public void beforeCreation(){
        System.out.println("just added another camera");
    }
    public void destroy(){
        System.out.println("all gone");
    }

    public GSM getGsm() {
        return gsm;
    }

    public void setGsm(GSM gsm) {
        this.gsm = gsm;
    }

    public NumberFormat getFormat() {
        return format;
    }

    public void setFormat(NumberFormat format) {
        this.format = format;
    }
}
