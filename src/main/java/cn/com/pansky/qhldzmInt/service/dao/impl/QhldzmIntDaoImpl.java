package cn.com.pansky.qhldzmInt.service.dao.impl;

import cn.com.pansky.qhldzmInt.service.dao.QhldzmIntDao;
import cn.com.pansky.qhldzmInt.service.dto.Cd50ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd51ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd52ViewDTO;
import cn.com.pansky.qhldzmInt.service.dto.Cd53ViewDTO;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository("qhldzmIntDao")
public class QhldzmIntDaoImpl extends SqlSessionDaoSupport implements QhldzmIntDao {

    static final String PREFIX = "cn.com.pansky.qhldzmInt.datacon.";

    @Override
    public Cd50ViewDTO findCd50(String aae036, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("aae036", aae036);
        map.put("aae017", aae017);
        Cd50ViewDTO cd50ViewDTO= sqlSession.selectOne(PREFIX+"cd50FindSql", map);
        return cd50ViewDTO;
    }
    @Override
    public Cd50ViewDTO findCd50s(String aae036, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("aae036", aae036);
        map.put("aae017", aae017);
        Cd50ViewDTO cd50ViewDTO= sqlSession.selectOne(PREFIX+"cd50sFindSql", map);
        return cd50ViewDTO;
    }
    @Override
    public Cd50ViewDTO findCd50z(String aae036, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("aae036", aae036);
        map.put("aae017", aae017);
        Cd50ViewDTO cd50ViewDTO= sqlSession.selectOne(PREFIX+"cd50zFindSql", map);
        return cd50ViewDTO;
    }

    @Override
    public List<Cd50ViewDTO> findCd50sList(String aae036, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        List returnList = new ArrayList<Cd50ViewDTO>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("aae036", aae036);
        map.put("aae017", aae017);
        returnList= sqlSession.selectList(PREFIX+"cd50sListFindSql", map);
        return returnList;
    }

    @Override
    public List<Cd50ViewDTO> findCd50zList(String aae036, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        List returnList = new ArrayList<Cd50ViewDTO>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("aae036", aae036);
        map.put("aae017", aae017);
        returnList= sqlSession.selectList(PREFIX+"cd50zListFindSql", map);
        return returnList;
    }








    @Override
    public Cd51ViewDTO findCd51(String adc210, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("adc210", adc210);
        map.put("aae017", aae017);
        Cd51ViewDTO cd51ViewDTO= sqlSession.selectOne(PREFIX+"cd51FindSql", map);
        return cd51ViewDTO;
    }

    @Override
    public Cd51ViewDTO findCd51s(String adc210, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("adc210", adc210);
        map.put("aae017", aae017);
        Cd51ViewDTO cd51ViewDTO= sqlSession.selectOne(PREFIX+"cd51sFindSql", map);
        return cd51ViewDTO;
    }

    @Override
    public Cd51ViewDTO findCd51z(String adc210, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("adc210", adc210);
        map.put("aae017", aae017);
        Cd51ViewDTO cd51ViewDTO= sqlSession.selectOne(PREFIX+"cd51zFindSql", map);
        return cd51ViewDTO;
    }

    @Override
    public List<Cd51ViewDTO> findCd51sList(String adc210, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        List returnList = new ArrayList<Cd51ViewDTO>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("adc210", adc210);
        map.put("aae017", aae017);
        returnList= sqlSession.selectList(PREFIX+"cd51sListFindSql", map);
        return returnList;
    }

    @Override
    public List<Cd51ViewDTO> findCd51zList(String adc210, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        List returnList = new ArrayList<Cd51ViewDTO>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("adc210", adc210);
        map.put("aae017", aae017);
        returnList= sqlSession.selectList(PREFIX+"cd51zListFindSql", map);
        return returnList;
    }





