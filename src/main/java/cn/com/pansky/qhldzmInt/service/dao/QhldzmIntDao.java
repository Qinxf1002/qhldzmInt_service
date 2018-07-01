package cn.com.pansky.qhldzmInt.service.dao;

import cn.com.pansky.qhldzmInt.service.dto.Cd50ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd51ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd52ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd53ViewDTO;

import java.util.List;

public interface QhldzmIntDao {

    public Cd50ViewDTO findCd50(String aae036, String aae017) throws Exception;
    public Cd50ViewDTO findCd50s(String aae036, String aae017) throws Exception;
    public Cd50ViewDTO findCd50z(String aae036, String aae017) throws Exception;

    public  List<Cd50ViewDTO> findCd50sList(String aae036,String aae017)throws  Exception;
    public  List<Cd50ViewDTO> findCd50zList(String aae036,String aae017)throws  Exception;



    public Cd51ViewDTO findCd51(String adc210, String aae017) throws Exception;
    public Cd51ViewDTO findCd51s(String adc210, String aae017) throws Exception;
    public Cd51ViewDTO findCd51z(String adc210, String aae017) throws Exception;

    public  List<Cd51ViewDTO> findCd51sList(String adc210,String aae017)throws  Exception;
    public  List<Cd51ViewDTO> findCd51zList(String adc210,String aae017)throws  Exception;



    public Cd52ViewDTO findCd52(String bcc80b, String aae017) throws Exception;
    public Cd52ViewDTO findCd52s(String bcc80b, String aae017) throws Exception;
    public Cd52ViewDTO findCd52z(String bcc80b, String aae017) throws Exception;

    public  List<Cd52ViewDTO> findCd52sList(String bcc80b,String aae017)throws  Exception;
    public  List<Cd52ViewDTO> findCd52zList(String bcc80b,String aae017)throws  Exception;



    public Cd53ViewDTO findCd53(String bcca45, String aae017) throws Exception;
    public Cd53ViewDTO findCd53s(String bcca45, String aae017) throws Exception;
    public Cd53ViewDTO findCd53z(String bcca45, String aae017) throws Exception;

    public  List<Cd53ViewDTO> findCd53sList(String bcca45,String aae017)throws  Exception;
    public  List<Cd53ViewDTO> findCd53zList(String bcca45,String aae017)throws  Exception;



    public List findCd50Year() throws Exception;
    public List findCd51Year() throws Exception;
    public List findCd52Year() throws Exception;
    public List findCd53Year() throws Exception;

}
