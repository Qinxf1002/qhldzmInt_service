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
     * ����invoke�ӿ����ݲ�����
     * @param body �ӿڷ�������
     * @return JSONObject����
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
     * ����invoke�ӿ����ݲ�����
     * @param body �ӿڷ�������
     * @return JSONArray����
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
     * post ����ӿڵ���
     * @param url �ӿڵ�ַ
     * @param json json��
     * @return �ӿڵ��ý��
     */
    public static String send(String url, JSONObject json){
        String body = "";
        try{
            //����httpclient����
            CloseableHttpClient client = HttpClients.createDefault();
            //����post��ʽ�������
            HttpPost httpPost = new HttpPost(url);

            List<NameValuePair> nvps = new ArrayList<NameValuePair>();

            nvps.add(new BasicNameValuePair("data", JSON.toJSONString(json)));
            //���ò��������������
            httpPost.setEntity(new UrlEncodedFormEntity(nvps, "UTF-8"));

            //����header��Ϣ
            //ָ������ͷ��Content-type������User-Agent��
            httpPost.setHeader("Content-type", "application/x-www-form-urlencoded");
            httpPost.setHeader("User-Agent", "Mozilla/4.0 (compatible; MSIE 5.0; Windows NT; DigExt)");
            //ִ��������������õ������ͬ��������
            CloseableHttpResponse response = client.execute(httpPost);
            //��ȡ���ʵ��
            HttpEntity entity = response.getEntity();
            if (entity != null) {
                //��ָ������ת�����ʵ��ΪString����
                body= EntityUtils.toString(entity, "gbk");
            }
            EntityUtils.consume(entity);
            //�ͷ�����
            response.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return body;
    }
}
