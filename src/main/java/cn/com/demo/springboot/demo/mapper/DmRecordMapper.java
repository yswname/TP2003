package cn.com.demo.springboot.demo.mapper;

import cn.com.demo.springboot.demo.entity.DmRecord;
import cn.com.demo.springboot.demo.entity.DmRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;

public interface DmRecordMapper {
    @SelectProvider(type=DmRecordSqlProvider.class, method="countByExample")
    long countByExample(DmRecordExample example);

    @DeleteProvider(type=DmRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(DmRecordExample example);

    @Delete({
        "delete from dm_record",
        "where rd_phone = #{rdPhone,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String rdPhone);

    @Insert({
        "insert into dm_record (rd_phone, rd_up, ",
        "rd_down, rd_sum)",
        "values (#{rdPhone,jdbcType=VARCHAR}, #{rdUp,jdbcType=BIGINT}, ",
        "#{rdDown,jdbcType=BIGINT}, #{rdSum,jdbcType=BIGINT})"
    })
    int insert(DmRecord record);

    @InsertProvider(type=DmRecordSqlProvider.class, method="insertSelective")
    int insertSelective(DmRecord record);

    @SelectProvider(type=DmRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="rd_phone", property="rdPhone", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="rd_up", property="rdUp", jdbcType=JdbcType.BIGINT),
        @Result(column="rd_down", property="rdDown", jdbcType=JdbcType.BIGINT),
        @Result(column="rd_sum", property="rdSum", jdbcType=JdbcType.BIGINT)
    })
    List<DmRecord> selectByExample(DmRecordExample example);

    @Select({
        "select",
        "rd_phone, rd_up, rd_down, rd_sum",
        "from dm_record",
        "where rd_phone = #{rdPhone,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="rd_phone", property="rdPhone", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="rd_up", property="rdUp", jdbcType=JdbcType.BIGINT),
        @Result(column="rd_down", property="rdDown", jdbcType=JdbcType.BIGINT),
        @Result(column="rd_sum", property="rdSum", jdbcType=JdbcType.BIGINT)
    })
    DmRecord selectByPrimaryKey(String rdPhone);

    @UpdateProvider(type=DmRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DmRecord record, @Param("example") DmRecordExample example);

    @UpdateProvider(type=DmRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DmRecord record, @Param("example") DmRecordExample example);

    @UpdateProvider(type=DmRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DmRecord record);

    @Update({
        "update dm_record",
        "set rd_up = #{rdUp,jdbcType=BIGINT},",
          "rd_down = #{rdDown,jdbcType=BIGINT},",
          "rd_sum = #{rdSum,jdbcType=BIGINT}",
        "where rd_phone = #{rdPhone,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(DmRecord record);
}