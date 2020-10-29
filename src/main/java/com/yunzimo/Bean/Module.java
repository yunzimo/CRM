package com.yunzimo.Bean;


public class Module {

  private int id;
  private String proname;
  private int analysisFk;
  private String modname;
  private String level;
  private String simpledis;
  private String detaileddis;
  private String remark;
  private Analysis analysis;


  public Analysis getAnalysis() {
    return analysis;
  }

  public void setAnalysis(Analysis analysis) {
    this.analysis = analysis;
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


  public int getAnalysisFk() {
    return analysisFk;
  }

  public void setAnalysisFk(int analysisFk) {
    this.analysisFk = analysisFk;
  }


  public String getModname() {
    return modname;
  }

  public void setModname(String modname) {
    this.modname = modname;
  }


  public String getLevel() {
    return level;
  }

  public void setLevel(String level) {
    this.level = level;
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


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
  }


  @Override
  public String toString() {
    return "Module{" +
            "id=" + id +
            ", proname='" + proname + '\'' +
            ", analysisFk=" + analysisFk +
            ", modname='" + modname + '\'' +
            ", level='" + level + '\'' +
            ", simpledis='" + simpledis + '\'' +
            ", detaileddis='" + detaileddis + '\'' +
            ", remark='" + remark + '\'' +
            ", analysis=" + analysis +
            '}';
  }
}
