package cn.com.demo.springboot.demo.mapper;

import cn.com.demo.springboot.demo.entity.DmAccount;
import cn.com.demo.springboot.demo.entity.DmAccountExample;
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

public interface DmAccountMapper {
    @SelectProvider(type=DmAccountSqlProvider.class, method="countByExample")
    long countByExample(DmAccountExample example);

    @DeleteProvider(type=DmAccountSqlProvider.class, method="deleteByExample")
    int deleteByExample(DmAccountExample example);

    @Delete({
        "delete from dm_account",
        "where acc_id = #{accId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer accId);

    @Insert({
        "insert into dm_account (acc_id, acc_code, ",
        "acc_password, acc_money)",
        "values (#{accId,jdbcType=INTEGER}, #{accCode,jdbcType=VARCHAR}, ",
        "#{accPassword,jdbcType=VARCHAR}, #{accMoney,jdbcType=DOUBLE})"
    })
    int insert(DmAccount record);

    @InsertProvider(type=DmAccountSqlProvider.class, method="insertSelective")
    int insertSelective(DmAccount record);

    @SelectProvider(type=DmAccountSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="acc_id", property="accId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="acc_code", property="accCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="acc_password", property="accPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="acc_money", property="accMoney", jdbcType=JdbcType.DOUBLE)
    })
    List<DmAccount> selectByExample(DmAccountExample example);

    @Select({
        "select",
        "acc_id, acc_code, acc_password, acc_money",
        "from dm_account",
        "where acc_id = #{accId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="acc_id", property="accId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="acc_code", property="accCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="acc_password", property="accPassword", jdbcType=JdbcType.VARCHAR),
        @Result(column="acc_money", property="accMoney", jdbcType=JdbcType.DOUBLE)
    })
    DmAccount selectByPrimaryKey(Integer accId);

    @UpdateProvider(type=DmAccountSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DmAccount record, @Param("example") DmAccountExample example);

    @UpdateProvider(type=DmAccountSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DmAccount record, @Param("example") DmAccountExample example);

    @UpdateProvider(type=DmAccountSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DmAccount record);

    @Update({
        "update dm_account",
        "set acc_code = #{accCode,jdbcType=VARCHAR},",
          "acc_password = #{accPassword,jdbcType=VARCHAR},",
          "acc_money = #{accMoney,jdbcType=DOUBLE}",
        "where acc_id = #{accId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(DmAccount record);
}