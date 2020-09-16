package com.tplink.lxy;

import com.tplink.lxy.dao.UserMapper;
import com.tplink.lxy.pojo.User;
import com.tplink.lxy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> userList = mapper.getMapperList();
        for(User user:userList){
            System.out.println(user);
        }

        sqlSession.close();
    }
}
