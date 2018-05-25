package cn.org.cntd.web.entity;

import java.util.Date;

public class CntdControlAddress {
    private Integer id;

    private String serviceId;

    private Date addDate;

    private String reverseIpUrl;

    private String reverseDomainUrl;

    private String reverseDomainType;

    private String reverseDomain;

    private String fileMd5;

    private String fileSha;

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

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getReverseIpUrl() {
        return reverseIpUrl;
    }

    public void setReverseIpUrl(String reverseIpUrl) {
        this.reverseIpUrl = reverseIpUrl == null ? null : reverseIpUrl.trim();
    }

    public String getReverseDomainUrl() {
        return reverseDomainUrl;
    }

    public void setReverseDomainUrl(String reverseDomainUrl) {
        this.reverseDomainUrl = reverseDomainUrl == null ? null : reverseDomainUrl.trim();
    }

    public String getReverseDomainType() {
        return reverseDomainType;
    }

    public void setReverseDomainType(String reverseDomainType) {
        this.reverseDomainType = reverseDomainType == null ? null : reverseDomainType.trim();
    }

    public String getReverseDomain() {
        return reverseDomain;
    }

    public void setReverseDomain(String reverseDomain) {
        this.reverseDomain = reverseDomain == null ? null : reverseDomain.trim();
    }

    public String getFileMd5() {
        return fileMd5;
    }

    public void setFileMd5(String fileMd5) {
        this.fileMd5 = fileMd5 == null ? null : fileMd5.trim();
    }

    public String getFileSha() {
        return fileSha;
    }

    public void setFileSha(String fileSha) {
        this.fileSha = fileSha == null ? null : fileSha.trim();
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