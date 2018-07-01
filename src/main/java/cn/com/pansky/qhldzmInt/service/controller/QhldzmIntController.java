package cn.com.pansky.qhldzmInt.service.controller;

import cn.com.pansky.qhldzmInt.service.dto.Cd50ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd51ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd52ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd53ViewDTO;
import cn.com.pansky.qhldzmInt.service.service.QhldzmIntService;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializerFeature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.MediaType;

@RestController
@RequestMapping(value = "/qhldzmInt")
public class QhldzmIntController {

    @Autowired
    private QhldzmIntService service;

    /**
     * 观决策-关键指标（KPI）分析-城镇新增就业任务完成率
     * @param aae036 年份
     * @param aae017 地区编码
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findCd50", method = RequestMethod.POST)
    public String findCd50(String aae036,String aae017){
        JSONObject json = new JSONObject();
        try {
            Cd50ViewDTO cd50ViewDTO = service.findCd50(aae036,aae017);
            Cd50ViewDTO cd50 = service.findCd500(aae036,aae017);
            json.put("code",1);
            json.put("msg", "获取成功！");
            json.put("data",cd50ViewDTO);
            json.put("cd50",cd50);
        }catch (Exception e){
            e.printStackTrace();
            json.put("code", 0);
            json.put("msg", e);
        }
        return json.toString();
    }

    @RequestMapping(value = "/findCd50Year", method = RequestMethod.POST)
    public String findCd50Year(){
        JSONObject json = new JSONObject();
        try {
            List cd50Year = service.findCd50Year();
            json.put("code", 1);
            json.put("msg", "获取成功！");
            json.put("data",cd50Year);
        }catch (Exception e){
            e.printStackTrace();
            json.put("code", 0);
            json.put("msg", e);
        }
        return json.toString();
    }

    @RequestMapping(value = "/findCd51Year", method = RequestMethod.POST)
    public String findCd51Year(){
        JSONObject json = new JSONObject();
        try {
            List cd51Year = service.findCd51Year();
            json.put("code", 1);
            json.put("msg", "获取成功！");
            json.put("data",cd51Year);
        }catch (Exception e){
            e.printStackTrace();
            json.put("code", 0);
            json.put("msg", e);
        }
        return json.toString();
    }

    @RequestMapping(value = "/findCd52Year", method = RequestMethod.POST)
    public String findCd52Year(){
        JSONObject json = new JSONObject();
        try {
            List cd52Year = service.findCd52Year();
            json.put("code", 1);
            json.put("msg", "获取成功！");
            json.put("data",cd52Year);
        }catch (Exception e){
            e.printStackTrace();
            json.put("code", 0);
            json.put("msg", e);
        }
        return json.toString();
    }

    @RequestMapping(value = "/findCd53Year", method = RequestMethod.POST)
    public String findCd53Year(){
        JSONObject json = new JSONObject();
        try {
            List cd53Year = service.findCd53Year();
            json.put("code", 1);
            json.put("msg", "获取成功！");
            json.put("data",cd53Year);
        }catch (Exception e){
            e.printStackTrace();
            json.put("code", 0);
            json.put("msg", e);
        }
        return json.toString();
    }

    /**
     * 观决策-关键指标（KPI）分析-城镇登记失业率
     * @param adc210 年份
     * @param aae017 地区编码
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findCd51", method = RequestMethod.POST)
    public String findCd51(String adc210,String aae017) throws Exception {
        JSONObject json = new JSONObject();
        try {
            Cd51ViewDTO cd51ViewDTO = service.findCd51(adc210,aae017);
            json.put("code", 1);
            json.put("msg", "获取成功！");
            json.put("data",cd51ViewDTO);
        }catch (Exception e){
            e.printStackTrace();
            json.put("code", 0);
            json.put("msg", e);
        }
        return json.toString();
//        Cd51ViewDTO cd51ViewDTO = service.findCd51(adc210,aae017);
//        Map< String , Object > jsonMap = new HashMap< String , Object>();
//        jsonMap.put("code",1);
//        jsonMap.put("msg","获取成功！");
//        jsonMap.put("data",cd51ViewDTO);
////        String str = JSONObject.toJSONString(jsonMap);
////        System.out.println(str);
//        return JSONObject.toJSONString(jsonMap, SerializerFeature.WriteNullNumberAsZero);
    }

    /**
     * 观决策-关键指标（KPI）分析-农牧区劳动力转移就业任务完成率
     * @param bcc80b 年份
     * @param aae017 地区编码
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findCd52", method = RequestMethod.POST)
    public String findCd52(String bcc80b,String aae017) throws Exception {
        JSONObject json = new JSONObject();
        try {
            Cd52ViewDTO cd52ViewDTO = service.findCd52(bcc80b,aae017);
            json.put("code", 1);
            json.put("msg", "获取成功！");
            json.put("data",cd52ViewDTO);
        }catch (Exception e){
            e.printStackTrace();
            json.put("code", 0);
            json.put("msg", e);
        }
        return json.toString();
    }

    /**
     *观决策-关键指标（KPI）分析-分析-高校毕业生就业率
     * @param bcca45 年份
     * @param aae017 地区编码
     * @return
     * @throws Exception
     */
    @RequestMapping(value = "/findCd53", method = RequestMethod.POST)
    public String findCd53(String bcca45,String aae017) throws Exception {
        JSONObject json = new JSONObject();
        try {
            Cd53ViewDTO cd53ViewDTO = service.findCd53(bcca45,aae017);
            json.put("code", 1);
            json.put("msg", "获取成功！");
            json.put("data",cd53ViewDTO);
        }catch (Exception e){
            e.printStackTrace();
            json.put("code", 0);
            json.put("msg", e);
        }
        return json.toString();
    }
}
