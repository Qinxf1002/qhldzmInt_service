package cn.com.pansky.qhldzmInt.service.service.impl;

import cn.com.pansky.qhldzmInt.service.dao.QhldzmIntDao;
import cn.com.pansky.qhldzmInt.service.dto.Cd50ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd51ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd52ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd53ViewDTO;
import cn.com.pansky.qhldzmInt.service.service.QhldzmIntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.List;

@Service
public class QhldzmInterviceImpl implements QhldzmIntService {

    @Autowired
    private QhldzmIntDao dao;

    @Override
    public Cd50ViewDTO findCd500(String aae036, String aae017) throws Exception {
        Cd50ViewDTO cd50ViewDTO = null;
        if(aae017!=null && aae017.endsWith("000000")){//省级
            cd50ViewDTO = dao.findCd50s(aae036,aae017);
        }else if(aae017!=null && aae017.endsWith("0000")){//市州级
            cd50ViewDTO = dao.findCd50z(aae036,aae017);
        }else{//区县级
            cd50ViewDTO = dao.findCd50(aae036,aae017);
        }
        return cd50ViewDTO;
    }

    @Override
    public Cd50ViewDTO findCd50(String aae036, String aae017) throws Exception {
        Cd50ViewDTO cd50ViewDTO = null;
        if(aae017!=null && aae017.endsWith("000000")){//省级
            List cd50sList = dao.findCd50sList(aae036,aae017);
            cd50ViewDTO = dao.findCd50s(aae036,aae017);
            cd50ViewDTO.setCd50List(cd50sList);
        }else if(aae017!=null && aae017.endsWith("0000")){//市州级
            List cd50zList = dao.findCd50zList(aae036,aae017);
            cd50ViewDTO = dao.findCd50z(aae036,aae017);
            cd50ViewDTO.setCd50List(cd50zList);
        }else{//区县级
            cd50ViewDTO = dao.findCd50(aae036,aae017);
        }
        return cd50ViewDTO;
    }

    @Override
    public Cd51ViewDTO findCd51(String adc210, String aae017) throws Exception {
        Cd51ViewDTO cd51ViewDTO = null;
        if(aae017!=null && aae017.endsWith("000000")){//省级
            List cd51sList = dao.findCd51sList(adc210,aae017);
            cd51ViewDTO = dao.findCd51s(adc210,aae017);
            cd51ViewDTO.setCd51List(cd51sList);
        }else if(aae017!=null && aae017.endsWith("0000")){//市州级
            List cd51zList = dao.findCd51zList(adc210,aae017);
            cd51ViewDTO = dao.findCd51z(adc210,aae017);
            cd51ViewDTO.setCd51List(cd51zList);
        }else{//区县级
            cd51ViewDTO = dao.findCd51(adc210,aae017);
        }
//        if(cd51ViewDTO == null){
//            return cd51ViewDTO;
//        }else{
////            Double bcd511 = cd51ViewDTO.getBcd511();
////            Double bcd512 = cd51ViewDTO.getBcd512();
////            Double bcd513s = bcd511/(bcd511+bcd512);
////            DecimalFormat df1 = new DecimalFormat("##.00%");
////            String bcd513 = df1.format(bcd513s);
////            cd51ViewDTO.setBcd513(bcd513);
//            Double bcd511 = null;
//            Double bcd513s = null;
//            if(cd51ViewDTO.getBcd511()!=null&&cd51ViewDTO.getBcd511()!=0){
//                bcd511 = cd51ViewDTO.getBcd511();
//            }
//            Double bcd512 = null;
//            if(cd51ViewDTO.getBcd512()!=null&&cd51ViewDTO.getBcd512()!=0){
//                bcd512 = cd51ViewDTO.getBcd512();
//                bcd513s = bcd511/(bcd512+bcd511);
//                BigDecimal b  =  new BigDecimal(bcd513s);
//                double f1 = b.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
//                cd51ViewDTO.setBcd513(Double.toString(f1));
//            }
//            return cd51ViewDTO;
//        }
        return cd51ViewDTO;
    }

