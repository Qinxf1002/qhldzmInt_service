package cn.com.pansky.qhldzmInt.service.dto;


import java.util.List;

public class Cd52ViewDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1675220690361570846L;
    private Double bcd521;
    private Double bcd522;
    private String aaa021;
    private String bcd523;
    private String aaa020;
    private Double aaa0200;

    public Double getAaa0200() {
        return aaa0200;
    }

    public void setAaa0200(Double aaa0200) {
        this.aaa0200 = aaa0200;
    }

    public String getAaa020() {
        return aaa020;
    }

    public void setAaa020(String aaa020) {
        this.aaa020 = aaa020;
    }

    public List<Cd52ViewDTO> getCd52List() {
        return cd52List;
    }

    public void setCd52List(List<Cd52ViewDTO> cd52List) {
        this.cd52List = cd52List;
    }

    private List<Cd52ViewDTO> cd52List;

    public Cd52ViewDTO() {

    }

    public Double getBcd521() {
        return bcd521;
    }

    public void setBcd521(Double bcd521) {
        this.bcd521 = bcd521;
    }

    public Double getBcd522() {
        return bcd522;
    }

    public void setBcd522(Double bcd522) {
        this.bcd522 = bcd522;
    }

    public String getAaa021() {
        return aaa021;
    }

    public void setAaa021(String aaa021) {
        this.aaa021 = aaa021;
    }

    public String getBcd523() {
        return bcd523;
    }

    public void setBcd523(String bcd523) {
        this.bcd523 = bcd523;
    }
}
