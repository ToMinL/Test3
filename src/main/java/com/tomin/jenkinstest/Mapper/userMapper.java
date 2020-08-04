package com.tomin.jenkinstest.Mapper;

import com.tomin.jenkinstest.Pojo.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface userMapper {

    @Update("UPDATE user SET name = #{name}, country = #{country}, sex = #{sex} where id = #{id}")
    void Update(User user);

    @Insert("INSERT INTO user(name, country, sex) values(#{name},#{country}, #{sex})")
    void insert(User user);

    @Select("SELECT * FROM user where name = #{name}")
    User SelectOne(String name);

    @Delete("DELETE FROM user where id = #{id}")
    void Delete(int id);
}
