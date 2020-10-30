package com.yunzimo.Bean;


import java.util.Date;
import java.util.List;

public class Employee {

  private int eid;
  private String ename;
  private String esex;
  private int eage;
  private String telephone;
  private Date hiredate;
  private String pnum;
  private String username;
  private String password;
  private String remark;
  private int pFk;
  private int dFk;
  private int lFk;
  private String emppic;

  private List<Baoxiao> baoxiaoList;

  public int getdFk() {
    return dFk;
  }

  public void setdFk(int dFk) {
    this.dFk = dFk;
  }

  public int getlFk() {
    return lFk;
  }

  public void setlFk(int lFk) {
    this.lFk = lFk;
  }

  public List<Baoxiao> getBaoxiaoList() {
    return baoxiaoList;
  }

  public void setBaoxiaoList(List<Baoxiao> baoxiaoList) {
    this.baoxiaoList = baoxiaoList;
  }

  public int getpFk() {
    return pFk;
  }

  public void setpFk(int pFk) {
    this.pFk = pFk;
  }

  public int getEid() {
    return eid;
  }

  public void setEid(int eid) {
    this.eid = eid;
  }


  public String getEname() {
    return ename;
  }

  public void setEname(String ename) {
    this.ename = ename;
  }


  public String getEsex() {
    return esex;
  }

  public void setEsex(String esex) {
    this.esex = esex;
  }


  public int getEage() {
    return eage;
  }

  public void setEage(int eage) {
    this.eage = eage;
  }


  public String getTelephone() {
    return telephone;
  }

  public void setTelephone(String telephone) {
    this.telephone = telephone;
  }


  public Date getHiredate() {
    return hiredate;
  }

  public void setHiredate(Date hiredate) {
    this.hiredate = hiredate;
  }


  public String getPnum() {
    return pnum;
  }

  public void setPnum(String pnum) {
    this.pnum = pnum;
  }


  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public int getPFk() {
    return pFk;
  }

  public void setPFk(int pFk) {
    this.pFk = pFk;
  }


  public int getDFk() {
    return dFk;
  }

  public void setDFk(int dFk) {
    this.dFk = dFk;
  }


  public int getLFk() {
    return lFk;
  }

  public void setLFk(int lFk) {
    this.lFk = lFk;
  }


  public String getEmppic() {
    return emppic;
  }

  public void setEmppic(String emppic) {
    this.emppic = emppic;
  }

  @Override
  public String toString() {
    return "Employee{" +
            "eid=" + eid +
            ", ename='" + ename + '\'' +
            ", esex='" + esex + '\'' +
            ", eage=" + eage +
            ", telephone='" + telephone + '\'' +
            ", hiredate=" + hiredate +
            ", pnum='" + pnum + '\'' +
            ", username='" + username + '\'' +
            ", password='" + password + '\'' +
            ", remark='" + remark + '\'' +
            ", pFk=" + pFk +
            ", dFk=" + dFk +
            ", lFk=" + lFk +
            ", emppic='" + emppic + '\'' +
            '}';
  }
}
