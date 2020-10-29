package com.yunzimo.Bean;

public class Key {
    private String keyword;
    private String cid;
    private String orderby;

    @Override
    public String toString() {
        return "Key{" +
                "keyword='" + keyword + '\'' +
                ", cid='" + cid + '\'' +
                ", orderby='" + orderby + '\'' +
                '}';
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getOrderby() {
        return orderby;
    }

    public void setOrderby(String orderby) {
        this.orderby = orderby;
    }
}
