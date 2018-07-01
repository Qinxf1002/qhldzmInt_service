package cn.com.pansky.qhldzmInt.service.dto;


import java.util.List;

public class Cd51ViewDTO implements java.io.Serializable {

    private static final long serialVersionUID = 1675220690361570846L;

    private Double bcd511;
    private Double bcd512;
    private String aaa021;
    private String bcd513;
    private String aaa020;

    public String getAaa020() {
        return aaa020;
    }

    public void setAaa020(String aaa020) {
        this.aaa020 = aaa020;
    }

    public List<Cd51ViewDTO> getCd51List() {
        return cd51List;
    }

    public void setCd51List(List<Cd51ViewDTO> cd51List) {
        this.cd51List = cd51List;
    }

    private List<Cd51ViewDTO> cd51List;

    public Cd51ViewDTO() {

    }

    public Double getBcd511() {
        return bcd511;
    }

    public void setBcd511(Double bcd511) {
        this.bcd511 = bcd511;
    }

    public Double getBcd512() {
        return bcd512;
    }

    public void setBcd512(Double bcd512) {
        this.bcd512 = bcd512;
    }

    public String getAaa021() {
        return aaa021;
    }

    public void setAaa021(String aaa021) {
        this.aaa021 = aaa021;
    }

    public String getBcd513() {
        return bcd513;
    }

    public void setBcd513(String bcd513) {
        this.bcd513 = bcd513;
    }
}
