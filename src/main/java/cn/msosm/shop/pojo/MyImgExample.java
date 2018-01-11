package cn.msosm.shop.pojo;

import java.util.ArrayList;
import java.util.List;

public class MyImgExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MyImgExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNull() {
            addCriterion("groups is null");
            return (Criteria) this;
        }

        public Criteria andGroupsIsNotNull() {
            addCriterion("groups is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsEqualTo(String value) {
            addCriterion("groups =", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotEqualTo(String value) {
            addCriterion("groups <>", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThan(String value) {
            addCriterion("groups >", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsGreaterThanOrEqualTo(String value) {
            addCriterion("groups >=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThan(String value) {
            addCriterion("groups <", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLessThanOrEqualTo(String value) {
            addCriterion("groups <=", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsLike(String value) {
            addCriterion("groups like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotLike(String value) {
            addCriterion("groups not like", value, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsIn(List<String> values) {
            addCriterion("groups in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotIn(List<String> values) {
            addCriterion("groups not in", values, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsBetween(String value1, String value2) {
            addCriterion("groups between", value1, value2, "groups");
            return (Criteria) this;
        }

        public Criteria andGroupsNotBetween(String value1, String value2) {
            addCriterion("groups not between", value1, value2, "groups");
            return (Criteria) this;
        }

        public Criteria andUrlIsNull() {
            addCriterion("url is null");
            return (Criteria) this;
        }

        public Criteria andUrlIsNotNull() {
            addCriterion("url is not null");
            return (Criteria) this;
        }

        public Criteria andUrlEqualTo(String value) {
            addCriterion("url =", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotEqualTo(String value) {
            addCriterion("url <>", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThan(String value) {
            addCriterion("url >", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlGreaterThanOrEqualTo(String value) {
            addCriterion("url >=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThan(String value) {
            addCriterion("url <", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLessThanOrEqualTo(String value) {
            addCriterion("url <=", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlLike(String value) {
            addCriterion("url like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotLike(String value) {
            addCriterion("url not like", value, "url");
            return (Criteria) this;
        }

        public Criteria andUrlIn(List<String> values) {
            addCriterion("url in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotIn(List<String> values) {
            addCriterion("url not in", values, "url");
            return (Criteria) this;
        }

        public Criteria andUrlBetween(String value1, String value2) {
            addCriterion("url between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andUrlNotBetween(String value1, String value2) {
            addCriterion("url not between", value1, value2, "url");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNull() {
            addCriterion("imgUrl is null");
            return (Criteria) this;
        }

        public Criteria andImgurlIsNotNull() {
            addCriterion("imgUrl is not null");
            return (Criteria) this;
        }

        public Criteria andImgurlEqualTo(String value) {
            addCriterion("imgUrl =", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotEqualTo(String value) {
            addCriterion("imgUrl <>", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThan(String value) {
            addCriterion("imgUrl >", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlGreaterThanOrEqualTo(String value) {
            addCriterion("imgUrl >=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThan(String value) {
            addCriterion("imgUrl <", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLessThanOrEqualTo(String value) {
            addCriterion("imgUrl <=", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlLike(String value) {
            addCriterion("imgUrl like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotLike(String value) {
            addCriterion("imgUrl not like", value, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlIn(List<String> values) {
            addCriterion("imgUrl in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotIn(List<String> values) {
            addCriterion("imgUrl not in", values, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlBetween(String value1, String value2) {
            addCriterion("imgUrl between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andImgurlNotBetween(String value1, String value2) {
            addCriterion("imgUrl not between", value1, value2, "imgurl");
            return (Criteria) this;
        }

        public Criteria andExtnameIsNull() {
            addCriterion("extName is null");
            return (Criteria) this;
        }

        public Criteria andExtnameIsNotNull() {
            addCriterion("extName is not null");
            return (Criteria) this;
        }

        public Criteria andExtnameEqualTo(String value) {
            addCriterion("extName =", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameNotEqualTo(String value) {
            addCriterion("extName <>", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameGreaterThan(String value) {
            addCriterion("extName >", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameGreaterThanOrEqualTo(String value) {
            addCriterion("extName >=", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameLessThan(String value) {
            addCriterion("extName <", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameLessThanOrEqualTo(String value) {
            addCriterion("extName <=", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameLike(String value) {
            addCriterion("extName like", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameNotLike(String value) {
            addCriterion("extName not like", value, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameIn(List<String> values) {
            addCriterion("extName in", values, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameNotIn(List<String> values) {
            addCriterion("extName not in", values, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameBetween(String value1, String value2) {
            addCriterion("extName between", value1, value2, "extname");
            return (Criteria) this;
        }

        public Criteria andExtnameNotBetween(String value1, String value2) {
            addCriterion("extName not between", value1, value2, "extname");
            return (Criteria) this;
        }

        public Criteria andOldnameIsNull() {
            addCriterion("oldName is null");
            return (Criteria) this;
        }

        public Criteria andOldnameIsNotNull() {
            addCriterion("oldName is not null");
            return (Criteria) this;
        }

        public Criteria andOldnameEqualTo(String value) {
            addCriterion("oldName =", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotEqualTo(String value) {
            addCriterion("oldName <>", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameGreaterThan(String value) {
            addCriterion("oldName >", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameGreaterThanOrEqualTo(String value) {
            addCriterion("oldName >=", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameLessThan(String value) {
            addCriterion("oldName <", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameLessThanOrEqualTo(String value) {
            addCriterion("oldName <=", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameLike(String value) {
            addCriterion("oldName like", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotLike(String value) {
            addCriterion("oldName not like", value, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameIn(List<String> values) {
            addCriterion("oldName in", values, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotIn(List<String> values) {
            addCriterion("oldName not in", values, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameBetween(String value1, String value2) {
            addCriterion("oldName between", value1, value2, "oldname");
            return (Criteria) this;
        }

        public Criteria andOldnameNotBetween(String value1, String value2) {
            addCriterion("oldName not between", value1, value2, "oldname");
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