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

    public long getRole() {
        return role;
    }

    public void setRole(long role) {
        this.role = role;
    }

    public long getId(DefaultOrg org){
        return org.getId();
    }
}
