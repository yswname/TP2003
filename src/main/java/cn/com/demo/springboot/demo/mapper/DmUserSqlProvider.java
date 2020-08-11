package cn.com.demo.springboot.demo.mapper;

import cn.com.demo.springboot.demo.entity.DmUser;
import cn.com.demo.springboot.demo.entity.DmUserExample.Criteria;
import cn.com.demo.springboot.demo.entity.DmUserExample.Criterion;
import cn.com.demo.springboot.demo.entity.DmUserExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DmUserSqlProvider {

    public String countByExample(DmUserExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("dm_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DmUserExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("dm_user");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(DmUser record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("dm_user");
        
        if (record.getUrId() != null) {
            sql.VALUES("ur_id", "#{urId,jdbcType=INTEGER}");
        }
        
        if (record.getUrUserName() != null) {
            sql.VALUES("ur_user_name", "#{urUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrName() != null) {
            sql.VALUES("ur_name", "#{urName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrPassword() != null) {
            sql.VALUES("ur_password", "#{urPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUrSex() != null) {
            sql.VALUES("ur_sex", "#{urSex,jdbcType=VARCHAR}");
        }
        
        if (record.getUrAge() != null) {
            sql.VALUES("ur_age", "#{urAge,jdbcType=INTEGER}");
        }
        
        if (record.getUrPhone() != null) {
            sql.VALUES("ur_phone", "#{urPhone,jdbcType=VARCHAR}");
        }
        
        return sql.toString();
    }

    public String selectByExample(DmUserExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("ur_id");
        } else {
            sql.SELECT("ur_id");
        }
        sql.SELECT("ur_user_name");
        sql.SELECT("ur_name");
        sql.SELECT("ur_password");
        sql.SELECT("ur_sex");
        sql.SELECT("ur_age");
        sql.SELECT("ur_phone");
        sql.FROM("dm_user");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        DmUser record = (DmUser) parameter.get("record");
        DmUserExample example = (DmUserExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("dm_user");
        
        if (record.getUrId() != null) {
            sql.SET("ur_id = #{record.urId,jdbcType=INTEGER}");
        }
        
        if (record.getUrUserName() != null) {
            sql.SET("ur_user_name = #{record.urUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrName() != null) {
            sql.SET("ur_name = #{record.urName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrPassword() != null) {
            sql.SET("ur_password = #{record.urPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUrSex() != null) {
            sql.SET("ur_sex = #{record.urSex,jdbcType=VARCHAR}");
        }
        
        if (record.getUrAge() != null) {
            sql.SET("ur_age = #{record.urAge,jdbcType=INTEGER}");
        }
        
        if (record.getUrPhone() != null) {
            sql.SET("ur_phone = #{record.urPhone,jdbcType=VARCHAR}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("dm_user");
        
        sql.SET("ur_id = #{record.urId,jdbcType=INTEGER}");
        sql.SET("ur_user_name = #{record.urUserName,jdbcType=VARCHAR}");
        sql.SET("ur_name = #{record.urName,jdbcType=VARCHAR}");
        sql.SET("ur_password = #{record.urPassword,jdbcType=VARCHAR}");
        sql.SET("ur_sex = #{record.urSex,jdbcType=VARCHAR}");
        sql.SET("ur_age = #{record.urAge,jdbcType=INTEGER}");
        sql.SET("ur_phone = #{record.urPhone,jdbcType=VARCHAR}");
        
        DmUserExample example = (DmUserExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DmUser record) {
        SQL sql = new SQL();
        sql.UPDATE("dm_user");
        
        if (record.getUrUserName() != null) {
            sql.SET("ur_user_name = #{urUserName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrName() != null) {
            sql.SET("ur_name = #{urName,jdbcType=VARCHAR}");
        }
        
        if (record.getUrPassword() != null) {
            sql.SET("ur_password = #{urPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getUrSex() != null) {
            sql.SET("ur_sex = #{urSex,jdbcType=VARCHAR}");
        }
        
        if (record.getUrAge() != null) {
            sql.SET("ur_age = #{urAge,jdbcType=INTEGER}");
        }
        
        if (record.getUrPhone() != null) {
            sql.SET("ur_phone = #{urPhone,jdbcType=VARCHAR}");
        }
        
        sql.WHERE("ur_id = #{urId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, DmUserExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }
}