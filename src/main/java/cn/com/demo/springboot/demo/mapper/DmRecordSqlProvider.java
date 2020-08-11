package cn.com.demo.springboot.demo.mapper;

import cn.com.demo.springboot.demo.entity.DmRecord;
import cn.com.demo.springboot.demo.entity.DmRecordExample.Criteria;
import cn.com.demo.springboot.demo.entity.DmRecordExample.Criterion;
import cn.com.demo.springboot.demo.entity.DmRecordExample;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class DmRecordSqlProvider {

    public String countByExample(DmRecordExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("dm_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String deleteByExample(DmRecordExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("dm_record");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    public String insertSelective(DmRecord record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("dm_record");
        
        if (record.getRdPhone() != null) {
            sql.VALUES("rd_phone", "#{rdPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getRdUp() != null) {
            sql.VALUES("rd_up", "#{rdUp,jdbcType=BIGINT}");
        }
        
        if (record.getRdDown() != null) {
            sql.VALUES("rd_down", "#{rdDown,jdbcType=BIGINT}");
        }
        
        if (record.getRdSum() != null) {
            sql.VALUES("rd_sum", "#{rdSum,jdbcType=BIGINT}");
        }
        
        return sql.toString();
    }

    public String selectByExample(DmRecordExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("rd_phone");
        } else {
            sql.SELECT("rd_phone");
        }
        sql.SELECT("rd_up");
        sql.SELECT("rd_down");
        sql.SELECT("rd_sum");
        sql.FROM("dm_record");
        applyWhere(sql, example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        
        return sql.toString();
    }

    public String updateByExampleSelective(Map<String, Object> parameter) {
        DmRecord record = (DmRecord) parameter.get("record");
        DmRecordExample example = (DmRecordExample) parameter.get("example");
        
        SQL sql = new SQL();
        sql.UPDATE("dm_record");
        
        if (record.getRdPhone() != null) {
            sql.SET("rd_phone = #{record.rdPhone,jdbcType=VARCHAR}");
        }
        
        if (record.getRdUp() != null) {
            sql.SET("rd_up = #{record.rdUp,jdbcType=BIGINT}");
        }
        
        if (record.getRdDown() != null) {
            sql.SET("rd_down = #{record.rdDown,jdbcType=BIGINT}");
        }
        
        if (record.getRdSum() != null) {
            sql.SET("rd_sum = #{record.rdSum,jdbcType=BIGINT}");
        }
        
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("dm_record");
        
        sql.SET("rd_phone = #{record.rdPhone,jdbcType=VARCHAR}");
        sql.SET("rd_up = #{record.rdUp,jdbcType=BIGINT}");
        sql.SET("rd_down = #{record.rdDown,jdbcType=BIGINT}");
        sql.SET("rd_sum = #{record.rdSum,jdbcType=BIGINT}");
        
        DmRecordExample example = (DmRecordExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(DmRecord record) {
        SQL sql = new SQL();
        sql.UPDATE("dm_record");
        
        if (record.getRdUp() != null) {
            sql.SET("rd_up = #{rdUp,jdbcType=BIGINT}");
        }
        
        if (record.getRdDown() != null) {
            sql.SET("rd_down = #{rdDown,jdbcType=BIGINT}");
        }
        
        if (record.getRdSum() != null) {
            sql.SET("rd_sum = #{rdSum,jdbcType=BIGINT}");
        }
        
        sql.WHERE("rd_phone = #{rdPhone,jdbcType=VARCHAR}");
        
        return sql.toString();
    }

    protected void applyWhere(SQL sql, DmRecordExample example, boolean includeExamplePhrase) {
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