package cn.org.cntd.web.entity;

import java.util.Date;

public class CnvdPatch {
    private String id;

    private String name;

    private String patchLink;

    private String vulnerabilityCode;

    private String annex;

    private String url;

    private String serviceid;

    private Date releaseDate;

    private Boolean transferFlag;

    private Boolean deleteFlag;

    private Date createDate;

    private Date modifyDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPatchLink() {
        return patchLink;
    }

    public void setPatchLink(String patchLink) {
        this.patchLink = patchLink == null ? null : patchLink.trim();
    }

    public String getVulnerabilityCode() {
        return vulnerabilityCode;
    }

    public void setVulnerabilityCode(String vulnerabilityCode) {
        this.vulnerabilityCode = vulnerabilityCode == null ? null : vulnerabilityCode.trim();
    }

    public String getAnnex() {
        return annex;
    }

    public void setAnnex(String annex) {
        this.annex = annex == null ? null : annex.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public String getServiceid() {
        return serviceid;
    }

    public void setServiceid(String serviceid) {
        this.serviceid = serviceid == null ? null : serviceid.trim();
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
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