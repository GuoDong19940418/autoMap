package cn.org.cntd.web.entity;

import java.util.Date;

public class TorNodes extends TorNodesKey {
    private String routerName;

    private Integer bandwidth;

    private Integer uptime;

    private String hostname;

    private String dirPort;

    private Integer badExit;

    private Date firstSeen;

    private String asName;

    private String id;

    private Integer asNumber;

    private Integer consensusBandwidth;

    private String orAddress;

    private String countryCode;

    private Integer authorityFlag;

    private Integer exitFlag;

    private Integer fastFlag;

    private Integer guardFlag;

    private Integer nameFlag;

    private Integer stableFlag;

    private Integer runningFlag;

    private Integer validFlag;

    private Integer v2dirFlag;

    private String platform;

    private Integer hibernatingFlag;

    private Integer badExitFlag;

    private Date time;

    private String whoisInfo;

    private String email;

    public String getRouterName() {
        return routerName;
    }

    public void setRouterName(String routerName) {
        this.routerName = routerName == null ? null : routerName.trim();
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public Integer getUptime() {
        return uptime;
    }

    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname == null ? null : hostname.trim();
    }

    public String getDirPort() {
        return dirPort;
    }

    public void setDirPort(String dirPort) {
        this.dirPort = dirPort == null ? null : dirPort.trim();
    }

    public Integer getBadExit() {
        return badExit;
    }

    public void setBadExit(Integer badExit) {
        this.badExit = badExit;
    }

    public Date getFirstSeen() {
        return firstSeen;
    }

    public void setFirstSeen(Date firstSeen) {
        this.firstSeen = firstSeen;
    }

    public String getAsName() {
        return asName;
    }

    public void setAsName(String asName) {
        this.asName = asName == null ? null : asName.trim();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Integer getAsNumber() {
        return asNumber;
    }

    public void setAsNumber(Integer asNumber) {
        this.asNumber = asNumber;
    }

    public Integer getConsensusBandwidth() {
        return consensusBandwidth;
    }

    public void setConsensusBandwidth(Integer consensusBandwidth) {
        this.consensusBandwidth = consensusBandwidth;
    }

    public String getOrAddress() {
        return orAddress;
    }

    public void setOrAddress(String orAddress) {
        this.orAddress = orAddress == null ? null : orAddress.trim();
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode == null ? null : countryCode.trim();
    }

    public Integer getAuthorityFlag() {
        return authorityFlag;
    }

    public void setAuthorityFlag(Integer authorityFlag) {
        this.authorityFlag = authorityFlag;
    }

    public Integer getExitFlag() {
        return exitFlag;
    }

    public void setExitFlag(Integer exitFlag) {
        this.exitFlag = exitFlag;
    }

    public Integer getFastFlag() {
        return fastFlag;
    }

    public void setFastFlag(Integer fastFlag) {
        this.fastFlag = fastFlag;
    }

    public Integer getGuardFlag() {
        return guardFlag;
    }

    public void setGuardFlag(Integer guardFlag) {
        this.guardFlag = guardFlag;
    }

    public Integer getNameFlag() {
        return nameFlag;
    }

    public void setNameFlag(Integer nameFlag) {
        this.nameFlag = nameFlag;
    }

    public Integer getStableFlag() {
        return stableFlag;
    }

    public void setStableFlag(Integer stableFlag) {
        this.stableFlag = stableFlag;
    }

    public Integer getRunningFlag() {
        return runningFlag;
    }

    public void setRunningFlag(Integer runningFlag) {
        this.runningFlag = runningFlag;
    }

    public Integer getValidFlag() {
        return validFlag;
    }

    public void setValidFlag(Integer validFlag) {
        this.validFlag = validFlag;
    }

    public Integer getV2dirFlag() {
        return v2dirFlag;
    }

    public void setV2dirFlag(Integer v2dirFlag) {
        this.v2dirFlag = v2dirFlag;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform == null ? null : platform.trim();
    }

    public Integer getHibernatingFlag() {
        return hibernatingFlag;
    }

    public void setHibernatingFlag(Integer hibernatingFlag) {
        this.hibernatingFlag = hibernatingFlag;
    }

    public Integer getBadExitFlag() {
        return badExitFlag;
    }

    public void setBadExitFlag(Integer badExitFlag) {
        this.badExitFlag = badExitFlag;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getWhoisInfo() {
        return whoisInfo;
    }

    public void setWhoisInfo(String whoisInfo) {
        this.whoisInfo = whoisInfo == null ? null : whoisInfo.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
}