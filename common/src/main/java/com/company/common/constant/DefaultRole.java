package com.company.common.constant;

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
}
