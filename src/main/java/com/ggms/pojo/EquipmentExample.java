package com.ggms.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipmentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentExample() {
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

        public Criteria andEquipmentidIsNull() {
            addCriterion("equipmentid is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIsNotNull() {
            addCriterion("equipmentid is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentidEqualTo(Integer value) {
            addCriterion("equipmentid =", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotEqualTo(Integer value) {
            addCriterion("equipmentid <>", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThan(Integer value) {
            addCriterion("equipmentid >", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipmentid >=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThan(Integer value) {
            addCriterion("equipmentid <", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidLessThanOrEqualTo(Integer value) {
            addCriterion("equipmentid <=", value, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidIn(List<Integer> values) {
            addCriterion("equipmentid in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotIn(List<Integer> values) {
            addCriterion("equipmentid not in", values, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidBetween(Integer value1, Integer value2) {
            addCriterion("equipmentid between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentidNotBetween(Integer value1, Integer value2) {
            addCriterion("equipmentid not between", value1, value2, "equipmentid");
            return (Criteria) this;
        }

        public Criteria andEnameIsNull() {
            addCriterion("ename is null");
            return (Criteria) this;
        }

        public Criteria andEnameIsNotNull() {
            addCriterion("ename is not null");
            return (Criteria) this;
        }

        public Criteria andEnameEqualTo(String value) {
            addCriterion("ename =", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotEqualTo(String value) {
            addCriterion("ename <>", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThan(String value) {
            addCriterion("ename >", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameGreaterThanOrEqualTo(String value) {
            addCriterion("ename >=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThan(String value) {
            addCriterion("ename <", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLessThanOrEqualTo(String value) {
            addCriterion("ename <=", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameLike(String value) {
            addCriterion("ename like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotLike(String value) {
            addCriterion("ename not like", value, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameIn(List<String> values) {
            addCriterion("ename in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotIn(List<String> values) {
            addCriterion("ename not in", values, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameBetween(String value1, String value2) {
            addCriterion("ename between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andEnameNotBetween(String value1, String value2) {
            addCriterion("ename not between", value1, value2, "ename");
            return (Criteria) this;
        }

        public Criteria andenumsIsNull() {
            addCriterion("enums is null");
            return (Criteria) this;
        }

        public Criteria andenumsIsNotNull() {
            addCriterion("enums is not null");
            return (Criteria) this;
        }

        public Criteria andenumsEqualTo(Integer value) {
            addCriterion("enums =", value, "enums");
            return (Criteria) this;
        }

        public Criteria andenumsNotEqualTo(Integer value) {
            addCriterion("enums <>", value, "enums");
            return (Criteria) this;
        }

        public Criteria andenumsGreaterThan(Integer value) {
            addCriterion("enums >", value, "enums");
            return (Criteria) this;
        }

        public Criteria andenumsGreaterThanOrEqualTo(Integer value) {
            addCriterion("enums >=", value, "enums");
            return (Criteria) this;
        }

        public Criteria andenumsLessThan(Integer value) {
            addCriterion("enums <", value, "enums");
            return (Criteria) this;
        }

        public Criteria andenumsLessThanOrEqualTo(Integer value) {
            addCriterion("enums <=", value, "enums");
            return (Criteria) this;
        }

        public Criteria andenumsIn(List<Integer> values) {
            addCriterion("enums in", values, "enums");
            return (Criteria) this;
        }

        public Criteria andenumsNotIn(List<Integer> values) {
            addCriterion("enums not in", values, "enums");
            return (Criteria) this;
        }

        public Criteria andenumsBetween(Integer value1, Integer value2) {
            addCriterion("enums between", value1, value2, "enums");
            return (Criteria) this;
        }

        public Criteria andenumsNotBetween(Integer value1, Integer value2) {
            addCriterion("enums not between", value1, value2, "enums");
            return (Criteria) this;
        }

        public Criteria andErentIsNull() {
            addCriterion("erent is null");
            return (Criteria) this;
        }

        public Criteria andErentIsNotNull() {
            addCriterion("erent is not null");
            return (Criteria) this;
        }

        public Criteria andErentEqualTo(Integer value) {
            addCriterion("erent =", value, "erent");
            return (Criteria) this;
        }

        public Criteria andErentNotEqualTo(Integer value) {
            addCriterion("erent <>", value, "erent");
            return (Criteria) this;
        }

        public Criteria andErentGreaterThan(Integer value) {
            addCriterion("erent >", value, "erent");
            return (Criteria) this;
        }

        public Criteria andErentGreaterThanOrEqualTo(Integer value) {
            addCriterion("erent >=", value, "erent");
            return (Criteria) this;
        }

        public Criteria andErentLessThan(Integer value) {
            addCriterion("erent <", value, "erent");
            return (Criteria) this;
        }

        public Criteria andErentLessThanOrEqualTo(Integer value) {
            addCriterion("erent <=", value, "erent");
            return (Criteria) this;
        }

        public Criteria andErentIn(List<Integer> values) {
            addCriterion("erent in", values, "erent");
            return (Criteria) this;
        }

        public Criteria andErentNotIn(List<Integer> values) {
            addCriterion("erent not in", values, "erent");
            return (Criteria) this;
        }

        public Criteria andErentBetween(Integer value1, Integer value2) {
            addCriterion("erent between", value1, value2, "erent");
            return (Criteria) this;
        }

        public Criteria andErentNotBetween(Integer value1, Integer value2) {
            addCriterion("erent not between", value1, value2, "erent");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceIsNull() {
            addCriterion("ebreakprice is null");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceIsNotNull() {
            addCriterion("ebreakprice is not null");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceEqualTo(Integer value) {
            addCriterion("ebreakprice =", value, "ebreakprice");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceNotEqualTo(Integer value) {
            addCriterion("ebreakprice <>", value, "ebreakprice");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceGreaterThan(Integer value) {
            addCriterion("ebreakprice >", value, "ebreakprice");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("ebreakprice >=", value, "ebreakprice");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceLessThan(Integer value) {
            addCriterion("ebreakprice <", value, "ebreakprice");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceLessThanOrEqualTo(Integer value) {
            addCriterion("ebreakprice <=", value, "ebreakprice");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceIn(List<Integer> values) {
            addCriterion("ebreakprice in", values, "ebreakprice");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceNotIn(List<Integer> values) {
            addCriterion("ebreakprice not in", values, "ebreakprice");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceBetween(Integer value1, Integer value2) {
            addCriterion("ebreakprice between", value1, value2, "ebreakprice");
            return (Criteria) this;
        }

        public Criteria andEbreakpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("ebreakprice not between", value1, value2, "ebreakprice");
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