package com.ggms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FieldTimetableExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FieldTimetableExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andFieldidIsNull() {
            addCriterion("fieldid is null");
            return (Criteria) this;
        }

        public Criteria andFieldidIsNotNull() {
            addCriterion("fieldid is not null");
            return (Criteria) this;
        }

        public Criteria andFieldidEqualTo(Integer value) {
            addCriterion("fieldid =", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotEqualTo(Integer value) {
            addCriterion("fieldid <>", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidGreaterThan(Integer value) {
            addCriterion("fieldid >", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidGreaterThanOrEqualTo(Integer value) {
            addCriterion("fieldid >=", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidLessThan(Integer value) {
            addCriterion("fieldid <", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidLessThanOrEqualTo(Integer value) {
            addCriterion("fieldid <=", value, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidIn(List<Integer> values) {
            addCriterion("fieldid in", values, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotIn(List<Integer> values) {
            addCriterion("fieldid not in", values, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidBetween(Integer value1, Integer value2) {
            addCriterion("fieldid between", value1, value2, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFieldidNotBetween(Integer value1, Integer value2) {
            addCriterion("fieldid not between", value1, value2, "fieldid");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartIsNull() {
            addCriterion("fdtime_start is null");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartIsNotNull() {
            addCriterion("fdtime_start is not null");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartEqualTo(Date value) {
            addCriterionForJDBCDate("fdtime_start =", value, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartNotEqualTo(Date value) {
            addCriterionForJDBCDate("fdtime_start <>", value, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartGreaterThan(Date value) {
            addCriterionForJDBCDate("fdtime_start >", value, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fdtime_start >=", value, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartLessThan(Date value) {
            addCriterionForJDBCDate("fdtime_start <", value, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fdtime_start <=", value, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartIn(List<Date> values) {
            addCriterionForJDBCDate("fdtime_start in", values, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartNotIn(List<Date> values) {
            addCriterionForJDBCDate("fdtime_start not in", values, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fdtime_start between", value1, value2, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeStartNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fdtime_start not between", value1, value2, "fdtimeStart");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndIsNull() {
            addCriterion("fdtime_end is null");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndIsNotNull() {
            addCriterion("fdtime_end is not null");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndEqualTo(Date value) {
            addCriterionForJDBCDate("fdtime_end =", value, "fdtimeEnd");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndNotEqualTo(Date value) {
            addCriterionForJDBCDate("fdtime_end <>", value, "fdtimeEnd");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndGreaterThan(Date value) {
            addCriterionForJDBCDate("fdtime_end >", value, "fdtimeEnd");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fdtime_end >=", value, "fdtimeEnd");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndLessThan(Date value) {
            addCriterionForJDBCDate("fdtime_end <", value, "fdtimeEnd");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("fdtime_end <=", value, "fdtimeEnd");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndIn(List<Date> values) {
            addCriterionForJDBCDate("fdtime_end in", values, "fdtimeEnd");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndNotIn(List<Date> values) {
            addCriterionForJDBCDate("fdtime_end not in", values, "fdtimeEnd");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fdtime_end between", value1, value2, "fdtimeEnd");
            return (Criteria) this;
        }

        public Criteria andFdtimeEndNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("fdtime_end not between", value1, value2, "fdtimeEnd");
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