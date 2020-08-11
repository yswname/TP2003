package cn.com.demo.springboot.demo.mapper;

import cn.com.demo.springboot.demo.entity.DmUser;
import cn.com.demo.springboot.demo.entity.DmUserExample;
import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;

public interface DmUserMapper {
    @SelectProvider(type=DmUserSqlProvider.class, method="countByExample")
    long countByExample(DmUserExample example);

    @DeleteProvider(type=DmUserSqlProvider.class, method="deleteByExample")
    int deleteByExample(DmUserExample example);

    @Delete({
        "delete from dm_user",
        "where ur_id = #{urId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer urId);

    @Insert({
        "insert into dm_user (ur_id, ur_user_name, ",
        "ur_name, ur_password, ",
        "ur_sex, ur_age, ur_phone)",
        "values (#{urId,jdbcType=INTEGER}, #{urUserName,jdbcType=VARCHAR}, ",
        "#{urName,jdbcType=VARCHAR}, #{urPassword,jdbcType=VARCHAR}, ",
        "#{urSex,jdbcType=VARCHAR}, #{urAge,jdbcType=INTEGER}, #{urPhone,jdbcType=VARCHAR})"
    })
    int insert(DmUser record);

    @InsertProvider(type=DmUserSqlProvider.class, method="insertSelective")
    int insertSelective(DmUser record);

    @SelectProvider(type=DmUserSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ur_id", property="urId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ur_user_name", property="urUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ur_name", property="urName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ur_password", property="urPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="ur_sex", property="urSex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ur_age", property="urAge", jdbcType=JdbcType.INTEGER),
        @Result(column="ur_phone", property="urPhone", jdbcType=JdbcType.VARCHAR)
    })
    List<DmUser> selectByExample(DmUserExample example);

    @Select({
        "select",
        "ur_id, ur_user_name, ur_name, ur_password, ur_sex, ur_age, ur_phone",
        "from dm_user",
        "where ur_id = #{urId,jdbcType=INTEGER}"
    })
    @Results(id="UserResult",value={
        @Result(column="ur_id", property="urId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="ur_user_name", property="urUserName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ur_name", property="urName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ur_password", property="urPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="ur_sex", property="urSex", jdbcType=JdbcType.VARCHAR),
        @Result(column="ur_age", property="urAge", jdbcType=JdbcType.INTEGER),
        @Result(column="ur_phone", property="urPhone", jdbcType=JdbcType.VARCHAR)
    })
    DmUser selectByPrimaryKey(Integer urId);
    @Select({
            "select",
            "ur_id, ur_user_name, ur_name, ur_password, ur_sex, ur_age, ur_phone",
            "from dm_user",
            "where ur_user_name = #{urUserName,jdbcType=VARCHAR}"
    })
    @ResultMap(value="UserResult")// 定义字段-属性的对应
    DmUser selectByUserName(String userName);

    @UpdateProvider(type=DmUserSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DmUser record, @Param("example") DmUserExample example);

    @UpdateProvider(type=DmUserSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DmUser record, @Param("example") DmUserExample example);

    @UpdateProvider(type=DmUserSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DmUser record);

    @Update({
        "update dm_user",
        "set ur_user_name = #{urUserName,jdbcType=VARCHAR},",
          "ur_name = #{urName,jdbcType=VARCHAR},",
          "ur_password = #{urPassword,jdbcType=VARCHAR},",
          "ur_sex = #{urSex,jdbcType=VARCHAR},",
          "ur_age = #{urAge,jdbcType=INTEGER},",
          "ur_phone = #{urPhone,jdbcType=VARCHAR}",
        "where ur_id = #{urId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DmUser record);
}