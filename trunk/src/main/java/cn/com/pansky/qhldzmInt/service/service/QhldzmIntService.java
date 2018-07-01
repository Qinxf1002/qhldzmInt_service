package cn.com.pansky.qhldzmInt.service.service;

import cn.com.pansky.qhldzmInt.service.dto.Cd50ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd51ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd52ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd53ViewDTO;

import java.util.List;

public interface QhldzmIntService {

    public Cd50ViewDTO findCd50(String aae036, String aae017) throws Exception;
    public Cd50ViewDTO findCd500(String aae036, String aae017) throws Exception;
    public List findCd50Year() throws Exception;

    public Cd51ViewDTO findCd51(String adc210, String aae017) throws Exception;
    public List findCd51Year() throws Exception;

    public Cd52ViewDTO findCd52(String bcc80b, String aae017) throws Exception;
    public List findCd52Year() throws Exception;

    public Cd53ViewDTO findCd53(String bcca45, String aae017) throws Exception;
    public List findCd53Year() throws Exception;

}
