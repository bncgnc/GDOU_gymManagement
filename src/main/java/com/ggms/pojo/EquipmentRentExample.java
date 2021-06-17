package com.ggms.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipmentRentExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentRentExample() {
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

        public Criteria andEquipmentRentidIsNull() {
            addCriterion("equipment_rentid is null");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidIsNotNull() {
            addCriterion("equipment_rentid is not null");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidEqualTo(Integer value) {
            addCriterion("equipment_rentid =", value, "equipmentRentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidNotEqualTo(Integer value) {
            addCriterion("equipment_rentid <>", value, "equipmentRentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidGreaterThan(Integer value) {
            addCriterion("equipment_rentid >", value, "equipmentRentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidGreaterThanOrEqualTo(Integer value) {
            addCriterion("equipment_rentid >=", value, "equipmentRentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidLessThan(Integer value) {
            addCriterion("equipment_rentid <", value, "equipmentRentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidLessThanOrEqualTo(Integer value) {
            addCriterion("equipment_rentid <=", value, "equipmentRentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidIn(List<Integer> values) {
            addCriterion("equipment_rentid in", values, "equipmentRentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidNotIn(List<Integer> values) {
            addCriterion("equipment_rentid not in", values, "equipmentRentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidBetween(Integer value1, Integer value2) {
            addCriterion("equipment_rentid between", value1, value2, "equipmentRentid");
            return (Criteria) this;
        }

        public Criteria andEquipmentRentidNotBetween(Integer value1, Integer value2) {
            addCriterion("equipment_rentid not between", value1, value2, "equipmentRentid");
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

        public Criteria andEractualtimeIsNull() {
            addCriterion("eractualtime is null");
            return (Criteria) this;
        }

        public Criteria andEractualtimeIsNotNull() {
            addCriterion("eractualtime is not null");
            return (Criteria) this;
        }

        public Criteria andEractualtimeEqualTo(Integer value) {
            addCriterion("eractualtime =", value, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andEractualtimeNotEqualTo(Integer value) {
            addCriterion("eractualtime <>", value, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andEractualtimeGreaterThan(Integer value) {
            addCriterion("eractualtime >", value, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andEractualtimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("eractualtime >=", value, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andEractualtimeLessThan(Integer value) {
            addCriterion("eractualtime <", value, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andEractualtimeLessThanOrEqualTo(Integer value) {
            addCriterion("eractualtime <=", value, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andEractualtimeIn(List<Integer> values) {
            addCriterion("eractualtime in", values, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andEractualtimeNotIn(List<Integer> values) {
            addCriterion("eractualtime not in", values, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andEractualtimeBetween(Integer value1, Integer value2) {
            addCriterion("eractualtime between", value1, value2, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andEractualtimeNotBetween(Integer value1, Integer value2) {
            addCriterion("eractualtime not between", value1, value2, "eractualtime");
            return (Criteria) this;
        }

        public Criteria andErbreaknumIsNull() {
            addCriterion("erbreaknum is null");
            return (Criteria) this;
        }

        public Criteria andErbreaknumIsNotNull() {
            addCriterion("erbreaknum is not null");
            return (Criteria) this;
        }

        public Criteria andErbreaknumEqualTo(Integer value) {
            addCriterion("erbreaknum =", value, "erbreaknum");
            return (Criteria) this;
        }

        public Criteria andErbreaknumNotEqualTo(Integer value) {
            addCriterion("erbreaknum <>", value, "erbreaknum");
            return (Criteria) this;
        }

        public Criteria andErbreaknumGreaterThan(Integer value) {
            addCriterion("erbreaknum >", value, "erbreaknum");
            return (Criteria) this;
        }

        public Criteria andErbreaknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("erbreaknum >=", value, "erbreaknum");
            return (Criteria) this;
        }

        public Criteria andErbreaknumLessThan(Integer value) {
            addCriterion("erbreaknum <", value, "erbreaknum");
            return (Criteria) this;
        }

        public Criteria andErbreaknumLessThanOrEqualTo(Integer value) {
            addCriterion("erbreaknum <=", value, "erbreaknum");
            return (Criteria) this;
        }

        public Criteria andErbreaknumIn(List<Integer> values) {
            addCriterion("erbreaknum in", values, "erbreaknum");
            return (Criteria) this;
        }

        public Criteria andErbreaknumNotIn(List<Integer> values) {
            addCriterion("erbreaknum not in", values, "erbreaknum");
            return (Criteria) this;
        }

        public Criteria andErbreaknumBetween(Integer value1, Integer value2) {
            addCriterion("erbreaknum between", value1, value2, "erbreaknum");
            return (Criteria) this;
        }

        public Criteria andErbreaknumNotBetween(Integer value1, Integer value2) {
            addCriterion("erbreaknum not between", value1, value2, "erbreaknum");
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