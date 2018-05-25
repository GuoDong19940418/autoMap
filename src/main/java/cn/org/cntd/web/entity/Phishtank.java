package cn.org.cntd.web.entity;

import java.util.Date;

public class Phishtank {
    private String id;

    private String serviceId;

    private String idHref;

    private String small;

    private String phishUrl;

    private String submitted;

    private String submittedHref;

    private String valid;

    private String online;

    private String network;

    private Boolean transferFlag;

    private Boolean deleteFlag;

    private Date createDate;

    private Date modifyDate;

    private String whois;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getIdHref() {
        return idHref;
    }

    public void setIdHref(String idHref) {
        this.idHref = idHref == null ? null : idHref.trim();
    }

    public String getSmall() {
        return small;
    }

    public void setSmall(String small) {
        this.small = small == null ? null : small.trim();
    }

    public String getPhishUrl() {
        return phishUrl;
    }

    public void setPhishUrl(String phishUrl) {
        this.phishUrl = phishUrl == null ? null : phishUrl.trim();
    }

    public String getSubmitted() {
        return submitted;
    }

    public void setSubmitted(String submitted) {
        this.submitted = submitted == null ? null : submitted.trim();
    }

    public String getSubmittedHref() {
        return submittedHref;
    }

    public void setSubmittedHref(String submittedHref) {
        this.submittedHref = submittedHref == null ? null : submittedHref.trim();
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }

    public String getOnline() {
        return online;
    }

    public void setOnline(String online) {
        this.online = online == null ? null : online.trim();
    }

    public String getNetwork() {
        return network;
    }

    public void setNetwork(String network) {
        this.network = network == null ? null : network.trim();
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

    public String getWhois() {
        return whois;
    }

    public void setWhois(String whois) {
        this.whois = whois == null ? null : whois.trim();
    }
}