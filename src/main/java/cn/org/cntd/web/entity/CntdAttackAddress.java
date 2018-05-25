package cn.org.cntd.web.entity;

import java.util.Date;

public class CntdAttackAddress {
    private Integer id;

    private String serviceId;

    private String domain;

    private String type;

    private String source;

    private String times;

    private String ips;

    private String allDomain;

    private String beforeId;

    private Boolean transferFlag;

    private Boolean deleteFlag;

    private Date createDate;

    private Date modifyDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times == null ? null : times.trim();
    }

    public String getIps() {
        return ips;
    }

    public void setIps(String ips) {
        this.ips = ips == null ? null : ips.trim();
    }

    public String getAllDomain() {
        return allDomain;
    }

    public void setAllDomain(String allDomain) {
        this.allDomain = allDomain == null ? null : allDomain.trim();
    }

    public String getBeforeId() {
        return beforeId;
    }

    public void setBeforeId(String beforeId) {
        this.beforeId = beforeId == null ? null : beforeId.trim();
    }

    public Boolean getTransferFlag() {
        return transferFlag;
    }

    public void setTransferFlag(Boolean transferFlag) {
        this.transferFlag = transferFlag;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Date modifyDate) {
        this.modifyDate = modifyDate;
    }
}