package cn.org.cntd.web.entity;

public class TorNodesKey {
    private String ip;

    private String orPort;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getOrPort() {
        return orPort;
    }

    public void setOrPort(String orPort) {
        this.orPort = orPort == null ? null : orPort.trim();
    }
}