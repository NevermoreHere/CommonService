package com.company.common.constant;

import lombok.Data;

public enum DefaultRole {
    NORMAL(1, "普通用户", "[1]"),
    VIP(2, "vip用户","[1,2,3]");
    private long id;
    private String name;
    private String authList;

    DefaultRole(long id, String name, String  authList){
        this.id = id;
        this.name = name;
        this.authList = authList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthList() {
        return authList;
    }

    public void setAuthList(String authList) {
        this.authList = authList;
    }

    public long getId(DefaultRole role){
        return role.getId();
    }
}
