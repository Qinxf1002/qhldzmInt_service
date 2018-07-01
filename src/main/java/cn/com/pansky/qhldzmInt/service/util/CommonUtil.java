package cn.com.pansky.qhldzmInt.service.util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommonUtil {

	/**
	 * 简单的判断是否为身份证号码
	 * 
	 * @return
	 */
	public static boolean isIdcard(String idcard) {
		String regExp = "(^\\d{15}$)|(^\\d{17}([0-9]|x|X)$)";
		if (idcard == null) {
			return false;
		}
		if (!(idcard.length() == 15 || idcard.length() == 18)) {
			return false;
		}
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(idcard);
		return m.find();
	}

	/**
	 * 手机号码格式验证
	 * 
	 * @return
	 */
	public static boolean verifyPhone(String phone) {
		String regExp = "^0?1[3|4|5|7|8]\\d{9}$";
		Pattern p = Pattern.compile(regExp);
		Matcher m = p.matcher(phone);
		return m.find();
	}

	/**
	 * 获取当前时间 yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String currentDateTime() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}
	
	/**
	 * 获取当前时间的相对时间 返回 yyyy-MM-dd HH:mm:ss
	 * 
	 * @return
	 */
	public static String relDateTime(int rel) {
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DATE,rel);
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(cal.getTime());
	}

	/**
	 * 获取当前时间 yyyyMMddHHmmss
	 * 
	 * @return
	 */
	public static String currentDTStr() {
		return new SimpleDateFormat("yyyyMMddHHmmss").format(new Date());
	}

	public static String getDateFormat10(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd").format(date);
	}

	public static String getDateFormat(Date date) {
		return new SimpleDateFormat("yyyy-MM-dd ").format(date);
	}

	public static Date getStringFormatDate(String dateStr, String pattern) {
		Date date = null;
		try {
			date = new SimpleDateFormat(pattern).parse(dateStr);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * base64加密
	 * 
	 * @return
	 */
	public static String getBase64(String str) {
		byte[] b = null;
		String s = null;
		try {
			b = str.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		if (b != null) {
			s = new BASE64Encoder().encode(b);
		}
		return s;
	}

	/**
	 * base64解密
	 * 
	 * @return
	 */
	public static String getFromBase64(String s) {
		byte[] b = null;
		String result = null;
		if (s != null) {
			BASE64Decoder decoder = new BASE64Decoder();
			try {
				b = decoder.decodeBuffer(s);
				result = new String(b, "utf-8");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return result;
	}

	/**
	 * 字符串md5
	 * 
	 * @param srcStr
	 *            String 要加密的字符串
	 * @return String 加密后的字符串
	 */
	public static String encryptStr(String srcStr) {
		String tempStr = "";
		String encryptStr = "";
		MD5 md5 = new MD5(); // MD5加密
		String encoding = "GBK";
		try {
			tempStr = srcStr;
			byte[] strBytes = srcStr.getBytes(encoding);
			encryptStr = new String(strBytes, 0, strBytes.length);
			tempStr = md5.getMD5ofStr(encryptStr).toLowerCase();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return tempStr;
	}

	/**
	 * 生成随即密码
	 * 
	 * @param pwdlen
	 *            生成的密码的总长度
	 * @return 密码的字符串
	 */
	public String genRandomStr(int pwdlen) {
		final int maxNum = 36;
		int i; // 生成的随机数
		int count = 0; // 生成的密码的长度
		char[] str = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8','9' };
		StringBuffer pwd = new StringBuffer("");
		Random r = new Random();
		while (count < pwdlen) {
			// 生成随机数，取绝对值，防止生成负数，
			i = Math.abs(r.nextInt(maxNum));// 生成的数最大为36-1
			if (i >= 0 && i < str.length) {
				pwd.append(str[i]);
				count++;
			}
		}
		return pwd.toString();
	}

	public static Map json2Map(String json) {
		json=json.replace("[", "");
		json=json.replace("]", "");
		Map map = JSON.parseObject(json);
		return map;
	}

	public static List json2List(String json){
		List returnList = JSON.parseArray(json);
		return returnList;
	}


	/**
	 * xml转json
	 * @param element
	 * @param json
	 */
	public static void dom4j2Json(Element element, JSONObject json){
		//如果是属性
		for(Object o:element.attributes()){
			Attribute attr=(Attribute)o;
			if(!isEmpty(attr.getValue())){
				json.put("@"+attr.getName(), attr.getValue());
			}
		}
		List<Element> chdEl=element.elements();
		if(chdEl.isEmpty()&&!isEmpty(element.getText())){//如果没有子元素,只有一个值
			json.put(element.getName(), element.getText());
		}

		for(Element e:chdEl){//有子元素
			if(!e.elements().isEmpty()){//子元素也有子元素
				JSONObject chdjson=new JSONObject();
				dom4j2Json(e,chdjson);
				Object o=json.get(e.getName());
				if(o!=null){
					JSONArray jsona=null;
					if(o instanceof JSONObject){//如果此元素已存在,则转为jsonArray
						JSONObject jsono=(JSONObject)o;
						json.remove(e.getName());
						jsona=new JSONArray();
						jsona.add(jsono);
						jsona.add(chdjson);
					}
					if(o instanceof JSONArray){
						jsona=(JSONArray)o;
						jsona.add(chdjson);
					}
					json.put(e.getName(), jsona);
				}else{
					if(!chdjson.isEmpty()){
						json.put(e.getName(), chdjson);
					}
				}


			}else{//子元素没有子元素
				for(Object o:element.attributes()){
					Attribute attr=(Attribute)o;
					if(!isEmpty(attr.getValue())){
						json.put("@"+attr.getName(), attr.getValue());
					}
				}
				if(!e.getText().isEmpty()){
					json.put(e.getName(), e.getText());
				}
			}
		}
	}
	public static boolean isEmpty(String str) {

		if (str == null || str.trim().isEmpty() || "null".equals(str)) {
			return true;
		}
		return false;
	}

	/**
	 * xml转JSON
	 * @param xmlStr
	 * @return
	 */
	public static String xml2Json(String xmlStr) {
		try {
			Document doc = DocumentHelper.parseText(xmlStr);
			JSONObject json = new JSONObject();
			dom4j2Json(doc.getRootElement(), json);
			return json.toJSONString();
		}catch (Exception e){
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		

	}

}
