package cn.org.cntd.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PhishtankExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PhishtankExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
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

        public Criteria andIdHrefIsNull() {
            addCriterion("ID_href is null");
            return (Criteria) this;
        }

        public Criteria andIdHrefIsNotNull() {
            addCriterion("ID_href is not null");
            return (Criteria) this;
        }

        public Criteria andIdHrefEqualTo(String value) {
            addCriterion("ID_href =", value, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefNotEqualTo(String value) {
            addCriterion("ID_href <>", value, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefGreaterThan(String value) {
            addCriterion("ID_href >", value, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefGreaterThanOrEqualTo(String value) {
            addCriterion("ID_href >=", value, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefLessThan(String value) {
            addCriterion("ID_href <", value, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefLessThanOrEqualTo(String value) {
            addCriterion("ID_href <=", value, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefLike(String value) {
            addCriterion("ID_href like", value, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefNotLike(String value) {
            addCriterion("ID_href not like", value, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefIn(List<String> values) {
            addCriterion("ID_href in", values, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefNotIn(List<String> values) {
            addCriterion("ID_href not in", values, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefBetween(String value1, String value2) {
            addCriterion("ID_href between", value1, value2, "idHref");
            return (Criteria) this;
        }

        public Criteria andIdHrefNotBetween(String value1, String value2) {
            addCriterion("ID_href not between", value1, value2, "idHref");
            return (Criteria) this;
        }

        public Criteria andSmallIsNull() {
            addCriterion("small is null");
            return (Criteria) this;
        }

        public Criteria andSmallIsNotNull() {
            addCriterion("small is not null");
            return (Criteria) this;
        }

        public Criteria andSmallEqualTo(String value) {
            addCriterion("small =", value, "small");
            return (Criteria) this;
        }

        public Criteria andSmallNotEqualTo(String value) {
            addCriterion("small <>", value, "small");
            return (Criteria) this;
        }

        public Criteria andSmallGreaterThan(String value) {
            addCriterion("small >", value, "small");
            return (Criteria) this;
        }

        public Criteria andSmallGreaterThanOrEqualTo(String value) {
            addCriterion("small >=", value, "small");
            return (Criteria) this;
        }

        public Criteria andSmallLessThan(String value) {
            addCriterion("small <", value, "small");
            return (Criteria) this;
        }

        public Criteria andSmallLessThanOrEqualTo(String value) {
            addCriterion("small <=", value, "small");
            return (Criteria) this;
        }

        public Criteria andSmallLike(String value) {
            addCriterion("small like", value, "small");
            return (Criteria) this;
        }

        public Criteria andSmallNotLike(String value) {
            addCriterion("small not like", value, "small");
            return (Criteria) this;
        }

        public Criteria andSmallIn(List<String> values) {
            addCriterion("small in", values, "small");
            return (Criteria) this;
        }

        public Criteria andSmallNotIn(List<String> values) {
            addCriterion("small not in", values, "small");
            return (Criteria) this;
        }

        public Criteria andSmallBetween(String value1, String value2) {
            addCriterion("small between", value1, value2, "small");
            return (Criteria) this;
        }

        public Criteria andSmallNotBetween(String value1, String value2) {
            addCriterion("small not between", value1, value2, "small");
            return (Criteria) this;
        }

        public Criteria andPhishUrlIsNull() {
            addCriterion("Phish_url is null");
            return (Criteria) this;
        }

        public Criteria andPhishUrlIsNotNull() {
            addCriterion("Phish_url is not null");
            return (Criteria) this;
        }

        public Criteria andPhishUrlEqualTo(String value) {
            addCriterion("Phish_url =", value, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlNotEqualTo(String value) {
            addCriterion("Phish_url <>", value, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlGreaterThan(String value) {
            addCriterion("Phish_url >", value, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlGreaterThanOrEqualTo(String value) {
            addCriterion("Phish_url >=", value, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlLessThan(String value) {
            addCriterion("Phish_url <", value, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlLessThanOrEqualTo(String value) {
            addCriterion("Phish_url <=", value, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlLike(String value) {
            addCriterion("Phish_url like", value, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlNotLike(String value) {
            addCriterion("Phish_url not like", value, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlIn(List<String> values) {
            addCriterion("Phish_url in", values, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlNotIn(List<String> values) {
            addCriterion("Phish_url not in", values, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlBetween(String value1, String value2) {
            addCriterion("Phish_url between", value1, value2, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andPhishUrlNotBetween(String value1, String value2) {
            addCriterion("Phish_url not between", value1, value2, "phishUrl");
            return (Criteria) this;
        }

        public Criteria andSubmittedIsNull() {
            addCriterion("Submitted is null");
            return (Criteria) this;
        }

        public Criteria andSubmittedIsNotNull() {
            addCriterion("Submitted is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittedEqualTo(String value) {
            addCriterion("Submitted =", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotEqualTo(String value) {
            addCriterion("Submitted <>", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedGreaterThan(String value) {
            addCriterion("Submitted >", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedGreaterThanOrEqualTo(String value) {
            addCriterion("Submitted >=", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedLessThan(String value) {
            addCriterion("Submitted <", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedLessThanOrEqualTo(String value) {
            addCriterion("Submitted <=", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedLike(String value) {
            addCriterion("Submitted like", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotLike(String value) {
            addCriterion("Submitted not like", value, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedIn(List<String> values) {
            addCriterion("Submitted in", values, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotIn(List<String> values) {
            addCriterion("Submitted not in", values, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedBetween(String value1, String value2) {
            addCriterion("Submitted between", value1, value2, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedNotBetween(String value1, String value2) {
            addCriterion("Submitted not between", value1, value2, "submitted");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefIsNull() {
            addCriterion("Submitted_href is null");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefIsNotNull() {
            addCriterion("Submitted_href is not null");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefEqualTo(String value) {
            addCriterion("Submitted_href =", value, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefNotEqualTo(String value) {
            addCriterion("Submitted_href <>", value, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefGreaterThan(String value) {
            addCriterion("Submitted_href >", value, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefGreaterThanOrEqualTo(String value) {
            addCriterion("Submitted_href >=", value, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefLessThan(String value) {
            addCriterion("Submitted_href <", value, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefLessThanOrEqualTo(String value) {
            addCriterion("Submitted_href <=", value, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefLike(String value) {
            addCriterion("Submitted_href like", value, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefNotLike(String value) {
            addCriterion("Submitted_href not like", value, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefIn(List<String> values) {
            addCriterion("Submitted_href in", values, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefNotIn(List<String> values) {
            addCriterion("Submitted_href not in", values, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefBetween(String value1, String value2) {
            addCriterion("Submitted_href between", value1, value2, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andSubmittedHrefNotBetween(String value1, String value2) {
            addCriterion("Submitted_href not between", value1, value2, "submittedHref");
            return (Criteria) this;
        }

        public Criteria andValidIsNull() {
            addCriterion("Valid is null");
            return (Criteria) this;
        }

        public Criteria andValidIsNotNull() {
            addCriterion("Valid is not null");
            return (Criteria) this;
        }

        public Criteria andValidEqualTo(String value) {
            addCriterion("Valid =", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotEqualTo(String value) {
            addCriterion("Valid <>", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThan(String value) {
            addCriterion("Valid >", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidGreaterThanOrEqualTo(String value) {
            addCriterion("Valid >=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThan(String value) {
            addCriterion("Valid <", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLessThanOrEqualTo(String value) {
            addCriterion("Valid <=", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidLike(String value) {
            addCriterion("Valid like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotLike(String value) {
            addCriterion("Valid not like", value, "valid");
            return (Criteria) this;
        }

        public Criteria andValidIn(List<String> values) {
            addCriterion("Valid in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotIn(List<String> values) {
            addCriterion("Valid not in", values, "valid");
            return (Criteria) this;
        }

        public Criteria andValidBetween(String value1, String value2) {
            addCriterion("Valid between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andValidNotBetween(String value1, String value2) {
            addCriterion("Valid not between", value1, value2, "valid");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNull() {
            addCriterion("Online is null");
            return (Criteria) this;
        }

        public Criteria andOnlineIsNotNull() {
            addCriterion("Online is not null");
            return (Criteria) this;
        }

        public Criteria andOnlineEqualTo(String value) {
            addCriterion("Online =", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotEqualTo(String value) {
            addCriterion("Online <>", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThan(String value) {
            addCriterion("Online >", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineGreaterThanOrEqualTo(String value) {
            addCriterion("Online >=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThan(String value) {
            addCriterion("Online <", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLessThanOrEqualTo(String value) {
            addCriterion("Online <=", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineLike(String value) {
            addCriterion("Online like", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotLike(String value) {
            addCriterion("Online not like", value, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineIn(List<String> values) {
            addCriterion("Online in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotIn(List<String> values) {
            addCriterion("Online not in", values, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineBetween(String value1, String value2) {
            addCriterion("Online between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andOnlineNotBetween(String value1, String value2) {
            addCriterion("Online not between", value1, value2, "online");
            return (Criteria) this;
        }

        public Criteria andNetworkIsNull() {
            addCriterion("Network is null");
            return (Criteria) this;
        }

        public Criteria andNetworkIsNotNull() {
            addCriterion("Network is not null");
            return (Criteria) this;
        }

        public Criteria andNetworkEqualTo(String value) {
            addCriterion("Network =", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotEqualTo(String value) {
            addCriterion("Network <>", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThan(String value) {
            addCriterion("Network >", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkGreaterThanOrEqualTo(String value) {
            addCriterion("Network >=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThan(String value) {
            addCriterion("Network <", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLessThanOrEqualTo(String value) {
            addCriterion("Network <=", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkLike(String value) {
            addCriterion("Network like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotLike(String value) {
            addCriterion("Network not like", value, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkIn(List<String> values) {
            addCriterion("Network in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotIn(List<String> values) {
            addCriterion("Network not in", values, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkBetween(String value1, String value2) {
            addCriterion("Network between", value1, value2, "network");
            return (Criteria) this;
        }

        public Criteria andNetworkNotBetween(String value1, String value2) {
            addCriterion("Network not between", value1, value2, "network");
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