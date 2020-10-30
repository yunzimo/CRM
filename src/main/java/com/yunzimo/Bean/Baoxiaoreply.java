package com.yunzimo.Bean;


import java.util.Date;

public class Baoxiaoreply {

  private int id;
  private String content;
  private Date replytime;
  private String baoxiaoFk;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  public Date getReplytime() {
    return replytime;
  }

  public void setReplytime(Date replytime) {
    this.replytime = replytime;
  }


  public String getBaoxiaoFk() {
    return baoxiaoFk;
  }

  public void setBaoxiaoFk(String baoxiaoFk) {
    this.baoxiaoFk = baoxiaoFk;
  }

}
