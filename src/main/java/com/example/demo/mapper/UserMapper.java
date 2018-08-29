package com.example.demo.mapper;

import com.example.demo.entity.User;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

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
        @Result(property = "id",  column = "id"),
        @Result(property = "name",  column = "name"),
        @Result(property = "age", column = "age")
    })
    List<User> list();
}
