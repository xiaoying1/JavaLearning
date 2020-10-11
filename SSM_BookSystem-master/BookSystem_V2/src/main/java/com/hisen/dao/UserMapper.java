package com.hisen.dao;

import com.hisen.entity.User;
import com.hisen.entity.UserExample;
import com.hisen.entity.UserKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    int countByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    int deleteByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    int deleteByPrimaryKey(UserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    List<User> selectByExample(UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    User selectByPrimaryKey(UserKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table user
     *
     * @mbggenerated Thu Aug 03 16:47:27 CST 2017
     */
    int updateByPrimaryKey(User record);
}