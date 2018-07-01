package cn.com.pansky.qhldzmInt.service.dto;


import java.util.List;

public class Cd53ViewDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1675220690361570846L;

    private Double bcd531;
    private Double bcd532;
    private String aaa021;
    private String bcd533;
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

    public List<Cd53ViewDTO> getCd53List() {
        return cd53List;
    }

    public void setCd53List(List<Cd53ViewDTO> cd53List) {
        this.cd53List = cd53List;
    }

    private List<Cd53ViewDTO> cd53List;

    public Cd53ViewDTO() {

    }

    public Double getBcd531() {
        return bcd531;
    }

    public void setBcd531(Double bcd531) {
        this.bcd531 = bcd531;
    }

    public Double getBcd532() {
        return bcd532;
    }

    public void setBcd532(Double bcd532) {
        this.bcd532 = bcd532;
    }

    public String getAaa021() {
        return aaa021;
    }

    public void setAaa021(String aaa021) {
        this.aaa021 = aaa021;
    }

    public String getBcd533() {
        return bcd533;
    }

    public void setBcd533(String bcd533) {
        this.bcd533 = bcd533;
    }
}
