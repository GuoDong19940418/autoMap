package cn.org.cntd.web.entity;

import java.util.Date;

public class CntdAttack {
    private Integer id;

    private String serviceId;

    private String beforeId;

    private String beforeUrl;

    private String title;

    private String author;

    private String cve;

    private String platform;

    private String type;

    private Date addDate;

    private String filePath;

    private String tags;

    private String source;

    private Boolean transferFlag;

    private Boolean deleteFlag;

    private Date createDate;

    private Date modifyDate;

    private String container;

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

    public String getBeforeId() {
        return beforeId;
    }

    public void setBeforeId(String beforeId) {
        this.beforeId = beforeId == null ? null : beforeId.trim();
    }

    public String getBeforeUrl() {
        return beforeUrl;
    }

    public void setBeforeUrl(String beforeUrl) {
        this.beforeUrl = beforeUrl == null ? null : beforeUrl.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getCve() {
        return cve;
    }

    public void setCve(String cve) {
        this.cve = cve == null ? null : cve.trim();
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getAddDate() {
        return addDate;
    }

    public void setAddDate(Date addDate) {
        this.addDate = addDate;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath == null ? null : filePath.trim();
    }

    public String getTags() {
        return tags;
    }

    public void setTags(String tags) {
        this.tags = tags == null ? null : tags.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
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

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container == null ? null : container.trim();
    }
}