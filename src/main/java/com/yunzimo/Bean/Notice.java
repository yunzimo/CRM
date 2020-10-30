package com.yunzimo.Bean;


import java.util.Date;

public class Notice {

  private int nid;
  private String ntitle;
  private String remark;
  private Date ndate;
  private int empFk;


  public int getNid() {
    return nid;
  }

  public void setNid(int nid) {
    this.nid = nid;
  }


  public String getNtitle() {
    return ntitle;
  }

  public void setNtitle(String ntitle) {
    this.ntitle = ntitle;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public Date getNdate() {
    return ndate;
  }

  public void setNdate(Date ndate) {
    this.ndate = ndate;
  }


  public int getEmpFk() {
    return empFk;
  }

  public void setEmpFk(int empFk) {
    this.empFk = empFk;
  }

}
