package com.yunzimo.Bean;


import java.util.Date;

public class Analysis {

  private int id;
  private String proname;
  private String title;
  private String simpledis;
  private String detaileddis;
  private Date addtime;
  private Date updatetime;
  private String remark;

  private Project project;


  public Project getProject() {
    return project;
  }

  public void setProject(Project project) {
    this.project = project;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }


  public String getProname() {
    return proname;
  }

  public void setProname(String proname) {
    this.proname = proname;
  }


  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }


  public String getSimpledis() {
    return simpledis;
  }

  public void setSimpledis(String simpledis) {
    this.simpledis = simpledis;
  }


  public String getDetaileddis() {
    return detaileddis;
  }

  public void setDetaileddis(String detaileddis) {
    this.detaileddis = detaileddis;
  }


  public Date getAddtime() {
    return addtime;
  }

  public void setAddtime(Date addtime) {
    this.addtime = addtime;
  }


  public Date getUpdatetime() {
    return updatetime;
  }

  public void setUpdatetime(Date updatetime) {
    this.updatetime = updatetime;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }

  @Override
  public String toString() {
    return "Analysis{" +
            "id=" + id +
            ", proname='" + proname + '\'' +
            ", title='" + title + '\'' +
            ", simpledis='" + simpledis + '\'' +
            ", detaileddis='" + detaileddis + '\'' +
            ", addtime=" + addtime +
            ", updatetime=" + updatetime +
            ", remark='" + remark + '\'' +
            ", project=" + project +
            '}';
  }
}
