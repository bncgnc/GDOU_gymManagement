package com.ggms.pojo;

import java.util.ArrayList;
import java.util.List;

public class FieldApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FieldApplicationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFieldApplicationidIsNull() {
            addCriterion("field_applicationid is null");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidIsNotNull() {
            addCriterion("field_applicationid is not null");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidEqualTo(Integer value) {
            addCriterion("field_applicationid =", value, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidNotEqualTo(Integer value) {
            addCriterion("field_applicationid <>", value, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidGreaterThan(Integer value) {
            addCriterion("field_applicationid >", value, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_applicationid >=", value, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidLessThan(Integer value) {
            addCriterion("field_applicationid <", value, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidLessThanOrEqualTo(Integer value) {
            addCriterion("field_applicationid <=", value, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidIn(List<Integer> values) {
            addCriterion("field_applicationid in", values, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidNotIn(List<Integer> values) {
            addCriterion("field_applicationid not in", values, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidBetween(Integer value1, Integer value2) {
            addCriterion("field_applicationid between", value1, value2, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldApplicationidNotBetween(Integer value1, Integer value2) {
            addCriterion("field_applicationid not between", value1, value2, "fieldApplicationid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidIsNull() {
            addCriterion("field_timetableid is null");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidIsNotNull() {
            addCriterion("field_timetableid is not null");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidEqualTo(Integer value) {
            addCriterion("field_timetableid =", value, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidNotEqualTo(Integer value) {
            addCriterion("field_timetableid <>", value, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidGreaterThan(Integer value) {
            addCriterion("field_timetableid >", value, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidGreaterThanOrEqualTo(Integer value) {
            addCriterion("field_timetableid >=", value, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidLessThan(Integer value) {
            addCriterion("field_timetableid <", value, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidLessThanOrEqualTo(Integer value) {
            addCriterion("field_timetableid <=", value, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidIn(List<Integer> values) {
            addCriterion("field_timetableid in", values, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidNotIn(List<Integer> values) {
            addCriterion("field_timetableid not in", values, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidBetween(Integer value1, Integer value2) {
            addCriterion("field_timetableid between", value1, value2, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andFieldTimetableidNotBetween(Integer value1, Integer value2) {
            addCriterion("field_timetableid not between", value1, value2, "fieldTimetableid");
            return (Criteria) this;
        }

        public Criteria andUseridIsNull() {
            addCriterion("userid is null");
            return (Criteria) this;
        }

        public Criteria andUseridIsNotNull() {
            addCriterion("userid is not null");
            return (Criteria) this;
        }

        public Criteria andUseridEqualTo(String value) {
            addCriterion("userid =", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotEqualTo(String value) {
            addCriterion("userid <>", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThan(String value) {
            addCriterion("userid >", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridGreaterThanOrEqualTo(String value) {
            addCriterion("userid >=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThan(String value) {
            addCriterion("userid <", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLessThanOrEqualTo(String value) {
            addCriterion("userid <=", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridLike(String value) {
            addCriterion("userid like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotLike(String value) {
            addCriterion("userid not like", value, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridIn(List<String> values) {
            addCriterion("userid in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotIn(List<String> values) {
            addCriterion("userid not in", values, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridBetween(String value1, String value2) {
            addCriterion("userid between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andUseridNotBetween(String value1, String value2) {
            addCriterion("userid not between", value1, value2, "userid");
            return (Criteria) this;
        }

        public Criteria andFapermitIsNull() {
            addCriterion("fapermit is null");
            return (Criteria) this;
        }

        public Criteria andFapermitIsNotNull() {
            addCriterion("fapermit is not null");
            return (Criteria) this;
        }

        public Criteria andFapermitEqualTo(Integer value) {
            addCriterion("fapermit =", value, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapermitNotEqualTo(Integer value) {
            addCriterion("fapermit <>", value, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapermitGreaterThan(Integer value) {
            addCriterion("fapermit >", value, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapermitGreaterThanOrEqualTo(Integer value) {
            addCriterion("fapermit >=", value, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapermitLessThan(Integer value) {
            addCriterion("fapermit <", value, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapermitLessThanOrEqualTo(Integer value) {
            addCriterion("fapermit <=", value, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapermitIn(List<Integer> values) {
            addCriterion("fapermit in", values, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapermitNotIn(List<Integer> values) {
            addCriterion("fapermit not in", values, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapermitBetween(Integer value1, Integer value2) {
            addCriterion("fapermit between", value1, value2, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapermitNotBetween(Integer value1, Integer value2) {
            addCriterion("fapermit not between", value1, value2, "fapermit");
            return (Criteria) this;
        }

        public Criteria andFapaidIsNull() {
            addCriterion("fapaid is null");
            return (Criteria) this;
        }

        public Criteria andFapaidIsNotNull() {
            addCriterion("fapaid is not null");
            return (Criteria) this;
        }

        public Criteria andFapaidEqualTo(Integer value) {
            addCriterion("fapaid =", value, "fapaid");
            return (Criteria) this;
        }

        public Criteria andFapaidNotEqualTo(Integer value) {
            addCriterion("fapaid <>", value, "fapaid");
            return (Criteria) this;
        }

        public Criteria andFapaidGreaterThan(Integer value) {
            addCriterion("fapaid >", value, "fapaid");
            return (Criteria) this;
        }

        public Criteria andFapaidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fapaid >=", value, "fapaid");
            return (Criteria) this;
        }

        public Criteria andFapaidLessThan(Integer value) {
            addCriterion("fapaid <", value, "fapaid");
            return (Criteria) this;
        }

        public Criteria andFapaidLessThanOrEqualTo(Integer value) {
            addCriterion("fapaid <=", value, "fapaid");
            return (Criteria) this;
        }

        public Criteria andFapaidIn(List<Integer> values) {
            addCriterion("fapaid in", values, "fapaid");
            return (Criteria) this;
        }

        public Criteria andFapaidNotIn(List<Integer> values) {
            addCriterion("fapaid not in", values, "fapaid");
            return (Criteria) this;
        }

        public Criteria andFapaidBetween(Integer value1, Integer value2) {
            addCriterion("fapaid between", value1, value2, "fapaid");
            return (Criteria) this;
        }

        public Criteria andFapaidNotBetween(Integer value1, Integer value2) {
            addCriterion("fapaid not between", value1, value2, "fapaid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}