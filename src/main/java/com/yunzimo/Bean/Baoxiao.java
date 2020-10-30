package com.yunzimo.Bean;


import java.util.Date;

public class Baoxiao {

  private String bxid;
  private int paymode;
  private double totalmoney;
  private Date bxtime;
  private String bxremark;
  private int bxstatus;
  private int empFk;
  private String result;
  private Employee employee;
  private Expendituretype expendituretype;

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public Expendituretype getExpendituretype() {
    return expendituretype;
  }

  public void setExpendituretype(Expendituretype expendituretype) {
    this.expendituretype = expendituretype;
  }

  public String getBxid() {
    return bxid;
  }

  public void setBxid(String bxid) {
    this.bxid = bxid;
  }


  public int getPaymode() {
    return paymode;
  }

  public void setPaymode(int paymode) {
    this.paymode = paymode;
  }


  public double getTotalmoney() {
    return totalmoney;
  }

  public void setTotalmoney(double totalmoney) {
    this.totalmoney = totalmoney;
  }


  public Date getBxtime() {
    return bxtime;
  }

  public void setBxtime(Date bxtime) {
    this.bxtime = bxtime;
  }


  public String getBxremark() {
    return bxremark;
  }

  public void setBxremark(String bxremark) {
    this.bxremark = bxremark;
  }


  public int getBxstatus() {
    return bxstatus;
  }

  public void setBxstatus(int bxstatus) {
    this.bxstatus = bxstatus;
  }


  public int getEmpFk() {
    return empFk;
  }

  public void setEmpFk(int empFk) {
    this.empFk = empFk;
  }


  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

}
