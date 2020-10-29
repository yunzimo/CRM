package com.yunzimo.Bean;


import java.util.Date;

public class Project {

  private int pid;
  private String pname;
  private int comname;
  private int empFk1;
  private int empcount;
  private Date starttime;
  private Date buildtime;
  private int cost;
  private String level;
  private Date endtime;
  private String remark;
  private int empFk;
  private Customer customer;
  private Employee employee;

  public Customer getCustomer() {
    return customer;
  }

  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  public Employee getEmployee() {
    return employee;
  }

  public void setEmployee(Employee employee) {
    this.employee = employee;
  }

  public int getPid() {
    return pid;
  }

  public void setPid(int pid) {
    this.pid = pid;
  }


  public String getPname() {
    return pname;
  }

  public void setPname(String pname) {
    this.pname = pname;
  }


  public int getComname() {
    return comname;
  }

  public void setComname(int comname) {
    this.comname = comname;
  }


  public int getEmpFk1() {
    return empFk1;
  }

  public void setEmpFk1(int empFk1) {
    this.empFk1 = empFk1;
  }


  public int getEmpcount() {
    return empcount;
  }

  public void setEmpcount(int empcount) {
    this.empcount = empcount;
  }


  public Date getStarttime() {
    return starttime;
  }

  public void setStarttime(Date starttime) {
    this.starttime = starttime;
  }


  public Date getBuildtime() {
    return buildtime;
  }

  public void setBuildtime(Date buildtime) {
    this.buildtime = buildtime;
  }


  public int getCost() {
    return cost;
  }

  public void setCost(int cost) {
    this.cost = cost;
  }


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
  }


  public Date getEndtime() {
    return endtime;
  }

  public void setEndtime(Date endtime) {
    this.endtime = endtime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  public int getEmpFk() {
    return empFk;
  }

  public void setEmpFk(int empFk) {
    this.empFk = empFk;
  }

  @Override
  public String toString() {
    return "Project{" +
            "pid=" + pid +
            ", pname='" + pname + '\'' +
            ", comname=" + comname +
            ", empFk1=" + empFk1 +
            ", empcount=" + empcount +
            ", starttime=" + starttime +
            ", buildtime=" + buildtime +
            ", cost=" + cost +
            ", level='" + level + '\'' +
            ", endtime=" + endtime +
            ", remark='" + remark + '\'' +
            ", empFk=" + empFk +
            ", customer=" + customer +
            ", employee=" + employee +
            '}';
  }
}
