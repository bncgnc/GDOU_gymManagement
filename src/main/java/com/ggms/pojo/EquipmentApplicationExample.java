package com.ggms.pojo;

import java.util.ArrayList;
import java.util.List;

public class EquipmentApplicationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public EquipmentApplicationExample() {
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

        public Criteria andEanumIsNull() {
            addCriterion("eanum is null");
            return (Criteria) this;
        }

        public Criteria andEanumIsNotNull() {
            addCriterion("eanum is not null");
            return (Criteria) this;
        }

        public Criteria andEanumEqualTo(Integer value) {
            addCriterion("eanum =", value, "eanum");
            return (Criteria) this;
        }

        public Criteria andEanumNotEqualTo(Integer value) {
            addCriterion("eanum <>", value, "eanum");
            return (Criteria) this;
        }

        public Criteria andEanumGreaterThan(Integer value) {
            addCriterion("eanum >", value, "eanum");
            return (Criteria) this;
        }

        public Criteria andEanumGreaterThanOrEqualTo(Integer value) {
            addCriterion("eanum >=", value, "eanum");
            return (Criteria) this;
        }

        public Criteria andEanumLessThan(Integer value) {
            addCriterion("eanum <", value, "eanum");
            return (Criteria) this;
        }

        public Criteria andEanumLessThanOrEqualTo(Integer value) {
            addCriterion("eanum <=", value, "eanum");
            return (Criteria) this;
        }

        public Criteria andEanumIn(List<Integer> values) {
            addCriterion("eanum in", values, "eanum");
            return (Criteria) this;
        }

        public Criteria andEanumNotIn(List<Integer> values) {
            addCriterion("eanum not in", values, "eanum");
            return (Criteria) this;
        }

        public Criteria andEanumBetween(Integer value1, Integer value2) {
            addCriterion("eanum between", value1, value2, "eanum");
            return (Criteria) this;
        }

        public Criteria andEanumNotBetween(Integer value1, Integer value2) {
            addCriterion("eanum not between", value1, value2, "eanum");
            return (Criteria) this;
        }

        public Criteria andEaplantimeIsNull() {
            addCriterion("eaplantime is null");
            return (Criteria) this;
        }

        public Criteria andEaplantimeIsNotNull() {
            addCriterion("eaplantime is not null");
            return (Criteria) this;
        }

        public Criteria andEaplantimeEqualTo(Integer value) {
            addCriterion("eaplantime =", value, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEaplantimeNotEqualTo(Integer value) {
            addCriterion("eaplantime <>", value, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEaplantimeGreaterThan(Integer value) {
            addCriterion("eaplantime >", value, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEaplantimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("eaplantime >=", value, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEaplantimeLessThan(Integer value) {
            addCriterion("eaplantime <", value, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEaplantimeLessThanOrEqualTo(Integer value) {
            addCriterion("eaplantime <=", value, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEaplantimeIn(List<Integer> values) {
            addCriterion("eaplantime in", values, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEaplantimeNotIn(List<Integer> values) {
            addCriterion("eaplantime not in", values, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEaplantimeBetween(Integer value1, Integer value2) {
            addCriterion("eaplantime between", value1, value2, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEaplantimeNotBetween(Integer value1, Integer value2) {
            addCriterion("eaplantime not between", value1, value2, "eaplantime");
            return (Criteria) this;
        }

        public Criteria andEapermitIsNull() {
            addCriterion("eapermit is null");
            return (Criteria) this;
        }

        public Criteria andEapermitIsNotNull() {
            addCriterion("eapermit is not null");
            return (Criteria) this;
        }

        public Criteria andEapermitEqualTo(Integer value) {
            addCriterion("eapermit =", value, "eapermit");
            return (Criteria) this;
        }

        public Criteria andEapermitNotEqualTo(Integer value) {
            addCriterion("eapermit <>", value, "eapermit");
            return (Criteria) this;
        }

        public Criteria andEapermitGreaterThan(Integer value) {
            addCriterion("eapermit >", value, "eapermit");
            return (Criteria) this;
        }

        public Criteria andEapermitGreaterThanOrEqualTo(Integer value) {
            addCriterion("eapermit >=", value, "eapermit");
            return (Criteria) this;
        }

        public Criteria andEapermitLessThan(Integer value) {
            addCriterion("eapermit <", value, "eapermit");
            return (Criteria) this;
        }

        public Criteria andEapermitLessThanOrEqualTo(Integer value) {
            addCriterion("eapermit <=", value, "eapermit");
            return (Criteria) this;
        }

        public Criteria andEapermitIn(List<Integer> values) {
            addCriterion("eapermit in", values, "eapermit");
            return (Criteria) this;
        }

        public Criteria andEapermitNotIn(List<Integer> values) {
            addCriterion("eapermit not in", values, "eapermit");
            return (Criteria) this;
        }

        public Criteria andEapermitBetween(Integer value1, Integer value2) {
            addCriterion("eapermit between", value1, value2, "eapermit");
            return (Criteria) this;
        }

        public Criteria andEapermitNotBetween(Integer value1, Integer value2) {
            addCriterion("eapermit not between", value1, value2, "eapermit");
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