    @Override
    public Cd52ViewDTO findCd52(String bcc80b, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcc80b", bcc80b);
        map.put("aae017", aae017);
        Cd52ViewDTO cd52ViewDTO= sqlSession.selectOne(PREFIX+"cd52FindSql", map);
        return cd52ViewDTO;
    }

    @Override
    public Cd52ViewDTO findCd52s(String bcc80b, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcc80b", bcc80b);
        map.put("aae017", aae017);
        Cd52ViewDTO cd52ViewDTO= sqlSession.selectOne(PREFIX+"cd52sFindSql", map);
        return cd52ViewDTO;
    }

    @Override
    public Cd52ViewDTO findCd52z(String bcc80b, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcc80b", bcc80b);
        map.put("aae017", aae017);
        Cd52ViewDTO cd52ViewDTO= sqlSession.selectOne(PREFIX+"cd52zFindSql", map);
        return cd52ViewDTO;
    }

    @Override
    public List<Cd52ViewDTO> findCd52sList(String bcc80b, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        List returnList = new ArrayList<Cd52ViewDTO>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcc80b", bcc80b);
        map.put("aae017", aae017);
        returnList= sqlSession.selectList(PREFIX+"cd52sListFindSql", map);
        return returnList;
    }

    @Override
    public List<Cd52ViewDTO> findCd52zList(String bcc80b, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        List returnList = new ArrayList<Cd52ViewDTO>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcc80b", bcc80b);
        map.put("aae017", aae017);
        returnList= sqlSession.selectList(PREFIX+"cd52zListFindSql", map);
        return returnList;
    }




    @Override
    public Cd53ViewDTO findCd53(String bcca45, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcca45", bcca45);
        map.put("aae017", aae017);
        Cd53ViewDTO cd53ViewDTO= sqlSession.selectOne(PREFIX+"cd53zFindSql", map);
        return cd53ViewDTO;
    }

    @Override
    public Cd53ViewDTO findCd53s(String bcca45, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcca45", bcca45);
        map.put("aae017", aae017);
        Cd53ViewDTO cd53ViewDTO= sqlSession.selectOne(PREFIX+"cd53sFindSql", map);
        return cd53ViewDTO;
    }

    @Override
    public Cd53ViewDTO findCd53z(String bcca45, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcca45", bcca45);
        map.put("aae017", aae017);
        Cd53ViewDTO cd53ViewDTO= sqlSession.selectOne(PREFIX+"cd53zFindSql", map);
        return cd53ViewDTO;
    }

    @Override
    public List<Cd53ViewDTO> findCd53sList(String bcca45, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        List returnList = new ArrayList<Cd53ViewDTO>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcca45", bcca45);
        map.put("aae017", aae017);
        returnList= sqlSession.selectList(PREFIX+"cd53sListFindSql", map);
        return returnList;
    }

    @Override
    public List<Cd53ViewDTO> findCd53zList(String bcca45, String aae017) throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        List returnList = new ArrayList<Cd53ViewDTO>();
        SqlSession sqlSession=this.getSqlSession();
        map.put("bcca45", bcca45);
        map.put("aae017", aae017);
        returnList= sqlSession.selectList(PREFIX+"cd53zListFindSql", map);
        return returnList;
    }



    @Override
    public List findCd50Year() throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        return sqlSession.selectList(PREFIX+"findCd50Year", map);
    }

    @Override
    public List findCd51Year() throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        return sqlSession.selectList(PREFIX+"findCd51Year", map);
    }

    @Override
    public List findCd52Year() throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        return sqlSession.selectList(PREFIX+"findCd52Year", map);
    }

    @Override
    public List findCd53Year() throws Exception {
        Map<String,String> map = new HashMap<String,String>();
        SqlSession sqlSession=this.getSqlSession();
        return sqlSession.selectList(PREFIX+"findCd53Year", map);
    }

    @Autowired
    @Override
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        super.setSqlSessionFactory(sqlSessionFactory);
    }
}
