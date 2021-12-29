package com.company.common.constant;

public enum DefaultOrg {
    NORMAL(1, "普通用户组", 1),
    VIP(2, "vip用户组",2);
    private long id;
    private String name;
    private long role;

    DefaultOrg(long id, String name, long role){
        this.id = id;
        this.name = name;
        this.role = role;
    }

}
