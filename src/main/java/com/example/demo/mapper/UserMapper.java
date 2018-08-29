package com.example.demo.mapper;

import com.example.demo.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

/**
 * UserMapper
 *
 * @author gavincook
 * @date 2018-08-29 10:57
 * @since 1.0.0
 */
@Mapper
public interface UserMapper {

    @Select("select * from d_user")
    @Results({
        @Result(property = "id", column = "id"),
        @Result(property = "name", column = "name"),
        @Result(property = "age", column = "age")
    })
    List<User> list();

    /**
     * 新增用户
     *
     * @param user 需要新增的用户数据
     * @return 影响记录数
     */
    @Insert("insert into d_user(name, age) values(#{user.name},#{user.age})")
    @SelectKey(keyProperty = "id", statement = "select last_insert_id()", before = false, resultType = Long.class)
    int insert(@Param("user") User user);
}
