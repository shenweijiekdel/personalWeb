package com.fswj.personalweb.entity;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_NULL)
public class TravelLog {
    private Integer id;
    private String province;
    private String remark;
    private Date time;
    private Boolean isGone;

    @Override
    public String toString() {
        return "TravelLog{" +
                "id=" + id +
                ", province='" + province + '\'' +
                ", remark='" + remark + '\'' +
                ", time=" + time +
                ", isGone=" + isGone +
                '}';
    }

    public Boolean getGone() {
        return isGone;
    }

    public void setGone(Boolean gone) {
        isGone = gone;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
