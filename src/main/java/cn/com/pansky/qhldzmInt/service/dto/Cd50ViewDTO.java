package cn.com.pansky.qhldzmInt.service.dto;


import java.util.List;

public class Cd50ViewDTO implements java.io.Serializable {


    private static final long serialVersionUID = 1675220690361570846L;

    private Double bcd501;
    private Double bcd502;
    private String aaa021;
    private  String aaa020;
    private String bcd503;
    private List<Cd50ViewDTO> cd50List;
    private List<Cd50ViewDTO> cd50List2;
    private Cd50ViewDTO cd50ViewDTO;

    public String getAaa020() {
        return aaa020;
    }

    public void setAaa020(String aaa020) {
        this.aaa020 = aaa020;
    }

    public Cd50ViewDTO getCd50ViewDTO() {
        return cd50ViewDTO;
    }

    public void setCd50ViewDTO(Cd50ViewDTO cd50ViewDTO) {
        this.cd50ViewDTO = cd50ViewDTO;
    }

    public List<Cd50ViewDTO> getCd50List2() {
        return cd50List2;
    }

    public void setCd50List2(List<Cd50ViewDTO> cd50List2) {
        this.cd50List2 = cd50List2;
    }

    public List<Cd50ViewDTO> getCd50List() {
        return cd50List;
    }

    public void setCd50List(List<Cd50ViewDTO> cd50List) {
        this.cd50List = cd50List;
    }

    public Cd50ViewDTO() {

    }

    public Double getBcd501() {
        return bcd501;
    }

    public void setBcd501(Double bcd501) {
        this.bcd501 = bcd501;
    }

    public Double getBcd502() {
        return bcd502;
    }

    public void setBcd502(Double bcd502) {
        this.bcd502 = bcd502;
    }

    public String getAaa021() {
        return aaa021;
    }

    public void setAaa021(String aaa021) {
        this.aaa021 = aaa021;
    }

    public String getBcd503() {
        return bcd503;
    }

    public void setBcd503(String bcd503) {
        this.bcd503 = bcd503;
    }
}
