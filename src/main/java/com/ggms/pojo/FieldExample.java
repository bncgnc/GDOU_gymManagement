package com.ggms.pojo;

import java.util.ArrayList;
import java.util.List;

public class FieldExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FieldExample() {
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

        public Criteria andFnameIsNull() {
            addCriterion("fname is null");
            return (Criteria) this;
        }

        public Criteria andFnameIsNotNull() {
            addCriterion("fname is not null");
            return (Criteria) this;
        }

        public Criteria andFnameEqualTo(String value) {
            addCriterion("fname =", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotEqualTo(String value) {
            addCriterion("fname <>", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThan(String value) {
            addCriterion("fname >", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameGreaterThanOrEqualTo(String value) {
            addCriterion("fname >=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThan(String value) {
            addCriterion("fname <", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLessThanOrEqualTo(String value) {
            addCriterion("fname <=", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameLike(String value) {
            addCriterion("fname like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotLike(String value) {
            addCriterion("fname not like", value, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameIn(List<String> values) {
            addCriterion("fname in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotIn(List<String> values) {
            addCriterion("fname not in", values, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameBetween(String value1, String value2) {
            addCriterion("fname between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFnameNotBetween(String value1, String value2) {
            addCriterion("fname not between", value1, value2, "fname");
            return (Criteria) this;
        }

        public Criteria andFlocationIsNull() {
            addCriterion("flocation is null");
            return (Criteria) this;
        }

        public Criteria andFlocationIsNotNull() {
            addCriterion("flocation is not null");
            return (Criteria) this;
        }

        public Criteria andFlocationEqualTo(String value) {
            addCriterion("flocation =", value, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationNotEqualTo(String value) {
            addCriterion("flocation <>", value, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationGreaterThan(String value) {
            addCriterion("flocation >", value, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationGreaterThanOrEqualTo(String value) {
            addCriterion("flocation >=", value, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationLessThan(String value) {
            addCriterion("flocation <", value, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationLessThanOrEqualTo(String value) {
            addCriterion("flocation <=", value, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationLike(String value) {
            addCriterion("flocation like", value, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationNotLike(String value) {
            addCriterion("flocation not like", value, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationIn(List<String> values) {
            addCriterion("flocation in", values, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationNotIn(List<String> values) {
            addCriterion("flocation not in", values, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationBetween(String value1, String value2) {
            addCriterion("flocation between", value1, value2, "flocation");
            return (Criteria) this;
        }

        public Criteria andFlocationNotBetween(String value1, String value2) {
            addCriterion("flocation not between", value1, value2, "flocation");
            return (Criteria) this;
        }

        public Criteria andFhostIsNull() {
            addCriterion("fhost is null");
            return (Criteria) this;
        }

        public Criteria andFhostIsNotNull() {
            addCriterion("fhost is not null");
            return (Criteria) this;
        }

        public Criteria andFhostEqualTo(String value) {
            addCriterion("fhost =", value, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostNotEqualTo(String value) {
            addCriterion("fhost <>", value, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostGreaterThan(String value) {
            addCriterion("fhost >", value, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostGreaterThanOrEqualTo(String value) {
            addCriterion("fhost >=", value, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostLessThan(String value) {
            addCriterion("fhost <", value, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostLessThanOrEqualTo(String value) {
            addCriterion("fhost <=", value, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostLike(String value) {
            addCriterion("fhost like", value, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostNotLike(String value) {
            addCriterion("fhost not like", value, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostIn(List<String> values) {
            addCriterion("fhost in", values, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostNotIn(List<String> values) {
            addCriterion("fhost not in", values, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostBetween(String value1, String value2) {
            addCriterion("fhost between", value1, value2, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostNotBetween(String value1, String value2) {
            addCriterion("fhost not between", value1, value2, "fhost");
            return (Criteria) this;
        }

        public Criteria andFhostcallIsNull() {
            addCriterion("fhostcall is null");
            return (Criteria) this;
        }

        public Criteria andFhostcallIsNotNull() {
            addCriterion("fhostcall is not null");
            return (Criteria) this;
        }

        public Criteria andFhostcallEqualTo(String value) {
            addCriterion("fhostcall =", value, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallNotEqualTo(String value) {
            addCriterion("fhostcall <>", value, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallGreaterThan(String value) {
            addCriterion("fhostcall >", value, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallGreaterThanOrEqualTo(String value) {
            addCriterion("fhostcall >=", value, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallLessThan(String value) {
            addCriterion("fhostcall <", value, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallLessThanOrEqualTo(String value) {
            addCriterion("fhostcall <=", value, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallLike(String value) {
            addCriterion("fhostcall like", value, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallNotLike(String value) {
            addCriterion("fhostcall not like", value, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallIn(List<String> values) {
            addCriterion("fhostcall in", values, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallNotIn(List<String> values) {
            addCriterion("fhostcall not in", values, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallBetween(String value1, String value2) {
            addCriterion("fhostcall between", value1, value2, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFhostcallNotBetween(String value1, String value2) {
            addCriterion("fhostcall not between", value1, value2, "fhostcall");
            return (Criteria) this;
        }

        public Criteria andFrentIsNull() {
            addCriterion("frent is null");
            return (Criteria) this;
        }

        public Criteria andFrentIsNotNull() {
            addCriterion("frent is not null");
            return (Criteria) this;
        }

        public Criteria andFrentEqualTo(Integer value) {
            addCriterion("frent =", value, "frent");
            return (Criteria) this;
        }

        public Criteria andFrentNotEqualTo(Integer value) {
            addCriterion("frent <>", value, "frent");
            return (Criteria) this;
        }

        public Criteria andFrentGreaterThan(Integer value) {
            addCriterion("frent >", value, "frent");
            return (Criteria) this;
        }

        public Criteria andFrentGreaterThanOrEqualTo(Integer value) {
            addCriterion("frent >=", value, "frent");
            return (Criteria) this;
        }

        public Criteria andFrentLessThan(Integer value) {
            addCriterion("frent <", value, "frent");
            return (Criteria) this;
        }

        public Criteria andFrentLessThanOrEqualTo(Integer value) {
            addCriterion("frent <=", value, "frent");
            return (Criteria) this;
        }

        public Criteria andFrentIn(List<Integer> values) {
            addCriterion("frent in", values, "frent");
            return (Criteria) this;
        }

        public Criteria andFrentNotIn(List<Integer> values) {
            addCriterion("frent not in", values, "frent");
            return (Criteria) this;
        }

        public Criteria andFrentBetween(Integer value1, Integer value2) {
            addCriterion("frent between", value1, value2, "frent");
            return (Criteria) this;
        }

        public Criteria andFrentNotBetween(Integer value1, Integer value2) {
            addCriterion("frent not between", value1, value2, "frent");
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