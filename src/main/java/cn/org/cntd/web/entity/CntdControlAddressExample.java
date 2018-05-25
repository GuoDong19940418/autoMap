package cn.org.cntd.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CntdControlAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CntdControlAddressExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNull() {
            addCriterion("service_id is null");
            return (Criteria) this;
        }

        public Criteria andServiceIdIsNotNull() {
            addCriterion("service_id is not null");
            return (Criteria) this;
        }

        public Criteria andServiceIdEqualTo(String value) {
            addCriterion("service_id =", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotEqualTo(String value) {
            addCriterion("service_id <>", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThan(String value) {
            addCriterion("service_id >", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdGreaterThanOrEqualTo(String value) {
            addCriterion("service_id >=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThan(String value) {
            addCriterion("service_id <", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLessThanOrEqualTo(String value) {
            addCriterion("service_id <=", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdLike(String value) {
            addCriterion("service_id like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotLike(String value) {
            addCriterion("service_id not like", value, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdIn(List<String> values) {
            addCriterion("service_id in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotIn(List<String> values) {
            addCriterion("service_id not in", values, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdBetween(String value1, String value2) {
            addCriterion("service_id between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andServiceIdNotBetween(String value1, String value2) {
            addCriterion("service_id not between", value1, value2, "serviceId");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNull() {
            addCriterion("add_date is null");
            return (Criteria) this;
        }

        public Criteria andAddDateIsNotNull() {
            addCriterion("add_date is not null");
            return (Criteria) this;
        }

        public Criteria andAddDateEqualTo(Date value) {
            addCriterionForJDBCDate("add_date =", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("add_date <>", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThan(Date value) {
            addCriterionForJDBCDate("add_date >", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("add_date >=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThan(Date value) {
            addCriterionForJDBCDate("add_date <", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("add_date <=", value, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateIn(List<Date> values) {
            addCriterionForJDBCDate("add_date in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("add_date not in", values, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("add_date between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andAddDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("add_date not between", value1, value2, "addDate");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlIsNull() {
            addCriterion("reverse_ip_url is null");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlIsNotNull() {
            addCriterion("reverse_ip_url is not null");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlEqualTo(String value) {
            addCriterion("reverse_ip_url =", value, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlNotEqualTo(String value) {
            addCriterion("reverse_ip_url <>", value, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlGreaterThan(String value) {
            addCriterion("reverse_ip_url >", value, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlGreaterThanOrEqualTo(String value) {
            addCriterion("reverse_ip_url >=", value, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlLessThan(String value) {
            addCriterion("reverse_ip_url <", value, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlLessThanOrEqualTo(String value) {
            addCriterion("reverse_ip_url <=", value, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlLike(String value) {
            addCriterion("reverse_ip_url like", value, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlNotLike(String value) {
            addCriterion("reverse_ip_url not like", value, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlIn(List<String> values) {
            addCriterion("reverse_ip_url in", values, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlNotIn(List<String> values) {
            addCriterion("reverse_ip_url not in", values, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlBetween(String value1, String value2) {
            addCriterion("reverse_ip_url between", value1, value2, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseIpUrlNotBetween(String value1, String value2) {
            addCriterion("reverse_ip_url not between", value1, value2, "reverseIpUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlIsNull() {
            addCriterion("reverse_domain_url is null");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlIsNotNull() {
            addCriterion("reverse_domain_url is not null");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlEqualTo(String value) {
            addCriterion("reverse_domain_url =", value, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlNotEqualTo(String value) {
            addCriterion("reverse_domain_url <>", value, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlGreaterThan(String value) {
            addCriterion("reverse_domain_url >", value, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlGreaterThanOrEqualTo(String value) {
            addCriterion("reverse_domain_url >=", value, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlLessThan(String value) {
            addCriterion("reverse_domain_url <", value, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlLessThanOrEqualTo(String value) {
            addCriterion("reverse_domain_url <=", value, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlLike(String value) {
            addCriterion("reverse_domain_url like", value, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlNotLike(String value) {
            addCriterion("reverse_domain_url not like", value, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlIn(List<String> values) {
            addCriterion("reverse_domain_url in", values, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlNotIn(List<String> values) {
            addCriterion("reverse_domain_url not in", values, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlBetween(String value1, String value2) {
            addCriterion("reverse_domain_url between", value1, value2, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainUrlNotBetween(String value1, String value2) {
            addCriterion("reverse_domain_url not between", value1, value2, "reverseDomainUrl");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeIsNull() {
            addCriterion("reverse_domain_type is null");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeIsNotNull() {
            addCriterion("reverse_domain_type is not null");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeEqualTo(String value) {
            addCriterion("reverse_domain_type =", value, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeNotEqualTo(String value) {
            addCriterion("reverse_domain_type <>", value, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeGreaterThan(String value) {
            addCriterion("reverse_domain_type >", value, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeGreaterThanOrEqualTo(String value) {
            addCriterion("reverse_domain_type >=", value, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeLessThan(String value) {
            addCriterion("reverse_domain_type <", value, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeLessThanOrEqualTo(String value) {
            addCriterion("reverse_domain_type <=", value, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeLike(String value) {
            addCriterion("reverse_domain_type like", value, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeNotLike(String value) {
            addCriterion("reverse_domain_type not like", value, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeIn(List<String> values) {
            addCriterion("reverse_domain_type in", values, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeNotIn(List<String> values) {
            addCriterion("reverse_domain_type not in", values, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeBetween(String value1, String value2) {
            addCriterion("reverse_domain_type between", value1, value2, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainTypeNotBetween(String value1, String value2) {
            addCriterion("reverse_domain_type not between", value1, value2, "reverseDomainType");
            return (Criteria) this;
        }

        public Criteria andReverseDomainIsNull() {
            addCriterion("reverse_domain is null");
            return (Criteria) this;
        }

        public Criteria andReverseDomainIsNotNull() {
            addCriterion("reverse_domain is not null");
            return (Criteria) this;
        }

        public Criteria andReverseDomainEqualTo(String value) {
            addCriterion("reverse_domain =", value, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainNotEqualTo(String value) {
            addCriterion("reverse_domain <>", value, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainGreaterThan(String value) {
            addCriterion("reverse_domain >", value, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainGreaterThanOrEqualTo(String value) {
            addCriterion("reverse_domain >=", value, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainLessThan(String value) {
            addCriterion("reverse_domain <", value, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainLessThanOrEqualTo(String value) {
            addCriterion("reverse_domain <=", value, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainLike(String value) {
            addCriterion("reverse_domain like", value, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainNotLike(String value) {
            addCriterion("reverse_domain not like", value, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainIn(List<String> values) {
            addCriterion("reverse_domain in", values, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainNotIn(List<String> values) {
            addCriterion("reverse_domain not in", values, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainBetween(String value1, String value2) {
            addCriterion("reverse_domain between", value1, value2, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andReverseDomainNotBetween(String value1, String value2) {
            addCriterion("reverse_domain not between", value1, value2, "reverseDomain");
            return (Criteria) this;
        }

        public Criteria andFileMd5IsNull() {
            addCriterion("file_md5 is null");
            return (Criteria) this;
        }

        public Criteria andFileMd5IsNotNull() {
            addCriterion("file_md5 is not null");
            return (Criteria) this;
        }

        public Criteria andFileMd5EqualTo(String value) {
            addCriterion("file_md5 =", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotEqualTo(String value) {
            addCriterion("file_md5 <>", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5GreaterThan(String value) {
            addCriterion("file_md5 >", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5GreaterThanOrEqualTo(String value) {
            addCriterion("file_md5 >=", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5LessThan(String value) {
            addCriterion("file_md5 <", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5LessThanOrEqualTo(String value) {
            addCriterion("file_md5 <=", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5Like(String value) {
            addCriterion("file_md5 like", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotLike(String value) {
            addCriterion("file_md5 not like", value, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5In(List<String> values) {
            addCriterion("file_md5 in", values, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotIn(List<String> values) {
            addCriterion("file_md5 not in", values, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5Between(String value1, String value2) {
            addCriterion("file_md5 between", value1, value2, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileMd5NotBetween(String value1, String value2) {
            addCriterion("file_md5 not between", value1, value2, "fileMd5");
            return (Criteria) this;
        }

        public Criteria andFileShaIsNull() {
            addCriterion("file_sha is null");
            return (Criteria) this;
        }

        public Criteria andFileShaIsNotNull() {
            addCriterion("file_sha is not null");
            return (Criteria) this;
        }

        public Criteria andFileShaEqualTo(String value) {
            addCriterion("file_sha =", value, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaNotEqualTo(String value) {
            addCriterion("file_sha <>", value, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaGreaterThan(String value) {
            addCriterion("file_sha >", value, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaGreaterThanOrEqualTo(String value) {
            addCriterion("file_sha >=", value, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaLessThan(String value) {
            addCriterion("file_sha <", value, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaLessThanOrEqualTo(String value) {
            addCriterion("file_sha <=", value, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaLike(String value) {
            addCriterion("file_sha like", value, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaNotLike(String value) {
            addCriterion("file_sha not like", value, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaIn(List<String> values) {
            addCriterion("file_sha in", values, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaNotIn(List<String> values) {
            addCriterion("file_sha not in", values, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaBetween(String value1, String value2) {
            addCriterion("file_sha between", value1, value2, "fileSha");
            return (Criteria) this;
        }

        public Criteria andFileShaNotBetween(String value1, String value2) {
            addCriterion("file_sha not between", value1, value2, "fileSha");
            return (Criteria) this;
        }

        public Criteria andBeforeIdIsNull() {
            addCriterion("before_id is null");
            return (Criteria) this;
        }

        public Criteria andBeforeIdIsNotNull() {
            addCriterion("before_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeforeIdEqualTo(String value) {
            addCriterion("before_id =", value, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdNotEqualTo(String value) {
            addCriterion("before_id <>", value, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdGreaterThan(String value) {
            addCriterion("before_id >", value, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdGreaterThanOrEqualTo(String value) {
            addCriterion("before_id >=", value, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdLessThan(String value) {
            addCriterion("before_id <", value, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdLessThanOrEqualTo(String value) {
            addCriterion("before_id <=", value, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdLike(String value) {
            addCriterion("before_id like", value, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdNotLike(String value) {
            addCriterion("before_id not like", value, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdIn(List<String> values) {
            addCriterion("before_id in", values, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdNotIn(List<String> values) {
            addCriterion("before_id not in", values, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdBetween(String value1, String value2) {
            addCriterion("before_id between", value1, value2, "beforeId");
            return (Criteria) this;
        }

        public Criteria andBeforeIdNotBetween(String value1, String value2) {
            addCriterion("before_id not between", value1, value2, "beforeId");
            return (Criteria) this;
        }

        public Criteria andTransferFlagIsNull() {
            addCriterion("transfer_flag is null");
            return (Criteria) this;
        }

        public Criteria andTransferFlagIsNotNull() {
            addCriterion("transfer_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTransferFlagEqualTo(Boolean value) {
            addCriterion("transfer_flag =", value, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andTransferFlagNotEqualTo(Boolean value) {
            addCriterion("transfer_flag <>", value, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andTransferFlagGreaterThan(Boolean value) {
            addCriterion("transfer_flag >", value, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andTransferFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("transfer_flag >=", value, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andTransferFlagLessThan(Boolean value) {
            addCriterion("transfer_flag <", value, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andTransferFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("transfer_flag <=", value, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andTransferFlagIn(List<Boolean> values) {
            addCriterion("transfer_flag in", values, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andTransferFlagNotIn(List<Boolean> values) {
            addCriterion("transfer_flag not in", values, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andTransferFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("transfer_flag between", value1, value2, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andTransferFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("transfer_flag not between", value1, value2, "transferFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNull() {
            addCriterion("delete_flag is null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIsNotNull() {
            addCriterion("delete_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagEqualTo(Boolean value) {
            addCriterion("delete_flag =", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotEqualTo(Boolean value) {
            addCriterion("delete_flag <>", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThan(Boolean value) {
            addCriterion("delete_flag >", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagGreaterThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag >=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThan(Boolean value) {
            addCriterion("delete_flag <", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagLessThanOrEqualTo(Boolean value) {
            addCriterion("delete_flag <=", value, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagIn(List<Boolean> values) {
            addCriterion("delete_flag in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotIn(List<Boolean> values) {
            addCriterion("delete_flag not in", values, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andDeleteFlagNotBetween(Boolean value1, Boolean value2) {
            addCriterion("delete_flag not between", value1, value2, "deleteFlag");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNull() {
            addCriterion("modify_date is null");
            return (Criteria) this;
        }

        public Criteria andModifyDateIsNotNull() {
            addCriterion("modify_date is not null");
            return (Criteria) this;
        }

        public Criteria andModifyDateEqualTo(Date value) {
            addCriterion("modify_date =", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotEqualTo(Date value) {
            addCriterion("modify_date <>", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThan(Date value) {
            addCriterion("modify_date >", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modify_date >=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThan(Date value) {
            addCriterion("modify_date <", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateLessThanOrEqualTo(Date value) {
            addCriterion("modify_date <=", value, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateIn(List<Date> values) {
            addCriterion("modify_date in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotIn(List<Date> values) {
            addCriterion("modify_date not in", values, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateBetween(Date value1, Date value2) {
            addCriterion("modify_date between", value1, value2, "modifyDate");
            return (Criteria) this;
        }

        public Criteria andModifyDateNotBetween(Date value1, Date value2) {
            addCriterion("modify_date not between", value1, value2, "modifyDate");
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