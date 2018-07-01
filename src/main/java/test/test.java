package test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

	    JSONObject jsonObject=new JSONObject();
	    jsonObject.put("bcc80b","2014");
        jsonObject.put("aae017","63010000");
		String a=send("http://localhost:7001/qhldzmInt_service/qhldzmInt/findCd52",jsonObject);
        System.out.println(a);

	}
	
	
	/**
     * 解析invoke接口数据并返回
     * @param body 接口返回数据
     * @return JSONObject对象
     */
    private static JSONObject getJsonRowObj(String body) {
        if (body != null && !"".equals(body)) {
            JSONObject joCc = JSON.parseObject(body);
            if (joCc != null) {
                if (joCc.getString("code") != null && "1".equals(joCc.getString("code")) && !"0".equals(joCc.getJSONObject("output").getString("recordcount"))) {
                    return joCc.getJSONObject("output").getJSONObject("resultset").getJSONObject("row");
                }
            }
        }
        return null;
    }

    /**
     * 解析invoke接口数据并返回
     * @param body 接口返回数据
     * @return JSONArray对象
     */
    public static JSONArray getJsonRowArr(String body) {
        if (body != null && !"".equals(body)) {
            JSONObject joCc = JSON.parseObject(body);
            if (joCc != null) {
                if (joCc.getString("code") != null && "1".equals(joCc.getString("code")) && !"0".equals(joCc.getJSONObject("output").getString("recordcount"))) {
                    return joCc.getJSONObject("output").getJSONObject("resultset").getJSONArray("row");
                }
            }
        }
        return null;
    }

    /**
     * post 请求接口调用
     * @param url 接口地址
     * @param json json串
     * @return 接口调用结果
     */
    public static String send(String url, JSONObject json){
        String body = "";
        try{
            //创建httpclient对象
            CloseableHttpClient client = HttpClients.createDefault();
            //创建post方式请求对象
            HttpPost httpPost = new HttpPost(url);

            List<NameValuePair> nvps = new ArrayList<NameValuePair>();

            nvps.add(new BasicNameValuePair("data", JSON.toJSONString(json)));
            //设置参数到请求对象中
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));

            //设置header信息
            //指定报文头【Content-type】、【User-Agent】
            httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
            httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            //执行请求操作，并拿到结果（同步阻塞）
            CloseableHttpResponse response = client.execute(httpPost);
            //获取结果实体
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                //按指定编码转换结果实体为String类型
                body= EntityUtils.toString(entity, "gbk");
            }
            EntityUtils.consume(entity);
            //释放链接
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }
}
