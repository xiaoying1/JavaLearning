package com.tplink.lxy;

import com.tplink.lxy.dao.UserDao;
import com.tplink.lxy.pojo.User;
import com.tplink.lxy.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test1(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        List<User> userList = mapper.getUserList();
        for(User user:userList){
            System.out.println(user);
        }

        sqlSession.close();
    }
}
