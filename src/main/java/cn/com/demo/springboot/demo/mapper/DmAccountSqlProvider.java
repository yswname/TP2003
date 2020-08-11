package cn.com.demo.springboot.demo.mapper;

import cn.com.demo.springboot.demo.entity.DmAccount;
import cn.com.demo.springboot.demo.entity.DmAccountExample.Criteria;
import cn.com.demo.springboot.demo.entity.DmAccountExample.Criterion;
import cn.com.demo.springboot.demo.entity.DmAccountExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DmAccountSqlProvider {

    public String countByExample(DmAccountExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("dm_account");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DmAccountExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("dm_account");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(DmAccount record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("dm_account");
        
        if (record.getAccId() != null) {
            sql.VALUES("acc_id", "#{accId,jdbcType=INTEGER}");
        }
        
        if (record.getAccCode() != null) {
            sql.VALUES("acc_code", "#{accCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAccPassword() != null) {
            sql.VALUES("acc_password", "#{accPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getAccMoney() != null) {
            sql.VALUES("acc_money", "#{accMoney,jdbcType=DOUBLE}");
        }
        
        return sql.toString();
    }

    public String selectByExample(DmAccountExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("acc_id");
        } else {
            sql.SELECT("acc_id");
        }
        sql.SELECT("acc_code");
        sql.SELECT("acc_password");
        sql.SELECT("acc_money");
        sql.FROM("dm_account");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        DmAccount record = (DmAccount) parameter.get("record");
        DmAccountExample example = (DmAccountExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("dm_account");
        
        if (record.getAccId() != null) {
            sql.SET("acc_id = #{record.accId,jdbcType=INTEGER}");
        }
        
        if (record.getAccCode() != null) {
            sql.SET("acc_code = #{record.accCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAccPassword() != null) {
            sql.SET("acc_password = #{record.accPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getAccMoney() != null) {
            sql.SET("acc_money = #{record.accMoney,jdbcType=DOUBLE}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("dm_account");
        
        sql.SET("acc_id = #{record.accId,jdbcType=INTEGER}");
        sql.SET("acc_code = #{record.accCode,jdbcType=VARCHAR}");
        sql.SET("acc_password = #{record.accPassword,jdbcType=VARCHAR}");
        sql.SET("acc_money = #{record.accMoney,jdbcType=DOUBLE}");
        
        DmAccountExample example = (DmAccountExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DmAccount record) {
        SQL sql = new SQL();
        sql.UPDATE("dm_account");
        
        if (record.getAccCode() != null) {
            sql.SET("acc_code = #{accCode,jdbcType=VARCHAR}");
        }
        
        if (record.getAccPassword() != null) {
            sql.SET("acc_password = #{accPassword,jdbcType=VARCHAR}");
        }
        
        if (record.getAccMoney() != null) {
            sql.SET("acc_money = #{accMoney,jdbcType=DOUBLE}");
        }
        
        sql.WHERE("acc_id = #{accId,jdbcType=INTEGER}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, DmAccountExample example, boolean includeExamplePhrase) {
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