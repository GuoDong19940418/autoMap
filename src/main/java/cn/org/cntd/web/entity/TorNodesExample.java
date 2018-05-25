package cn.org.cntd.web.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TorNodesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TorNodesExample() {
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andOrPortIsNull() {
            addCriterion("or_port is null");
            return (Criteria) this;
        }

        public Criteria andOrPortIsNotNull() {
            addCriterion("or_port is not null");
            return (Criteria) this;
        }

        public Criteria andOrPortEqualTo(String value) {
            addCriterion("or_port =", value, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortNotEqualTo(String value) {
            addCriterion("or_port <>", value, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortGreaterThan(String value) {
            addCriterion("or_port >", value, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortGreaterThanOrEqualTo(String value) {
            addCriterion("or_port >=", value, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortLessThan(String value) {
            addCriterion("or_port <", value, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortLessThanOrEqualTo(String value) {
            addCriterion("or_port <=", value, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortLike(String value) {
            addCriterion("or_port like", value, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortNotLike(String value) {
            addCriterion("or_port not like", value, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortIn(List<String> values) {
            addCriterion("or_port in", values, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortNotIn(List<String> values) {
            addCriterion("or_port not in", values, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortBetween(String value1, String value2) {
            addCriterion("or_port between", value1, value2, "orPort");
            return (Criteria) this;
        }

        public Criteria andOrPortNotBetween(String value1, String value2) {
            addCriterion("or_port not between", value1, value2, "orPort");
            return (Criteria) this;
        }

        public Criteria andRouterNameIsNull() {
            addCriterion("router_name is null");
            return (Criteria) this;
        }

        public Criteria andRouterNameIsNotNull() {
            addCriterion("router_name is not null");
            return (Criteria) this;
        }

        public Criteria andRouterNameEqualTo(String value) {
            addCriterion("router_name =", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameNotEqualTo(String value) {
            addCriterion("router_name <>", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameGreaterThan(String value) {
            addCriterion("router_name >", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameGreaterThanOrEqualTo(String value) {
            addCriterion("router_name >=", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameLessThan(String value) {
            addCriterion("router_name <", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameLessThanOrEqualTo(String value) {
            addCriterion("router_name <=", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameLike(String value) {
            addCriterion("router_name like", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameNotLike(String value) {
            addCriterion("router_name not like", value, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameIn(List<String> values) {
            addCriterion("router_name in", values, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameNotIn(List<String> values) {
            addCriterion("router_name not in", values, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameBetween(String value1, String value2) {
            addCriterion("router_name between", value1, value2, "routerName");
            return (Criteria) this;
        }

        public Criteria andRouterNameNotBetween(String value1, String value2) {
            addCriterion("router_name not between", value1, value2, "routerName");
            return (Criteria) this;
        }

        public Criteria andBandwidthIsNull() {
            addCriterion("bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andBandwidthIsNotNull() {
            addCriterion("bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andBandwidthEqualTo(Integer value) {
            addCriterion("bandwidth =", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotEqualTo(Integer value) {
            addCriterion("bandwidth <>", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthGreaterThan(Integer value) {
            addCriterion("bandwidth >", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("bandwidth >=", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthLessThan(Integer value) {
            addCriterion("bandwidth <", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthLessThanOrEqualTo(Integer value) {
            addCriterion("bandwidth <=", value, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthIn(List<Integer> values) {
            addCriterion("bandwidth in", values, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotIn(List<Integer> values) {
            addCriterion("bandwidth not in", values, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthBetween(Integer value1, Integer value2) {
            addCriterion("bandwidth between", value1, value2, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andBandwidthNotBetween(Integer value1, Integer value2) {
            addCriterion("bandwidth not between", value1, value2, "bandwidth");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Integer value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Integer value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Integer value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Integer value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Integer value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Integer> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Integer> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Integer value1, Integer value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Integer value1, Integer value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNull() {
            addCriterion("hostname is null");
            return (Criteria) this;
        }

        public Criteria andHostnameIsNotNull() {
            addCriterion("hostname is not null");
            return (Criteria) this;
        }

        public Criteria andHostnameEqualTo(String value) {
            addCriterion("hostname =", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotEqualTo(String value) {
            addCriterion("hostname <>", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThan(String value) {
            addCriterion("hostname >", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameGreaterThanOrEqualTo(String value) {
            addCriterion("hostname >=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThan(String value) {
            addCriterion("hostname <", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLessThanOrEqualTo(String value) {
            addCriterion("hostname <=", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameLike(String value) {
            addCriterion("hostname like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotLike(String value) {
            addCriterion("hostname not like", value, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameIn(List<String> values) {
            addCriterion("hostname in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotIn(List<String> values) {
            addCriterion("hostname not in", values, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameBetween(String value1, String value2) {
            addCriterion("hostname between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andHostnameNotBetween(String value1, String value2) {
            addCriterion("hostname not between", value1, value2, "hostname");
            return (Criteria) this;
        }

        public Criteria andDirPortIsNull() {
            addCriterion("dir_port is null");
            return (Criteria) this;
        }

        public Criteria andDirPortIsNotNull() {
            addCriterion("dir_port is not null");
            return (Criteria) this;
        }

        public Criteria andDirPortEqualTo(String value) {
            addCriterion("dir_port =", value, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortNotEqualTo(String value) {
            addCriterion("dir_port <>", value, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortGreaterThan(String value) {
            addCriterion("dir_port >", value, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortGreaterThanOrEqualTo(String value) {
            addCriterion("dir_port >=", value, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortLessThan(String value) {
            addCriterion("dir_port <", value, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortLessThanOrEqualTo(String value) {
            addCriterion("dir_port <=", value, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortLike(String value) {
            addCriterion("dir_port like", value, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortNotLike(String value) {
            addCriterion("dir_port not like", value, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortIn(List<String> values) {
            addCriterion("dir_port in", values, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortNotIn(List<String> values) {
            addCriterion("dir_port not in", values, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortBetween(String value1, String value2) {
            addCriterion("dir_port between", value1, value2, "dirPort");
            return (Criteria) this;
        }

        public Criteria andDirPortNotBetween(String value1, String value2) {
            addCriterion("dir_port not between", value1, value2, "dirPort");
            return (Criteria) this;
        }

        public Criteria andBadExitIsNull() {
            addCriterion("bad_exit is null");
            return (Criteria) this;
        }

        public Criteria andBadExitIsNotNull() {
            addCriterion("bad_exit is not null");
            return (Criteria) this;
        }

        public Criteria andBadExitEqualTo(Integer value) {
            addCriterion("bad_exit =", value, "badExit");
            return (Criteria) this;
        }

        public Criteria andBadExitNotEqualTo(Integer value) {
            addCriterion("bad_exit <>", value, "badExit");
            return (Criteria) this;
        }

        public Criteria andBadExitGreaterThan(Integer value) {
            addCriterion("bad_exit >", value, "badExit");
            return (Criteria) this;
        }

        public Criteria andBadExitGreaterThanOrEqualTo(Integer value) {
            addCriterion("bad_exit >=", value, "badExit");
            return (Criteria) this;
        }

        public Criteria andBadExitLessThan(Integer value) {
            addCriterion("bad_exit <", value, "badExit");
            return (Criteria) this;
        }

        public Criteria andBadExitLessThanOrEqualTo(Integer value) {
            addCriterion("bad_exit <=", value, "badExit");
            return (Criteria) this;
        }

        public Criteria andBadExitIn(List<Integer> values) {
            addCriterion("bad_exit in", values, "badExit");
            return (Criteria) this;
        }

        public Criteria andBadExitNotIn(List<Integer> values) {
            addCriterion("bad_exit not in", values, "badExit");
            return (Criteria) this;
        }

        public Criteria andBadExitBetween(Integer value1, Integer value2) {
            addCriterion("bad_exit between", value1, value2, "badExit");
            return (Criteria) this;
        }

        public Criteria andBadExitNotBetween(Integer value1, Integer value2) {
            addCriterion("bad_exit not between", value1, value2, "badExit");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNull() {
            addCriterion("first_seen is null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIsNotNull() {
            addCriterion("first_seen is not null");
            return (Criteria) this;
        }

        public Criteria andFirstSeenEqualTo(Date value) {
            addCriterion("first_seen =", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotEqualTo(Date value) {
            addCriterion("first_seen <>", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThan(Date value) {
            addCriterion("first_seen >", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenGreaterThanOrEqualTo(Date value) {
            addCriterion("first_seen >=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThan(Date value) {
            addCriterion("first_seen <", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenLessThanOrEqualTo(Date value) {
            addCriterion("first_seen <=", value, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenIn(List<Date> values) {
            addCriterion("first_seen in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotIn(List<Date> values) {
            addCriterion("first_seen not in", values, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenBetween(Date value1, Date value2) {
            addCriterion("first_seen between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andFirstSeenNotBetween(Date value1, Date value2) {
            addCriterion("first_seen not between", value1, value2, "firstSeen");
            return (Criteria) this;
        }

        public Criteria andAsNameIsNull() {
            addCriterion("as_name is null");
            return (Criteria) this;
        }

        public Criteria andAsNameIsNotNull() {
            addCriterion("as_name is not null");
            return (Criteria) this;
        }

        public Criteria andAsNameEqualTo(String value) {
            addCriterion("as_name =", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameNotEqualTo(String value) {
            addCriterion("as_name <>", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameGreaterThan(String value) {
            addCriterion("as_name >", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameGreaterThanOrEqualTo(String value) {
            addCriterion("as_name >=", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameLessThan(String value) {
            addCriterion("as_name <", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameLessThanOrEqualTo(String value) {
            addCriterion("as_name <=", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameLike(String value) {
            addCriterion("as_name like", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameNotLike(String value) {
            addCriterion("as_name not like", value, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameIn(List<String> values) {
            addCriterion("as_name in", values, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameNotIn(List<String> values) {
            addCriterion("as_name not in", values, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameBetween(String value1, String value2) {
            addCriterion("as_name between", value1, value2, "asName");
            return (Criteria) this;
        }

        public Criteria andAsNameNotBetween(String value1, String value2) {
            addCriterion("as_name not between", value1, value2, "asName");
            return (Criteria) this;
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

        public Criteria andAsNumberIsNull() {
            addCriterion("as_number is null");
            return (Criteria) this;
        }

        public Criteria andAsNumberIsNotNull() {
            addCriterion("as_number is not null");
            return (Criteria) this;
        }

        public Criteria andAsNumberEqualTo(Integer value) {
            addCriterion("as_number =", value, "asNumber");
            return (Criteria) this;
        }

        public Criteria andAsNumberNotEqualTo(Integer value) {
            addCriterion("as_number <>", value, "asNumber");
            return (Criteria) this;
        }

        public Criteria andAsNumberGreaterThan(Integer value) {
            addCriterion("as_number >", value, "asNumber");
            return (Criteria) this;
        }

        public Criteria andAsNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("as_number >=", value, "asNumber");
            return (Criteria) this;
        }

        public Criteria andAsNumberLessThan(Integer value) {
            addCriterion("as_number <", value, "asNumber");
            return (Criteria) this;
        }

        public Criteria andAsNumberLessThanOrEqualTo(Integer value) {
            addCriterion("as_number <=", value, "asNumber");
            return (Criteria) this;
        }

        public Criteria andAsNumberIn(List<Integer> values) {
            addCriterion("as_number in", values, "asNumber");
            return (Criteria) this;
        }

        public Criteria andAsNumberNotIn(List<Integer> values) {
            addCriterion("as_number not in", values, "asNumber");
            return (Criteria) this;
        }

        public Criteria andAsNumberBetween(Integer value1, Integer value2) {
            addCriterion("as_number between", value1, value2, "asNumber");
            return (Criteria) this;
        }

        public Criteria andAsNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("as_number not between", value1, value2, "asNumber");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthIsNull() {
            addCriterion("consensus_bandwidth is null");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthIsNotNull() {
            addCriterion("consensus_bandwidth is not null");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthEqualTo(Integer value) {
            addCriterion("consensus_bandwidth =", value, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthNotEqualTo(Integer value) {
            addCriterion("consensus_bandwidth <>", value, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthGreaterThan(Integer value) {
            addCriterion("consensus_bandwidth >", value, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthGreaterThanOrEqualTo(Integer value) {
            addCriterion("consensus_bandwidth >=", value, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthLessThan(Integer value) {
            addCriterion("consensus_bandwidth <", value, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthLessThanOrEqualTo(Integer value) {
            addCriterion("consensus_bandwidth <=", value, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthIn(List<Integer> values) {
            addCriterion("consensus_bandwidth in", values, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthNotIn(List<Integer> values) {
            addCriterion("consensus_bandwidth not in", values, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthBetween(Integer value1, Integer value2) {
            addCriterion("consensus_bandwidth between", value1, value2, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andConsensusBandwidthNotBetween(Integer value1, Integer value2) {
            addCriterion("consensus_bandwidth not between", value1, value2, "consensusBandwidth");
            return (Criteria) this;
        }

        public Criteria andOrAddressIsNull() {
            addCriterion("or_address is null");
            return (Criteria) this;
        }

        public Criteria andOrAddressIsNotNull() {
            addCriterion("or_address is not null");
            return (Criteria) this;
        }

        public Criteria andOrAddressEqualTo(String value) {
            addCriterion("or_address =", value, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressNotEqualTo(String value) {
            addCriterion("or_address <>", value, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressGreaterThan(String value) {
            addCriterion("or_address >", value, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressGreaterThanOrEqualTo(String value) {
            addCriterion("or_address >=", value, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressLessThan(String value) {
            addCriterion("or_address <", value, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressLessThanOrEqualTo(String value) {
            addCriterion("or_address <=", value, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressLike(String value) {
            addCriterion("or_address like", value, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressNotLike(String value) {
            addCriterion("or_address not like", value, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressIn(List<String> values) {
            addCriterion("or_address in", values, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressNotIn(List<String> values) {
            addCriterion("or_address not in", values, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressBetween(String value1, String value2) {
            addCriterion("or_address between", value1, value2, "orAddress");
            return (Criteria) this;
        }

        public Criteria andOrAddressNotBetween(String value1, String value2) {
            addCriterion("or_address not between", value1, value2, "orAddress");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNull() {
            addCriterion("country_code is null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIsNotNull() {
            addCriterion("country_code is not null");
            return (Criteria) this;
        }

        public Criteria andCountryCodeEqualTo(String value) {
            addCriterion("country_code =", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotEqualTo(String value) {
            addCriterion("country_code <>", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThan(String value) {
            addCriterion("country_code >", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeGreaterThanOrEqualTo(String value) {
            addCriterion("country_code >=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThan(String value) {
            addCriterion("country_code <", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLessThanOrEqualTo(String value) {
            addCriterion("country_code <=", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeLike(String value) {
            addCriterion("country_code like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotLike(String value) {
            addCriterion("country_code not like", value, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeIn(List<String> values) {
            addCriterion("country_code in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotIn(List<String> values) {
            addCriterion("country_code not in", values, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeBetween(String value1, String value2) {
            addCriterion("country_code between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andCountryCodeNotBetween(String value1, String value2) {
            addCriterion("country_code not between", value1, value2, "countryCode");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagIsNull() {
            addCriterion("authority_flag is null");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagIsNotNull() {
            addCriterion("authority_flag is not null");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagEqualTo(Integer value) {
            addCriterion("authority_flag =", value, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagNotEqualTo(Integer value) {
            addCriterion("authority_flag <>", value, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagGreaterThan(Integer value) {
            addCriterion("authority_flag >", value, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("authority_flag >=", value, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagLessThan(Integer value) {
            addCriterion("authority_flag <", value, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagLessThanOrEqualTo(Integer value) {
            addCriterion("authority_flag <=", value, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagIn(List<Integer> values) {
            addCriterion("authority_flag in", values, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagNotIn(List<Integer> values) {
            addCriterion("authority_flag not in", values, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagBetween(Integer value1, Integer value2) {
            addCriterion("authority_flag between", value1, value2, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andAuthorityFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("authority_flag not between", value1, value2, "authorityFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagIsNull() {
            addCriterion("exit_flag is null");
            return (Criteria) this;
        }

        public Criteria andExitFlagIsNotNull() {
            addCriterion("exit_flag is not null");
            return (Criteria) this;
        }

        public Criteria andExitFlagEqualTo(Integer value) {
            addCriterion("exit_flag =", value, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagNotEqualTo(Integer value) {
            addCriterion("exit_flag <>", value, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagGreaterThan(Integer value) {
            addCriterion("exit_flag >", value, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("exit_flag >=", value, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagLessThan(Integer value) {
            addCriterion("exit_flag <", value, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagLessThanOrEqualTo(Integer value) {
            addCriterion("exit_flag <=", value, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagIn(List<Integer> values) {
            addCriterion("exit_flag in", values, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagNotIn(List<Integer> values) {
            addCriterion("exit_flag not in", values, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagBetween(Integer value1, Integer value2) {
            addCriterion("exit_flag between", value1, value2, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andExitFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("exit_flag not between", value1, value2, "exitFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagIsNull() {
            addCriterion("fast_flag is null");
            return (Criteria) this;
        }

        public Criteria andFastFlagIsNotNull() {
            addCriterion("fast_flag is not null");
            return (Criteria) this;
        }

        public Criteria andFastFlagEqualTo(Integer value) {
            addCriterion("fast_flag =", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagNotEqualTo(Integer value) {
            addCriterion("fast_flag <>", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagGreaterThan(Integer value) {
            addCriterion("fast_flag >", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("fast_flag >=", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagLessThan(Integer value) {
            addCriterion("fast_flag <", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagLessThanOrEqualTo(Integer value) {
            addCriterion("fast_flag <=", value, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagIn(List<Integer> values) {
            addCriterion("fast_flag in", values, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagNotIn(List<Integer> values) {
            addCriterion("fast_flag not in", values, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagBetween(Integer value1, Integer value2) {
            addCriterion("fast_flag between", value1, value2, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andFastFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("fast_flag not between", value1, value2, "fastFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagIsNull() {
            addCriterion("guard_flag is null");
            return (Criteria) this;
        }

        public Criteria andGuardFlagIsNotNull() {
            addCriterion("guard_flag is not null");
            return (Criteria) this;
        }

        public Criteria andGuardFlagEqualTo(Integer value) {
            addCriterion("guard_flag =", value, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagNotEqualTo(Integer value) {
            addCriterion("guard_flag <>", value, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagGreaterThan(Integer value) {
            addCriterion("guard_flag >", value, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("guard_flag >=", value, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagLessThan(Integer value) {
            addCriterion("guard_flag <", value, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagLessThanOrEqualTo(Integer value) {
            addCriterion("guard_flag <=", value, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagIn(List<Integer> values) {
            addCriterion("guard_flag in", values, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagNotIn(List<Integer> values) {
            addCriterion("guard_flag not in", values, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagBetween(Integer value1, Integer value2) {
            addCriterion("guard_flag between", value1, value2, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andGuardFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("guard_flag not between", value1, value2, "guardFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagIsNull() {
            addCriterion("name_flag is null");
            return (Criteria) this;
        }

        public Criteria andNameFlagIsNotNull() {
            addCriterion("name_flag is not null");
            return (Criteria) this;
        }

        public Criteria andNameFlagEqualTo(Integer value) {
            addCriterion("name_flag =", value, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagNotEqualTo(Integer value) {
            addCriterion("name_flag <>", value, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagGreaterThan(Integer value) {
            addCriterion("name_flag >", value, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("name_flag >=", value, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagLessThan(Integer value) {
            addCriterion("name_flag <", value, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagLessThanOrEqualTo(Integer value) {
            addCriterion("name_flag <=", value, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagIn(List<Integer> values) {
            addCriterion("name_flag in", values, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagNotIn(List<Integer> values) {
            addCriterion("name_flag not in", values, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagBetween(Integer value1, Integer value2) {
            addCriterion("name_flag between", value1, value2, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andNameFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("name_flag not between", value1, value2, "nameFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagIsNull() {
            addCriterion("stable_flag is null");
            return (Criteria) this;
        }

        public Criteria andStableFlagIsNotNull() {
            addCriterion("stable_flag is not null");
            return (Criteria) this;
        }

        public Criteria andStableFlagEqualTo(Integer value) {
            addCriterion("stable_flag =", value, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagNotEqualTo(Integer value) {
            addCriterion("stable_flag <>", value, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagGreaterThan(Integer value) {
            addCriterion("stable_flag >", value, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("stable_flag >=", value, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagLessThan(Integer value) {
            addCriterion("stable_flag <", value, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagLessThanOrEqualTo(Integer value) {
            addCriterion("stable_flag <=", value, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagIn(List<Integer> values) {
            addCriterion("stable_flag in", values, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagNotIn(List<Integer> values) {
            addCriterion("stable_flag not in", values, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagBetween(Integer value1, Integer value2) {
            addCriterion("stable_flag between", value1, value2, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andStableFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("stable_flag not between", value1, value2, "stableFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagIsNull() {
            addCriterion("running_flag is null");
            return (Criteria) this;
        }

        public Criteria andRunningFlagIsNotNull() {
            addCriterion("running_flag is not null");
            return (Criteria) this;
        }

        public Criteria andRunningFlagEqualTo(Integer value) {
            addCriterion("running_flag =", value, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagNotEqualTo(Integer value) {
            addCriterion("running_flag <>", value, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagGreaterThan(Integer value) {
            addCriterion("running_flag >", value, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("running_flag >=", value, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagLessThan(Integer value) {
            addCriterion("running_flag <", value, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagLessThanOrEqualTo(Integer value) {
            addCriterion("running_flag <=", value, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagIn(List<Integer> values) {
            addCriterion("running_flag in", values, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagNotIn(List<Integer> values) {
            addCriterion("running_flag not in", values, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagBetween(Integer value1, Integer value2) {
            addCriterion("running_flag between", value1, value2, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andRunningFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("running_flag not between", value1, value2, "runningFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNull() {
            addCriterion("valid_flag is null");
            return (Criteria) this;
        }

        public Criteria andValidFlagIsNotNull() {
            addCriterion("valid_flag is not null");
            return (Criteria) this;
        }

        public Criteria andValidFlagEqualTo(Integer value) {
            addCriterion("valid_flag =", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotEqualTo(Integer value) {
            addCriterion("valid_flag <>", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThan(Integer value) {
            addCriterion("valid_flag >", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("valid_flag >=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThan(Integer value) {
            addCriterion("valid_flag <", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagLessThanOrEqualTo(Integer value) {
            addCriterion("valid_flag <=", value, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagIn(List<Integer> values) {
            addCriterion("valid_flag in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotIn(List<Integer> values) {
            addCriterion("valid_flag not in", values, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagBetween(Integer value1, Integer value2) {
            addCriterion("valid_flag between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andValidFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("valid_flag not between", value1, value2, "validFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagIsNull() {
            addCriterion("v2dir_flag is null");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagIsNotNull() {
            addCriterion("v2dir_flag is not null");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagEqualTo(Integer value) {
            addCriterion("v2dir_flag =", value, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagNotEqualTo(Integer value) {
            addCriterion("v2dir_flag <>", value, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagGreaterThan(Integer value) {
            addCriterion("v2dir_flag >", value, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("v2dir_flag >=", value, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagLessThan(Integer value) {
            addCriterion("v2dir_flag <", value, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagLessThanOrEqualTo(Integer value) {
            addCriterion("v2dir_flag <=", value, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagIn(List<Integer> values) {
            addCriterion("v2dir_flag in", values, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagNotIn(List<Integer> values) {
            addCriterion("v2dir_flag not in", values, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagBetween(Integer value1, Integer value2) {
            addCriterion("v2dir_flag between", value1, value2, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andV2dirFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("v2dir_flag not between", value1, value2, "v2dirFlag");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagIsNull() {
            addCriterion("hibernating_flag is null");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagIsNotNull() {
            addCriterion("hibernating_flag is not null");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagEqualTo(Integer value) {
            addCriterion("hibernating_flag =", value, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagNotEqualTo(Integer value) {
            addCriterion("hibernating_flag <>", value, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagGreaterThan(Integer value) {
            addCriterion("hibernating_flag >", value, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("hibernating_flag >=", value, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagLessThan(Integer value) {
            addCriterion("hibernating_flag <", value, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagLessThanOrEqualTo(Integer value) {
            addCriterion("hibernating_flag <=", value, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagIn(List<Integer> values) {
            addCriterion("hibernating_flag in", values, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagNotIn(List<Integer> values) {
            addCriterion("hibernating_flag not in", values, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagBetween(Integer value1, Integer value2) {
            addCriterion("hibernating_flag between", value1, value2, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andHibernatingFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("hibernating_flag not between", value1, value2, "hibernatingFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagIsNull() {
            addCriterion("bad_exit_flag is null");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagIsNotNull() {
            addCriterion("bad_exit_flag is not null");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagEqualTo(Integer value) {
            addCriterion("bad_exit_flag =", value, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagNotEqualTo(Integer value) {
            addCriterion("bad_exit_flag <>", value, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagGreaterThan(Integer value) {
            addCriterion("bad_exit_flag >", value, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("bad_exit_flag >=", value, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagLessThan(Integer value) {
            addCriterion("bad_exit_flag <", value, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagLessThanOrEqualTo(Integer value) {
            addCriterion("bad_exit_flag <=", value, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagIn(List<Integer> values) {
            addCriterion("bad_exit_flag in", values, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagNotIn(List<Integer> values) {
            addCriterion("bad_exit_flag not in", values, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagBetween(Integer value1, Integer value2) {
            addCriterion("bad_exit_flag between", value1, value2, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andBadExitFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("bad_exit_flag not between", value1, value2, "badExitFlag");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoIsNull() {
            addCriterion("whois_info is null");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoIsNotNull() {
            addCriterion("whois_info is not null");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoEqualTo(String value) {
            addCriterion("whois_info =", value, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoNotEqualTo(String value) {
            addCriterion("whois_info <>", value, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoGreaterThan(String value) {
            addCriterion("whois_info >", value, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoGreaterThanOrEqualTo(String value) {
            addCriterion("whois_info >=", value, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoLessThan(String value) {
            addCriterion("whois_info <", value, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoLessThanOrEqualTo(String value) {
            addCriterion("whois_info <=", value, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoLike(String value) {
            addCriterion("whois_info like", value, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoNotLike(String value) {
            addCriterion("whois_info not like", value, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoIn(List<String> values) {
            addCriterion("whois_info in", values, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoNotIn(List<String> values) {
            addCriterion("whois_info not in", values, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoBetween(String value1, String value2) {
            addCriterion("whois_info between", value1, value2, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andWhoisInfoNotBetween(String value1, String value2) {
            addCriterion("whois_info not between", value1, value2, "whoisInfo");
            return (Criteria) this;
        }

        public Criteria andEmailIsNull() {
            addCriterion("email is null");
            return (Criteria) this;
        }

        public Criteria andEmailIsNotNull() {
            addCriterion("email is not null");
            return (Criteria) this;
        }

        public Criteria andEmailEqualTo(String value) {
            addCriterion("email =", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotEqualTo(String value) {
            addCriterion("email <>", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThan(String value) {
            addCriterion("email >", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailGreaterThanOrEqualTo(String value) {
            addCriterion("email >=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThan(String value) {
            addCriterion("email <", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLessThanOrEqualTo(String value) {
            addCriterion("email <=", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailLike(String value) {
            addCriterion("email like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotLike(String value) {
            addCriterion("email not like", value, "email");
            return (Criteria) this;
        }

        public Criteria andEmailIn(List<String> values) {
            addCriterion("email in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotIn(List<String> values) {
            addCriterion("email not in", values, "email");
            return (Criteria) this;
        }

        public Criteria andEmailBetween(String value1, String value2) {
            addCriterion("email between", value1, value2, "email");
            return (Criteria) this;
        }

        public Criteria andEmailNotBetween(String value1, String value2) {
            addCriterion("email not between", value1, value2, "email");
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