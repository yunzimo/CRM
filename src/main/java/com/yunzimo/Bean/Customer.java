package com.yunzimo.Bean;


import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Customer {

  private int id;
  private String comname;
  private String companyperson;
  private String comaddress;
  private String comphone;
  private String camera;
  private String present;
  private String remark;
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date addtime;


  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getComname() {
    return comname;
  }

  public void setComname(String comname) {
    this.comname = comname;
  }


  public String getCompanyperson() {
    return companyperson;
  }

  public void setCompanyperson(String companyperson) {
    this.companyperson = companyperson;
  }


  public String getComaddress() {
    return comaddress;
  }

  public void setComaddress(String comaddress) {
    this.comaddress = comaddress;
  }


  public String getComphone() {
    return comphone;
  }

  public void setComphone(String comphone) {
    this.comphone = comphone;
  }


  public String getCamera() {
    return camera;
  }

  public void setCamera(String camera) {
    this.camera = camera;
  }


  public String getPresent() {
    return present;
  }

  public void setPresent(String present) {
    this.present = present;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public Date getAddtime() {
    return addtime;
  }

  public void setAddtime(Date addtime) {
    this.addtime = addtime;
  }

  @Override
  public String toString() {
    return "Customer{" +
            "id=" + id +
            ", comname='" + comname + '\'' +
            ", companyperson='" + companyperson + '\'' +
            ", comaddress='" + comaddress + '\'' +
            ", comphone='" + comphone + '\'' +
            ", camera='" + camera + '\'' +
            ", present='" + present + '\'' +
            ", remark='" + remark + '\'' +
            ", addtime=" + addtime +
            '}';
  }
}
