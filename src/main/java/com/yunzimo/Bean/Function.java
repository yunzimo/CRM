package com.yunzimo.Bean;


public class Function {

  private int id;
  private String proname;
  private String analysisname;
  private int modeleFk;
  private String functionname;
  private String level;
  private String simpledis;
  private String detaileddis;
  private String remark;

  private Module module;

  public Module getModule() {
    return module;
  }

  public void setModule(Module module) {
    this.module = module;
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


  public String getAnalysisname() {
    return analysisname;
  }

  public void setAnalysisname(String analysisname) {
    this.analysisname = analysisname;
  }


  public int getModeleFk() {
    return modeleFk;
  }

  public void setModeleFk(int modeleFk) {
    this.modeleFk = modeleFk;
  }


  public String getFunctionname() {
    return functionname;
  }

  public void setFunctionname(String functionname) {
    this.functionname = functionname;
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
    return "Function{" +
            "id=" + id +
            ", proname='" + proname + '\'' +
            ", analysisname='" + analysisname + '\'' +
            ", modeleFk=" + modeleFk +
            ", functionname='" + functionname + '\'' +
            ", level='" + level + '\'' +
            ", simpledis='" + simpledis + '\'' +
            ", detaileddis='" + detaileddis + '\'' +
            ", remark='" + remark + '\'' +
            ", module=" + module +
            '}';
  }
}