    @Override
    public Cd52ViewDTO findCd52(String bcc80b, String aae017) throws Exception {
        Cd52ViewDTO cd52ViewDTO = null;
        if(aae017!=null && aae017.endsWith("000000")){//省级
            List cd52sList = dao.findCd52sList(bcc80b,aae017);
            cd52ViewDTO = dao.findCd52s(bcc80b,aae017);
            cd52ViewDTO.setCd52List(cd52sList);
        }else if(aae017!=null && aae017.endsWith("0000")){//市州级
            List cd52zList = dao.findCd52zList(bcc80b,aae017);
            cd52ViewDTO = dao.findCd52z(bcc80b,aae017);
            cd52ViewDTO.setCd52List(cd52zList);
        }else{//区县级
            cd52ViewDTO = dao.findCd52(bcc80b,aae017);
        }
//        if(cd52ViewDTO == null){
//            return cd52ViewDTO;
//        }else{
////            Double bcd521 = cd52ViewDTO.getBcd521();
////            Double bcd522 = cd52ViewDTO.getBcd522();
////            Double bcd523s = bcd522/bcd521;
////            DecimalFormat df1 = new DecimalFormat("##.00%");
////            String bcd523 = df1.format(bcd523s);
////            cd52ViewDTO.setBcd523(bcd523);
//            Double bcd521 = null;
//            Double bcd523s = null;
//            if(cd52ViewDTO.getBcd522()!=null&&cd52ViewDTO.getBcd521()!=0){
//                bcd521 = cd52ViewDTO.getBcd521();
//            }
//            Double bcd522 = null;
//            if(cd52ViewDTO.getBcd522()!=null&&cd52ViewDTO.getBcd522()!=0){
//                bcd522 = cd52ViewDTO.getBcd522();
//                bcd523s = bcd522/bcd521;
//                BigDecimal b  =  new BigDecimal(bcd523s);
//                double f1 = b.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
//                cd52ViewDTO.setBcd523(Double.toString(f1));
//            }
//            return cd52ViewDTO;
//        }
        return cd52ViewDTO;
    }

    @Override
    public Cd53ViewDTO findCd53(String bcca45, String aae017) throws Exception {
        Cd53ViewDTO cd53ViewDTO = null;
        if(aae017!=null && aae017.endsWith("000000")){//省级
            List cd53sList = dao.findCd53sList(bcca45,aae017);
            cd53ViewDTO = dao.findCd53s(bcca45,aae017);
            cd53ViewDTO.setCd53List(cd53sList);
        }else if(aae017!=null && aae017.endsWith("0000")){//市州级
            List cd53zList = dao.findCd53zList(bcca45,aae017);
            cd53ViewDTO = dao.findCd53z(bcca45,aae017);
            cd53ViewDTO.setCd53List(cd53zList);
        }else{//区县级
            cd53ViewDTO = dao.findCd53(bcca45,aae017);
        }
//        if(cd53ViewDTO == null){
//            return cd53ViewDTO;
//        }else{
////            Double bcd531 = cd53ViewDTO.getBcd531();
////            Double bcd532 = cd53ViewDTO.getBcd532();
////            Double bcd533s = bcd532/bcd531;
////            DecimalFormat df1 = new DecimalFormat("##.00%");
////            String bcd533 = df1.format(bcd533s);
////            cd53ViewDTO.setBcd533(bcd533);
//            Double bcd531 = null;
//            Double bcd533s = null;
//            if(cd53ViewDTO.getBcd532()!=null&&cd53ViewDTO.getBcd531()!=0){
//                bcd531 = cd53ViewDTO.getBcd531();
//            }
//            Double bcd532 = null;
//            if(cd53ViewDTO.getBcd532()!=null&&cd53ViewDTO.getBcd532()!=0){
//                bcd532 = cd53ViewDTO.getBcd532();
//                bcd533s = bcd532/bcd531;
//                BigDecimal b  =  new BigDecimal(bcd533s);
//                double f1 = b.setScale(3, BigDecimal.ROUND_HALF_UP).doubleValue();
//                cd53ViewDTO.setBcd533(Double.toString(f1));
//            }
//            return cd53ViewDTO;
//        }
        return cd53ViewDTO;
    }

    @Override
    public List findCd50Year() throws Exception {
        return dao.findCd50Year();
    }

    @Override
    public List findCd51Year() throws Exception {
        return dao.findCd51Year();
    }

    @Override
    public List findCd52Year() throws Exception {
        return dao.findCd52Year();
    }

    @Override
    public List findCd53Year() throws Exception {
        return dao.findCd53Year();
    }
}
