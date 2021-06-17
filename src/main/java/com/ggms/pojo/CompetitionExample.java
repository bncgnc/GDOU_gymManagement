package com.ggms.pojo;

import java.util.ArrayList;
import java.util.List;

public class CompetitionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CompetitionExample() {
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

        public Criteria andCompetitionidIsNull() {
            addCriterion("competitionid is null");
            return (Criteria) this;
        }

        public Criteria andCompetitionidIsNotNull() {
            addCriterion("competitionid is not null");
            return (Criteria) this;
        }

        public Criteria andCompetitionidEqualTo(Integer value) {
            addCriterion("competitionid =", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidNotEqualTo(Integer value) {
            addCriterion("competitionid <>", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidGreaterThan(Integer value) {
            addCriterion("competitionid >", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidGreaterThanOrEqualTo(Integer value) {
            addCriterion("competitionid >=", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidLessThan(Integer value) {
            addCriterion("competitionid <", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidLessThanOrEqualTo(Integer value) {
            addCriterion("competitionid <=", value, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidIn(List<Integer> values) {
            addCriterion("competitionid in", values, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidNotIn(List<Integer> values) {
            addCriterion("competitionid not in", values, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidBetween(Integer value1, Integer value2) {
            addCriterion("competitionid between", value1, value2, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCompetitionidNotBetween(Integer value1, Integer value2) {
            addCriterion("competitionid not between", value1, value2, "competitionid");
            return (Criteria) this;
        }

        public Criteria andCnameIsNull() {
            addCriterion("cname is null");
            return (Criteria) this;
        }

        public Criteria andCnameIsNotNull() {
            addCriterion("cname is not null");
            return (Criteria) this;
        }

        public Criteria andCnameEqualTo(String value) {
            addCriterion("cname =", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotEqualTo(String value) {
            addCriterion("cname <>", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThan(String value) {
            addCriterion("cname >", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameGreaterThanOrEqualTo(String value) {
            addCriterion("cname >=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThan(String value) {
            addCriterion("cname <", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLessThanOrEqualTo(String value) {
            addCriterion("cname <=", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameLike(String value) {
            addCriterion("cname like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotLike(String value) {
            addCriterion("cname not like", value, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameIn(List<String> values) {
            addCriterion("cname in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotIn(List<String> values) {
            addCriterion("cname not in", values, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameBetween(String value1, String value2) {
            addCriterion("cname between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCnameNotBetween(String value1, String value2) {
            addCriterion("cname not between", value1, value2, "cname");
            return (Criteria) this;
        }

        public Criteria andCjudgeIsNull() {
            addCriterion("cjudge is null");
            return (Criteria) this;
        }

        public Criteria andCjudgeIsNotNull() {
            addCriterion("cjudge is not null");
            return (Criteria) this;
        }

        public Criteria andCjudgeEqualTo(String value) {
            addCriterion("cjudge =", value, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeNotEqualTo(String value) {
            addCriterion("cjudge <>", value, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeGreaterThan(String value) {
            addCriterion("cjudge >", value, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeGreaterThanOrEqualTo(String value) {
            addCriterion("cjudge >=", value, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeLessThan(String value) {
            addCriterion("cjudge <", value, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeLessThanOrEqualTo(String value) {
            addCriterion("cjudge <=", value, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeLike(String value) {
            addCriterion("cjudge like", value, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeNotLike(String value) {
            addCriterion("cjudge not like", value, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeIn(List<String> values) {
            addCriterion("cjudge in", values, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeNotIn(List<String> values) {
            addCriterion("cjudge not in", values, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeBetween(String value1, String value2) {
            addCriterion("cjudge between", value1, value2, "cjudge");
            return (Criteria) this;
        }

        public Criteria andCjudgeNotBetween(String value1, String value2) {
            addCriterion("cjudge not between", value1, value2, "cjudge");
            return (Criteria) this;
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

        public Criteria andEquipmentApplicationidIsNull() {
            addCriterion("equipment_applicationid is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidIsNotNull() {
            addCriterion("equipment_applicationid is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidEqualTo(Integer value) {
            addCriterion("equipment_applicationid =", value, "equipmentApplicationid");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidNotEqualTo(Integer value) {
            addCriterion("equipment_applicationid <>", value, "equipmentApplicationid");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidGreaterThan(Integer value) {
            addCriterion("equipment_applicationid >", value, "equipmentApplicationid");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_applicationid >=", value, "equipmentApplicationid");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidLessThan(Integer value) {
            addCriterion("equipment_applicationid <", value, "equipmentApplicationid");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_applicationid <=", value, "equipmentApplicationid");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidIn(List<Integer> values) {
            addCriterion("equipment_applicationid in", values, "equipmentApplicationid");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidNotIn(List<Integer> values) {
            addCriterion("equipment_applicationid not in", values, "equipmentApplicationid");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidBetween(Integer value1, Integer value2) {
            addCriterion("equipment_applicationid between", value1, value2, "equipmentApplicationid");
            return (Criteria) this;
        }

        public Criteria andEquipmentApplicationidNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_applicationid not between", value1, value2, "equipmentApplicationid");
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